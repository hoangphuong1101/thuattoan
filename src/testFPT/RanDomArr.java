package testFPT;

import java.util.Random;

public class RanDomArr {
    public static void main(String[] args) {
        int[] a=new int [10];
        Random ran=new Random();
        
        for(int i=0;i<10;i++)
        	a[i]= ran.nextInt(100);
        for(int i=0;i<10;i++)
            System.out.println(a[i]+"  ");
    }
}
