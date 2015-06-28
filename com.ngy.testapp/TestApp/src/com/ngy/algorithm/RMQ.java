package com.ngy.algorithm;

/**
 * Created by niuguangyuan on 6/28/15.
 */
public class RMQ {
    /**
     * simple rmq algorithm. return the min value index
     * @param array
     * @param p
     * @param q
     * @return
     */
    public static int rmq_simple(int[] array, int p, int q, int i, int j) {
        if (i < p || j > q) throw new IndexOutOfBoundsException("rmq query index wrong");
        int index = i;
        for (int k = i; k <= j; k++) {
            if (array[k] < array[index]) {
                index = k;
            }
        }
        return index;
    }
}
