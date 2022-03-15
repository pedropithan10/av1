package br.com.senai.model;

import java.util.ArrayList;

public class Pedido {

    public String descricao;
    public double total;
    public String data;
    public ArrayList<ItensDoPedido> itensDoPedidos;

    public Pedido(){
        itensDoPedidos = new ArrayList<>();
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public void setItensDoPedido(String nome, double preco, int quantidade){
        ItensDoPedido item = new ItensDoPedido();
        item.setProduto(nome, preco, quantidade);
        this.total += preco * quantidade;
        itensDoPedidos.add(item);
    }


    @Override
    public String toString() {
        return "Pedido" +
                "\nDescrição: " + descricao +
                "\nTotal: " + total +
                "\nData: " + data;
    }

}
