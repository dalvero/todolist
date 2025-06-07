package panel;

import component.MyButton;
import component.MySpinnerTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;

public class EditTimerPanel extends javax.swing.JPanel {
    
    public EditTimerPanel() {
        initComponents();                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_editTimerTitle = new component.MyLabel();
        l_longBreak = new component.MyLabel();
        l_mainTimer = new component.MyLabel();
        l_shortBreak = new component.MyLabel();
        btn_save = new component.MyButton();
        s_longBreak = new component.MySpinnerTime();
        s_mainTimer = new component.MySpinnerTime();
        s_shortBreak = new component.MySpinnerTime();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(380, 420));
        setLayout(null);

        l_editTimerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_editTimerTitle.setText("Edit your timer");
        l_editTimerTitle.setColorClick(new java.awt.Color(0, 0, 0));
        l_editTimerTitle.setColorOver(new java.awt.Color(0, 0, 0));
        l_editTimerTitle.setFont(new java.awt.Font("Gavoline", 1, 36)); // NOI18N
        add(l_editTimerTitle);
        l_editTimerTitle.setBounds(5, 35, 370, 36);

        l_longBreak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_longBreak.setText("Long Break");
        l_longBreak.setColorClick(new java.awt.Color(0, 0, 0));
        l_longBreak.setColorOver(new java.awt.Color(0, 0, 0));
        l_longBreak.setFont(new java.awt.Font("Gavoline", 1, 24)); // NOI18N
        add(l_longBreak);
        l_longBreak.setBounds(10, 270, 360, 24);

        l_mainTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_mainTimer.setText("Main Timer");
        l_mainTimer.setColorClick(new java.awt.Color(0, 0, 0));
        l_mainTimer.setColorOver(new java.awt.Color(0, 0, 0));
        l_mainTimer.setFont(new java.awt.Font("Gavoline", 1, 24)); // NOI18N
        add(l_mainTimer);
        l_mainTimer.setBounds(10, 90, 360, 30);

        l_shortBreak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_shortBreak.setText("Short Break");
        l_shortBreak.setColorClick(new java.awt.Color(0, 0, 0));
        l_shortBreak.setColorOver(new java.awt.Color(0, 0, 0));
        l_shortBreak.setFont(new java.awt.Font("Gavoline", 1, 24)); // NOI18N
        add(l_shortBreak);
        l_shortBreak.setBounds(10, 180, 360, 30);

        btn_save.setBorder(null);
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setText("Save");
        btn_save.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_save.setColor(new java.awt.Color(245, 245, 245));
        btn_save.setColorClick(new java.awt.Color(220, 220, 220));
        btn_save.setColorOver(new java.awt.Color(250, 250, 250));
        btn_save.setFont(new java.awt.Font("Gavoline", 1, 18)); // NOI18N
        btn_save.setRadius(15);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        add(btn_save);
        btn_save.setBounds(60, 360, 260, 40);
        add(s_longBreak);
        s_longBreak.setBounds(90, 300, 210, 40);
        add(s_mainTimer);
        s_mainTimer.setBounds(90, 120, 210, 40);
        add(s_shortBreak);
        s_shortBreak.setBounds(90, 210, 210, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
    }//GEN-LAST:event_btn_saveActionPerformed

    public int getMainTimerInSecond() {
        Object value = s_mainTimer.getValue(); // MENGAMBIL NILAI DARI SPINNER MAIN TIMER
        if (value instanceof Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((Date) value);
            // SpinnerDateModel DENGAN FORMAT "HH:mm" AKAN MENYIMPAN DETIK SEBAGAI 0/DETIK DIABAIKAN            
            // BIAR KITA FOKUS PADA JAM DAN MENIT                        
            int menit = cal.get(Calendar.MINUTE); // MENGAMBIL MENIT            
            
            // MENGAMBIL JAM
            int jam = cal.get(Calendar.HOUR_OF_DAY);
            return jam * 3600 + menit * 60;           
        }        
        return 0; // NILAI DEFAULT JIKA ADA KESALAHAN
    }

    public int getShortBreakInSecond() {
        Object value = s_shortBreak.getValue(); 
        if (value instanceof Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((Date) value);
            int menit = cal.get(Calendar.MINUTE);
            int jam = cal.get(Calendar.HOUR_OF_DAY);
            return jam * 3600 + menit * 60;  
        }        
        return 0;
    }

    public int getLongBreakInSecond() {
        Object value = s_longBreak.getValue(); 
        if (value instanceof Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((Date) value);
            int menit = cal.get(Calendar.MINUTE);
            int jam = cal.get(Calendar.HOUR_OF_DAY);
            return jam * 3600 + menit * 60;  
        }        
        return 0;
    }
    
    // GETTER SETTER
    public MySpinnerTime getMainTimerSpinner() {
        return s_longBreak;
    }

    public MySpinnerTime getShortBreakSpinner() {
        return s_shortBreak;
    }

    public MySpinnerTime getLongBreakSpinner() {
        return s_longBreak;
    }

    public MyButton getSaveButton() {
        return btn_save;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_save;
    private component.MyLabel l_editTimerTitle;
    private component.MyLabel l_longBreak;
    private component.MyLabel l_mainTimer;
    private component.MyLabel l_shortBreak;
    private component.MySpinnerTime s_longBreak;
    private component.MySpinnerTime s_mainTimer;
    private component.MySpinnerTime s_shortBreak;
    // End of variables declaration//GEN-END:variables

}
