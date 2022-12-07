package Controller;

import Interfaces.IController;
import Model.Funcionario;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Nery
 */
public class FuncionarioController implements IController<Funcionario> {

    private String arquivo = ".\\funcionarios.csv";

    @Override
    public void salvar(Funcionario funcionario) {
        try {
            boolean precisaCriarCabecalho = !(new File(arquivo)).exists();

            FileWriter file = new FileWriter(arquivo, true);
            PrintWriter writer = new PrintWriter(file);

            if (precisaCriarCabecalho) {
                writer.printf("Nome;Dt.Nasc;CPF;Email;Telefone;Salario;Beneficios;Cargo;");
            }

            writer.printf("\n" + funcionario.toString());

            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
