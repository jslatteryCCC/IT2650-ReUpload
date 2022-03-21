package com.IT2650;
import java.text.DecimalFormat;

public class DevCalc {

    /*get the sample set - array?
      get the mean  - sum array/array length
      subtract the mean from the sample set ((sum of set - (mean * num of items in sample ?)squared)
      / by num of items - 1
      find square root of this quotient





     */
    public void setArray(){



    }
    public class DecimalFormatDemo {

        public void customFormat(String pattern, double value ) {
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(value);
            System.out.println(value + "  " + pattern + "  " + output);
        }

        public void main(String[] args) {

            customFormat("###,###.###", 123456.789);
            customFormat("###.##", 123456.789);
            customFormat("000000.000", 123.78);
            customFormat("$###,###.###", 12345.67);
        }
    }
    public double devCalc(int[] set){
        double sum = 0;
        for(double val : set){
            sum += val;
        }
        double mean = (sum / set.length);
        double prep = 0;
        for (double val : set)
            prep += (val - mean) * (val - mean);
        double divide = prep / (set.length - 1);
        double fin = Math.sqrt(divide);
        System.out.println("The sum is:");
        System.out.format("%.2f%n", sum);
        System.out.println("The mean is:");
        System.out.format("%.2f%n", mean);
        System.out.println("The standard deviation is:");
        System.out.format("%.2f%n", fin);

        return fin;

    }
}
