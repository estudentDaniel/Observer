package Netflix;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bem vindo a NETFLIX");
        Systema NetFlix = new Systema();

        Serie SerieA = new Serie("SerieA", "O GAROTO PERDIDO");
        Serie SerieB = new Serie("SerieB", "BRASIL E A RELIGIÃO");
        Serie SerieC = new Serie("SerieC", "ANTES DA PRIMEIRA GUERRA");
        Serie SerieD = new Serie("SerieD", "FURIA DOS TITANS");
        Serie SerieE = new Serie("SerieE", "PADRÕES DE PROJETOS");


        boolean variavel = true;

        while (variavel) {
        System.out.println("Deseja receber Notificações?");
        System.out.println("1) sim.   0)Não.");
        Scanner scan = new Scanner(System.in);

        NetFlix.subscribe(SerieA);
        NetFlix.subscribe(SerieB);
        NetFlix.subscribe(SerieC);
        NetFlix.subscribe(SerieD);
        NetFlix.subscribe(SerieE);
        

         int opcao = scan.nextInt();
            System.out.println(opcao);

            if (opcao != 0) {

                NetFlix.update("----PICITURE-----");
                SerieA.setNotify();
                System.out.println("PADRÕES DE PROJETOS" + SerieD.Display().getName());

            }else{
                System.out.println("Voce não recebera notificações");
                
            }
            scan.close();
            variavel = false;
        }
        

    }
}
