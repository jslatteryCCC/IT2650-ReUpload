package com.IT2650;

public class Main {

    public static void main(String[] args) {

        public class DRoot {
            public static int digital_root(int n) {
                // ...
                String given = String.valueOf(n);
                char[] givenArray = given.toCharArray();

                if(givenArray.length > 1){
                    for (int i = 0; i < givenArray.length - 1; i++ ){
                        return givenArray[i] + givenArray[i+1];

                    }
                }
            }
        }
        digital_root(16);


    }
}
