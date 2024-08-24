/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class CheckInput {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        boolean ck1 = sc.hasNextInt();
        boolean ck2 = sc.hasNextDouble();
        System.out.println("Check" + ck1);
    }
}

