package vistas.VistasComponentes;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

    VistaPrincipal vista;

    
    public VistaListar(VistaPrincipal vista) {
        this.vista = vista;
        initComponents();
    }


    private JTable table;

    public VistaListar() {
        super("Listado");
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel jl = new JLabel("  Listado de trajes");
        jl.setBounds(0, 0, 500, 50);
        jl.setBorder(new EtchedBorder());
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl, BorderLayout.NORTH);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        String[] headers = {"Nombre", "País", "Material", "Precio"};
        loadCsvData("datos.csv", headers);

        setVisible(true);
    }

    private void loadCsvData(String csvFile, String[] headers) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));

            // Leer las líneas restantes para obtener los datos
            DefaultTableModel model = new DefaultTableModel(headers, 0);
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                model.addRow(tokens);
            }

            br.close();

            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo CSV: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*public static void main(String[] args) {
        VistaListar obj = new VistaListar();
    }*/
}


