package com.ngy.test;

import com.ngy.algorithm.RMQ;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by niuguangyuan on 6/28/15.
 */

public class RMQTest {

    private int smallArray[];

    @Before
    public void setUp() throws Exception {
        smallArray = new int[] {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
    }

    @org.junit.Test
    public void testRMQSimple() {
        Assert.assertEquals(3, RMQ.rmq_simple(smallArray, 0, smallArray.length-1, 1, 3));
    }

}
