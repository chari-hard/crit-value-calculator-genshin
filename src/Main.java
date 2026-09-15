import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///////////// ARTEFATOS ////////////

        double cvMetaArtefatos = 0;
        double taxaDoConjunto = 0;

        ///////////// ARMA ////////////

        double danoDaArma = 0;
        double taxaDaArma = 0;
        Arma arma = new  Arma(danoDaArma, taxaDaArma);


        ///////////// VARIAVEIS PERSONAGEM ////////////


        double taxaBaseDoPersonagem = 5;
        double danoBaseDoPersonagem = 50;
        Personagem personagem = new Personagem(taxaBaseDoPersonagem, danoBaseDoPersonagem);

        ///////////// ENTRADAS DO TERMINAL ////////////

        System.out.println("Insira o crítico dos artefatos direto no código!!!");

        System.out.print("\n1 - Seu personagem acende com taxa ou dano?: ");
        String danoOuTaxa = sc.nextLine();
        if (danoOuTaxa.equals("taxa")){
            taxaBaseDoPersonagem = 19.2;
        } else if (danoOuTaxa.equals("dano")) {
            danoBaseDoPersonagem = 88.4;
        }

        System.out.println("\n2 - insira a taxa da arma(lvl90): ");
        taxaDaArma = sc.nextDouble();

        System.out.println("\n3 - insira o dano da arma(lvl90): ");
        danoDaArma = sc.nextDouble();

        System.out.println("\n4 - Qual sua meta de crit value nos artefatos para esse personagem?");
        cvMetaArtefatos = sc.nextDouble();

        System.out.println("\n5 - Qual a taxa extra do conjunto");
        taxaDoConjunto = sc.nextDouble();

        ///////////////////////////calculos

        double taxaBase = taxaBaseDoPersonagem + taxaDaArma + taxaDoConjunto;
        double danoBase = danoBaseDoPersonagem + danoDaArma;

        ///////////////////////////calculos de cv

        double taxaIdeal;
        double danoIdeal;

        if (taxaBase > 5){
            if (taxaBase <= 80){
                taxaIdeal = 80 - taxaBase;
            } else {
                taxaIdeal = 0;
            }
        } else {
            if (taxaBase <= 75){
                taxaIdeal = 75 - taxaBase;
            } else {
                taxaIdeal = 0;
            }
        }

        danoIdeal = cvMetaArtefatos - (taxaIdeal * 2);;

        double taxaFinal = taxaBase + taxaIdeal;
        double danoFinal = danoBase + danoIdeal;
        ////////////////////////////


        System.out.printf("\nTaxa final: %.1f", taxaBase);
        System.out.printf("\nDano final: %.1f", danoBase);
        System.out.printf("\nCv Meta: %.1f", cvMetaArtefatos);
        System.out.printf("\nCV ideal: %.1f/%.1f", taxaIdeal, danoIdeal);
        System.out.printf("\nbuild estimada: %.1f/%.1f", taxaFinal, danoFinal);





    }
}