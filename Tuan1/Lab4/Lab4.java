/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
public class Lab4  extends SanPham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tạo sản phẩm với 3 kiểu hàm dựng
		/*
		SanPham sp1 = new SanPham();
		sp1.nhap();
		sp1.xuat();
                System.out.println(sp1.getThueNhapKhau());
		
		SanPham sp2 = new SanPham("SanPham 2",200000);
		sp2.xuat();
		
		SanPham sp3 = new SanPham("SanPham 3",300000,3000);
		sp3.xuat();
		
		
		//Nhập mảng sử dụng array list

		ArrayList<SanPham> productArray = new ArrayList<>();
		productArray.add(sp1);
		productArray.add(sp2);
		productArray.add(sp3);
		
		for(SanPham product: productArray)
		{
			System.out.println("Tên SP: " + product.getTenSP() +"\nDon Gia: " + product.getDonGia() +"\nGiam Gia: " + product.getGiamGia());
		}
*/
		//Nhập xuất mảng sản phẩm
		SanPham product = new SanPham();
		product.NhapSP();
    }
    
}
