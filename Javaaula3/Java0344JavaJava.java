/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java0344java.java;
import javax.swing.JOptionPane;

/**
 *
 * @author vilma
 */
public class Java0344JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num, base, logaritmo;
        String s;
       
        s = JOptionPane.showInputDialog("Entre com o logaritmo:");
        num = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Entre com a base:");
        base = Double.parseDouble(s);
        
        logaritmo = Math.log (num) / Math.log(base);
        System.out.format("O logaritmo de %.2f, na base %.2f eh %.2f", num, base,logaritmo);
    }
    
}
