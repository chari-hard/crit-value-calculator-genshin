public class Artefatos {
    private double taxaDoArtefato;
    private double danoDoArtefato;
    private double cvDoArtefato;

    public Artefatos(){

    }

    // get

    public double getTaxa(){
        return taxaDoArtefato;
    }
    public double getDano(){
        return danoDoArtefato;
    }

    public double getCvDoArtefato(){
        return cvDoArtefato;
    }

    // set

    public void setTaxa(double taxa){
        this.taxaDoArtefato = taxa;
    }

    public void setDano(double dano){
        this.danoDoArtefato = dano;
    }

    //outros métodos

    public void setCvDoArtefato(){
        this.cvDoArtefato = (this.taxaDoArtefato * 2) + this.danoDoArtefato;
    }

}
