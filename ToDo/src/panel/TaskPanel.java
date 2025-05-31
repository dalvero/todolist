package panel;

public class TaskPanel extends javax.swing.JPanel {


    public TaskPanel(String namaTugas, String status, String tingkatan, String waktu, String tanggal) {
        initComponents();
                                        
        l_taskTitle.setText(namaTugas);
        l_taskTingkatan.setText(tingkatan);
        l_tanggalTask.setText(tanggal);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskPanel = new component.MyPanel();
        l_taskTitle = new component.MyLabel();
        l_tanggalTask = new component.MyLabel();
        l_taskTingkatan = new component.MyLabel();
        btn_edit = new component.MyButton();
        btn_delete = new component.MyButton();
        chbx_status = new component.MyCheckBox();

        setBackground(new java.awt.Color(245, 245, 245));

        taskPanel.setBackground(new java.awt.Color(245, 245, 245));
        taskPanel.setBorderColor(new java.awt.Color(242, 242, 242));
        taskPanel.setCornerRadius(20);

        l_taskTitle.setText("Finish Project Proposal");
        l_taskTitle.setFont(new java.awt.Font("Gavoline", 0, 24)); // NOI18N

        l_tanggalTask.setText("Due: 22 May, 2025");
        l_tanggalTask.setColorClick(new java.awt.Color(0, 0, 0));
        l_tanggalTask.setColorOver(new java.awt.Color(0, 0, 0));
        l_tanggalTask.setFont(new java.awt.Font("Gavoline", 0, 14)); // NOI18N

        l_taskTingkatan.setText("Status");
        l_taskTingkatan.setColorClick(new java.awt.Color(0, 0, 0));
        l_taskTingkatan.setColorOver(new java.awt.Color(0, 0, 0));
        l_taskTingkatan.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btn_edit.setRadius(1000);

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_delete.setBorderColor(new java.awt.Color(204, 0, 0));
        btn_delete.setColorClick(new java.awt.Color(255, 102, 102));
        btn_delete.setColorOver(new java.awt.Color(255, 153, 153));
        btn_delete.setRadius(1000);

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addComponent(l_tanggalTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_taskTingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_taskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_taskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_taskTingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(l_tanggalTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_delete;
    private component.MyButton btn_edit;
    private component.MyCheckBox chbx_status;
    private component.MyLabel l_tanggalTask;
    private component.MyLabel l_taskTingkatan;
    private component.MyLabel l_taskTitle;
    private component.MyPanel taskPanel;
    // End of variables declaration//GEN-END:variables
}
