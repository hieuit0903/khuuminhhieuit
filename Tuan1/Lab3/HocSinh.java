/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb3b4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Khuu Hieu
 */
class HocSinh {
     public Scanner sr = new Scanner(System.in);
        private String hoTen;
	private double diemTB;
	
	public HocSinh() {
	}

	
	public String getName() {
		return hoTen;
	}

	public void setName(String name) {
		this.hoTen = name;
	}

	public double getMark() {
		return diemTB;
	}

	public void setMark(double mark) {
		this.diemTB = mark;
        }    
            
        public void nhap()
	{
		System.out.print("Nhập Họ Tên: ");
		String hoTen = sr.nextLine();
		this.setName(hoTen);
		
		System.out.print("Nhập Điểm TB: ");
		double diemTB =  sr.nextDouble();
		this.setMark(diemTB);
        }
        
        
        public void nhapDayHocSinh()
	{
		System.out.print("Nhập Số Lượng Học Sinh: ");
		int n = sr.nextInt();
		HocSinh[] dayHocSinh = new HocSinh[n];
		
		for(int i=0;i<n;i++)
		{
			HocSinh student = new HocSinh();
			student.nhap();
			dayHocSinh[i] = student;
		}
		HocSinh temp;
		for(int i=0;i<dayHocSinh.length-1;i++)
		{
			for(int j=i+1;j<dayHocSinh.length;j++)
			{
				if(dayHocSinh[i].diemTB > dayHocSinh[j].diemTB)
				{
					temp = dayHocSinh[i];
					dayHocSinh[i] = dayHocSinh[j];
					dayHocSinh[j] = temp;
				}
			}
		}
                
                	for(HocSinh student: dayHocSinh)
		{
			if(student.diemTB>=9)
			{
				System.out.println("Họ Tên: " + student.getName() +"\nĐiểm TB: " + student.getMark() +"\nXếp Loại: Xuất Sắc");
			}
			else if(student.diemTB <9 && student.diemTB >=7.5)
			{
				System.out.println("Họ Tên: " + student.getName() +"\nĐiểm TB: " + student.getMark()+"\nXếp Loại: Giỏi");
			}
			else if(student.diemTB <7.5 && student.diemTB >=6.5)
			{
				System.out.println("Họ Tên: " + student.getName() +"\nĐiểm TB: " + student.getMark()+"\nAcademic evaluation: Khá");
			}
			else if(student.diemTB <6.5 && student.diemTB >=5)
			{
				System.out.println("Họ Tên: " + student.getName() +"\nĐiểm TB: " + student.getMark()+"\nAcademic evaluation: Trung Bình");
			}
			else
			{
				System.out.println("Họ Tên: " + student.getName() +"\nĐiểm TB: " + student.getMark()+"\nAcademic evaluation: Yếu");
			}
		}
	}
        }
