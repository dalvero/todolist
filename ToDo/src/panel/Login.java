package panel;

import frame.ToDoFrame;
import javax.swing.JFrame;
import component.MyOptionPane;
import javax.swing.SwingUtilities;
import repository.UserRepository;
import objek.User;

public class Login extends javax.swing.JPanel {
    public static User user;
    
    public Login() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new component.MyPanelCustBorder();
        navIcon = new component.MyLabel();
        btn_login = new component.MyButton();
        btn_register = new component.MyButton();
        btn_close = new component.MyButton();
        btn_minimize = new component.MyButton();
        p_footer = new component.MyPanelCustBorder();
        p_registerForm4 = new component.MyPanel();
        p_circle4 = new component.MyPanel();
        l_circleTitle4 = new component.MyLabel();
        l_titleForm = new component.MyLabel();
        l_username = new component.MyLabel();
        l_password = new component.MyLabel();
        t_password = new component.MyPasswordField();
        t_username = new component.MyTextFieldCustBorder();
        btn_loginForm = new component.MyButton();
        l_belumPunyaAkun = new component.MyLabel();
        btn_registerForm = new component.MyLabel();
        l_usernameIcon = new component.MyLabel();
        l_passwordIcon = new component.MyLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

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
        navIcon.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
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
        btn_login.setFont(new java.awt.Font("Gavoline", 0, 15)); // NOI18N
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
        btn_register.setFont(new java.awt.Font("Gavoline", 0, 15)); // NOI18N
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
        btn_close.setFont(new java.awt.Font("Gavoline", 0, 15)); // NOI18N
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

        p_footer.setBorderBottom(false);
        p_footer.setBorderColor(new java.awt.Color(102, 102, 102));
        p_footer.setBorderLeft(false);
        p_footer.setBorderRight(false);
        p_footer.setBorderTop(false);
        p_footer.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout p_footerLayout = new javax.swing.GroupLayout(p_footer);
        p_footer.setLayout(p_footerLayout);
        p_footerLayout.setHorizontalGroup(
            p_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        p_footerLayout.setVerticalGroup(
            p_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(p_footer);
        p_footer.setBounds(0, 650, 998, 50);

        p_registerForm4.setBorderWidth(1);
        p_registerForm4.setCornerRadius(30);

        p_circle4.setBackgroundColor(new java.awt.Color(38, 38, 38));
        p_circle4.setBorderColor(new java.awt.Color(38, 38, 38));
        p_circle4.setCornerRadius(100);

        l_circleTitle4.setForeground(new java.awt.Color(255, 255, 255));
        l_circleTitle4.setText("To Do");
        l_circleTitle4.setColor(new java.awt.Color(255, 255, 255));
        l_circleTitle4.setColorClick(new java.awt.Color(255, 255, 255));
        l_circleTitle4.setColorOver(new java.awt.Color(255, 255, 255));
        l_circleTitle4.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        javax.swing.GroupLayout p_circle4Layout = new javax.swing.GroupLayout(p_circle4);
        p_circle4.setLayout(p_circle4Layout);
        p_circle4Layout.setHorizontalGroup(
            p_circle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_circle4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(l_circleTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        p_circle4Layout.setVerticalGroup(
            p_circle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_circle4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(l_circleTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        l_titleForm.setText("Login");
        l_titleForm.setColorClick(new java.awt.Color(0, 0, 0));
        l_titleForm.setColorOver(new java.awt.Color(0, 0, 0));
        l_titleForm.setFont(new java.awt.Font("Gavoline", 0, 36)); // NOI18N

        l_username.setText("Username");
        l_username.setColorClick(new java.awt.Color(0, 0, 0));
        l_username.setColorOver(new java.awt.Color(0, 0, 0));
        l_username.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        l_password.setText("Password");
        l_password.setColorClick(new java.awt.Color(0, 0, 0));
        l_password.setColorOver(new java.awt.Color(0, 0, 0));
        l_password.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        t_password.setForeground(new java.awt.Color(0, 0, 0));
        t_password.setBorderFocusColor(new java.awt.Color(128, 128, 128));
        t_password.setCornerRadius(15);
        t_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        t_username.setForeground(new java.awt.Color(0, 0, 0));
        t_username.setBorderFocusColor(new java.awt.Color(128, 128, 128));
        t_username.setCornerRadius(15);
        t_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_loginForm.setBackground(new java.awt.Color(0, 0, 0));
        btn_loginForm.setForeground(new java.awt.Color(255, 255, 255));
        btn_loginForm.setText("Login");
        btn_loginForm.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_loginForm.setColor(new java.awt.Color(0, 0, 0));
        btn_loginForm.setColorClick(new java.awt.Color(102, 102, 102));
        btn_loginForm.setColorOver(new java.awt.Color(153, 153, 153));
        btn_loginForm.setFont(new java.awt.Font("Gavoline", 0, 24)); // NOI18N
        btn_loginForm.setRadius(15);
        btn_loginForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginFormActionPerformed(evt);
            }
        });

        l_belumPunyaAkun.setText("Belum punya akun?");
        l_belumPunyaAkun.setColorClick(new java.awt.Color(0, 0, 0));
        l_belumPunyaAkun.setColorOver(new java.awt.Color(0, 0, 0));
        l_belumPunyaAkun.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        btn_registerForm.setText("Register");
        btn_registerForm.setColorClick(new java.awt.Color(102, 102, 102));
        btn_registerForm.setColorOver(new java.awt.Color(153, 153, 153));
        btn_registerForm.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        btn_registerForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerFormMouseClicked(evt);
            }
        });

        l_usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/username24.png"))); // NOI18N

        l_passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password24.png"))); // NOI18N

        javax.swing.GroupLayout p_registerForm4Layout = new javax.swing.GroupLayout(p_registerForm4);
        p_registerForm4.setLayout(p_registerForm4Layout);
        p_registerForm4Layout.setHorizontalGroup(
            p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_registerForm4Layout.createSequentialGroup()
                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_registerForm4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_registerForm4Layout.createSequentialGroup()
                                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(t_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(t_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_usernameIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(l_passwordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))))
                    .addGroup(p_registerForm4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(l_belumPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_registerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_registerForm4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_circle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_titleForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(161, 161, 161))
        );
        p_registerForm4Layout.setVerticalGroup(
            p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_registerForm4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(p_circle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_titleForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_usernameIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_passwordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(btn_loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_registerForm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_belumPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(p_registerForm4);
        p_registerForm4.setBounds(280, 130, 426, 466);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerFormMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showRegister();
        }
    }//GEN-LAST:event_btn_registerFormMouseClicked

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
        MyOptionPane.showConfirm(this, "Yakin ingin keluar aplikasi?", "Konfirmasi", result -> {
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

    private void btn_loginFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginFormActionPerformed
        if (t_username.getText().isEmpty()) {
            MyOptionPane.showWarning(this, "Username harus diisi!", "Warning");
        } else if (t_password.getPassword().length == 0) {
            MyOptionPane.showWarning(this, "Password harus diisi!", "Warning");
        } else {            
            String username = t_username.getText();
            char[] passwordChars = t_password.getPassword();
            String password = new String(passwordChars);
            user = UserRepository.loginUser(username, password);
            if (user != null) {
                ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
                if (toDoFrame != null) {
                    toDoFrame.showMyTask();
                }
            }                        
        }
        
        

    }//GEN-LAST:event_btn_loginFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_close;
    private component.MyButton btn_login;
    private component.MyButton btn_loginForm;
    private component.MyButton btn_minimize;
    private component.MyButton btn_register;
    private component.MyLabel btn_registerForm;
    private component.MyLabel l_belumPunyaAkun;
    private component.MyLabel l_circleTitle4;
    private component.MyLabel l_password;
    private component.MyLabel l_passwordIcon;
    private component.MyLabel l_titleForm;
    private component.MyLabel l_username;
    private component.MyLabel l_usernameIcon;
    private component.MyLabel navIcon;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_circle4;
    private component.MyPanelCustBorder p_footer;
    private component.MyPanel p_registerForm4;
    private component.MyPasswordField t_password;
    private component.MyTextFieldCustBorder t_username;
    // End of variables declaration//GEN-END:variables
}
