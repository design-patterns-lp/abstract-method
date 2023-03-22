package AbstractFactory;

public class Jogador {
    private Arma arma;
    private HabilidadeEspecial habilidadeEspecial;

    public Jogador(FabricaAbstrata fabrica){
        this.arma = fabrica.createArma();
        this.habilidadeEspecial = fabrica.createHabilidadeEspecial();
    }

    public String atirar(){
        return this.arma.atirar();
    }

    public String usarHabilidade(){
        return this.habilidadeEspecial.usar();
    }

}
