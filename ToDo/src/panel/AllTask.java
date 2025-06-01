
package panel;

import component.MyScrollPane;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import objek.Task;
import repository.TaskRepository;

public class AllTask extends javax.swing.JPanel {
    private JPanel containerPanel;
    
    public AllTask() {
        initComponents();
        
        containerPanel = new JPanel();        
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        containerPanel.setBackground(new java.awt.Color(245, 245, 245));

        MyScrollPane scrollPane = new MyScrollPane(containerPanel);       
        scrollPane.setBounds(20, 20, 680, 400); // MENGATUR UKURAN DAN POSISI SCROLLPANE
                
        setLayout(null);
        add(scrollPane);
        showTask(null);
    }

    public void showTask(ArrayList<Task> taskList){
        int taskId = Login.user.getId_user();
        if (taskList == null) {
            taskList = TaskRepository.getAllTask(taskId);
        } 
        
        containerPanel.removeAll();                            
        
        for (Task task : taskList) {                        
            TaskPanel taskPanel = new TaskPanel(task.getNama_tugas(), task.getStatus(), task.getTingkatan(), task.getWaktu(), task.getTanggal());            
            taskPanel.setAlignmentX(Component.LEFT_ALIGNMENT);            
            containerPanel.add(taskPanel);
            containerPanel.add(Box.createVerticalStrut(5));
        }
        
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(690, 440));
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
