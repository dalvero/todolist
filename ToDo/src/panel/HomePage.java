package panel;

import component.MyOptionPane;
import frame.ToDoFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HomePage extends javax.swing.JPanel {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_circle = new component.MyPanel();
        l_titleCircle = new component.MyLabel();
        l_title = new component.MyLabel();
        l_text1 = new component.MyLabel();
        l_text2 = new component.MyLabel();
        l_text3 = new component.MyLabel();
        p_footer3 = new component.MyPanelCustBorder();
        navbar = new component.MyPanelCustBorder();
        navIcon = new component.MyLabel();
        btn_login = new component.MyButton();
        btn_register = new component.MyButton();
        btn_close = new component.MyButton();
        btn_minimize = new component.MyButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

        p_circle.setBackgroundColor(new java.awt.Color(38, 38, 38));
        p_circle.setBorderColor(new java.awt.Color(38, 38, 38));
        p_circle.setCornerRadius(400);

        l_titleCircle.setForeground(new java.awt.Color(255, 255, 255));
        l_titleCircle.setText("To Do");
        l_titleCircle.setColor(new java.awt.Color(255, 255, 255));
        l_titleCircle.setColorClick(new java.awt.Color(255, 255, 255));
        l_titleCircle.setColorOver(new java.awt.Color(255, 255, 255));
        l_titleCircle.setFont(new java.awt.Font("Gavoline", 0, 64)); // NOI18N

        javax.swing.GroupLayout p_circleLayout = new javax.swing.GroupLayout(p_circle);
        p_circle.setLayout(p_circleLayout);
        p_circleLayout.setHorizontalGroup(
            p_circleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_circleLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(l_titleCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        p_circleLayout.setVerticalGroup(
            p_circleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_circleLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(l_titleCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        add(p_circle);
        p_circle.setBounds(640, 200, 300, 292);

        l_title.setText("To Do List");
        l_title.setColorClick(new java.awt.Color(0, 0, 0));
        l_title.setColorOver(new java.awt.Color(0, 0, 0));
        l_title.setFont(new java.awt.Font("SansSerif", 0, 72)); // NOI18N
        add(l_title);
        l_title.setBounds(140, 240, 350, 92);

        l_text1.setText("Solusi manajemen aktivitas sehari-hari");
        l_text1.setColorClick(new java.awt.Color(0, 0, 0));
        l_text1.setColorOver(new java.awt.Color(0, 0, 0));
        l_text1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        add(l_text1);
        l_text1.setBounds(140, 340, 411, 32);

        l_text2.setText("untuk meningkatkan produktivitas");
        l_text2.setColorClick(new java.awt.Color(0, 0, 0));
        l_text2.setColorOver(new java.awt.Color(0, 0, 0));
        l_text2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        add(l_text2);
        l_text2.setBounds(140, 370, 361, 32);

        l_text3.setText("anda.");
        l_text3.setColorClick(new java.awt.Color(0, 0, 0));
        l_text3.setColorOver(new java.awt.Color(0, 0, 0));
        l_text3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        add(l_text3);
        l_text3.setBounds(140, 400, 90, 32);

        p_footer3.setBorderBottom(false);
        p_footer3.setBorderColor(new java.awt.Color(102, 102, 102));
        p_footer3.setBorderLeft(false);
        p_footer3.setBorderRight(false);
        p_footer3.setBorderTop(false);
        p_footer3.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout p_footer3Layout = new javax.swing.GroupLayout(p_footer3);
        p_footer3.setLayout(p_footer3Layout);
        p_footer3Layout.setHorizontalGroup(
            p_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        p_footer3Layout.setVerticalGroup(
            p_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(p_footer3);
        p_footer3.setBounds(0, 650, 1000, 50);

        navbar.setBorderBottom(false);
        navbar.setBorderColor(new java.awt.Color(102, 102, 102));
        navbar.setBorderLeft(false);
        navbar.setBorderRight(false);
        navbar.setBorderTop(false);
        navbar.setPreferredSize(new java.awt.Dimension(1050, 50));
        navbar.setLayout(null);

        navIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/todoIcon24.png"))); // NOI18N
        navIcon.setText("  To-Do List");
        navIcon.setColorClick(new java.awt.Color(102, 102, 102));
        navIcon.setColorOver(new java.awt.Color(153, 153, 153));
        navIcon.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        navIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navIconMouseClicked(evt);
            }
        });
        navbar.add(navIcon);
        navIcon.setBounds(30, 20, 171, 40);

        btn_login.setForeground(new java.awt.Color(0, 0, 0));
        btn_login.setText("Login");
        btn_login.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_login.setColor(new java.awt.Color(245, 245, 245));
        btn_login.setColorClick(new java.awt.Color(220, 220, 220));
        btn_login.setColorOver(new java.awt.Color(250, 250, 250));
        btn_login.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_login.setRadius(15);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        navbar.add(btn_login);
        btn_login.setBounds(780, 50, 83, 30);

        btn_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_register.setText("Register");
        btn_register.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_register.setColor(new java.awt.Color(245, 245, 245));
        btn_register.setColorClick(new java.awt.Color(220, 220, 220));
        btn_register.setColorOver(new java.awt.Color(250, 250, 250));
        btn_register.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_register.setRadius(15);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        navbar.add(btn_register);
        btn_register.setBounds(880, 50, 100, 30);

        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("X");
        btn_close.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_close.setColor(new java.awt.Color(255, 255, 255));
        btn_close.setColorClick(new java.awt.Color(220, 220, 220));
        btn_close.setColorOver(new java.awt.Color(153, 153, 153));
        btn_close.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        navbar.add(btn_close);
        btn_close.setBounds(930, 10, 50, 30);

        btn_minimize.setForeground(new java.awt.Color(0, 0, 0));
        btn_minimize.setText("-");
        btn_minimize.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_minimize.setColor(new java.awt.Color(255, 255, 255));
        btn_minimize.setColorClick(new java.awt.Color(220, 220, 220));
        btn_minimize.setColorOver(new java.awt.Color(153, 153, 153));
        btn_minimize.setFont(new java.awt.Font("Gavoline", 1, 24)); // NOI18N
        btn_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizeActionPerformed(evt);
            }
        });
        navbar.add(btn_minimize);
        btn_minimize.setBounds(880, 10, 50, 30);

        add(navbar);
        navbar.setBounds(0, 0, 1000, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showHomePage();
        }
    }//GEN-LAST:event_navIconMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showLogin();
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showRegister();
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        MyOptionPane.showConfirm(null, "Yakin ingin keluar aplikasi?", "Konfirmasi", result -> {
            if (result) {
                System.exit(0);
            } else {
                System.out.println("Batal keluar.");
            }
        });
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btn_minimize);
        if (frame != null) {
            frame.setState(JFrame.ICONIFIED); // Set window to minimized state
        }
    }//GEN-LAST:event_btn_minimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_close;
    private component.MyButton btn_login;
    private component.MyButton btn_minimize;
    private component.MyButton btn_register;
    private component.MyLabel l_text1;
    private component.MyLabel l_text2;
    private component.MyLabel l_text3;
    private component.MyLabel l_title;
    private component.MyLabel l_titleCircle;
    private component.MyLabel navIcon;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_circle;
    private component.MyPanelCustBorder p_footer3;
    // End of variables declaration//GEN-END:variables
}
