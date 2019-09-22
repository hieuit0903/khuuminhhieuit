/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2bai7;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author Khuu Hieu
 */
public class Tuan2Bai7 extends JFrame{
    
    /**
     * @param args the command line arguments
     */
    private JTextField txtEnter;
    private JCheckBox ckbSelectMinus;
    private JList jList;
    DefaultListModel listModel;
    
    public Tuan2Bai7(){
        super("Thao tác trên List");
        setSize(500, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addControl();
    }
      private void addControl() {
       JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        Font font = new Font("Arial", Font.BOLD, 25);
        JPanel pnNouth = new JPanel();
        JLabel lblTitle = new JLabel("Thao tác trên JList - Checkbox");
        lblTitle.setForeground(Color.BLUE);
        lblTitle.setFont(font);
        pnNouth.add(lblTitle);
        pnBorder.add(pnNouth, BorderLayout.NORTH);

        JPanel pnWest = new JPanel();
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
        Border border = BorderFactory.createLineBorder(Color.RED);
        pnWest.setBorder(new TitledBorder(border, "Chọn tác vụ"));
        pnWest.setPreferredSize(new Dimension(200, 0));
        // các btn
        JButton btnEven = new JButton("Tô đen số chẳn");
        pnWest.add(btnEven);
        pnWest.add(Box.createVerticalStrut(10));
        JButton btnOdd = new JButton("Tô đen số lẽ");
        pnWest.add(btnOdd);
        pnWest.add(Box.createVerticalStrut(10));
        JButton btnPrime = new JButton("Tô đen số nguyên tố");
        pnWest.add(btnPrime);
        pnWest.add(Box.createVerticalStrut(10));
        JButton btnSpace = new JButton("Bỏ tô đen");
        pnWest.add(btnSpace);
        pnWest.add(Box.createVerticalStrut(10));
        JButton btnRemove = new JButton("Xóa các giá trị đang tô đen");
        pnWest.add(btnRemove);
        pnWest.add(Box.createVerticalStrut(10));
        JButton btnSum = new JButton("Tổng giá trị trong JList");
        pnWest.add(btnSum);
        pnWest.add(Box.createVerticalStrut(10));
        pnBorder.add(pnWest, BorderLayout.WEST);

        JPanel pnCenter = new JPanel();
        pnCenter.setBorder(new TitledBorder(border, "Nhập thông tin:"));
        pnCenter.setLayout(new BorderLayout());
        JPanel pnInput = new JPanel();
        JButton btnEnter = new JButton("Nhập");
        pnInput.add(btnEnter);
        txtEnter = new JTextField(5);
        pnInput.add(txtEnter);
        ckbSelectMinus = new JCheckBox("Chọn nhập số âm", false);
        pnInput.add(ckbSelectMinus);
        pnCenter.add(pnInput, BorderLayout.NORTH);
        
        listModel = new DefaultListModel();
        JPanel pnJList = new JPanel();
        jList = new JList(listModel);
        jList.setVisibleRowCount(12);
        jList.setFixedCellWidth(270);
        jList.setSelectionBackground(new Color(154, 185, 219));
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane jScrollPane = new JScrollPane(jList);
        pnJList.add(jScrollPane);
        pnCenter.add(pnJList, BorderLayout.CENTER);
        pnBorder.add(pnCenter, BorderLayout.CENTER);

        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.LIGHT_GRAY);
        pnSouth.setBorder(border);
        JButton btnDong = new JButton("Đóng chương trình");
        pnSouth.add(btnDong);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);

        Container container = getContentPane();
        container.add(pnBorder);

        jList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
//                txtEnter.setText(jList.getSelectedValue().toString());
            }
        });

        txtEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        btnDong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Bạn muốn đóng chương trình?", "Đóng", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        btnEven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectNum(true);
            }
        });

        btnOdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectNum(false);
            }
        });

        btnPrime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> selectPrime = new ArrayList<>();
                int[] mSelected;

                for (int i = 0; i < listModel.getSize(); i++) {
                    if (soNguyenTo((int) listModel.get(i))) {
                        selectPrime.add(i);
                    }
                }

                mSelected = convertIntegers(selectPrime);
                jList.setSelectedIndices(mSelected);
            }
        });

        btnSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jList.clearSelection();
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jList.getSelectedIndices().length > 0) {
                    int[] selectedIndices = jList.getSelectedIndices();
                    for (int i = selectedIndices.length - 1; i >= 0; i--) {
                        listModel.removeElementAt(selectedIndices[i]);
                    }
                }
            }
        });

        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                for (int i = 0; i < listModel.getSize(); i++) {
                    sum += (int) listModel.get(i);
                }

                JOptionPane.showMessageDialog(null, "Tổng = " + sum);
            }
        });
    }

    public static boolean soNguyenTo(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void selectNum(boolean op) {
        ArrayList<Integer> selectEven = new ArrayList<>();
        ArrayList<Integer> selectOdd = new ArrayList<>();
        int[] mSelected;

        for (int i = 0; i < listModel.getSize(); i++) {
            if (((int) listModel.get(i) % 2) == 0) {
                selectEven.add(i);
            } else {
                selectOdd.add(i);
            }
        }

        if (op) {
            mSelected = convertIntegers(selectEven);
            jList.setSelectedIndices(mSelected);
        } else {
            mSelected = convertIntegers(selectOdd);
            jList.setSelectedIndices(mSelected);
        }
    }

    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    private void addItem() {
        try {
            String text = txtEnter.getText().trim();
            if (!text.equals("")) {
                int num = Integer.parseInt(text);
                if (ckbSelectMinus.isSelected())
                    listModel.addElement(num);
                else {
                    if (num < 0) {
                        JOptionPane.showMessageDialog(null, "Chưa cho phép nhập số âm");
                        txtEnter.requestFocus();
                        txtEnter.selectAll();
                    } else
                        listModel.addElement(num);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!");
            txtEnter.selectAll();
            txtEnter.requestFocus();
        }

          
      }
    public static void main(String[] args) {
        // TODO code application logic here
         Tuan2Bai7 ui = new Tuan2Bai7();
        ui.setVisible(true);
    }
    
}
