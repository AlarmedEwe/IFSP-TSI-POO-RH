package Controller;

import Interfaces.IController;
import Model.Cargo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

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

    @Override
    public ArrayList<Cargo> buscar() {
        try {
            FileReader file = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(file);

            ArrayList<Cargo> lista = new ArrayList<Cargo>();

            int i = 0;
            while (reader.ready()) {
                try {
                    String linha = reader.readLine();

                    if (++i == 1) {
                        continue;
                    }
                    
                    String[] colunas = linha.split(";");

                    Cargo cargo = new Cargo(
                            Long.parseLong(colunas[0]),
                            colunas[1],
                            Float.parseFloat(colunas[2]),
                            LocalDateTime.parse(colunas[3])
                    );

                    lista.add(cargo);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
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
