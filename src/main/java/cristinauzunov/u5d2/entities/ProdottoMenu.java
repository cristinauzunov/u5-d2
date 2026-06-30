package cristinauzunov.u5d2.entities;

// classe base per tutto ciò che compare a menù

public abstract class ProdottoMenu {
    protected String nome;

    public ProdottoMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getPrezzo();

    public abstract int getCalorie();
}