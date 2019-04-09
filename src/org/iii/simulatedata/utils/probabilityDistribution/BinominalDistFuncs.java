package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.BinomialDistribution;

import java.util.Arrays;

public class BinominalDistFuncs extends BinomialDistribution {

    public BinominalDistFuncs(int trials, double p) {
        super(trials, p);
    }

    public static int[] BinominalDistFuncs(int r, int n, double p){
        BinominalDistFuncs binominalRG = new BinominalDistFuncs(n, p);
        return binominalRG.sample(r);
    }
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(BinominalDistFuncs(20,1, 0.5)));//bernouill dist
//    }

}
