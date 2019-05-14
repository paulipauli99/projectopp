/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author shenr
 */
public class ListadeTarefas {
    public ListadeTarefas(){
        listas = new ArrayList<Tarefas>();
    }
    private ArrayList<Tarefas> listas;

    public ArrayList<Tarefas> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Tarefas> listas) {
        this.listas = listas;
    }
    
    
}
