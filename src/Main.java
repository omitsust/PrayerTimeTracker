/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pr;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    JFrame frame = new JFrame();
    int window_x = 700, window_y = 600;
    Main()
    {
        JLabel fnm = new JLabel();
        fnm.setOpaque(true);
        fnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_pr/t1img4.jpg")));
        fnm.setBounds(window_x-250,12,245,52);
        frame.add(fnm);
        
        JLabel fnx = new JLabel();
        fnx.setOpaque(true);
        fnx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_pr/timg1.jpg")));
        fnx.setBounds(window_x-150,window_y-130,146,73);
        frame.add(fnx);
        
        fnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                frame.dispose();
                new Soft_page();
                
            }
        });
        
        ImageIcon i1=new ImageIcon("images\\img1.jpg");
        JLabel jLab=new JLabel();
        jLab.setIcon(i1);
        jLab.setBounds(0, 0, window_x, window_y);
        frame.add(jLab);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(window_x, window_y);
        frame.setResizable(false);
    }
    public static void main(String args[])
    {
        new Main();
    }
}
