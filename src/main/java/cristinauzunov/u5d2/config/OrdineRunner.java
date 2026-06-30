package cristinauzunov.u5d2.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cristinauzunov.u5d2.entities.Bevanda;
import cristinauzunov.u5d2.entities.Menu;
import cristinauzunov.u5d2.entities.Ordine;
import cristinauzunov.u5d2.entities.Pizza;
import cristinauzunov.u5d2.entities.StatoTavolo;
import cristinauzunov.u5d2.entities.Tavolo;

@Component
public class OrdineRunner implements CommandLineRunner {

    // logger per stampare a video
    private static final Logger logger = LoggerFactory.getLogger(OrdineRunner.class);

    // leggo il costo del coperto da application.properties
    @Value("${pizzeria.costo-coperto}")
    private double costoCoperto;

    // mi faccio dare i Bean che mi servono da Spring
    private Menu menu;
    private Pizza margherita;
    private Bevanda cocaCola;

    public OrdineRunner(Menu menu, Pizza margherita, Bevanda cocaCola) {
        this.menu = menu;
        this.margherita = margherita;
        this.cocaCola = cocaCola;
    }

    @Override
    public void run(String... args) throws Exception {

        //mostro il menù
        logger.info("\n" + menu.toString());

        //creo un tavolo
        Tavolo tavolo = new Tavolo(5, 4, StatoTavolo.LIBERO);

        //creo un ordine per quel tavolo, con 2 coperti
        Ordine ordine = new Ordine(1, tavolo, 2);

        //aggiungo qualche elemento del menù all'ordine
        ordine.aggiungiElemento(margherita);
        ordine.aggiungiElemento(cocaCola);

        //il tavolo ora è occupato
        tavolo.setStato(StatoTavolo.OCCUPATO);

        //calcolo l'importo totale (elementi + coperti)
        ordine.calcolaImporto(costoCoperto);

        //stampo l'ordine con il logger
        logger.info("\n" + ordine.toString());
    }
}