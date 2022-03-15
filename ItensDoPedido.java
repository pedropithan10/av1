package br.com.senai.model;

public class ItensDoPedido {

    public Produto produto;
    public int quantidade;

    public Produto getProduto() { return produto; }

    public void setProduto(String nome, double preco, int quantidade) {
        this.produto = new Produto();
        this.produto.setNome(nome);
        this.produto.setPreco(preco);
        this.quantidade = quantidade;
    }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Itens Do Produto: " +
                "\nProduto: " + produto +
                "\nQuantidade: " + quantidade;
    }


}
