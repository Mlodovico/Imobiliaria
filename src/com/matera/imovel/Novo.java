package com.matera.imovel;

public class Novo extends Imovel {


    public Novo( String end, int preco) {
        super(end,preco);
        int valorizacao = valorizacaoImovel(preco);

        super.setPreco(valorizacao);
    }

    private int valorizacaoImovel(double preco) {
           double valorizacaoImovel = preco + (preco * 0.20 );
           return (int) valorizacaoImovel;
    }

}
