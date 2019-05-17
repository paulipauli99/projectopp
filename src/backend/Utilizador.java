/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Paulo Rodrigues
 */
public class Utilizador {
    
    private String nome;
    private String username;
    private String email;
    private String pass;

    public Utilizador(String nome, String username, String email, String pass) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.pass = pass;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

   @Override
    public String toString(){
    String s="";
    s+="\n";
    s+="\nNOME: " + nome;
    s+="\nUSERNAME: " + username;
    s+="\nEMAIL: " + email;
    s+="\nPASS: " + pass;
    return s.toString();
    }
    
    
    
    
}

