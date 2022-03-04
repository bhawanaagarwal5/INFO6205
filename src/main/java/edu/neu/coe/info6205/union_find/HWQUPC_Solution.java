package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class HWQUPC_Solution {
    
    
    
    public static void executeUFwithPC(int num){
        UF u = new UF_HWQUPC(num);
        Random r = new Random();
        
        int connectedPairs = 0;
        while(u.components() != 1){
            int i = r.nextInt(num);
            int j = r.nextInt(num);
            
            if ( i == j) continue;
            
            if(! u.isConnected(i, j)){
//                System.out.println("Connecting...");
                u.connect(i, j);
                
            }
//            else {
//                System.out.println("Elements are already connected!");
//            }

            connectedPairs++;
            
            
        }
        System.out.println("Number of elements/sites : " + num);
        System.out.println("Number of connections : " + connectedPairs);
        
        System.out.println("====================================================");
    }
    
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int numOfSites = sc.nextInt();
        System.out.println("Number of sites are : " + numOfSites);
        System.out.print("Enter the number of experiments : ");
        int exp = sc.nextInt();
        sc.close();
        for (int i = 0; i < exp; i++ ){
            if(i!=0){
                numOfSites *= 2;
            }
            executeUFwithPC(numOfSites);
        }
    }
}
