/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai3;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab2Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float  thanhTien;

Scanner scanner = new Scanner(System.in);
System.out.println("Nhap so Dien: ");
float soDien = scanner.nextFloat();

if (soDien >= 0 && soDien < 50 ){
	thanhTien=soDien*1000;
}else {
	thanhTien=50*1000 + (soDien - 50)*1200;
}

System.out.println("Thanh Tien la: "+ thanhTien);
    }
    
}
