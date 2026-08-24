public class Main {
    static void main(String[] args) {
        Artefatos flor = new Artefatos();
        Artefatos pena = new Artefatos();
        Artefatos areia = new Artefatos();
        Artefatos copo = new Artefatos();
        Artefatos tiara = new Artefatos();

        //flor

        flor.setTaxa(7);
        flor.setDano(21);


        //pena

        pena.setTaxa(7);
        pena.setDano(21);


        //areia

        areia.setTaxa(7);
        areia.setDano(21);


        //copo

        copo.setTaxa(7);
        copo.setDano(21);


        //tiara

        tiara.setTaxa(7);
        tiara.setDano(21);


        //crit value

        flor.setCvDoArtefato();
        pena.setCvDoArtefato();
        areia.setCvDoArtefato();
        copo.setCvDoArtefato();
        tiara.setCvDoArtefato();

        //agr o calculo
        
        double cvGeral = flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato();
        double mediaCv = (flor.getCvDoArtefato() + pena.getCvDoArtefato() + areia.getCvDoArtefato() + copo.getCvDoArtefato() + tiara.getCvDoArtefato()) / 5 ;


        //


    }

}