package com.adriano.conjectura_collatz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ConjecturaCollatzTest {

    private ConjecturaCollatz conjecturaCollatz;

    @Before
    public void init(){
        this.conjecturaCollatz = new ConjecturaCollatz();
    }

    @Test
    public void testSimpleCase()  {
        List<Integer> result = this.conjecturaCollatz.processar(1);
        Assert.assertEquals(result, Arrays.asList(1));
    }

    @Test
    public void testSimpleCase2()  {
        List<Integer> result = this.conjecturaCollatz.processar(5);
        Assert.assertEquals(result, Arrays.asList(5,16,8,4,2,1));
    }

    @Test
    public void testSimpleCase3()  {
        List<Integer> result = this.conjecturaCollatz.processar(-2);
        Assert.assertEquals(result, Arrays.asList());
    }
}