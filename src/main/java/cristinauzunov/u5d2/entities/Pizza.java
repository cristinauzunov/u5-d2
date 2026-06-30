package cristinauzunov.u5d2.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ProdottoMenu {
    private double prezzoBase;
    private int calorieBase;
    private List<Topping> toppings;

    public Pizza(String nome, double prezzoBase, int calorieBase) {
        super(nome);
        this.prezzoBase = prezzoBase;
        this.calorieBase = calorieBase;
        this.toppings = new ArrayList<>();
    }

    // un topping si può aggiungere più volte

    public void aggiungiTopping(Topping t) {
        toppings.add(t);
    }

    @Override
    public double getPrezzo() {
        double totale = prezzoBase;
        for (Topping t : toppings) {
            totale = totale + t.getPrezzo();
        }
        return totale;
    }

    @Override
    public int getCalorie() {
        int totale = calorieBase;
        for (Topping t : toppings) {
            totale = totale + t.getCalorie();
        }
        return totale;
    }

    @Override
    public String toString() {
        String descrizione = nome + " - " + getPrezzo() + "€ (" + getCalorie() + " kcal)";
        if (!toppings.isEmpty()) {
            descrizione = descrizione + "\n   Toppings: ";
            for (Topping t : toppings) {
                descrizione = descrizione + t.getNome() + " ";
            }
        }
        return descrizione;
    }
}