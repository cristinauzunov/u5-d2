package cristinauzunov.u5d2.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private Tavolo tavolo;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private List<ProdottoMenu> elementi;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, int numeroCoperti) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.numeroCoperti = numeroCoperti;
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.elementi = new ArrayList<>();
        this.importoTotale = 0;
    }

    public void aggiungiElemento(ProdottoMenu prodotto) {
        elementi.add(prodotto);
    }

    // calcola il totale: costo degli elementi + costo dei coperti

    public void calcolaImporto(double costoCoperto) {
        double totale = 0;
        for (ProdottoMenu p : elementi) {
            totale = totale + p.getPrezzo();
        }
        totale = totale + (numeroCoperti * costoCoperto);
        this.importoTotale = totale;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    @Override
    public String toString() {
        String risultato = "===== ORDINE #" + numeroOrdine + " =====\n";
        risultato = risultato + "Tavolo: " + tavolo.getNumero() + "\n";
        risultato = risultato + "Stato: " + stato + "\n";
        risultato = risultato + "Coperti: " + numeroCoperti + "\n";
        risultato = risultato + "Ora: " + oraAcquisizione + "\n";
        risultato = risultato + "Elementi ordinati:\n";
        for (ProdottoMenu p : elementi) {
            risultato = risultato + "  - " + p.getNome() + " (" + p.getPrezzo() + "€)\n";
        }
        risultato = risultato + "IMPORTO TOTALE: " + importoTotale + "€";
        return risultato;
    }
}