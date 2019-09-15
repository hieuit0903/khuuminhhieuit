/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Khuu Hieu
 */
class SanPham {
    public Scanner sr = new Scanner(System.in);
	private String tenSP;//Tên sản phẩm
	private double donGia;//Đơn giá
	private double giamGia;//giảm giá
	
	//Hàm dựng 3 tham số
	public SanPham(String tenSP, double donGia, double giaGiam) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	//Hàm dựng 2 tham số - sản phẩm không giảm giá
	public SanPham(String tenSP, double donGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
	}

	//Hàm dựng rỗng
	public SanPham() {

	}

	//Lấy tên sản phẩm
	public String getTenSP() {
		return tenSP;
	}
	
	//Set tên sản phẩm
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	//Lấy đơn giá
	public double getDonGia() {
		return donGia;
	}

	//Set đơn giá
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	//Lấy giá giảm
	public double getGiamGia() {
		return giamGia;
	}

	//Set giá giảm
	public void setGiamGia(double giamGia ) {
		this.giamGia = giamGia;
	}

	//Lấy thuế nhập
	private double getThueNhapKhau()
	{
		return this.donGia * 0.1;
	}
	
	//Nhập thông tin sản phẩm
	public void nhap()
	{
		System.out.print("Nhập Tên SP: ");
		String tenSP = sr.nextLine();
		this.setTenSP(tenSP);
		
		System.out.print("Nhập Đơn Gía: ");
		double donGia =  sr.nextDouble();
		this.setDonGia(donGia);
		
		System.out.print("Nhập Gía Giảm: ");
		double giamGia =  sr.nextDouble();
		this.setGiamGia(giamGia);
	}
	
	//Tạo và xuất mảng sản phẩm
	public void NhapSP()
	{
		System.out.print("Nhập Số Sản Phẩm: ");
		int n = sr.nextInt();
		SanPham[] daySP = new SanPham[n];
		
		for(int i=0;i<n;i++)
		{
			SanPham product = new SanPham();
			product.nhap();
			daySP[i] = product;
		}
		for(SanPham product: daySP)
		{
			System.out.println("Tên SP: " + product.getTenSP() +"\nĐơn Gía: " + product.getDonGia() +"\nGiảm giá: " + product.getGiamGia() + "\nThuế Nhập Khẩu: " +product.getThueNhapKhau());
		}
	}
	
	//Xuất thông tin 1 sản phẩm
	public void xuat()
	{
		System.out.println("Tên SP: " + this.getTenSP() +"\nĐơn Gía: " + this.getDonGia() +"\nGiảm Gía: " + this.getGiamGia()+ "\nThuế Nhập Khẩu: " +this.getThueNhapKhau());
	}
}
