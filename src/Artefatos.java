public class Artefatos {
    public double taxaDoArtefato;
    public double danoDoArtefato;
    public double bonusTaxaDeConjunto;
    public double bonusDanoDeConjunto;
    private double cvDoArtefato;

    public Artefatos(double dano, double taxa){
        this.danoDoArtefato = dano;
        this.taxaDoArtefato = taxa;
        this.cvDoArtefato = this.danoDoArtefato + (taxaDoArtefato * 2);
    }

    //Calculo de cv

    public double getCvDoArtefato(){
        return cvDoArtefato;
    }
}
