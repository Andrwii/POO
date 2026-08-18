import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cfic=0, crom=0, cave=0, h=0, f=0, cont = 0;
        int tp;
        
        do{
        System.out.println("Qual é o tipo do livro? (1 - Ficção, 2 - Romance, 3 - Aventura, 0 - Sair)");
        tp = sc.nextInt();

        switch(tp) {
            case 1:
                System.out.println("Você escolheu Ficção.");
                cfic++;
                break;
            case 2:
                System.out.println("Você escolheu Romance.");
                crom++;
                break;
            case 3:
                System.out.println("Você escolheu Aventura.");
                cave++;
                break;
            case 0:
                System.out.println("Você escolheu Sair.");
                break;
            default:
                System.out.println("Gênero inválido.");
        }
        
        if(tp >= 1 && tp <= 3){
            System.out.println("Digite o seu Gênero: (M-masculino, F-Feminino)");
            char ger = sc.next().charAt(0);

            if(ger == 'M' || ger == 'm'){
                h++;}
            else if(ger == 'F' || ger == 'f'){
                f++;
            }
            else{
                System.out.println("Gênero inválido.");}
            }
        cont++;
        }while(tp != 0);

        if(cfic>crom && cfic>cave){
            System.out.println("O tipo de livro mais escolhido foi Ficção.");
        }
        else if(crom>cfic && crom>cave){
            System.out.println("O tipo de livro mais escolhido foi Romance.");
        }
        else if(cave>cfic && cave>crom){
            System.out.println("O tipo de livro mais escolhido foi Aventura.");
        }
        else{
            System.out.println("Houve empate entre os tipos de livros.");
        }
        
        h = (h/cont)*100;

        System.out.println("Percentual de Homens: " +h);


    }
}
