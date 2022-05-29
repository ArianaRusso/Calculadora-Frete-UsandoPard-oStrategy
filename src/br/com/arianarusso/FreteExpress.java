package br.com.arianarusso;

/*
 *Implementação do padrão Strategy
 * Classe que implementou a interface para proporcionar comportamentos diferentes no objeto Pedido
 */
public class FreteExpress implements CalculadoraDeFrete {
    @Override
    public float calcularFrete(float valorPedido, Integer distancia, Integer pesoTotalPedido) {
        float valorFrete = 0f;

        if (valorPedido > 300 || distancia < 10) valorFrete = 0;
        else if (distancia > 10 && distancia < 100) valorFrete = 30f;
        else if (distancia > 100) valorFrete = 50f;
        if (pesoTotalPedido > 5) valorFrete *= 2;

        return valorFrete;
    }

    //Informa o tipo de frete na impressão
    @Override
    public String getNome() {
        return "express";
    }
}
