package frame;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import panel.HomePage;
import panel.Login;
import panel.Register;

public class ToDoFrame extends javax.swing.JFrame {
    // INSIALISASI PANEL
    private HomePage homePage;
    private Register register;
    private Login login;
    
    public ToDoFrame() {
        initComponents();
        myInits();
    }
    
    public void myInits(){
        // MENDAPATKAN UKURUAN LAYAR LAPTOP AGAR RESPONSIVE
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();      
        // SET UKURAN FRAME SESUAI LAYAR
        this.setSize(screenSize);
        // MENGATUR FRAME KE FULLSCREEN
        this.setExtendedState(ToDoFrame.MAXIMIZED_BOTH);
        // AGAR FRAME TIDAK BISA DI RESIZE
        this.setResizable(false);
        
        // SET LAYOUT UNTUK FRAME CARDLAYOUT
        getContentPane().setLayout(new CardLayout());
        showHomePage();
    }

    // METHOD UNTUK MENAMPILKAN HOME PAGE
    public void showHomePage(){
        // INISIALISASI LANDPANEL
        homePage = new HomePage();
        getContentPane().add(homePage, "homePage");        
        
        // MENAMPILKAN KEDALAM PANE KONTEN LAND PANEL DENGAN NAMA "landPanel"
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "homePage");
    }
    
    // METHOD UNTUK MENAMPILKAN REGISTER
    public void showRegister(){
        // INISIALISASI LANDPANEL
        register = new Register();
        getContentPane().add(register, "register");        
        
        // MENAMPILKAN KEDALAM PANE KONTEN LAND PANEL DENGAN NAMA "landPanel"
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "register");
    }
    
    // METHOD UNTUK MENAMPILKAN LOGIN
    public void showLogin(){
        // INISIALISASI LANDPANEL
        login = new Login();
        getContentPane().add(login, "login");        
        
        // MENAMPILKAN KEDALAM PANE KONTEN LAND PANEL DENGAN NAMA "landPanel"
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "login");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
        );

        pack();
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
