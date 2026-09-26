/**
 * Problem: Q0.48 - Basic_Level_1_Conditional_Statements_7
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
        char ch=sc.next().charAt(0);
        int int2=sc.nextInt();
        if(ch=='+'){
            System.out.println(int1+int2);
        }
        else if(ch=='-'){
            System.out.println(int1-int2);
        }
        else if(ch=='*'){
            System.out.println(int1*int2);
        }
        else if(ch=='/'){
            System.out.println(int1/int2);
        }
        
        // your code goes here
    }
}
