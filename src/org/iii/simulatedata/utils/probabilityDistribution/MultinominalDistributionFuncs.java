package org.iii.simulatedata.utils.probabilityDistribution;

import org.iii.simulatedata.utils.probabilityDistribution.distrib.*;

public class MultinominalDistributionFuncs {

//    private Multinomial test = null;
//    public MultinominalDistributionFuncs(){
//        test = new Multinomial();
//        Util.initRandom(true);
//
//        multinominalProbSetting mbProbSetting = new multinominalProbSetting();
//        double[] probVector = {0.2,0.2,0.2,0.2,0.2}; //注意機率加總要等於1
//        mbProbSetting.setElement(5,1,probVector); //x控制生成數量
//        test.setParams(10, mbProbSetting); //n控制類別數量
//        System.out.println("123: "+ test.sampleVal());
//    }

    private static Multinomial distribMultiNominal = null;
    public static Object multinominalRandomGenerator(int r, int n, double[] p){
        distribMultiNominal = new Multinomial();
        Util.initRandom(true);
        multinominalProbSetting mbProbSetting = new multinominalProbSetting(); //初始化機率矩陣
//        double[] probVector = {0.2,0.2,0.2,0.2,0.2}; //注意機率加總要等於1
        mbProbSetting.setElement(r,1,p); //x控制生成數量
        distribMultiNominal.setParams(n, mbProbSetting); //n控制類別數量
//        System.out.println(distribMultiNominal.sampleVal());

        return distribMultiNominal.sampleVal();
    }

    public static void main(String[] args){
        double[] p  = {0.2,0.2,0.2,0.2,0.2};
        System.out.println(multinominalRandomGenerator(10,5,p));//multinominal dist

    }

//    public static void main(String[] args){
//
//
//        System.out.println(multinominalRandomGenerator(20,5, p));
//    }
}
