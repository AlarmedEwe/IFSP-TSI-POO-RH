package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nery
 */
public interface IController<T> {

    public ArrayList<T> buscar();
    public void salvar(T obj);
}
