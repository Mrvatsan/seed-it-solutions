/**
 * Problem: Q0.49 - Basic_Level_1_Conditional_Statements_8
 * Category: General
 * Difficulty: Medium
 * Platform: SEED-IT Platform (https://seed-it.com)
 * Date Solved: 2026-09-26
 * Language: java
 * Test Cases: 30 / 30 Passed (100%)
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int int1=sc.nextInt();
        int int2=sc.nextInt();
        if(int1==0 && int2==0){
            System.out.println("Point lies at the origin");
        }
        else if(int1<0 && int2<0){
            System.out.println("Point lies in the Third quandrant");
        }
        else if(int1>0 && int2<0){
            System.out.println("Point lies in the Fourth quandrant");
        }
        else if(int1<0 && int2>0){
            System.out.println("Point lies in the Second quandrant");
        }
        else{
            System.out.println("Point lies in the First quandrant");
        }
        
        
        // your code goes here
    }
}
