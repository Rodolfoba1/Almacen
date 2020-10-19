
package Reproductor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GuardarDatos {
    Lista x = new Lista();
    public void escribir(Lista x)
    {
        try {
            RandomAccessFile a =new RandomAccessFile("info.ggs","rw");
            a.writeByte('P');
            a.writeByte('P');
            a.writeByte('P');
            a.writeByte('0');
            a.writeByte('0');
            a.writeByte('0');
            String cancion;
            String artista;
            String album;
            int largo;
            
            x.setsiguiente(x.getinicio());
            while(x.auxiliar!=null)
            {   
                if(x.getartista()!=null)
                {
                    
                     artista=x.getartista();
                     
                     largo=artista.length();
                    
                      a.writeByte('0');
                      a.writeByte((byte)largo);
                      a.writeByte('0');
                      for (int i = 0; i < artista.length(); i++) {
                        a.writeByte(artista.charAt(i));
                    }
                      
                }
                else
                {
                    a.writeByte('0');
                    a.writeByte('0');
                    
                }
                if(x.getalbum()!=null)
                {
                   
                     album=x.getalbum();
                     largo=album.length();
                     
                      a.writeByte('0');
                      a.writeByte((byte)largo);
                      a.writeByte('0');
                      for (int i = 0; i < album.length(); i++) {
                        a.writeByte(album.charAt(i));
                    }
                }
                else
                {
                    
                    a.writeByte('0');
                    a.writeByte('0');
                }
                 if(x.getnombre()!=null)
                {
                    
                     cancion=x.getnombre();
                    
                     largo=cancion.length();
                    
                      a.writeByte('0');
                      a.writeByte((byte)largo);
                      a.writeByte('0');
                      for (int i = 0; i < cancion.length(); i++) {
                        a.writeByte(cancion.charAt(i));
                    }
                      
                }
                else
                {
                    a.writeByte('0');
                    a.writeByte('0');
                    
                }
                cancion=x.getnombre();
                
                x.setsiguiente(x.getsiguinte());
            }
            a.close();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
