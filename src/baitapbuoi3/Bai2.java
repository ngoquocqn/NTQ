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
public class Bai2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ho va ten: ");
    String hoVaTen = sc.nextLine();
    System.out.println("Nhap nam sinh: ");
    int namSinh = sc.nextInt();
    System.out.println("Nhap tuoi: ");
    int tuoi = sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    String gT = sc.nextLine();
    System.out.println("Nhap GPA: ");
    float gPA = sc.nextFloat();
    sc.nextLine();
    System.out.println("Nhap que quan: ");
    String queQuan = sc.nextLine();
    
    System.out.println("Ho va ten: "+ hoVaTen + "Nam sinh: "+ namSinh 
            + "Tuoi: "+ tuoi + "Gioi tinh: "+ gT + "Diem GPA: "
            + gPA + "Que quan: "+ queQuan );
    //System.out.println("Nam sinh: "+ namSinh  ); 
    //System.out.println("Tuoi: "+ tuoi  );
    //System.out.println("Gioi tinh: "+ gT  );
    //System.out.println("Diem GPA: "+ gPA  );
    //System.out.println("Que quan: "+ queQuan  );
    }   
}
