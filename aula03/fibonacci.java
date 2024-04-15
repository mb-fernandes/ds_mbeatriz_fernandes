package aula03;

public class fibonacci {
    public static void main(String[] args){
        for (int i=0; i<13; i++){
            int fib = 0;

            fib = (i-1)+(i-2);

            System.out.println(fib);
        }
    }
}
