package com.matera.imovel;

public class Imovel {


    private String end;
    private int preco;



    public Imovel(String end, int preco) {
        this.end = end;
        this.preco = preco;

    }


    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }



    public int hashCode() {

        int I = getEnd().length() * 8;

        return I;
    }

    public boolean equals(Object obj) {

        if ((obj instanceof Imovel) && ((Imovel) obj).getEnd().equals(this.getEnd())) {
            return true;
        }
        else {
            return false;
        }

    }



    public String endNull(String end){

        if (end == null){
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
        else {
            this.setEnd(end);

              return getEnd();
        }
    }


    public int verificaPrecoNegatico( int preco){
        if (preco<= 0){
            IllegalArgumentException erro = new IllegalArgumentException();
         throw erro;
        }

        else {
            this.setPreco(preco);

              return getPreco();
        }
    }
}






