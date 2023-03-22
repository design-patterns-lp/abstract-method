package AbstractFactory;

public class FabricaDuelista implements FabricaAbstrata{
    @Override
    public Arma createArma(){
        return new ArmaDuelista();
    }

    @Override
    public HabilidadeEspecial createHabilidadeEspecial(){
        return new HabilidadeEspecialDuelista();
    }
}
