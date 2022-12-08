package Model;

import java.time.LocalDateTime;

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

        this.dtCadastro = LocalDateTime.now();
    }

    public Cargo(long id, String descricao, float salarioBase, LocalDateTime dtCadastro) {
        this.id = id;
        this.descricao = descricao;
        this.salarioBase = salarioBase;
        this.dtCadastro = dtCadastro;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(";");
        sb.append(descricao).append(";");
        sb.append(salarioBase).append(";");
        sb.append(dtCadastro).append(";");
        return sb.toString();
    }
}
