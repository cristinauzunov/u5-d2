package cristinauzunov.u5d2.entities;

public class Tavolo {
    private int numero;
    private int copertiMassimi;
    private StatoTavolo stato;

    public Tavolo(int numero, int copertiMassimi, StatoTavolo stato) {
        this.numero = numero;
        this.copertiMassimi = copertiMassimi;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }

    public int getCopertiMassimi() {
        return copertiMassimi;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo " + numero + " (max " + copertiMassimi + " coperti) - " + stato;
    }
}