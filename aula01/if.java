package aula01;

class If {
    public static void main(String[] args) {
        int x = 20;
        int y = 20;

        if(x > y ){
            System.out.println("x é maior que y");
        } else if(x == y){
            System.out.println("x é igual a y");
        } else{
            System.out.println("y é maior que x");
        }
    }   
}