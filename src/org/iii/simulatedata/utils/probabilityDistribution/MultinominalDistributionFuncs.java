package org.iii.simulatedata.utils.probabilityDistribution;

import org.iii.simulatedata.utils.probabilityDistribution.distrib.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultinominalDistributionFuncs {

    private static Multinomial distribMultiNominal = null;
    public static Object multinominalRandomGenerator(int r, int n, double[] p){

        distribMultiNominal = new Multinomial();
        Util.initRandom(true);
        ArrayList allRandomValueResult = new ArrayList<>();
        for (int i=0; i <= n; i++){
            multinominalProbSetting mbProbSetting = new multinominalProbSetting(); //初始化機率矩陣
//            double[] probVector = {0.2,0.2,0.2,0.2,0.2}; //注意機率加總要等於1
            mbProbSetting.setElement(n,1,p); //x控制生成數量
            distribMultiNominal.setParams(n, mbProbSetting); //n控制類別數量
            ArrayList randomValueResult = (ArrayList) distribMultiNominal.sampleVal();
           // System.out.println("randomValueResult: " + randomValueResult);
            for (int j= 0; j <= n-1; j++){
//                System.out.println(randomValueResult.get(j));
                int randomValue = (int) randomValueResult.get(j);
                allRandomValueResult.add(randomValue);
            }
        }
        ArrayList allRandomValueResultRev = new ArrayList<>();
        for (int i=0; i<=r-1; i++){
            allRandomValueResultRev.add(allRandomValueResult.get(i));
        }
//        System.out.println("allRandomValueResult: " + allRandomValueResultRev);
        return allRandomValueResultRev;
    }

//    public static void main(String[] args){
//        double[] p  = {0.2,0.2,0.2,0.2,0.2};
//        ArrayList result = (ArrayList) multinominalRandomGenerator(20, 5, p); //multinominal dist
////        System.out.println(result.size());
//        Collections.shuffle((List<?>) result); //shuffle重組
//        System.out.println(result);
//
//    }

}
