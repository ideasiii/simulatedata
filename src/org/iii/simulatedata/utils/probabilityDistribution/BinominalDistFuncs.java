package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.random.RandomGenerator;

public class BinominalDistFuncs extends BinomialDistribution {

    public BinominalDistFuncs(RandomGenerator rng, int trials, double p) {
        super(rng, trials, p);

    }

    public static void main(String[] args){
        BinominalDistFuncs test = new BinominalDistFuncs(10,10,0.9);

        System.out.println(test);
    }
}
