package com.br.model;

import java.util.ArrayList;

public class Evento{
    private String nome;
    private String data;
    private ArrayList<Cliente> clientes;

    public Evento(){
        this.clientes = new ArrayList<>();
    }

    public Evento(String nome, String data){
            this.nome = nome;
            this.data = data ;
            this.clientes = new ArrayList<>();
    }

    public void setCliente(Cliente cliente){
        clientes.add(cliente);

    }


    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    @Override
    public String toString() {
        return "Evento" +
                "\nnome: " + nome +
                "\ndata: " + data  + clientes;
    }
}
