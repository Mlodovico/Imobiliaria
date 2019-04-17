package com.matera.imovel;
import java.util.*;



public class Main {

    public static void main(String[] args) {


    Imovel I1 = new Imovel("23242424", 500);
    Imovel I2 = new Imovel("27742424", 800);
    Imovel I3 = new Imovel("26642424", 1000);
    Imovel I4 = new Imovel("25542424", 500);
    Imovel I5 = new Imovel("29942424", 200);
    Imovel I6 = new Imovel("28842424", 230);

    HashMap <Imovel, String> hash = new HashMap<Imovel, String>();

    hash.put(I1,"Informação Importante sobre o cliente" );
    hash.put(I2,"Informação Importante sobre o cliente" );
    hash.put(I3,"Informação Importante sobre o cliente" );
    hash.put(I4,"Informação Importante sobre o cliente" );
    hash.put(I5,"Informação Importante sobre o cliente" );
    hash.put(I6,"Informação Importante sobre o cliente" );

    String info = hash.get(I1);
        System.out.println(info);
        System.out.println(hash.containsKey(info));






    }
}





