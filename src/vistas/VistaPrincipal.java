package vistas;

import controlador.ControladorTrajes;
import controlador.Operaciones;
import vistas.VistasComponentes.BuscarVista;
import vistas.VistasComponentes.EliminarVista;
import vistas.VistasComponentes.VistaActualizar;
import vistas.VistasComponentes.VistaComprar;
import vistas.VistasComponentes.VistaInsertar;
import vistas.VistasComponentes.VistaListar;

public class VistaPrincipal extends javax.swing.JFrame implements IVista{
    ControladorTrajes controlador;
    String nombreTrajeActualizar;
    
    VistaInsertar menuInsertar = new VistaInsertar(this);
    VistaActualizar menuActualizar = new VistaActualizar(this);
    EliminarVista menuEliminar = new EliminarVista(this);
    BuscarVista menuBuscar = new BuscarVista(this);
    VistaListar menuListar = new VistaListar(this);
    VistaComprar menuComprar = new VistaComprar(this);
    public VistaPrincipal() {
        initComponents();
    }

    public void actualizarListarComboboxes(){
        String[] nombresTrajes = controlador.getNombresTrajes();
        menuEliminar.cmbTrajes.setModel(new javax.swing.DefaultComboBoxModel<>(nombresTrajes));
        menuComprar.cmbTrajes.setModel(new javax.swing.DefaultComboBoxModel<>(nombresTrajes));
        menuActualizar.cmbTrajes.setModel(new javax.swing.DefaultComboBoxModel<>(nombresTrajes));
        limpiarCampos();
    }

    public void limpiarCampos(){
        menuInsertar.limpiarCampos();
        menuActualizar.limpiarCampos();
        menuEliminar.limpiarCampos();
        menuBuscar.limpiarCampos();
        menuListar.limpiarCampos();
        //menuComprar.limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Alquiler de trajes");

        btnInsertar.setText("Insertar Traje");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Traje");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Traje");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Traje");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar Trajes");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnComprar.setText("ComprarTrajes");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una opcion:");

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                        .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139))))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnInsertar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarListarComboboxes();  
        controlador.setOperacion(Operaciones.INSERTAR);
        System.out.println("Operacion insertar");                                          
        this.dispose();
        menuInsertar.setVisible(true);
    }                                           

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        actualizarListarComboboxes();
        controlador.setOperacion(Operaciones.ACTUALIZAR);
        this.dispose();
        menuActualizar.setVisible(true);
    }                                             

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {   
        actualizarListarComboboxes();
        controlador.setOperacion(Operaciones.ELIMINAR);                                        
        this.dispose();
        menuEliminar.setVisible(true);
    }                                           

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {   
        actualizarListarComboboxes();
        controlador.setOperacion(Operaciones.BUSCAR);                                       
        this.dispose();
        menuBuscar.setVisible(true);
    }                                         

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {  
        actualizarListarComboboxes();
        menuListar.rellenarTabla();                                        
        this.dispose();
        menuListar.setVisible(true);
    }                                         

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {  
        actualizarListarComboboxes();         
        controlador.setOperacion(Operaciones.COMPRAR);                                
        this.dispose();
        menuComprar.setVisible(true);
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnBg;
    // End of variables declaration                   

    @Override
    public void iniciar(ControladorTrajes controlador) {
        
        this.controlador = controlador;
        actualizarListarComboboxes();
        // agregar el action listener a cada boton
        this.menuInsertar.btnGuardar.addActionListener(controlador);
        this.menuEliminar.btnEliminar.addActionListener(controlador);

        this.menuActualizar.btnActualizar.addActionListener(controlador);

        this.menuBuscar.btnBuscar.addActionListener(controlador);
        this.menuBuscar.txtInformacionTraje.setEditable(false);

        this.menuComprar.btnComprar.addActionListener(controlador);


       setVisible(true);
    }

    @Override
    public Object[] insertarTraje() {
        String nombre = this.menuInsertar.txtNombre.getText();
        String pais = this.menuInsertar.txtPais.getText();
        String material = this.menuInsertar.txtMaterial.getText();
        Double precio = Double.parseDouble(this.menuInsertar.txtPrecio.getText());
        System.out.println("Se retornan los datos");
        return new Object[] {nombre, pais, material, precio};
    }

    @Override
    public Object[] actualizarTraje() {
        nombreTrajeActualizar = this.menuActualizar.cmbTrajes.getSelectedItem().toString();
        String nombreTraje = this.menuActualizar.txtNombre.getText();
        String pais = this.menuActualizar.txtPais.getText();
        String material = this.menuActualizar.txtMaterial.getText();
        Double precio = Double.parseDouble(this.menuActualizar.txtPrecio.getText());
        return new Object[] {nombreTraje, pais, material, precio}; 
    }

    @Override
    public String eliminarTraje() {
        String nombreAEliminar = (String) this.menuEliminar.cmbTrajes.getSelectedItem();
        return nombreAEliminar; 
    }

    @Override
    public String buscarTraje() {
        String nombreABuscar = this.menuBuscar.txtNombreBuscar.getText();
        return nombreABuscar;
    }
    public void setInformacionBusqueda(String informacion, boolean validar){
        if(validar == true){
            String[] datosCompra = informacion.split(";");
            String textoFormateado = String.format("Nombre: %s\nPais: %s\nMaterial: %s\nPrecio: %s",
                                datosCompra[0], datosCompra[1], datosCompra[2], datosCompra[3]);
            String textoanterio = menuComprar.jTextArea1.getText();
            this.menuComprar.jTextArea1.setText(textoanterio+"\n\n"+textoFormateado);

        }else{
            String[] datosTraje = informacion.split(";");
            String textoFormateado = String.format("Nombre: %s\nPais: %s\nMaterial: %s\nPrecio: %s",
                                datosTraje[0], datosTraje[1], datosTraje[2], datosTraje[3]);
            this.menuBuscar.txtInformacionTraje.setText(textoFormateado);

        }
        
    }

    @Override
    public void listarTrajes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTrajes'");
    }

    public Object[] comprarTraje() {
        String nombre = this.menuComprar.cmbTrajes.getSelectedItem().toString();
        int cantidad = (int) this.menuComprar.spCantidad.getValue();
        System.out.println("Entró a añadir carrito");
        return new Object[] {nombre, cantidad};
    }

    @Override
    public String getNombreTrajeActualizar() {
        return nombreTrajeActualizar;
    }
}
