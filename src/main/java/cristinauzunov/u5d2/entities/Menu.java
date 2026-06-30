package cristinauzunov.u5d2.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    @Override
    public String toString() {
        String risultato = "===== MENÙ PIZZERIA =====\n\n";
        risultato = risultato + "-- PIZZE --\n";
        for (Pizza p : pizze) {
            risultato = risultato + p.toString() + "\n";
        }
        risultato = risultato + "\n-- BEVANDE --\n";
        for (Bevanda b : bevande) {
            risultato = risultato + b.toString() + "\n";
        }
        return risultato;
    }
}