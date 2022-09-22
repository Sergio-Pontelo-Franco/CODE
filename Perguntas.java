package jogo_poo;

import java.util.ArrayList;

public class Perguntas {

    public ArrayList<Perguntas> pergunta = new ArrayList();  
    
    public void cadastro(Perguntas perguntas){

        pergunta.add(perguntas);
        
        for (Perguntas p : pergunta) {
        System.out.println(p);
        }
    }
        public int numperguntas() {
        return pergunta.size();
        }
    
}
