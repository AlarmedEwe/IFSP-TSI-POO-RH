package View;

import Controller.CargoController;
import Controller.FuncionarioController;
import Model.Cargo;
import Model.Funcionario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

    private FuncionarioController funcionarioController;
    private CargoController cargoController;

    public CadastroFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        funcionarioController = new FuncionarioController();
        cargoController = new CargoController();

        ArrayList<Cargo> cargos = cargoController.buscar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCpf = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfSalario = new javax.swing.JTextField();
        jtfBeneficios = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtfCargo = new javax.swing.JTextField();
        jftfNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar novo funcionário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nome completo");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Data de nascimento");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Telefone");

        jtfNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfNome.setName(""); // NOI18N

        jtfCpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        jtfTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Salário R$");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Benefícios R$");

        jtfSalario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalarioActionPerformed(evt);
            }
        });

        jtfBeneficios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBeneficiosActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Cargo");

        jtfCargo.setEditable(false);
        jtfCargo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCargoActionPerformed(evt);
            }
        });

        jftfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jftfNascimento.setToolTipText("00/00/0000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jtfEmail)
                            .addComponent(jftfNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCpf, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfBeneficios, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jtfCargo)
                                    .addComponent(jtfSalario)))
                            .addComponent(btnCadastrar)))
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jftfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jtfBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btnCadastrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jftfNascimento.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jtfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSalarioActionPerformed

    private void jtfBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBeneficiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBeneficiosActionPerformed

    private void jtfCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCargoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            Cargo cargo = new Cargo("TI", 2000f);

            // Formatando string da data de nascimento
            String[] dtNasc = jftfNascimento.getText().split("/");
            String data = (dtNasc[0].length() == 4)
                    ? dtNasc[0] + "-" + dtNasc[1] + "-" + dtNasc[2]
                    : dtNasc[2] + "-" + dtNasc[1] + "-" + dtNasc[0];

            // Formatando strings de salário e benefícios
            String salario = !jtfSalario.getText().isBlank()
                    ? jtfSalario.getText() : "0";
            String beneficios = !jtfBeneficios.getText().isBlank()
                    ? jtfBeneficios.getText() : "0";

            // Criando entidade Funcionário
            Funcionario funcionario = new Funcionario(
                    jtfNome.getText(),
                    LocalDate.parse(data),
                    jtfCpf.getText(),
                    jtfEmail.getText(),
                    jtfTelefone.getText(),
                    Float.parseFloat(salario),
                    Float.parseFloat(beneficios),
                    cargo
            );

            funcionarioController.salvar(funcionario);

            JOptionPane.showMessageDialog(this, "Funcionário salvo com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jftfNascimento;
    private javax.swing.JTextField jtfBeneficios;
    private javax.swing.JTextField jtfCargo;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables

}
