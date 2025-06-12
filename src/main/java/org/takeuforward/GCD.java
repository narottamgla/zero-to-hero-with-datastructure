package org.takeuforward;

public class GCD {

    public static void main(String[] args) {
        int num= 11;
        int gcd = getGCD(num);
        System.out.println(gcd);

    }

    private static int getGCD(int num) {

        int maximumNum=1;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                maximumNum=i;
            }
        }

        if (maximumNum==1){
            return num;
        }

        return maximumNum;



    }
}
