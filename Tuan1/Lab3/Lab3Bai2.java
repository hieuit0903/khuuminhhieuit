/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai2;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab3Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=9;
        for (int i=1;i<=9;i++){
            System.out.printf("\nBảng Cửu Chương "+i);
            for (int j=1; j<=10; j++){
                System.out.printf("\n%d * "+j+" = %d",i,(i * j));
                System.out.println();
            }
        }
    }
    
}
