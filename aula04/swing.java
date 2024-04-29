package aula04;

import javax.swing.*;
public class swing{

    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        String output = name + "?Nome feio da bexiga, doido";
        JOptionPane.showMessageDialog(null, output);
    }

}