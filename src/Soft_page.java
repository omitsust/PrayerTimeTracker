/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pr;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;


public class Soft_page{
    JFrame frame = new JFrame();
    JFrame frame1;
    int window_x = 700, window_y = 600;
    JCheckBox chk1,chk2,chk3,chk4,chk5,chk6;
    
    JSlider sl;
    Soft_page()
    {
        Font font=new Font("Comic Sans MS", Font.BOLD, 25);
        JLabel com = new JLabel();
        com.setText("Today's Azan Shedule");
        com.setForeground(Color.WHITE);
        com.setBounds(350, 25, 350, 30);
        com.setFont(font);
        frame.add(com);
        
        Font font1=new Font("Comic Sans MS", Font.BOLD, 25);
        JLabel com1 = new JLabel();
        com1.setText("of");
        com1.setForeground(Color.WHITE);
        com1.setBounds(470, 55, 150, 30);
        com1.setFont(font);
        frame.add(com1);
        
        Font font2=new Font("Comic Sans MS", Font.BOLD, 25);
        final JLabel comL = new JLabel();
        comL.setText("Latitude:");
        comL.setForeground(Color.WHITE);
        comL.setBounds(230, 95, 130, 30);
        comL.setFont(font2);
        frame.add(comL);
        
        Font font3=new Font("Comic Sans MS", Font.PLAIN, 15);
        TextField texL=new TextField();
        texL.setBounds(360, 95, 110, 30);
        texL.setFont(font3);
        frame.add(texL);
        
        
        final JLabel comLn = new JLabel();
        comLn.setText("Longitud: ");
        comLn.setForeground(Color.WHITE);
        comLn.setBounds(230, 135, 130, 30);
        comLn.setFont(font2);
        frame.add(comLn);
        
        
        TextField texLn=new TextField();
        texLn.setBounds(360, 135, 110, 30);
        texLn.setFont(font3);
        frame.add(texLn);
        
        Font font4=new Font("Comic Sans MS", Font.PLAIN, 18);
        JButton sh1=new JButton("Show");
        sh1.setBounds(360, 175, 80, 40);
        sh1.setBackground(Color.gray);
        sh1.setFont(font4);
        frame.add(sh1);
        
        JLabel or = new JLabel();
        or.setText("or");
        or.setForeground(Color.ORANGE);
        or.setBounds(480, 115, 30, 30);
        or.setFont(font2);
        frame.add(or);
        
        JLabel comc = new JLabel();
        comc.setText("City:");
        comc.setForeground(Color.WHITE);
        comc.setBounds(510, 95, 80, 30);
        comc.setFont(font2);
        frame.add(comc);
        
        final TextField texc=new TextField();
        texc.setBounds(590, 95, 100, 30);
        texc.setFont(font3);
        frame.add(texc);
        
        JLabel comcn = new JLabel();
        comcn.setText("Coun: ");
        comcn.setForeground(Color.WHITE);
        comcn.setBounds(510, 135, 80, 30);
        comcn.setFont(font2);
        frame.add(comcn);
        
        
        TextField texcn=new TextField();
        texcn.setBounds(590, 135, 100, 30);
        texcn.setFont(font3);
        frame.add(texcn);
        
        JButton sh2=new JButton("Show");
        sh2.setBounds(590, 175, 80, 40);
        sh2.setBackground(Color.gray);
        sh2.setFont(font4);
        frame.add(sh2);
        
        Font font8=new Font("Dialog", Font.BOLD, 20);
        JLabel shdule = new JLabel();
        shdule.setText("Azan Shedule");
        shdule.setForeground(Color.WHITE);
        shdule.setBounds(420, 245, 350, 30);
        shdule.setFont(font);
        frame.add(shdule);
        
        JLabel fajr = new JLabel();
        fajr.setText("Fajr    ");
        fajr.setBackground(Color.WHITE);
        fajr.setForeground(Color.DARK_GRAY);
        fajr.setBounds(360, 275, 150, 30);
        fajr.setFont(font8);
        frame.add(fajr);
        final JLabel fajrt = new JLabel();
        fajrt.setText("");
        fajrt.setForeground(Color.DARK_GRAY);
        fajrt.setBounds(540, 275, 150, 30);
        fajrt.setFont(font8);
        frame.add(fajrt);
        
        JLabel rise = new JLabel();
        rise.setText("Sunrise ");
        rise.setForeground(Color.DARK_GRAY);
        rise.setBounds(360, 305, 150, 30);
        rise.setFont(font8);
        frame.add(rise);
        final JLabel riset = new JLabel();
        riset.setText("");
        riset.setForeground(Color.DARK_GRAY);
        riset.setBounds(540, 305, 100, 30);
        riset.setFont(font8);
        frame.add(riset);
        
        final JLabel dhuhr = new JLabel();
        dhuhr.setText("Dhuhr ");
        dhuhr.setForeground(Color.DARK_GRAY);
        dhuhr.setBounds(360, 335, 150, 30);
        dhuhr.setFont(font8);
        frame.add(dhuhr);
        final JLabel dhuhrt = new JLabel();
        dhuhrt.setText("");
        dhuhrt.setForeground(Color.DARK_GRAY);
        dhuhrt.setBounds(540, 335, 100, 30);
        dhuhrt.setFont(font8);
        frame.add(dhuhrt);
        
        JLabel asr = new JLabel();
        asr.setText("Asr     ");
        asr.setForeground(Color.DARK_GRAY);
        asr.setBounds(360, 365, 150, 30);
        asr.setFont(font8);
        frame.add(asr);
        final JLabel asrt = new JLabel();
        asrt.setText("");
        asrt.setForeground(Color.DARK_GRAY);
        asrt.setBounds(540, 365, 100, 30);
        asrt.setFont(font8);
        frame.add(asrt);
        
        JLabel maghrib = new JLabel();
        maghrib.setText("Maghrib");
        maghrib.setForeground(Color.DARK_GRAY);
        maghrib.setBounds(360, 395, 150, 30);
        maghrib.setFont(font8);
        frame.add(maghrib);
        final JLabel maghribt = new JLabel();
        maghribt.setText("");
        maghribt.setForeground(Color.DARK_GRAY);
        maghribt.setBounds(540, 395, 100, 30);
        maghribt.setFont(font8);
        frame.add(maghribt);
        
        JLabel isha = new JLabel();
        isha.setText("Isha    ");
        isha.setForeground(Color.DARK_GRAY);
        isha.setBounds(360, 425, 150, 30);
        isha.setFont(font8);
        frame.add(isha);
        final JLabel ishat = new JLabel();
        ishat.setText("");
        ishat.setForeground(Color.DARK_GRAY);
        ishat.setBounds(540, 425, 100, 30);
        ishat.setFont(font8);
        frame.add(ishat);
        
        ImageIcon i8=new ImageIcon("images\\img8.jpg");
        JLabel jLab8=new JLabel();
        jLab8.setIcon(i8);
        jLab8.setBounds(350, 250, 300, 206);
        frame.add(jLab8);
        
        final JLabel alarmL = new JLabel();
        alarmL.setText("Alarm-");
        alarmL.setForeground(Color.BLACK);
        alarmL.setBounds(500, 480, 100, 30);
        alarmL.setFont(font);
        frame.add(alarmL);
        final JButton alarmI = new JButton();
        alarmI.setText("");
        alarmI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_pr/alarm-png.jpg")));
        alarmI.setBounds(590, 470, 60, 61);
        frame.add(alarmI);
        
        alarmI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                frame1=new JFrame();
                
                Font font=new Font("Comic Sans MS", Font.BOLD, 25);
                JLabel com = new JLabel();
                com.setText("Select For Alarm :");
                com.setForeground(Color.WHITE);
                com.setBounds(10, 25, 350, 30);
                com.setFont(font);
                frame1.add(com);
                
                chk1=new JCheckBox();
                chk1.setBounds(10, 70, 16, 13);
                chk1.setBackground(Color.DARK_GRAY);
                frame1.add(chk1);
                JLabel fj = new JLabel();
                Font font1=new Font("Comic Sans MS", Font.PLAIN, 20);
                fj.setText("Fajr");
                fj.setForeground(Color.WHITE);
                fj.setBounds(30, 60, 80, 30);
                fj.setFont(font1);
                frame1.add(fj);
                
                chk2=new JCheckBox();
                chk2.setBounds(10, 100, 16, 13);
                chk2.setBackground(Color.DARK_GRAY);
                frame1.add(chk2);
                JLabel rs = new JLabel();
                rs.setText("Sunrise");
                rs.setForeground(Color.WHITE);
                rs.setBounds(30, 90, 80, 30);
                rs.setFont(font1);
                frame1.add(rs);
                
                chk3=new JCheckBox();
                chk3.setBounds(10, 130, 16, 13);
                chk3.setBackground(Color.DARK_GRAY);
                frame1.add(chk3);
                JLabel dh = new JLabel();
                dh.setText("Dhuhr");
                dh.setForeground(Color.WHITE);
                dh.setBounds(30, 120, 60, 30);
                dh.setFont(font1);
                frame1.add(dh);
                
                chk4=new JCheckBox();
                chk4.setBounds(10, 160, 16, 13);
                chk4.setBackground(Color.DARK_GRAY);
                frame1.add(chk4);
                JLabel as = new JLabel();
                as.setText("Asr");
                as.setForeground(Color.WHITE);
                as.setBounds(30, 150, 40, 30);
                as.setFont(font1);
                frame1.add(as);
                
                chk5=new JCheckBox();
                chk5.setBounds(10, 190, 16, 13);
                chk5.setBackground(Color.DARK_GRAY);
                frame1.add(chk5);
                JLabel mg = new JLabel();
                mg.setText("Maghrib");
                mg.setForeground(Color.WHITE);
                mg.setBounds(30, 180, 80, 30);
                mg.setFont(font1);
                frame1.add(mg);
                
                chk6=new JCheckBox();
                chk6.setBounds(10, 220, 16, 13);
                chk6.setBackground(Color.DARK_GRAY);
                frame1.add(chk6);
                JLabel is = new JLabel();
                is.setText("Isha");
                is.setForeground(Color.WHITE);
                is.setBounds(30, 210, 80, 30);
                is.setFont(font1);
                frame1.add(is);
                
                JLabel al = new JLabel();
                al.setText("Alarm Before (m) minutes :");
                al.setForeground(Color.WHITE);
                al.setBounds(160, 130, 250, 30);
                al.setFont(font1);
                frame1.add(al);
                sl= new JSlider(JSlider.HORIZONTAL, 0, 60, 25);
                sl.setMinorTickSpacing(2);
                sl.setMajorTickSpacing(10);
                sl.setPaintTicks(true);
                sl.setPaintLabels(true);
                sl.setBounds(160, 160, 300, 70);
                frame1.add(sl);
                
                final JButton alarmD = new JButton();
                alarmD.setText("");
                alarmD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_pr/i2.jpg")));
                alarmD.setBounds(400, 250, 64, 64);
                alarmD.setBackground(Color.DARK_GRAY);
                frame1.add(alarmD);
                
                alarmD.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        
                        frame1.dispose();
                        if(chk1.isSelected())
                        {
                            
                           // new Alarm_page().start();
                                                    }
                        if(chk2.isSelected())
                        {
                            
                        }
                        if(chk3.isSelected())
                        {
                            
                        }
                        if(chk4.isSelected())
                        {
                            
                        }
                        if(chk5.isSelected())
                        {
                            
                        }
                        if(chk6.isSelected())
                        {
                            
                        }
                        

                    }
                });
                
                ImageIcon i2=new ImageIcon("images\\img7.jpg");
                JLabel jLab2=new JLabel();
                jLab2.setIcon(i2);
                jLab2.setBounds(0, 0, 500, 400);
                frame1.add(jLab2);
                
                
                
                frame1.pack(); //sets appropriate size for frame
                frame1.setVisible(true); //makes frame visible
                frame1.setSize(500, 400);
                frame1.setResizable(false);
            }
        });
        
        sh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                String lt=comL.getText();
                String ln=comLn.getText();
                try {
                    String txt=new Java_Pr().Ajan_tm(lt,ln);
                    System.out.println(""+txt);
                    int i=0,j=0;
                    String st="";
                    while(i<txt.length())
                    {
                        st="Fajr";
                        
                        if(txt.substring(i,i+4).equals(st))
                        {
                            j=i+5;
                            String str = "";
                           
                            while((txt.charAt(j)>='0'&&txt.charAt(j)<='9')||txt.charAt(j)==':')
                            {
                                
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            fajrt.setText(str);
                        }
                        st="Sunrise";
                        if(txt.substring(i,i+7).equals(st))
                        {
                            j=i+8;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            riset.setText(str);
                        }
                        st="Dhuhr";
                        if(txt.substring(i,i+5).equals(st))
                        {
                            j=i+6;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            dhuhrt.setText(str);
                        }
                        st="Asr";
                        if(txt.substring(i,i+3).equals(st))
                        {
                            j=i+4;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            asrt.setText(str);
                        }
                        st="Maghrib";
                        if(txt.substring(i,i+7).equals(st))
                        {
                            j=i+8;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            maghribt.setText(str);
                        }
                        st="Isha";
                        if(txt.substring(i,i+4).equals(st))
                        {
                            j=i+5;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            ishat.setText(str);
                            break;
                        }
                        i++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Soft_page.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
        sh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                GoogleGeoCode ob=new GoogleGeoCode().GoogleGeoCode_ret(texc.getText());
                String lt=ob.lat;
                String ln=ob.lon;
                
                try {
                    String txt=new Java_Pr().Ajan_tm(lt,ln);
                    System.out.println(""+txt);
                    int i=0,j=0;
                    String st="";
                    while(i<txt.length())
                    {
                        st="Fajr";
                        
                        if(txt.substring(i,i+4).equals(st))
                        {
                            j=i+5;
                            String str = "";
                           
                            while((txt.charAt(j)>='0'&&txt.charAt(j)<='9')||txt.charAt(j)==':')
                            {
                                
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            fajrt.setText(str);
                        }
                        st="Sunrise";
                        if(txt.substring(i,i+7).equals(st))
                        {
                            j=i+8;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            riset.setText(str);
                        }
                        st="Dhuhr";
                        if(txt.substring(i,i+5).equals(st))
                        {
                            j=i+6;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            dhuhrt.setText(str);
                        }
                        st="Asr";
                        if(txt.substring(i,i+3).equals(st))
                        {
                            j=i+4;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            asrt.setText(str);
                        }
                        st="Maghrib";
                        if(txt.substring(i,i+7).equals(st))
                        {
                            j=i+8;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            maghribt.setText(str);
                        }
                        st="Isha";
                        if(txt.substring(i,i+4).equals(st))
                        {
                            j=i+5;
                            String str = "";
                            while(txt.charAt(j)!=' ')
                            {
                                str=str+txt.substring(j, j+1);
                                j++;
                            }
                            i=j;
                            ishat.setText(str);
                            break;
                        }
                        i++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Soft_page.class.getName()).log(Level.SEVERE, null, ex);
                }
                
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
}
