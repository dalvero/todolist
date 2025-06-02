package frame;

import java.awt.CardLayout;
import panel.EditToDoList;
import panel.HomePage;
import panel.Login;
import panel.Register;
import panel.TambahToDoList;
import panel.MyTask;

public class ToDoFrame extends javax.swing.JFrame {
    // INSIALISASI PANEL
    private HomePage homePage;
    private Register register;
    private Login login;
    private MyTask myTask;
    private TambahToDoList tambahToDoList;
    private EditToDoList editToDoList;    
    
    public ToDoFrame() {
        setUndecorated(true);
        initComponents();
        myInits();
        
    }
    
    public void myInits(){
        // AGAR FRAME TIDAK BISA DI RESIZE
        this.setResizable(false);
        
        // SET LAYOUT UNTUK FRAME CARDLAYOUT
        getContentPane().setLayout(new CardLayout());
        showHomePage();
    }

    // METHOD UNTUK MENAMPILKAN HOME PAGE
    public void showHomePage(){
        // INISIALISASI HOMEPAGE
        homePage = new HomePage();
        getContentPane().add(homePage, "homePage");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "homePage");
    }
    
    // METHOD UNTUK MENAMPILKAN REGISTER
    public void showRegister(){
        // INISIALISASI REGISTER
        register = new Register();
        getContentPane().add(register, "register");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "register");
    }
    
    // METHOD UNTUK MENAMPILKAN LOGIN
    public void showLogin(){
        // INISIALISASI LOGIN
        login = new Login();
        getContentPane().add(login, "login");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "login");
    }
    
    // METHOD UNTUK MENAMPILKAN TASK
    public void showMyTask(){
        // INISIALISASI TASK
        myTask = new MyTask();
        getContentPane().add(myTask, "myTask");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "myTask");
    }
    
    // METHOD UNTUK MENAMPILKAN TAMBAH TASK
    public void showTambahToDoList(){
        // INISIALISASI TAMBAHTODOLIST
        tambahToDoList = new TambahToDoList();
        getContentPane().add(tambahToDoList, "tambahToDoList");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "tambahToDoList");
    }
    
    // METHOD UNTUK MENAMPILKAN EDIT TASK
    public void showEditToDoList(){
        // INISIALISASI TAMBAHTODOLIST
        editToDoList = new EditToDoList();
        getContentPane().add(editToDoList, "editToDoList");        
                
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "editToDoList");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
