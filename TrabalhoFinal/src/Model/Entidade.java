package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Nery
 */
public abstract class Entidade {

    protected long id;
    protected LocalDateTime dtCadastro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(LocalDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
