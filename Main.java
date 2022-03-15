package br.com.senai;
import br.com.senai.model.Produto;
import br.com.senai.model.ItensDoPedido;
import br.com.senai.model.Pedido;

public class Main {
    public static void main(String[] args) {

        System.out.println("Compra 1");

        Pedido pedido1 = new Pedido();

        pedido1.setDescricao("Compra de Jon Jones");
        pedido1.setData("15/03/2022");
        pedido1.setItensDoPedido("Macarrão", 25.55, 2);
        pedido1.setItensDoPedido("Arroz", 20.00, 3);
        pedido1.setItensDoPedido("Sorvete", 19.99, 1);
        pedido1.setItensDoPedido("Água", 6.55, 5);
        pedido1.setItensDoPedido("Feijão", 25.00, 2);
        pedido1.setItensDoPedido("Frango", 49.00, 1);
        pedido1.setItensDoPedido("Bolacha", 26.50, 7);
        pedido1.setItensDoPedido("Chiclete", 3.00, 1);
        pedido1.setItensDoPedido("Suco", 12.99, 1);
        pedido1.setItensDoPedido("Chocolate", 6.50, 3);
        System.out.println(pedido1);



        System.out.println("Compra 2");
        Pedido pedido2 = new Pedido();
        pedido2.setDescricao("Compra de Anderson Silva");
        pedido2.setData("12/03/2022");
        pedido2.setItensDoPedido("Açai", 21.35, 2);
        pedido2.setItensDoPedido("Picolé", 15.00, 5);
        pedido2.setItensDoPedido("Cerveja", 25.00, 6);
        pedido2.setItensDoPedido("Vodka", 18.00, 1);
        pedido2.setItensDoPedido("Whisky", 170.00, 1);
        pedido2.setItensDoPedido("Refrigerante", 9.00, 1);
        pedido2.setItensDoPedido("Cigarro", 10.50, 1);
        pedido2.setItensDoPedido("Queijo", 15.00, 2);
        pedido2.setItensDoPedido("Salame", 12.99, 1);
        pedido2.setItensDoPedido("Tequila", 90.00, 2);
        System.out.println(pedido2);






}
}

