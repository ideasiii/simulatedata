package org.iii.simulatedata.utils.probabilityDistribution;

import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

import java.util.ArrayList;
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
//        System.out.println(Arrays.toString(PoissonDistFuncs(200,1)));//poisson dist
//
//        /*
//        同時伸縮
//         */
//        int[] testResult = PoissonDistFuncs(200,3);
//        ArrayList testResultRev = new ArrayList();
//        for (int i=0; i < testResult.length; i++){
//            double resultRev = (double) testResult[i] / 10;
//            testResultRev.add(resultRev);
//        }
//        System.out.println(testResultRev);
//    }
}
