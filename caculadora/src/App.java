import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc= new Scanner(System.in);


        char exit;
        do{


        System.out.println("Insira o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.println("Insira a operação: + - * /  ");
        String op = sc.next();
        System.out.println("Insira o segundo número: ");
        float n2 = sc.nextFloat();

        switch(op){
            case "+":
                System.out.println("Resultado: " + (n1+n2));
                break;
            case "-":
                System.out.println("Resultado: " + (n1-n2));
                break;
            case "*":
                System.out.println("Resultado: " + (n1*n2));
                break;
            case "/":
                System.out.println("Resultado: " + (n1/n2));
                break;
            default:
                System.out.println("Operação inválida");
        }

        System.out.println("Deseja continuar? (s/n)");
        exit = sc.next().charAt(0);

    }
    while(exit == 's');




        
    }
}
