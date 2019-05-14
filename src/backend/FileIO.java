/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Rodrigues
 */
public class FileIO {
    
    public void saveUsers(ArrayList<Utilizador> utilizadores){
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\53pau\\Documents\\NetBeansProjects\\ProjectoF\\users.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            for(Utilizador user : utilizadores){
                gravarArq.printf(user.toString());
                
            }

            arq.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
