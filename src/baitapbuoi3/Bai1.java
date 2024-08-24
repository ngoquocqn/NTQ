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
public class Bai1 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap du lieu: ");
    String name = sc.nextLine();
    System.out.println("Name:" + name);
    
    System.out.println("Enter an int number: ");
    int number = sc.nextInt();
    System.out.println("Number:" + number);
    
    System.out.println("Enter an int number: ");
    double number1 = sc.nextDouble();
    System.out.println("Number1:" + number1);
    
    System.out.println("Enter an int number: ");
    float number2 = sc.nextInt();
    System.out.println("Number2:" + number2);
    }
}

