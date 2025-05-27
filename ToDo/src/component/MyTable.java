package component;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class MyTable extends JTable {
    private Color colorBackground;
    private Color colorHeaderBackground;
    private Color colorHeaderText;
    private DefaultTableModel tableModel;

    public MyTable() {
//        // Definisikan nama kolom
//        String[] namaKolom = {"ID", "Nama Barang", "Stok"};
//        tableModel = new DefaultTableModel(namaKolom, 0);
//        setModel(tableModel);

        // Set warna default untuk background tabel dan header
        colorBackground = Color.WHITE;
        colorHeaderBackground = new Color(200, 200, 200); // Warna default header
        colorHeaderText = Color.BLACK; // Warna default teks header

        // Set DefaultTableCellRenderer untuk data di tengah
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        setDefaultRenderer(Object.class, centerRenderer);       
        
        // Terapkan warna-warna default
        setBackground(colorBackground);
        customizeHeader();
    }

    // Setter untuk background tabel
    @Override
    public void setBackground(Color colorBackground) {
        this.colorBackground = colorBackground;
        super.setBackground(colorBackground);
    }

    // Setter dan getter untuk warna background header
    public void setHeaderBackground(Color colorHeaderBackground) {
        this.colorHeaderBackground = colorHeaderBackground;
        customizeHeader();
    }

    public Color getHeaderBackground() {
        return colorHeaderBackground;
    }

    // Setter dan getter untuk warna teks header
    public void setHeaderTextColor(Color colorHeaderText) {
        this.colorHeaderText = colorHeaderText;
        customizeHeader();
    }

    public Color getHeaderTextColor() {
        return colorHeaderText;
    }

    // Metode untuk menambahkan data ke tabel
    public void addRowData(Object[] rowData) {
        tableModel.addRow(rowData);
    }

    // Metode untuk menghapus semua data dari tabel
    public void clearTableData() {
        tableModel.setRowCount(0);
    }

    // Method untuk menyesuaikan tampilan header
    private void customizeHeader() {
        JTableHeader header = getTableHeader();
        header.setBackground(colorHeaderBackground);

        // Custom renderer untuk mengatur warna teks header
        header.setDefaultRenderer(new TableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel headerLabel = new JLabel(value.toString());
                headerLabel.setOpaque(true);
                headerLabel.setBackground(colorHeaderBackground);
                headerLabel.setForeground(colorHeaderText);
                headerLabel.setFont(new Font("SansSerif", Font.BOLD, 12)); // Mengatur font header
                headerLabel.setHorizontalAlignment(JLabel.CENTER); // Teks header rata tengah
                return headerLabel;
            }
        });
    }
}
