package cristinauzunov.u5d2.entities;

public class Bevanda extends ProdottoMenu {
    private double prezzo;
    private int calorie;

    public Bevanda(String nome, double prezzo, int calorie) {
        super(nome);
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return nome + " - " + prezzo + "€ (" + calorie + " kcal)";
    }
}