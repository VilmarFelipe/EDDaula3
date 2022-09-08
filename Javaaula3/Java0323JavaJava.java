/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java0323java.java;
import javax.swing.JOptionPane;

/**
 *
 * @author vilma
 */
public class Java0323JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, d;
        String s;
        
        s = JOptionPane.showInputDialog ("Digite o numero de tres casas:");
        a = (int) Float.parseFloat(s);
        
        d = a % 100 / 10 ;
        System.out.println("Algarismos da casa das dezenas" +d);
    }
    
}
