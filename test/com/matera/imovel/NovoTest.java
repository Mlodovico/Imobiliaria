package com.matera.imovel;
import org.junit.Test;
import org.junit.Assert;

public class NovoTest extends RuntimeException{

    @Test
     public void testValorizacaoImovel(){
        Imovel imovel = new Novo("345342", 100);

        Assert.assertEquals(120, imovel.getPreco());

    }
}
