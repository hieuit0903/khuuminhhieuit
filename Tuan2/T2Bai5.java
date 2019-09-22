/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2bai5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Khuu Hieu
 */
public class T2Bai5 extends JFrame{
    public T2Bai5(String title){
        setTitle(title);
    }
    public void doShow()
	{
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addControl();
		setResizable(false);
		setVisible(true);
	}	
    public void addControl(){
        JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth=new JPanel();
		JLabel lblTitle=new JLabel("Giải phương trình bậc 2");
                pnNorth.add(lblTitle);
		pnBorder.add(pnNorth,BorderLayout.NORTH);
                pnNorth.setBackground(Color.GRAY);
		lblTitle.setForeground(Color.BLACK);
		Font ft=new Font("arial", Font.BOLD, 25);
		lblTitle.setFont(ft);

                JPanel pnSouth=new JPanel();
		pnSouth.setLayout(new BoxLayout(pnSouth, BoxLayout.X_AXIS));
		JButton btnGiai=new JButton("Giải");
		JButton btnXoa=new JButton("Xóa");
		JButton btnThoat=new JButton("Thoát");
		pnSouth.add(btnGiai);
		pnSouth.add(Box.createVerticalStrut(10));
		pnSouth.add(btnXoa);
		pnSouth.add(Box.createVerticalStrut(10));
		pnSouth.add(btnThoat);
		pnBorder.add(pnSouth,BorderLayout.SOUTH);
		//pnSouth.setBackground(Color.LIGHT_GRAY);
                Border  southborder
		=BorderFactory.createLineBorder(Color.RED);
            
		TitledBorder southTitleBorder=
				new TitledBorder(southborder, "Chọn thao tác");
		pnSouth.setBorder(southTitleBorder);
                JPanel pnCenter=new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		pnBorder.add(pnCenter,BorderLayout.CENTER);
           
		
		Border  centerborder
		=BorderFactory.createLineBorder(Color.RED);
		TitledBorder centerTitleBorder=
				new TitledBorder(centerborder, "nhập 3 số a, b và c:");
		pnCenter.setBorder(centerTitleBorder);

                JPanel pna=new JPanel();
		JLabel lbla=new JLabel("nhập a:");
		final JTextField txta=new  JTextField(15);
		pna.add(lbla);
		pna.add(txta);
		pnCenter.add(pna);

                JPanel pnb=new JPanel();
		JLabel lblb=new JLabel("nhập b:");
		final JTextField txtb=new  JTextField(15);
		pnb.add(lblb);
		pnb.add(txtb);
		pnCenter.add(pnb);

                JPanel pnc=new JPanel();
		JLabel lblc=new JLabel("nhập c:");
		final JTextField txtc=new  JTextField(15);
		pnc.add(lblc);
		pnc.add(txtc);
		pnCenter.add(pnc);
                
                JPanel pnkq=new JPanel();
		JLabel lblkq=new JLabel("Kết quả:");
		final JTextField txtkq=new  JTextField(20);
		pnkq.add(lblkq);
		pnkq.add(txtkq);
		pnCenter.add(pnkq);
		
		lbla.setPreferredSize(lblkq.getPreferredSize());
		lblb.setPreferredSize(lblkq.getPreferredSize());
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ret=JOptionPane.showConfirmDialog(null, "Bạn có chắc thoát chương trình?", "Thoát", JOptionPane.YES_NO_OPTION);
				if(ret==JOptionPane.YES_OPTION)
					System.exit(0);
			}
});
                
                btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txta.setText("");
				txtb.setText("");
                                txtc.setText("");
				txtkq.setText("");
				txta.requestFocus();
			}
		});

                   btnGiai.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent arg0) {
				String sa=txta.getText();
				double a=0,b=0, c=0;
				try
				{
					a=Integer.parseInt(sa);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
					txta.selectAll();
					txta.requestFocus();
					return;
				}

                                String sb=txtb.getText();
				try
				{
					b=Integer.parseInt(sb);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
					txtb.selectAll();
					txtb.requestFocus();
					return;
				}
                                
                                String sc=txtc.getText();
				try
				{
					c=Integer.parseInt(sc);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
					txtc.selectAll();
					txtc.requestFocus();
					return;
				}
                                double kq=0;
                                  if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
               // System.out.println("Phương trình có một nghiệm: "
                 //       + "x = " + (-c / b));
                txtkq.setText("Phương trình có 1 nghiệm: "+ "x= "+ (-c/b));
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
            //System.out.println("Phương trình có 2 nghiệm là: "
              //      + "x1 = " + x1 + " và x2 = " + x2);
            
            txtkq.setText("Phương trình có 2 nghiệm: "+ "x1= "+ x1 + "và x2= "+ x2);
        } else if (delta == 0) {
           x = (-b / (2 * a));
        //    System.out.println("Phương trình có nghiệm kép: " + x);
            txtkq.setText("Phương trình có nghiệm kép: "+ "x= "+x);
        } else {
            System.out.println("Phương trình vô nghiệm!");
            txtkq.setText("Phương trình vô nghiệm ");
        }
           // txtkq.setText(kq+"");

                   }
                   });  
                Container con=getContentPane();
		con.add(pnBorder);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        T2Bai5 ui=new T2Bai5("Phương Trình Bậc 2");
		ui.doShow();

    }
    
}
