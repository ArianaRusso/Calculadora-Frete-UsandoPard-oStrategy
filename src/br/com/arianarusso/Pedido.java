package br.com.arianarusso;


/*
 * Implementação do padrão Strategy
 * Atributo do calculadoraDeFrete do tipo da interface.
 */
public class Pedido {

    private float valorPedido;
    private Integer distancia;

    private Integer pesoTotalPedido;
    private CalculadoraDeFrete calculadoraDeFrete;

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public void setPesoTotalPedido(Integer pesoTotalPedido) {
        this.pesoTotalPedido = pesoTotalPedido;
    }

    public void setCalculadoraDeFrete(CalculadoraDeFrete calculadoraDeFrete) {
        this.calculadoraDeFrete = calculadoraDeFrete;
    }

    public float calculaValorTotal() {
        float valorFrete = this.calculadoraDeFrete.calcularFrete
                (this.valorPedido, this.distancia, this.pesoTotalPedido);

        float valorTotalPedido = valorFrete + this.valorPedido;

        String nomeFrete = this.calculadoraDeFrete.getNome();

        System.out.println("Valor pedido: " + valorPedido);
        System.out.println("Valor frete " + nomeFrete + ": " + valorFrete);
        System.out.println("Valor total: " + valorTotalPedido);

        return valorTotalPedido;
    }

}
