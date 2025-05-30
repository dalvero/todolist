package panel;

import frame.ToDoFrame;
import javax.swing.SwingUtilities;

public class TambahToDoList extends javax.swing.JPanel {

    public TambahToDoList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new component.MyPanelCustBorder();
        myTextFieldCustBorder1 = new component.MyTextFieldCustBorder();
        myLabel4 = new component.MyLabel();
        myLabel5 = new component.MyLabel();
        myTextFieldCustBorder2 = new component.MyTextFieldCustBorder();
        myLabel6 = new component.MyLabel();
        myTextFieldCustBorder3 = new component.MyTextFieldCustBorder();
        myTextFieldCustBorder4 = new component.MyTextFieldCustBorder();
        myLabel7 = new component.MyLabel();
        myButton1 = new component.MyButton();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        myLabel1 = new component.MyLabel();
        myLabel2 = new component.MyLabel();
        myLabel3 = new component.MyLabel();
        jLabel1 = new javax.swing.JLabel();
        myLabel8 = new component.MyLabel();
        myTextFieldCustBorder5 = new component.MyTextFieldCustBorder();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

        footer.setBorderBottom(false);
        footer.setBorderLeft(false);
        footer.setBorderRight(false);
        footer.setBorderTop(false);
        footer.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(footer);
        footer.setBounds(0, 650, 1000, 50);

        myTextFieldCustBorder1.setCornerRadius(10);
        add(myTextFieldCustBorder1);
        myTextFieldCustBorder1.setBounds(240, 140, 573, 46);

        myLabel4.setText("Nama Project");
        myLabel4.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(myLabel4);
        myLabel4.setBounds(240, 110, 114, 18);

        myLabel5.setText("Status");
        myLabel5.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(myLabel5);
        myLabel5.setBounds(240, 200, 52, 18);

        myTextFieldCustBorder2.setCornerRadius(10);
        myTextFieldCustBorder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTextFieldCustBorder2ActionPerformed(evt);
            }
        });
        add(myTextFieldCustBorder2);
        myTextFieldCustBorder2.setBounds(240, 230, 573, 46);

        myLabel6.setText("Tingkatan");
        myLabel6.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(myLabel6);
        myLabel6.setBounds(240, 290, 81, 18);

        myTextFieldCustBorder3.setCornerRadius(10);
        add(myTextFieldCustBorder3);
        myTextFieldCustBorder3.setBounds(240, 310, 573, 46);

        myTextFieldCustBorder4.setCornerRadius(10);
        add(myTextFieldCustBorder4);
        myTextFieldCustBorder4.setBounds(240, 390, 573, 46);

        myLabel7.setText("Waktu");
        myLabel7.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(myLabel7);
        myLabel7.setBounds(240, 370, 52, 18);

        myButton1.setBackground(new java.awt.Color(0, 0, 0));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Simpan");
        myButton1.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton1.setColor(java.awt.Color.black);
        myButton1.setColorClick(new java.awt.Color(51, 51, 51));
        myButton1.setColorOver(new java.awt.Color(51, 51, 51));
        myButton1.setRadius(5);
        add(myButton1);
        myButton1.setBounds(680, 540, 137, 39);

        navbar.setBorderBottom(false);
        navbar.setBorderColor(new java.awt.Color(102, 102, 102));
        navbar.setBorderLeft(false);
        navbar.setBorderRight(false);
        navbar.setBorderTop(false);
        navbar.setPreferredSize(new java.awt.Dimension(1050, 50));
        navbar.setLayout(null);

        btn_navIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/todoIcon24.png"))); // NOI18N
        btn_navIcon.setText("  To-Do List");
        btn_navIcon.setColorClick(new java.awt.Color(102, 102, 102));
        btn_navIcon.setColorOver(new java.awt.Color(153, 153, 153));
        btn_navIcon.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        btn_navIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_navIconMouseClicked(evt);
            }
        });
        navbar.add(btn_navIcon);
        btn_navIcon.setBounds(36, 4, 130, 40);

        myLabel1.setText("My Task");
        navbar.add(myLabel1);
        myLabel1.setBounds(730, 20, 52, 13);

        myLabel2.setText("Pomodoro");
        navbar.add(myLabel2);
        myLabel2.setBounds(800, 20, 60, 13);

        myLabel3.setText("Logout");
        navbar.add(myLabel3);
        myLabel3.setBounds(880, 20, 40, 13);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ImageUser.png"))); // NOI18N
        navbar.add(jLabel1);
        jLabel1.setBounds(940, 10, 30, 30);

        add(navbar);
        navbar.setBounds(0, 0, 1000, 50);

        myLabel8.setText("Tanggal");
        myLabel8.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(myLabel8);
        myLabel8.setBounds(240, 450, 90, 18);

        myTextFieldCustBorder5.setCornerRadius(10);
        add(myTextFieldCustBorder5);
        myTextFieldCustBorder5.setBounds(240, 470, 573, 46);
    }// </editor-fold>//GEN-END:initComponents

    private void myTextFieldCustBorder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextFieldCustBorder2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextFieldCustBorder2ActionPerformed

    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showHomePage();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyLabel btn_navIcon;
    private component.MyPanelCustBorder footer;
    private javax.swing.JLabel jLabel1;
    private component.MyButton myButton1;
    private component.MyLabel myLabel1;
    private component.MyLabel myLabel2;
    private component.MyLabel myLabel3;
    private component.MyLabel myLabel4;
    private component.MyLabel myLabel5;
    private component.MyLabel myLabel6;
    private component.MyLabel myLabel7;
    private component.MyLabel myLabel8;
    private component.MyTextFieldCustBorder myTextFieldCustBorder1;
    private component.MyTextFieldCustBorder myTextFieldCustBorder2;
    private component.MyTextFieldCustBorder myTextFieldCustBorder3;
    private component.MyTextFieldCustBorder myTextFieldCustBorder4;
    private component.MyTextFieldCustBorder myTextFieldCustBorder5;
    private component.MyPanelCustBorder navbar;
    // End of variables declaration//GEN-END:variables
}
