package backend;

import java.util.ArrayList;

/**
 *
 * @author shenr
 */
public class ListadeProjetos {
    public ListadeProjetos (){
        listas = new ArrayList<Projeto>();
    }
    private ArrayList<Projeto> listas;

    public ArrayList<Projeto> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Projeto> listas) {
        this.listas = listas;
    }
}
