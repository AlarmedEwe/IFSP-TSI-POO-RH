package Model;

/**
 *
 * @author Nery
 */
public class Cargo extends Entidade {
    private String descricao;
    private float salarioBase;

    public Cargo(String descricao, float salarioBase) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
