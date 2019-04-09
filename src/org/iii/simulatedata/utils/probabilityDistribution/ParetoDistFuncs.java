package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.ParetoDistribution;

import java.util.Arrays;

public class ParetoDistFuncs extends ParetoDistribution {
    public static double[] ParetoDistFuncs(int r){
        ParetoDistFuncs paretoRG = new ParetoDistFuncs();
        return paretoRG.sample(r);
    }
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(ParetoDistFuncs(20)));//pareto dist
//    }
}
