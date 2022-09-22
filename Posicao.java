package jogo_poo;

import java.util.ArrayList;

public class Posicao {
    public ArrayList<Jogadores> jogador = new ArrayList();  
    
    public void cadastro(Jogadores jogadores){

        jogador.add(jogadores);
        
        for (Jogadores j : jogador) {
        System.out.println(j);
        }
    }
        public int numjogadores() {
        return jogador.size();
        }
    
}
