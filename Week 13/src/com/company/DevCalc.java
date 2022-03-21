package com.company;

public class DevCalc {
    //takes in array, outputs std. dev. results
    public void devCalc(double[] sample) {
        double sum = 0;
        for (double val : sample) {
            sum += val;
        }
        double mean = (sum / sample.length);
        double squaredValues = 0;
        for (double val : sample)
            squaredValues += (val - mean) * (val - mean);
        double standardDeviation = Math.sqrt(squaredValues / (sample.length - 1));
        System.out.println("The sum is:");
        System.out.format("%.2f%n", sum);
        System.out.println("The mean is:");
        System.out.format("%.2f%n", mean);
        System.out.println("The standard deviation is:");
        System.out.format("%.2f%n", standardDeviation);
    }
}

