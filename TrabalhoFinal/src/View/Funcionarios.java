/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FuncionarioController;
import Model.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.jline.utils.ShutdownHooks.Task;

/**
 *
 * @author caio_
 */
public class Funcionarios extends javax.swing.JFrame {

    private FuncionarioController funcionarioController;

    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        funcionarioController = new FuncionarioController();
        preencherTabela();
    }

    private void preencherTabela() {
        try {
            ArrayList<Funcionario> funcionarios = funcionarioController.buscar();

            if (funcionarios == null) {
                JOptionPane.showMessageDialog(this, "Ainda não há nenhum funcionário cadastrado!");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jtbFuncionarios.getModel();
            model.setRowCount(0);
            
            for (Funcionario funcionario : funcionarios) {
                model.addRow(new Object[]{
                    funcionario.getNome(),
                    funcionario.getDtNascimento(),
                    funcionario.getCargo().getDescricao(),
                    funcionario.getCpf(),
                    funcionario.getEmail(),
                    funcionario.getTelefone(),
                    funcionario.getSalario(),
                    funcionario.getBeneficios(),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        jtbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", " nascimento", "Cargo", "CPF", "E-mail", "Telefone", "Salário R$", "Benefícios R$"
            }
        ));
        jScrollPane1.setViewportView(jtbFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbFuncionarios;
    // End of variables declaration//GEN-END:variables
}
