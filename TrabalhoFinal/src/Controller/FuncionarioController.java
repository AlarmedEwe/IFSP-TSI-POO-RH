package Controller;

import Interfaces.IController;
import Model.Cargo;
import Model.Funcionario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
                writer.printf("#;Nome;Dt.Nasc;CPF;Email;Telefone;Salario;Beneficios;Cargo;Dt.Cadastro;");
            }

            writer.printf("\n" + funcionario.toString());

            writer.close();
            file.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Funcionario> buscar() {
        try {
            FileReader file = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(file);

            ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
            int i = 0;
            while (reader.ready()) {
                try {
                    String linha = reader.readLine();

                    if (++i == 1) {
                        continue;
                    }

                    String[] colunas = linha.split(";");

                    Cargo cargo = new Cargo(colunas[8], Float.parseFloat(colunas[6]));

                    Funcionario funcionario = new Funcionario(
                            Long.parseLong(colunas[0]), // id
                            colunas[1], // nome
                            LocalDate.parse(colunas[2]), //dtNascimento
                            colunas[3], // cpf
                            colunas[4], // email
                            colunas[5], // telefone
                            Float.parseFloat(colunas[6]), // salario
                            Float.parseFloat(colunas[7]), // beneficios
                            cargo,
                            LocalDateTime.parse(colunas[9]) // dtCadastro
                    );

                    lista.add(funcionario);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    return null;
                }
            }

            reader.close();
            file.close();

            return lista;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
