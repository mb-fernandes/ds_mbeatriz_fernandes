package aula01;
import java.util.Scanner;

class input {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String msg;

        System.out.println("insira mensagem");
        msg = myObj.nextLine();

        System.out.println(msg);
    }
}