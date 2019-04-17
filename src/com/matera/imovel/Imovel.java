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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imovel imovel = (Imovel) o;

        if (preco != imovel.preco) return false;
        return end != null ? end.equals(imovel.end) : imovel.end == null;

    }

    @Override
    public int hashCode() {
        int result = end != null ? end.hashCode() : 0;
        result = 31 * result + preco;
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }



    public String endNull(String end){

        if (end == null){
            IllegalArgumentException erro = new IllegalArgumentException("");
            throw erro;
        }
        else {
            this.setEnd(end);

              return getEnd();
        }
    }


    public int verificaPrecoNegativo( int preco){
        if (preco<= 0){
            IllegalArgumentException erro = new IllegalArgumentException("Argumento preco nao pode ser lido");
         throw erro;
        }

        else {
            this.setPreco(preco);

              return getPreco();
        }
    }
}






