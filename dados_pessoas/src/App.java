import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s;
        int ida, etd, csol=0, ccas=0, cm=0, cf=0;
        int im, ih;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o seu sexo: (M-masculino, F-Feminino)");
            s = sc.next().charAt(0);
            if(s == 'M' || s == 'm'){
             System.out.println("Digite a sua idade: ");   
             ida = sc.nextInt();
             cm++;}
            else if(s == 'F' || s == 'f'){
             System.out.println("Digite a sua idade: ");   
             ida = sc.nextInt();
             cf++; } 
            
            
    
}
