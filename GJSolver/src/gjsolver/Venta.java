/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjsolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author apple
 */
public class Venta extends javax.swing.JFrame {

    int filas,columnas;
    int Matriz[][];
    public Venta() {
        initComponents();
        RedimensionarTabla();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnRedimensionar = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnMenosFilas = new javax.swing.JButton();
        btnMenosColumnas = new javax.swing.JButton();
        btnMasFilas = new javax.swing.JButton();
        btnMasColumnas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatriz.setEditingColumn(0);
        tblMatriz.setEditingRow(0);
        jScrollPane1.setViewportView(tblMatriz);

        btnCargar.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        btnCargar.setText("Cargar matriz desde archivo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnRedimensionar.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        btnRedimensionar.setText("Redimesionar");
        btnRedimensionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedimensionarActionPerformed(evt);
            }
        });

        btnResolver.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        btnResolver.setText("Resolver Matriz");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar Matriz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnResolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRedimensionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedimensionar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnMenosFilas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnMenosFilas.setText("-");
        btnMenosFilas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMenosFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFilasActionPerformed(evt);
            }
        });

        btnMenosColumnas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnMenosColumnas.setText("-");
        btnMenosColumnas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMenosColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosColumnasActionPerformed(evt);
            }
        });

        btnMasFilas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMasFilas.setText("+");
        btnMasFilas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMasFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasFilasActionPerformed(evt);
            }
        });

        btnMasColumnas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMasColumnas.setText("+");
        btnMasColumnas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMasColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasColumnasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gaus-Jordan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenosColumnas)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMenosFilas)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMasFilas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMasColumnas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenosFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnMasColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenosColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMasFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        ObtenerMatriz();
    }//GEN-LAST:event_btnResolverActionPerformed

    private void btnRedimensionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedimensionarActionPerformed
        RedimensionarTabla();
    }//GEN-LAST:event_btnRedimensionarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        AbrirArchivo();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnMasColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasColumnasActionPerformed
        AgregarQuitarColumnas(1);
    }//GEN-LAST:event_btnMasColumnasActionPerformed

    private void btnMenosFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFilasActionPerformed
        if(filas>0)
            AgregarQuitarFilas(-1);
    }//GEN-LAST:event_btnMenosFilasActionPerformed

    private void btnMenosColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosColumnasActionPerformed
        if(columnas>0)    
            AgregarQuitarColumnas(-1);
    }//GEN-LAST:event_btnMenosColumnasActionPerformed

    private void btnMasFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasFilasActionPerformed
        AgregarQuitarFilas(1);
    }//GEN-LAST:event_btnMasFilasActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
    
    public void AgregarQuitarColumnas(int n){
        columnas+=n;
        DefaultTableModel modelo=(DefaultTableModel)tblMatriz.getModel();
        modelo.setColumnCount(columnas);
        modelo.setRowCount(filas);
        if(n>0){
            for(int i=0;i<filas;i++){
                modelo.setValueAt(0, i, columnas-1);
            }
        }
    }
    
    public void AgregarQuitarFilas(int n){
        filas+=n;
        DefaultTableModel modelo=(DefaultTableModel)tblMatriz.getModel();
        modelo.setColumnCount(columnas);
        modelo.setRowCount(filas);
        if(n>0){
            for(int i=0;i<columnas;i++){
                modelo.setValueAt(0, filas-1, i);
            }
        }
    }
    
    public void RedimensionarTabla(){
        filas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas: "));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas: "));
        DefaultTableModel modelo=(DefaultTableModel)tblMatriz.getModel();
        modelo.setColumnCount(columnas);
        modelo.setRowCount(filas);
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                modelo.setValueAt(0, i,j);
            }
        }
    }
    
    public void AbrirArchivo(){
        FileReader fr = null;
        BufferedReader br = null;
        JFileChooser jfcSelector =new JFileChooser();
        FileNameExtensionFilter filter =new FileNameExtensionFilter("TXT", "txt");
        jfcSelector.setFileFilter(filter);
        if(jfcSelector.showOpenDialog(getContentPane())==JFileChooser.APPROVE_OPTION){
            try {
                File file=jfcSelector.getSelectedFile();
                fr = new FileReader (file);
                br = new BufferedReader(fr);
                String texto = null;
                while((texto+=br.readLine())!=null){
                
                } 
                String Filas[]=texto.split("\n");
                String Columnas[] = null;
                Columnas=Filas[0].split(" ");
                filas=Filas.length;
                columnas=Columnas.length;
                Matriz=new int[filas][columnas];
                for (int i=0;i<Filas.length;i++) {
                    Columnas = Filas[i].split(" ");
                    for (int j = 0; j < Columnas.length; j++) {
                        Matriz[i][j]=Integer.parseInt(Columnas[j]);
                    }
                }
                PonerMatriz();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showInternalMessageDialog(this,"Error al abrir el archivo");
            }finally{
                try{                    
                   if( null != fr ){   
                      fr.close();     
                   }                  
                }catch (Exception e2){ 
                   e2.printStackTrace();
                }
             }
         }
    }
    
    public void PonerMatriz(){
        DefaultTableModel modelo=(DefaultTableModel)tblMatriz.getModel();
        modelo.setColumnCount(columnas);
        modelo.setRowCount(filas);
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                modelo.setValueAt(Matriz[i][j], i,j);
            }
        }
    }
    
    public void ObtenerMatriz(){
        Matriz=new int[filas][columnas];
        //Obtiene el valor de cada celda y lo guarda en la matriz
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                Matriz[i][j]=Integer.parseInt(tblMatriz.getValueAt(i,j).toString());
            }
        }/*Test para ver que obtenga la matriz que esta en la tabla
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(" "+Matriz[i][j]);
            }
            System.out.print("\n");
        }*/
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnMasColumnas;
    private javax.swing.JButton btnMasFilas;
    private javax.swing.JButton btnMenosColumnas;
    private javax.swing.JButton btnMenosFilas;
    private javax.swing.JButton btnRedimensionar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMatriz;
    // End of variables declaration//GEN-END:variables
}
