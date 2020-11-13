package Reproductor;
import static Reproductor.Lector.list;
public class Mostrar extends javax.swing.JFrame 
{
    public Mostrar() 
    {
        initComponents();
        for (int i = 0; i < list.size(); i++)
        {
            String dato = ""; 
            dato += "Numero: "+list.get(i).getDatos()+"\nNombre: "+list.get(i).getPistaNombre()+"\nDireccion: "+list.get(i).getPistaDireccion()+"\nDuracion: "+list.get(i).getPistaDuracionMin()+":"+list.get(i).getPistaDuracionSec()+"\nLetra: "+list.get(i).getPistaLetra()+"\nAlbum: "+list.get(i).getAlbum()+"\nNumeroAlbum:"+list.get(i).getAlbumNumero()+"\nAño: "+list.get(i).getAlbumAño()+"\nDisquera: "+list.get(i).getDisquera()+"\nArtista: "+list.get(i).getArtista()+"\nGenero: "+list.get(i).getGenero()+"\n---------Enlaces---------\n"+list.get(i).getEnlacesArtista()+"\n"+list.get(i).getEnlacesDisquera()+"\n"+list.get(i).getEnlacesOtros()+"\n-----------------------------------------------------------------------------";
            Mostrar.append(dato);
        }
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mostrar.setColumns(20);
        Mostrar.setRows(5);
        jScrollPane1.setViewportView(Mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Mostrar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}