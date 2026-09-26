/**
 * Problem: Q0.47 - Basic_Level_1_Conditional_Statements_6
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
        char ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println("LOWERCASE");
        }
        else{
            System.out.println("UPPERCASE");
        }
        // your code goes here
    }
}
