public class Main {
    static void main(String[] args) {
        Artefatos flor = new Artefatos(21, 7);
        Artefatos pena = new Artefatos(21, 7);
        Artefatos areia = new Artefatos(21, 7);
        Artefatos copo = new Artefatos(21, 7);
        Artefatos tiara = new Artefatos(66, 10);

        
        double cvGeral = flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato();
        double mediaCv = (flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato()) / 5 ;
        double mediaCvSemTiara = (flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato()) / 4 ;

        System.out.println(cvGeral);
        System.out.println(mediaCv);
        System.out.println(mediaCvSemTiara);

        

    }

}