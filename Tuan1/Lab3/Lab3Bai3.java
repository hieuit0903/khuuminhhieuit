/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Khuu Hieu
 */
public class Lab3Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Min, sum=0;
        double tbCong, dem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = scanner.nextInt();
       int array[] = new int[n];
       for (int i= 0; i< n; i++ ){
           System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
       }
       // Xuất ra mảng và xuất ra theo thứ tự đã sắp xếp.
        System.out.print("Các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            Arrays.sort(array);
        System.out.println(array[i]);
        }
        
        // Xuất phần tử có giá trị nhỏ nhất ra màn hình:
        for (int i= 0; i< n; i++ ){
         Min = Math.min(n,array[i]);
           System.out.println("\nSố nhỏ nhất là: " +Min);
           break;
       }
        // Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3:
        for (int i= 0; i< n; i++ ){
            if (array[i] % 3 == 0){
                sum =+ array[i];
                dem++;
            }        
        }
         tbCong= sum / dem;
         System.out.println("TBC: " +tbCong);    
    }
    
}
