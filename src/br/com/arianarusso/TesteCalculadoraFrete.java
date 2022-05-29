package br.com.arianarusso;

public class TesteCalculadoraFrete {

    public static void main(String[] args) {

        FreteExpress freteExpress= new FreteExpress();
        FreteNormal freteNormal = new FreteNormal();

        System.out.println("Pedido padrão");
        Pedido pedido1= new Pedido();
        pedido1.setValorPedido(200);
        pedido1.setDistancia(30);
        pedido1.setPesoTotalPedido(1);

        pedido1.setCalculadoraDeFrete(freteExpress);

        System.out.println(pedido1.calculaValorTotal());

        System.out.println();

        pedido1.setCalculadoraDeFrete(freteNormal);

        System.out.println(pedido1.calculaValorTotal());

        System.out.println("---------------------");

        System.out.println("Pedido pesado e distante");
        Pedido pedido2= new Pedido();
        pedido2.setValorPedido(100);
        pedido2.setDistancia(105);
        pedido2.setPesoTotalPedido(10);

        pedido2.setCalculadoraDeFrete(freteExpress);

        System.out.println(pedido2.calculaValorTotal());

        System.out.println();

        pedido2.setCalculadoraDeFrete(freteNormal);

        System.out.println(pedido2.calculaValorTotal());
    }
}
