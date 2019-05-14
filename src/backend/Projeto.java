/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import Backend.ListaUtilizadores;
import java.util.Calendar;

/**
 *
 * @author shenr
 */
public class Projeto {

    public Projeto(String titulo, Calendar datainicio, Calendar datafim) {
        this.titulo = titulo;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }
    
    private String titulo;
    private Calendar datainicio;
    private Calendar datafim;
    
    private ListaUtilizadores pessoal;
    private ListadeTarefas afazeres;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Calendar datainicio) {
        this.datainicio = datainicio;
    }

    public Calendar getDatafim() {
        return datafim;
    }

    public void setDatafim(Calendar datafim) {
        this.datafim = datafim;
    }

    public ListaUtilizadores getPessoal() {
        return pessoal;
    }

    public void setPessoal(ListaUtilizadores pessoal) {
        this.pessoal = pessoal;
    }

    public ListadeTarefas getAfazeres() {
        return afazeres;
    }

    public void setAfazeres(ListadeTarefas afazeres) {
        this.afazeres = afazeres;
    }
}
