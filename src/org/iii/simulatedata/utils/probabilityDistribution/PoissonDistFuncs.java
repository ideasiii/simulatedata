package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

import java.util.Arrays;

public class PoissonDistFuncs extends PoissonDistribution {

    public PoissonDistFuncs(double p) throws NotStrictlyPositiveException {
        super(p);
    }

    public static int[] PoissonDistFuncs(int r, double p){
        PoissonDistFuncs poissonRG = new PoissonDistFuncs(p);
        return poissonRG.sample(r);
    }
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(PoissonDistFuncs(20,1)));//poisson dist
//    }
}
