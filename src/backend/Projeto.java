/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shenr
 */
public class Projeto {

    private String titulo;
    private Date dataInicio;
    private Date dataFim;
    private ArrayList<Tarefa> listaTarefas;
    private ArrayList<Utilizador> pessoal;
    private Utilizador owner;
    
    public Projeto(String titulo, Date datainicio, Date datafim,ArrayList<Tarefa> listaTarefas,Utilizador owner) {
        this.titulo = titulo;
        this.dataInicio = datainicio;
        this.dataFim = datafim;
        this.listaTarefas = listaTarefas;
        this.owner = owner;
    }

  public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDatainicio() {
        return dataInicio;
    }

    public void setDatainicio(Date datainicio) {
        this.dataInicio = datainicio;
    }

    public Date getDatafim() {
        return dataFim;
    }

    public void setDatafim(Date datafim) {
        this.dataFim = datafim;
    }

    public ArrayList<Utilizador> getPessoal() {
        return pessoal;
    }

    public void setPessoal(ArrayList<Utilizador> pessoal) {
        this.pessoal = pessoal;
    }

    public Utilizador getOwner() {
        return owner;
    }

    public void setOwner(Utilizador owner) {
        this.owner = owner;
    }

      @Override
    public String toString(){
    String s="";
    s+="\n";
    s+="\n " + titulo;
    s+="\n " + dataInicio;
    s+="\n " + dataFim;
    s+="\n " + owner;
    return s;
}
}