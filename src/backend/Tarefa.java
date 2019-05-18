/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Date;

/**
 *
 * @author Paulo Rodrigues
 */
public class Tarefa {
    
    private String titulo;
    private int prioridade; /* o estado é categorizado em 3 digitos (1-pendente,2-em curso,3-fechado) */
    private Date dataFim;
    private Date dataInicio;
    private int estado; /* o estado é categorizado em 3 digitos (1-pendente,2-em curso,3-fechado) */
    private String utilAssociado; // isto é o username
    private String utilCriador;

    public Tarefa(String titulo, int prioridade, Date dataFim, Date dataInicio, int estado, String utilAssociado, String utilCriador){

        this.titulo= titulo;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.prioridade = prioridade;
        this.estado = estado;
        this.utilAssociado = utilAssociado;
        this.utilCriador = utilCriador;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUtilAssociado() {
        return utilAssociado;
    }

    public void setUtilAssociado(String utilAssociado) {
        this.utilAssociado = utilAssociado;
    }

    public String getUtilCriador() {
        return utilCriador;
    }

    public void setUtilCriador(String utilCriador) {
        this.utilCriador = utilCriador;
    }
    
    
}
