/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class Alarm_page{
    Listener obj;
    public Alarm_page(){
        Timer t=new Timer(1000,new Listener());
        t.start();
    }
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar today=Calendar.getInstance();
            int hr=today.get(Calendar.HOUR_OF_DAY);
            int mn=today.get(Calendar.MINUTE);
            int sc=today.get(Calendar.SECOND);
            System.out.println(hr+":"+mn+":"+sc);
        }
        
    }
    
}
