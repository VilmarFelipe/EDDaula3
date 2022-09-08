/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java0346java.java;
import javax.swing.JOptionPane;

/**
 *
 * @author vilma
 */
public class Java0346JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo, nsaldo;
        String s;
        
        s = JOptionPane.showInputDialog("Informe o Saldo:");
        saldo = Double.parseDouble(s);
        
        nsaldo = saldo * 1.01;
        System.out.println("O novo saldo:.. " +nsaldo);
    }
    
}
