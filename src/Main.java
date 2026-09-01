import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///////////// OBJETOS ////////////


        Arma arma = new  Arma();

        Artefatos flor = new Artefatos(21, 7);
        Artefatos pena = new Artefatos(21, 7);
        Artefatos areia = new Artefatos(21, 7);
        Artefatos copo = new Artefatos(21, 7);
        Artefatos tiara = new Artefatos(66, 10);


        ///////////// VARIAVEIS ARTEFATOS ////////////


        double cvAtefatosMeta;
        double cvGeralArtefatos = flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato();
        double mediaCvArtefatos = (flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato()) / 5 ;
        double taxaTotalArtefatos = flor.taxaDoArtefato + pena.taxaDoArtefato + areia.taxaDoArtefato + copo.taxaDoArtefato + tiara.taxaDoArtefato;
        double danoTotalArtefatos = flor.danoDoArtefato + pena.danoDoArtefato + areia.danoDoArtefato + copo.danoDoArtefato + tiara.danoDoArtefato;
        double mediaCvSemTiara = (flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato()) / 4 ;

        double taxaConjuntoDeArtefatos;
        double danoConjuntoDeArtefatos;


        ///////////// VARIAVEIS ARMA ////////////


        double danoDaArma;
        double taxaDaArma;


        ///////////// VARIAVEIS PERSONAGEM ////////////


        double taxaDoPersonagem = 5;
        double danoDoPersonagem = 50;
        Personagem personagem = new Personagem(taxaDoPersonagem, danoDoPersonagem);

        ///////////// ENTRADAS DO TERMINAL ////////////

        System.out.println("Insira o crítico dos artefatos direto no código!!!");

        System.out.print("\n1 - Seu personagem acende com taxa ou dano?: ");
        String danoOuTaxa = sc.nextLine();
        if (danoOuTaxa.equals("taxa")){
            taxaDoPersonagem = 19.2;
        } else if (danoOuTaxa.equals("dano")) {
            danoDoPersonagem = 88.4;
        } else {
            return;
        }

        System.out.print("\n3 - insira a taxa da arma(lvl90): ");
        taxaDaArma = sc.nextDouble();

        System.out.print("\n4 - insira o dano da arma(lvl90): ");
        danoDaArma = sc.nextDouble();

        System.out.print("\n5 - Qual sua meta de crit value nos artefatos para esse personagem?");
        cvAtefatosMeta = sc.nextDouble();

        ///////////////////////////

        double taxaFinal = taxaDoPersonagem + taxaTotalArtefatos + taxaDaArma;
        double DanoFinal = danoDoPersonagem + danoTotalArtefatos + danoDaArma;

        double taxaTotalSemArtefatos = taxaDoPersonagem + taxaDaArma;
        double danoTotalSemArtefatos = danoDoPersonagem + danoDaArma;


        ///////////////////////////

        double taxaIdeial;
        double danoIdeal;
    }
}