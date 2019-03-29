package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.random.RandomGenerator;

public class BinominalDistFuncs extends BinomialDistribution {

    public BinominalDistFuncs(RandomGenerator rng, int trials, double p) {
        super(rng, trials, p);

    }

    public static void main(String[] args){

        RandomGeneratorIII rng = new RandomGeneratorIII();

        rng.setSeed(1000);
        rng.nextInt(1000);
        BinominalDistFuncs test = new BinominalDistFuncs(rng,10,0.9);

        System.out.println(Integer.valueOf(test.sample()));
    }
}
