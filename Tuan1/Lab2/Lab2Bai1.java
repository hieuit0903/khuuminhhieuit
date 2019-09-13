/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai1;
import java.util.Scanner;

/**
 *
 * @author Khuu Hieu
 */
public class Lab2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = scanner.nextFloat();
        
        System.out.println("Nhap b: ");
        float b = scanner.nextFloat();
        if (a==0){
                if(b==0) {
                    System.out.println("PT Vô Số Nghiệm");
                }else {
                    System.out.println("PT Vô Nghiệm");
                }
            }else {
                    x=-b/a;
                    System.out.println("PT Có Nghiệm X= "+x );
                }
        
    }
    
}
