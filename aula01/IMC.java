package aula01;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float peso;
        float altura;
        String nome;
        String classificacao;

        System.out.println("insira seu nome: ");
        nome = scan.nextLine();

        System.out.println("Insira seu peso: ");
        peso = scan.nextFloat();

        System.out.println("Insira sua altura: ");
        altura = scan.nextFloat();

        float imc = (peso/(altura*altura));

        if(imc<18.5){
            classificacao = "abaixo do peso";
        }else if(imc>=18.5){
            classificacao = "Peso ideal";
        } else if(imc<30){
            classificacao = "acima do peso";
        } else{
            classificacao = "Obesidade";
        }

        System.out.println(nome+ " seu IMC é de "+ imc + classificacao);
    }
}
