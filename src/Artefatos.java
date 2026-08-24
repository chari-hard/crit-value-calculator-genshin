public class Artefatos {
    private double taxaDoArtefato;
    private double danoDoArtefato;

    public Artefatos(){

    }

    // get

    public double getTaxa(){
        return taxaDoArtefato;
    }
    public double getDano(){
        return danoDoArtefato;
    }

    // set

    public void setTaxa(double taxa){
        this.taxaDoArtefato = taxa;
    }

    public void setDano(double dano){
        this.danoDoArtefato = dano;
    }
}
