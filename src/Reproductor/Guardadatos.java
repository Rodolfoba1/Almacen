package Reproductor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Guardadatos 
{
    public void escribir(ArrayList<Datos>x)
    {
        int peso = 0;
        try
        {
            RandomAccessFile j = new RandomAccessFile("Almacen.data","rw");
            for (int i=0; i < x.size(); i++) 
            {
                j.writeInt(peso);
                j.writeChars(x.get(i).getPistaNombre());//tamaño por peso individual
                j.writeChars(x.get(i).getPistaDireccion());//tamaño por peso individual
                j.writeByte(x.get(i).getPistaDuracionMin());//pesa 1
                j.writeByte(x.get(i).getPistaDuracionSec());//pesa 1
                j.writeChars(x.get(i).getPistaLetra());//tamaño por peso individual
                j.writeChars(x.get(i).getAlbum());//tamaño por peso individual
                j.writeChars(x.get(i).getAlbumNumero());//tamaño por peso individual
                j.writeShort(x.get(i).getAlbumAño());//pesa 2
                j.writeChars(x.get(i).getDisquera());//tamaño por peso individual
                j.writeChars(x.get(i).getArtista());//tamaño por peso individual
                j.writeChars(x.get(i).getGenero());//tamaño por peso individual
                j.writeChars(x.get(i).getEnlacesArtista());//tamaño por peso individual
                j.writeChars(x.get(i).getEnlacesDisquera());//tamaño por peso individual
                j.writeChars(x.get(i).getEnlacesOtros());//tamaño por peso individual
                peso=peso+(x.get(i).getPistaNombre().length()*2)+(x.get(i).getPistaDireccion().length()*2)+1+1+2+(x.get(i).getPistaLetra().length()*2)+(x.get(i).getAlbum().length()*2)+(x.get(i).getAlbumNumero().length()*2)+(x.get(i).getDisquera().length()*2)+(x.get(i).getArtista().length()*2)+(x.get(i).getGenero().length()*2)+(x.get(i).getEnlacesArtista().length()*2)+(x.get(i).getEnlacesDisquera().length()*2)+(x.get(i).getEnlacesOtros().length()*2);
            }
            j.close();
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Guardadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Guardadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}