/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java0340java.java;
import javax.swing.JOptionPane;

/**
 *
 * @author vilma
 */
public class Java0340JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float quoc, rest, val1, val2;
        String s;
        
        s = JOptionPane.showInputDialog ("Entre com o dividendo: ");
        val1 = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog ("Entre com o valor do divisor: ");
        val2 = Float.parseFloat (s);
        
        quoc = val1 / val2;
        rest = val1 % 2;
        
        System.out.println("Dividendo:.."+val1);
        System.out.println("Divisor:.." +val2);
        System.out.println("Quociente:.."+quoc);
        System.out.println("Resto:.."+rest);
    }
    
}
