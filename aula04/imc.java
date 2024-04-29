package aula04;
import javax.swing.*;

public class imc {
    public static void main(String[] args){

        String classificacao;

        String name = JOptionPane.showInputDialog("Qual o seu nome?");

        String altura = JOptionPane.showInputDialog("Qual o sua altura?");

        String peso = JOptionPane.showInputDialog("Qual o seu peso?");

        float alt = Float.parseFloat(altura);
        float pes = Float.parseFloat(peso);

        float imc = (pes/(alt*alt));

        if(imc<18.5){
            classificacao = "abaixo do peso";
        }else if(imc>=18.5){
            classificacao = "Peso ideal";
        } else if(imc<30){
            classificacao = "acima do peso";
        } else{
            classificacao = "Obesidade";
        }

        String output = name+ " seu IMC é de " + imc + classificacao;
        JOptionPane.showMessageDialog(null, output);
    }
}
