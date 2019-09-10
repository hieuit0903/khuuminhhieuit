/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai1;

import java.util.Scanner;

/**
 *
 * @author Khuu Hieu
 */
public class Lab1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
Scanner scanner = new Scanner(System.in); 
System.out.print("Họ và tên: ");
String hoTen = scanner.nextLine();
System.out.print("Điểm TB: ");
double diemTB = scanner.nextDouble();
System.out.println("Họ Tên: " +hoTen);
System.out.println("ĐiểmTB: "+ diemTB);
    }
    
}
