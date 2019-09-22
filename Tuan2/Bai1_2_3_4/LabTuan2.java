/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Khuu Hieu
 */
public class LabTuan2 extends JFrame {
    public LabTuan2(){
         super("Demo Windows");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
          // Sử Dụng FlowLayout
       /*  JPanel jpn = new JPanel();
        jpn.setLayout(new FlowLayout()); 
        jpn.setBackground(Color.magenta); 
        JButton btn1 = new JButton("FlowLayout"); 
        JButton btn2 = new JButton("Add Control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết Chỗ");
        JButton btn5 = new JButton("Thì Xuống Dòng");
        
        jpn.add(btn1);
        jpn.add(btn2);
        jpn.add(btn3);
        jpn.add(btn4);
        jpn.add(btn5);
  
        Container con = getContentPane();
        con.add(jpn); */
        
       // BoxLayout
         /*   JPanel pnBox = new JPanel();
            pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
          
            JButton btn1 = new JButton("Box Layout");
            btn1.setForeground(Color.yellow);
            Font font =new Font("Arial",Font.BOLD / Font.ITALIC,25);
            btn1.setFont(font);
            pnBox.add(btn1);
            
            JButton btn2 = new JButton("X_AXIS");
            btn2.setForeground(Color.pink);
            btn2.setFont(font);
            pnBox.add(btn2);
            
            JButton btn3 = new JButton("Y_AXIS");
            btn3.setForeground(Color.red);
            btn3.setFont(font);
            pnBox.add(btn3);
            
            Container con = getContentPane();
            con.add(pnBox); */
         
         // BorderLayout
            JPanel pnBorder = new JPanel();
            pnBorder.setLayout(new BorderLayout());
            JPanel pnNorth = new JPanel();
            pnNorth.setBackground(Color.red);
            pnBorder.add(pnNorth, BorderLayout.NORTH);
            
            JPanel pnSouth = new JPanel();
            pnSouth.setBackground(Color.red);
            pnBorder.add(pnSouth, BorderLayout.SOUTH);
            
            JPanel pnWest = new JPanel();
            pnWest.setBackground(Color.blue);
            pnBorder.add(pnWest, BorderLayout.WEST);
            
            JPanel pnEAST = new JPanel();
            pnEAST.setBackground(Color.blue);
            pnBorder.add(pnEAST, BorderLayout.EAST);
            
            JPanel pnCenter = new JPanel();
            pnCenter.setBackground(Color.yellow);
            pnBorder.add(pnCenter, BorderLayout.CENTER);
            
            getContentPane().add(pnBorder);
            
    }    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      LabTuan2 ui = new LabTuan2();
      ui.setSize(420, 420);
      ui.setLocationRelativeTo(null); 
      ui.setVisible(true);
    }
    
}
