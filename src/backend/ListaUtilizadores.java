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
public class ListaUtilizadores {

    public ListaUtilizadores() {
        listas = new ArrayList<Utilizador>();
    }
    
     private ArrayList<Utilizador> listas;

    // metodo seletor
    public ArrayList<Utilizador> getListas() {
        return listas;
    }

    //metodo modificador
    public void setListas(ArrayList<Utilizador> listas) {
        this.listas = listas;
    }
    
}
