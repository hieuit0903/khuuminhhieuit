/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai2;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float canhNhoNhat, p , s;
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        float chieuDai = scanner.nextFloat();

        System.out.println("Nhap chieu rong: ");
        float chieuRong = scanner.nextFloat();

        p= (chieuDai + chieuRong)*2;

        s=  chieuDai*chieuRong;

        canhNhoNhat= Math.min(chieuDai,chieuRong);

System.out.println("Chu Vi: " + p);
System.out.println("Dien Tich: "+ s);
System.out.println("Canh Nho Nhat: "+ canhNhoNhat);

    }
    
}
