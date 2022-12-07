package Controller;

import Interfaces.IController;
import Model.Cargo;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Nery
 */
public class CargoController implements IController<Cargo> {

    private String arquivo = ".\\cargos.csv";

    @Override
    public void salvar(Cargo cargo) {
        try {
            boolean precisaCriarCabecalho = !(new File(arquivo)).exists();

            FileWriter file = new FileWriter(arquivo, true);
            PrintWriter writer = new PrintWriter(file);

            if (precisaCriarCabecalho) {
                writer.printf("#;Descricao;Salario Base;Dt.Cadastro;");
                writer.printf("\n1;RH;1500;2022-12-04;");
                writer.printf("\n2;TI;2000;2022-12-04;");
                writer.printf("\n3;Gerente Geral;10000;2022-12-04;");
            }

            writer.printf("\n" + cargo.toString());

            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
