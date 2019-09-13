/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai1;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab3Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i; 
        Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap vao 1`so: ");
       n = scanner.nextInt();
       for (i=2;i<n-1;n++){
           if (n % i == 0){
               System.out.println("Không phải số nguyên tố");
               break;
           }else {
               System.out.println("Đây là số nguyên tố");
               break;
           }
       }
    }
    
}
