package panel;

import frame.ToDoFrame;
import javax.swing.SwingUtilities;

public class MyTask extends javax.swing.JPanel {

   
    public MyTask() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new component.MyPanelCustBorder();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        myLabel1 = new component.MyLabel();
        myLabel2 = new component.MyLabel();
        myLabel3 = new component.MyLabel();
        jLabel1 = new javax.swing.JLabel();
        myPanel1 = new component.MyPanel();
        myLabel4 = new component.MyLabel();
        myLabel5 = new component.MyLabel();
        myLabel6 = new component.MyLabel();
        myLabel7 = new component.MyLabel();
        myButton1 = new component.MyButton();
        myLabel8 = new component.MyLabel();
        myTextFieldCustBorder1 = new component.MyTextFieldCustBorder();
        myPanel2 = new component.MyPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        myLabel9 = new component.MyLabel();
        myLabel10 = new component.MyLabel();
        myPanelCustBorder1 = new component.MyPanelCustBorder();
        myLabel11 = new component.MyLabel();
        myPanelCustBorder2 = new component.MyPanelCustBorder();
        myLabel12 = new component.MyLabel();
        myPanel3 = new component.MyPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        myLabel13 = new component.MyLabel();
        myLabel14 = new component.MyLabel();
        myPanelCustBorder3 = new component.MyPanelCustBorder();
        myLabel15 = new component.MyLabel();
        myPanelCustBorder4 = new component.MyPanelCustBorder();
        myLabel16 = new component.MyLabel();
        myPanel4 = new component.MyPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        myLabel17 = new component.MyLabel();
        myLabel18 = new component.MyLabel();
        myPanelCustBorder5 = new component.MyPanelCustBorder();
        myLabel19 = new component.MyLabel();
        myPanelCustBorder6 = new component.MyPanelCustBorder();
        myLabel20 = new component.MyLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 900));

        footer.setBorderBottom(false);
        footer.setBorderLeft(false);
        footer.setBorderRight(false);
        footer.setBorderTop(false);
        footer.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

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

        myPanel1.setBorderColor(new java.awt.Color(255, 255, 255));
        myPanel1.setCornerRadius(13);

        myLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MyList.png"))); // NOI18N
        myLabel4.setText("  My List");

        myLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AllTasks.png"))); // NOI18N
        myLabel5.setText(" All Tasks");

        myLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Today.png"))); // NOI18N
        myLabel6.setText(" Today");

        myLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Completed.png"))); // NOI18N
        myLabel7.setText(" Completed");

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(myLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(myLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(myLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        myButton1.setBackground(new java.awt.Color(0, 0, 0));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Add Task");
        myButton1.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton1.setColor(java.awt.Color.black);
        myButton1.setColorClick(new java.awt.Color(51, 51, 51));
        myButton1.setColorOver(new java.awt.Color(51, 51, 51));
        myButton1.setRadius(5);

        myLabel8.setText("All Task");
        myLabel8.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        myTextFieldCustBorder1.setText("Search");
        myTextFieldCustBorder1.setCornerRadius(15);
        myTextFieldCustBorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTextFieldCustBorder1ActionPerformed(evt);
            }
        });

        myPanel2.setBorderColor(new java.awt.Color(242, 242, 242));
        myPanel2.setCornerRadius(20);

        jCheckBox1.setMaximumSize(new java.awt.Dimension(25, 25));
        jCheckBox1.setMinimumSize(new java.awt.Dimension(25, 25));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        myLabel9.setText("Finish Project Proposal");

        myLabel10.setText("Due: 22 May, 2025");

        myPanelCustBorder1.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder1.setBorderBottom(false);
        myPanelCustBorder1.setBorderLeft(false);
        myPanelCustBorder1.setBorderRight(false);
        myPanelCustBorder1.setBorderTop(false);
        myPanelCustBorder1.setCornerRadius(1000);

        myLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder1Layout = new javax.swing.GroupLayout(myPanelCustBorder1);
        myPanelCustBorder1.setLayout(myPanelCustBorder1Layout);
        myPanelCustBorder1Layout.setHorizontalGroup(
            myPanelCustBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder1Layout.setVerticalGroup(
            myPanelCustBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPanelCustBorder2.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder2.setBorderBottom(false);
        myPanelCustBorder2.setBorderLeft(false);
        myPanelCustBorder2.setBorderRight(false);
        myPanelCustBorder2.setBorderTop(false);
        myPanelCustBorder2.setCornerRadius(1000);

        myLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder2Layout = new javax.swing.GroupLayout(myPanelCustBorder2);
        myPanelCustBorder2.setLayout(myPanelCustBorder2Layout);
        myPanelCustBorder2Layout.setHorizontalGroup(
            myPanelCustBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder2Layout.setVerticalGroup(
            myPanelCustBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myPanelCustBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanelCustBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myPanelCustBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(myPanelCustBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(myPanel2Layout.createSequentialGroup()
                                    .addComponent(myLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(myLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        myPanel3.setBorderColor(new java.awt.Color(242, 242, 242));
        myPanel3.setCornerRadius(20);

        jCheckBox2.setMaximumSize(new java.awt.Dimension(25, 25));
        jCheckBox2.setMinimumSize(new java.awt.Dimension(25, 25));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        myLabel13.setText("Finish Project Proposal");

        myLabel14.setText("Due: 22 May, 2025");

        myPanelCustBorder3.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder3.setBorderBottom(false);
        myPanelCustBorder3.setBorderLeft(false);
        myPanelCustBorder3.setBorderRight(false);
        myPanelCustBorder3.setBorderTop(false);
        myPanelCustBorder3.setCornerRadius(1000);

        myLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder3Layout = new javax.swing.GroupLayout(myPanelCustBorder3);
        myPanelCustBorder3.setLayout(myPanelCustBorder3Layout);
        myPanelCustBorder3Layout.setHorizontalGroup(
            myPanelCustBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder3Layout.setVerticalGroup(
            myPanelCustBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPanelCustBorder4.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder4.setBorderBottom(false);
        myPanelCustBorder4.setBorderLeft(false);
        myPanelCustBorder4.setBorderRight(false);
        myPanelCustBorder4.setBorderTop(false);
        myPanelCustBorder4.setCornerRadius(1000);

        myLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder4Layout = new javax.swing.GroupLayout(myPanelCustBorder4);
        myPanelCustBorder4.setLayout(myPanelCustBorder4Layout);
        myPanelCustBorder4Layout.setHorizontalGroup(
            myPanelCustBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder4Layout.setVerticalGroup(
            myPanelCustBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout myPanel3Layout = new javax.swing.GroupLayout(myPanel3);
        myPanel3.setLayout(myPanel3Layout);
        myPanel3Layout.setHorizontalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myPanelCustBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanelCustBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        myPanel3Layout.setVerticalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel3Layout.createSequentialGroup()
                .addGroup(myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myPanelCustBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(myPanelCustBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(myPanel3Layout.createSequentialGroup()
                                    .addComponent(myLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(myLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        myPanel4.setBorderColor(new java.awt.Color(242, 242, 242));
        myPanel4.setCornerRadius(20);

        jCheckBox3.setMaximumSize(new java.awt.Dimension(25, 25));
        jCheckBox3.setMinimumSize(new java.awt.Dimension(25, 25));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        myLabel17.setText("Finish Project Proposal");

        myLabel18.setText("Due: 22 May, 2025");

        myPanelCustBorder5.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder5.setBorderBottom(false);
        myPanelCustBorder5.setBorderLeft(false);
        myPanelCustBorder5.setBorderRight(false);
        myPanelCustBorder5.setBorderTop(false);
        myPanelCustBorder5.setCornerRadius(1000);

        myLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder5Layout = new javax.swing.GroupLayout(myPanelCustBorder5);
        myPanelCustBorder5.setLayout(myPanelCustBorder5Layout);
        myPanelCustBorder5Layout.setHorizontalGroup(
            myPanelCustBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder5Layout.setVerticalGroup(
            myPanelCustBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPanelCustBorder6.setBackgroundColor(new java.awt.Color(229, 229, 229));
        myPanelCustBorder6.setBorderBottom(false);
        myPanelCustBorder6.setBorderLeft(false);
        myPanelCustBorder6.setBorderRight(false);
        myPanelCustBorder6.setBorderTop(false);
        myPanelCustBorder6.setCornerRadius(1000);

        myLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder6Layout = new javax.swing.GroupLayout(myPanelCustBorder6);
        myPanelCustBorder6.setLayout(myPanelCustBorder6Layout);
        myPanelCustBorder6Layout.setHorizontalGroup(
            myPanelCustBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanelCustBorder6Layout.setVerticalGroup(
            myPanelCustBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout myPanel4Layout = new javax.swing.GroupLayout(myPanel4);
        myPanel4.setLayout(myPanel4Layout);
        myPanel4Layout.setHorizontalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myPanelCustBorder5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanelCustBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        myPanel4Layout.setVerticalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myPanelCustBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(myPanelCustBorder5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(myPanel4Layout.createSequentialGroup()
                                    .addComponent(myLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(myLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myTextFieldCustBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(myLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myTextFieldCustBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(myPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showHomePage();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked

    private void myTextFieldCustBorder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextFieldCustBorder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextFieldCustBorder1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyLabel btn_navIcon;
    private component.MyPanelCustBorder footer;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private component.MyButton myButton1;
    private component.MyLabel myLabel1;
    private component.MyLabel myLabel10;
    private component.MyLabel myLabel11;
    private component.MyLabel myLabel12;
    private component.MyLabel myLabel13;
    private component.MyLabel myLabel14;
    private component.MyLabel myLabel15;
    private component.MyLabel myLabel16;
    private component.MyLabel myLabel17;
    private component.MyLabel myLabel18;
    private component.MyLabel myLabel19;
    private component.MyLabel myLabel2;
    private component.MyLabel myLabel20;
    private component.MyLabel myLabel3;
    private component.MyLabel myLabel4;
    private component.MyLabel myLabel5;
    private component.MyLabel myLabel6;
    private component.MyLabel myLabel7;
    private component.MyLabel myLabel8;
    private component.MyLabel myLabel9;
    private component.MyPanel myPanel1;
    private component.MyPanel myPanel2;
    private component.MyPanel myPanel3;
    private component.MyPanel myPanel4;
    private component.MyPanelCustBorder myPanelCustBorder1;
    private component.MyPanelCustBorder myPanelCustBorder2;
    private component.MyPanelCustBorder myPanelCustBorder3;
    private component.MyPanelCustBorder myPanelCustBorder4;
    private component.MyPanelCustBorder myPanelCustBorder5;
    private component.MyPanelCustBorder myPanelCustBorder6;
    private component.MyTextFieldCustBorder myTextFieldCustBorder1;
    private component.MyPanelCustBorder navbar;
    // End of variables declaration//GEN-END:variables
}
