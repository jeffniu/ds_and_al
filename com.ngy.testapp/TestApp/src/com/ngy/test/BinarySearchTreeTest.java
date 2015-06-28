package com.ngy.test;

import java.util.HashMap;


/**
 * Created by niuguangyuan on 6/6/15.
 */
public class BinarySearchTreeTest {

    @org.junit.Test
    public void testInsert() throws Exception {
    }

    @org.junit.Test
    public void testHashMapInsert() throws Exception {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            hm.put(i, i);
        }
    }
}