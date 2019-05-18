/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Rodrigues
 */
public class FileIO {
    private Object ler;
    
    //METODO PARA GRAVAR UTILIZADORES
    public void saveUsers(ArrayList<Utilizador> utilizadores){
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\53pau\\Documents\\NetBeansProjects\\ProjectoF\\users.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            for(Utilizador user : utilizadores){
                gravarArq.println(user.toString());
            }
       
            arq.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //METODO PARA LER USERS
    public ArrayList<Utilizador> readUsers(){
        
        ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
        try {
          FileReader arq = new FileReader("C:\\Users\\53pau\\Documents\\NetBeansProjects\\ProjectoF\\users.txt");
          BufferedReader lerArq = new BufferedReader(arq);

          String linha = lerArq.readLine(); // lê a primeira linha
    // a variável "linha" recebe o valor "null" quando o processo
    // de repetição atingir o final do arquivo texto
          while (linha != null) {

            String[] parts = linha.split(",");
            Utilizador p = new Utilizador(parts[0],parts[1],parts[2],parts[3]);
            utilizadores.add(p);
            linha = lerArq.readLine(); // lê da segunda até a última linha
          }

          arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
 
        return utilizadores;
    }

    //METODO PARA GRAVAR PROJETOS
    public void saveProj(ArrayList<Projeto> projetos){
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\53pau\\Documents\\NetBeansProjects\\ProjectoF\\projetos.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            for(Projeto user : projetos){
                gravarArq.println(user.toString());
            }
       
            arq.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

