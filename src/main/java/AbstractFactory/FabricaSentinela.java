package AbstractFactory;

public class FabricaSentinela implements FabricaAbstrata{
    @Override
    public Arma createArma(){
        return new ArmaSentinela();
    }

    @Override
    public HabilidadeEspecial createHabilidadeEspecial(){
        return new HabilidadeEspecialSentinela();
    }
}
