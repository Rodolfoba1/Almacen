package Reproductor;
import static Reproductor.Lector.list;
import javax.swing.JOptionPane;
public class Buscar extends javax.swing.JFrame 
{
    public Buscar() 
    {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BuscarAutor = new javax.swing.JButton();
        BuscarNombre = new javax.swing.JButton();
        BuscarAño = new javax.swing.JButton();
        DatoAutor = new javax.swing.JTextField();
        DatoNombre = new javax.swing.JTextField();
        DatoAño = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuscarAutor.setText("Buscar por Autor");
        BuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAutorActionPerformed(evt);
            }
        });

        BuscarNombre.setText("Buscar por Nombre");
        BuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNombreActionPerformed(evt);
            }
        });

        BuscarAño.setText("Buscar Por Año");
        BuscarAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAñoActionPerformed(evt);
            }
        });

        DatoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(BuscarAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoAutor)
                    .addComponent(DatoNombre)
                    .addComponent(DatoAño))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(DatoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarAutor)
                .addGap(26, 26, 26)
                .addComponent(DatoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarNombre)
                .addGap(25, 25, 25)
                .addComponent(DatoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarAño)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAutorActionPerformed
        for (int i = 0; i <= list.size(); i++) 
        {
            if (list.get(i).getArtista().equals(DatoAutor.getText()))
                JOptionPane.showMessageDialog(null, "Numero: "+list.get(i).getDatos()+"\nNombre: "+list.get(i).getPistaNombre()+"\nDireccion: "+list.get(i).getPistaDireccion()+"\nDuracion: "+list.get(i).getPistaDuracionMin()+":"+list.get(i).getPistaDuracionSec()+"\nLetra: "+list.get(i).getPistaLetra()+"\nAlbum: "+list.get(i).getAlbum()+"\nNumeroAlbum:"+list.get(i).getAlbumNumero()+"\nAño: "+list.get(i).getAlbumAño()+"\nDisquera: "+list.get(i).getDisquera()+"\nArtista: "+list.get(i).getArtista()+"\nGenero: "+list.get(i).getGenero()+"\n---------Enlaces---------\n"+list.get(i).getEnlacesArtista()+"\n"+list.get(i).getEnlacesDisquera()+"\n"+list.get(i).getEnlacesOtros(), "Dato encontrado", HEIGHT);
            break;
        }
    }//GEN-LAST:event_BuscarAutorActionPerformed

    private void DatoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoAutorActionPerformed
        
    }//GEN-LAST:event_DatoAutorActionPerformed

    private void BuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNombreActionPerformed
        for (int i = 0; i <= list.size(); i++) 
        {
            if (list.get(i).getPistaNombre().equals(DatoNombre.getText()))
                JOptionPane.showMessageDialog(null, "Numero: "+list.get(i).getDatos()+"\nNombre: "+list.get(i).getPistaNombre()+"\nDireccion: "+list.get(i).getPistaDireccion()+"\nDuracion: "+list.get(i).getPistaDuracionMin()+":"+list.get(i).getPistaDuracionSec()+"\nLetra: "+list.get(i).getPistaLetra()+"\nAlbum: "+list.get(i).getAlbum()+"\nNumeroAlbum:"+list.get(i).getAlbumNumero()+"\nAño: "+list.get(i).getAlbumAño()+"\nDisquera: "+list.get(i).getDisquera()+"\nArtista: "+list.get(i).getArtista()+"\nGenero: "+list.get(i).getGenero()+"\n---------Enlaces---------\n"+list.get(i).getEnlacesArtista()+"\n"+list.get(i).getEnlacesDisquera()+"\n"+list.get(i).getEnlacesOtros(), "Dato encontrado", HEIGHT);
            break;
        }
    }//GEN-LAST:event_BuscarNombreActionPerformed

    private void BuscarAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAñoActionPerformed
        for (int i = 0; i <= list.size(); i++) 
        {
            if (list.get(i).getAlbumAño() == Integer.parseInt(DatoAño.getText()))
                JOptionPane.showMessageDialog(null, "Numero: "+list.get(i).getDatos()+"\nNombre: "+list.get(i).getPistaNombre()+"\nDireccion: "+list.get(i).getPistaDireccion()+"\nDuracion: "+list.get(i).getPistaDuracionMin()+":"+list.get(i).getPistaDuracionSec()+"\nLetra: "+list.get(i).getPistaLetra()+"\nAlbum: "+list.get(i).getAlbum()+"\nNumeroAlbum:"+list.get(i).getAlbumNumero()+"\nAño: "+list.get(i).getAlbumAño()+"\nDisquera: "+list.get(i).getDisquera()+"\nArtista: "+list.get(i).getArtista()+"\nGenero: "+list.get(i).getGenero()+"\n---------Enlaces---------\n"+list.get(i).getEnlacesArtista()+"\n"+list.get(i).getEnlacesDisquera()+"\n"+list.get(i).getEnlacesOtros(), "Dato encontrado", HEIGHT);
            break;
        }
    }//GEN-LAST:event_BuscarAñoActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Buscar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarAutor;
    private javax.swing.JButton BuscarAño;
    private javax.swing.JButton BuscarNombre;
    private javax.swing.JTextField DatoAutor;
    private javax.swing.JTextField DatoAño;
    private javax.swing.JTextField DatoNombre;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}