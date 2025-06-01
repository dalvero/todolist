package panel;

import component.MyLabel;
import component.MyOptionPane;
import java.awt.Color;
import javax.swing.SwingUtilities;
import repository.TaskRepository;
import java.awt.Component;

public class TaskPanel extends javax.swing.JPanel {


    public TaskPanel(String namaTugas, String status, String tingkatan, String waktu, String tanggal) {
        initComponents();
                                        
        l_taskTitle.setText(namaTugas);
        l_taskTingkatan.setText(tingkatan);
        l_tanggalTask.setText(tanggal);   
        
        
        // UBAH WARNA TINGKATAN SESUAI DENGAN SKALA PRIORITASNYA
        setColorForTingkatan(l_taskTingkatan);
    }
    
    private void setColorForTingkatan(MyLabel tingkatan){
        if (tingkatan.getText().equals("High")) {
            tingkatan.setForeground(Color.RED); // MERAH
            tingkatan.setColor(Color.RED); 
            tingkatan.setColorClick(Color.RED);
            tingkatan.setColorOver(Color.RED);
        } else if (tingkatan.getText().equals("Medium")) {            
            tingkatan.setForeground(Color.BLUE); // KUNING
            tingkatan.setColor(Color.BLUE); 
            tingkatan.setColorClick(Color.BLUE);
            tingkatan.setColorOver(Color.BLUE);
        } else if (tingkatan.getText().equals("Low")) {
            tingkatan.setForeground(Color.GREEN); // HIJAU
            tingkatan.setColor(Color.GREEN); 
            tingkatan.setColorClick(Color.GREEN);
            tingkatan.setColorOver(Color.GREEN);
        }
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
        l_taskTitle.setColorClick(new java.awt.Color(0, 0, 0));
        l_taskTitle.setColorOver(new java.awt.Color(0, 0, 0));
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
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_delete.setBorderColor(new java.awt.Color(204, 0, 0));
        btn_delete.setColorClick(new java.awt.Color(255, 102, 102));
        btn_delete.setColorOver(new java.awt.Color(255, 153, 153));
        btn_delete.setRadius(1000);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

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

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        System.out.println("Mengedit Tugas : " + l_taskTitle.getText());        
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        System.out.println("Menghapus Tugas : " + l_taskTitle.getText());        
        MyOptionPane.showConfirm(null, "Yakin ingin menghapus tugas?", "Konfirmasi", result -> {
            if (result) {
                TaskRepository.deleteTask(TaskRepository.getTaskByName(l_taskTitle.getText()).getId_tugas());
                
                // MEREFRESH TAMPILAN ALL TASK
                SwingUtilities.invokeLater(() -> {
                    Component parent = this.getParent(); // THIS MERUJUK KE TASK PANEL
                    while (parent != null && !(parent instanceof AllTask)) {
                        parent = parent.getParent();
                    }

                    if (parent instanceof AllTask allTask) {
                        allTask.showTask(null); // MEMANGGIL ULANG showTask()
                    }
                });
            } else {
                System.out.println("Batal hapus.");
            }
        });
    }//GEN-LAST:event_btn_deleteActionPerformed


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
