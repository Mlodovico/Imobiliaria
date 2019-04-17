package com.matera.imovel;

import org.junit.Assert;
import org.junit.Test;


public class VelhoTest extends RuntimeException{

    @Test
    public void testDepreciacaoImovel(){

          Imovel imovel = new Velho( "End", 400);

        Assert.assertEquals(320,imovel.getPreco());



    }
}
