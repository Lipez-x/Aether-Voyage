
package br.com.AetherVoyages.jdbc;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Deu certo btl");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
