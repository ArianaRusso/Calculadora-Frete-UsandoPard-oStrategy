package br.com.arianarusso;


public interface CalculadoraDeFrete {
    float calcularFrete(float valorPedido, Integer distancia, Integer pesoTotalPedido);

    String getNome();
}
