/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai4;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab1Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double delta, canBacHai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PT Bac Hai Co Dang: aX^2+bx-c");
        System.out.println("Nhap a: ");
        float a = scanner.nextFloat();

        System.out.println("Nhap b: ");
        float b = scanner.nextFloat();

        System.out.println("Nhap c: ");
        float c = scanner.nextFloat();

        delta = Math.pow(b,2)-4*a*c;
        canBacHai=Math.sqrt(delta);

        System.out.println("Delta= " +delta);
        if (delta < 0){
            System.out.println ("Khong the lay can bac hai so am");
        }else{
        System.out.println("Can Bac Hai Delta= " + canBacHai);
        }
             
    }
    
}
