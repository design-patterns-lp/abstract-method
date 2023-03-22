package abstractfactory;

import AbstractFactory.FabricaAbstrata;
import AbstractFactory.FabricaDuelista;
import AbstractFactory.FabricaSentinela;
import AbstractFactory.Jogador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void deveAtirarArmaSentinela(){
        FabricaAbstrata fabrica = new FabricaSentinela();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Atira com rifle de precisão", jogador.atirar());
    }

    @Test
    void deveAtirarArmaDuelista(){
        FabricaAbstrata fabrica = new FabricaDuelista();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Atira com fuzil de assalto", jogador.atirar());
    }

    @Test
    void deveUsarHabilidadeEspecialSentinela(){
        FabricaAbstrata fabrica = new FabricaSentinela();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Habilidade especial de defesa", jogador.usarHabilidade());
    }

    @Test
    void deveUsarHabilidadeEspecialDuelista(){
        FabricaAbstrata fabrica = new FabricaDuelista();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Habilidade especial de ataque", jogador.usarHabilidade());
    }
}
