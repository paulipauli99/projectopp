/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectof;

import Frontend.Projetos;
import backend.FileIO;
import backend.Projeto;
import backend.Tarefa;
import backend.Utilizador;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Rodrigues
 */
public class ProjectoF {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Projeto> projetos;
        ArrayList<Utilizador> utilizadores;
        ArrayList<Tarefa> tarefas;
        
        // TODO code application logic here
        projetos = new ArrayList<>();
        utilizadores = new ArrayList<>();
        tarefas = new ArrayList<>();
        
        //testes de utilizadores
        Utilizador user1 = new Utilizador("joao", "jeje", "user1@mail.com", "pass1"); 
        utilizadores.add(user1);
        Utilizador user2 = new Utilizador("paulo", "user2", "user2@mail.com", "pass2"); 
        utilizadores.add(user2);
        
        //testes de projetos
       Projeto proj1 = new Projeto("visaox");
       projetos.add(proj1);
       Projeto proj2 = new Projeto("visaoy");
       projetos.add(proj2);
        
        FileIO io = new FileIO();
        io.saveUsers(utilizadores);
        
        FileIO read = new FileIO();
        read.readUsers(utilizadores);
        
        FileIO io1 = new FileIO();
        io1.saveProj(projetos);
        
        
        System.out.println();
    }
    
}
