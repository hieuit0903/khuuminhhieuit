/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai4;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab2Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
    }
    public static void bacNhat(){
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
    
    public static void bacHai(){
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập hệ số bậc 2, a = ");
            float a = scanner.nextFloat();
            System.out.print("Nhập hệ số bậc 1, b = ");
            float b = scanner.nextFloat();
            System.out.print("Nhập hằng số tự do, c = ");
            float c = scanner.nextFloat();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        double delta = b*b - 4*a*c;
        double x1,x2,x;
        // tính nghiệm
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2*a));
            x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + x);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
        }
        
     public static void tienDien(){
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
        
    public static void Menu(){
            
        int chon;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nemu: ");
        System.out.println("1. PT Bac Nhat");
        System.out.println("2. PT Bac Hai");
        System.out.println("3. Tinh Tien Dien");
        System.out.println("4. Exit");
        
        System.out.println("Chọn số đi nè: ");
        chon  = scanner.nextInt();
        switch (chon){
            case 1:
                bacNhat();
                    break;
            case 2:
                   bacHai();
                   break;
            case 3: 
                tienDien();
                break;
            case 4:
                    System.out.println("Đã Thoát!!!");
                   System.exit(0);
                   break;
            default :
                System.out.println("Chọn sai rồi chọn lại đi nè!!!");
        }
    }
}
