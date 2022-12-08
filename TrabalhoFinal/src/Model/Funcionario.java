package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Nery
 */
public class Funcionario extends Entidade {
    private String nome;
    private LocalDate dtNascimento;
    private String cpf;
    private String email;
    private String telefone;
    private float salario;
    private float beneficios;
    private Cargo cargo;

    public Funcionario(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, float salario, float beneficios, Cargo cargo) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
        this.beneficios = beneficios;
        this.cargo = cargo;
        
        this.dtCadastro = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(float beneficios) {
        this.beneficios = beneficios;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(";");
        sb.append(nome).append(";");
        sb.append(dtNascimento).append(";");
        sb.append(cpf).append(";");
        sb.append(email).append(";");
        sb.append(telefone).append(";");
        sb.append(salario).append(";");
        sb.append(beneficios).append(";");
        sb.append(cargo.getDescricao()).append(";");
        sb.append(dtCadastro).append(";");
        return sb.toString();
    }
}
