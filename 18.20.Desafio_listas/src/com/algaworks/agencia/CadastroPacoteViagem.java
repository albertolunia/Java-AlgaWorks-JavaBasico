package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {
    private List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {

        if(pacotes.contains(new PacoteViagem(descricao, precoDiaria))){
            throw new IllegalArgumentException("Pacote já existe");
        }
        pacotes.add(new PacoteViagem(descricao, precoDiaria));
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar(){
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente(){
        Collections.sort(pacotes, Collections.reverseOrder());
    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> iterator = pacotes.iterator();
        while(iterator.hasNext()){
            PacoteViagem pacote = iterator.next();
            if(pacote.getDescricao().equals(descricao)){
                iterator.remove();
                return;
            }
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for(PacoteViagem pacote : pacotes){
            if(pacote.getDescricao().equals(descricao)){
                return pacote;
            }
        }
        return null;
    }

}
