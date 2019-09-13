/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Khuu Hieu
 */
public class Lab1Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao Canh: ");
        double canh = scanner.nextDouble();

        v = Math.pow(canh,3);
        System.out.println("The Tich V: "+ v);
    }
    
}
