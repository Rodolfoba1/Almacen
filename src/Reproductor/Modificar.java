package Reproductor;
import static Reproductor.Lector.list;
public class Modificar extends javax.swing.JFrame 
{
    public Modificar() 
    {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatoNumero = new javax.swing.JTextField();
        DatoNombre = new javax.swing.JTextField();
        Buscador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DatoNoAlbum = new javax.swing.JTextField();
        DatoAño = new javax.swing.JTextField();
        DatoDisquera = new javax.swing.JTextField();
        DatoArtista = new javax.swing.JTextField();
        DatoGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LetraCancion = new javax.swing.JTextArea();
        DatoAlbum = new javax.swing.JTextField();
        DatoEnArtista = new javax.swing.JTextField();
        DatoEnDisquera = new javax.swing.JTextField();
        DatoEnOtros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Modificado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DatoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoNombreActionPerformed(evt);
            }
        });

        Buscador.setText("Inserte Nombre");
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero");

        jLabel2.setText("Letra");

        jLabel3.setText("Album");

        jLabel4.setText("No. de album");

        jLabel5.setText("Año");

        jLabel6.setText("Disquera");

        jLabel7.setText("Artista");

        jLabel8.setText("Genero");

        LetraCancion.setColumns(20);
        LetraCancion.setRows(5);
        jScrollPane1.setViewportView(LetraCancion);

        jLabel9.setText("Enlaces");

        jLabel10.setText("Artista");

        jLabel11.setText("Disquera");

        jLabel12.setText("Otros");

        Modificado.setText("Modificar");
        Modificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Buscador)
                            .addGap(18, 18, 18)
                            .addComponent(DatoNombre))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DatoArtista)
                                .addComponent(DatoAlbum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoNoAlbum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoDisquera, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoGenero)
                                .addComponent(DatoNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoAño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DatoEnDisquera, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoEnArtista, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoEnOtros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modificado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscador)
                            .addComponent(DatoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Modificado, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(DatoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DatoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoNoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoEnArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoEnDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatoEnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(jScrollPane1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DatoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoNombreActionPerformed

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        for (int i = 0; i <= list.size(); i++) 
        {
            if (list.get(i).getPistaNombre().equals(DatoNombre.getText()))
            {
                String Anio = "";
                DatoNombre.setEditable(false);
                DatoNumero.setText(list.get(i).getDatos());
                DatoAlbum.setText(list.get(i).getAlbum());
                DatoNoAlbum.setText(list.get(i).getAlbumNumero());
                DatoAño.setText(Anio = ""+list.get(i).getAlbumAño());
                DatoDisquera.setText(list.get(i).getDisquera());
                DatoArtista.setText(list.get(i).getArtista());
                DatoGenero.setText(list.get(i).getGenero());
                DatoEnArtista.setText(list.get(i).getEnlacesArtista());
                DatoEnDisquera.setText(list.get(i).getEnlacesDisquera());
                DatoEnOtros.setText(list.get(i).getEnlacesOtros());
                LetraCancion.append(list.get(i).getPistaLetra());
            }
            break;
        }
    }//GEN-LAST:event_BuscadorActionPerformed

    private void ModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificadoActionPerformed
        for (int i = 0; i <= list.size(); i++) 
        {
            if (list.get(i).getPistaNombre().equals(DatoNombre.getText()))
            {
                list.get(i).setDatos(DatoNumero.getText());
                list.get(i).setAlbum(DatoAlbum.getText());
                list.get(i).setAlbumNumero(DatoNoAlbum.getText());
                list.get(i).setAlbumAño((short) Integer.parseInt(DatoAño.getText()));
                list.get(i).setDisquera(DatoDisquera.getText());
                list.get(i).setArtista(DatoArtista.getText());
                list.get(i).setGenero(DatoGenero.getText());
                list.get(i).setEnlacesArtista(DatoEnArtista.getText());
                list.get(i).setEnlacesDisquera(DatoEnDisquera.getText());
                list.get(i).setEnlacesOtros(DatoEnOtros.getText());
                list.get(i).setPistaLetra(LetraCancion.getText());
            }
            break;
        }
    }//GEN-LAST:event_ModificadoActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Modificar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscador;
    private javax.swing.JTextField DatoAlbum;
    private javax.swing.JTextField DatoArtista;
    private javax.swing.JTextField DatoAño;
    private javax.swing.JTextField DatoDisquera;
    private javax.swing.JTextField DatoEnArtista;
    private javax.swing.JTextField DatoEnDisquera;
    private javax.swing.JTextField DatoEnOtros;
    private javax.swing.JTextField DatoGenero;
    private javax.swing.JTextField DatoNoAlbum;
    private javax.swing.JTextField DatoNombre;
    private javax.swing.JTextField DatoNumero;
    private javax.swing.JTextArea LetraCancion;
    private javax.swing.JButton Modificado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}