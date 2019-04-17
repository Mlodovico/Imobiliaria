package com.matera.imovel;

public class Velho extends Imovel {


    public Velho(String end, int preco) {
            super(end,preco);
        int valorDepreciado = valorizacaoImovel(preco);

        super.setPreco(valorDepreciado);

        }

    private int valorizacaoImovel(double preco) {
        double valorizacaoImovel = preco - (preco * 0.20);
        return  (int) valorizacaoImovel;
    }
}