package Reproductor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
public class Lector 
{
    public static ArrayList<Datos> list = new ArrayList<>();
    public static JProgressBar barra;
    public File n = new File("Almacen.data");
    public void mostrar()
    {
        for (int i=0; i < list.size(); i++) 
        {
            System.out.println("PistaNumero "+list.get(i).getDatos());    
            System.out.println("PistaNombre "+list.get(i).getPistaNombre());
            System.out.println("PistaDireccion "+list.get(i).getPistaDireccion());
            System.out.println("PistaDuracion "+list.get(i).getPistaDuracionMin()+":"+list.get(i).getPistaDuracionSec());
            System.out.println("PistaLetra "+list.get(i).getPistaLetra());
            System.out.println("");
            System.out.println("Album "+list.get(i).getAlbum());
            System.out.println("AlbumNumero "+list.get(i).getAlbumNumero());
            System.out.println("AlbumAño "+list.get(i).getAlbumAño());
            System.out.println("");
            System.out.println("Disquera "+list.get(i).getDisquera());
            System.out.println("Artista "+list.get(i).getArtista());
            System.out.println("Genero "+list.get(i).getGenero());
            System.out.println("");
            System.out.println("EnlacesArtista "+list.get(i).getEnlacesArtista());
            System.out.println("EnlacesDisquera "+list.get(i).getEnlacesDisquera());
            System.out.println("EnlacesOtros "+list.get(i).getEnlacesOtros());
            System.out.println("------------------------------------------------------------------------");
        }
    }
    
    public boolean verificar()
    {
        return this.n.exists();
    }
    
    public void sobreescribir(Datos nuevos)
    {
        //Datos nuevos = new Datos();
        if(verificar())
        {
            try 
            {
                Datos nuevo = new Datos();
                InputStream in = new FileInputStream(n.getAbsolutePath());
                byte[] n = in.readAllBytes();
                String nueva = new String(n);
                nuevos.setDatos(nueva);
                list.add(nuevo);
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
    
    //////////
    public boolean EsMp3(String ruta) {
        String ext = "";
        boolean enc = false;
        int tam = ruta.length();
        for (int i = 0; i < tam; i++) {
            if (ruta.charAt(i) == '.') {
                enc = true;
                ext = "";
            } else if (enc) {
                ext += ruta.charAt(i);
            }
        }
        return "mp3".equalsIgnoreCase(ext);
    }
    /////
    public void ObternerDatos(){
        File mp3Archivo = new File(n.getAbsolutePath());
        AudioFileFormat baseFileFormat = null;
        try {
            baseFileFormat = AudioSystem.getAudioFileFormat(mp3Archivo);
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(baseFileFormat instanceof TAudioFileFormat){
            Map properties = ((TAudioFileFormat)baseFileFormat).properties();
            //list.getPistaNombre()=(String)properties.get("titulo");
            PistaNombre()=(String)properties.get("titulo");
            Artista=(String)properties.get("artista");
            Album=(String)properties.get("album");
            AlbumAño=(String)properties.get("año");
            PistaDuracion=(long)properties.get("duracion")/1000000;
            ////list.
        }
    }
    ///////////
    public String NombreArchivo(){
        String aux=new File(n.getAbsolutePath()).getName();
        return aux.substring(0,aux.length()-4);
    }
  
    
    Guardadatos f = new Guardadatos();
    public void lectura(String ruta) 
    {
        barra = new JProgressBar();
        int end, n = 0;
        int WPUB = 0;
        int TIT2 = 0;
        int TPUB = 0;
        int TPE2 = 0;
        int WOAR = 0;
        int USLT = 0;
        int TRCK = 0;
        int TPOS = 0;
        int TCON = 0;
        int TYER = 0;
        int TPE1 = 0;
        int TALB = 0;
        Datos nuevos = new Datos();
        try 
        {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "r");
            int s = -52;
            int contador = 0;
            if ((char) archivo.readByte() == 'I') 
            {
                contador++;
                if ((char) archivo.readByte() == 'D') 
                {
                    contador++;
                    if ((char) archivo.readByte() == '3') 
                    {
                        contador++;
                        byte x = archivo.readByte();
                        contador++;
                        int a = 0, b = 0, c = 0, d = 0;
                        end = 0;
                        while (a != 84 || b != 73 || c != 84 || d != 50) 
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 73 || c != 84 || d != 50) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 73;
                                c = 84;
                                d = 50;
                            }
                        }
                        if (end < 2000) 
                            TIT2 = contador;
                        else 
                            TIT2 = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 80 || c != 69 || d != 50) 
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 80 || c != 69 || d != 50) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 80;
                                c = 69;
                                d = 50;
                            }
                        }
                        if (end < 2000) 
                            TPE2 = contador;
                        else 
                            TPE2 = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        n=n+25;
                        barra.setValue(n);
                        while (a != 84 || b != 65 || c != 76 || d != 66)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 65 || c != 76 || d != 66) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 65;
                                c = 76;
                                d = 66;
                            }
                        }
                        if (end < 2000) 
                            TALB = contador;
                        else 
                            TALB = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 80 || c != 69 || d != 49) 
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 80 || c != 69 || d != 49) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 80;
                                c = 69;
                                d = 49;
                            }
                        }
                        if (end < 2000) 
                            TPE1 = contador;
                        else 
                            TPE1 = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 80 || c != 85 || d != 66)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 80 || c != 85 || d != 66) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 80;
                                c = 85;
                                d = 66;
                            }
                        }
                        if (end < 2000) 
                            TPUB = contador;
                        else 
                            TPUB = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 89 || c != 69 || d != 82)//TYER
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 89 || c != 69 || d != 82) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 89;
                                c = 69;
                                d = 82;
                            }
                        }
                        if (end < 2000) 
                            TYER = contador;
                        else 
                            TYER = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 67 || c != 79 || d != 78)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 67 || c != 79 || d != 78) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 2000) 
                            {
                                a = 84;
                                b = 67;
                                c = 79;
                                d = 78;
                            }
                        }
                        if (end < 2000) 
                            TCON = contador;
                        else 
                            TCON = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 80 || c != 79 || d != 83)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 80 || c != 79 || d != 83) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 99999) 
                            {
                                a = 84;
                                b = 80;
                                c = 79;
                                d = 83;
                            }
                        }
                        if (end < 99999) 
                            TPOS = contador;
                        else 
                            TPOS = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 84 || b != 82 || c != 67 || d != 75)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 84 || b != 82 || c != 67 || d != 75) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 99999) 
                            {
                                a = 84;
                                b = 82;
                                c = 67;
                                d = 75;
                            }
                        }
                        if (end < 99999) 
                            TRCK = contador;
                        else 
                            TRCK = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 85 || b != 83 || c != 76 || d != 84)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 85 || b != 83 || c != 76 || d != 84) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 99999) 
                            {
                                a = 85;
                                b = 83;
                                c = 76;
                                d = 84;
                            }
                        }
                        if (end < 99999) 
                            USLT = contador;
                        else 
                            USLT = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 87 || b != 79 || c != 65 || d != 82)
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 87 || b != 79 || c != 65 || d != 82) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 99999) 
                            {
                                a = 87;
                                b = 79;
                                c = 65;
                                d = 82;
                            }
                        }
                        if (end < 99999) 
                            WOAR = contador;
                        else 
                            WOAR = -1;
                        contador = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        end = 0;
                        while (a != 87 || b != 80 || c != 85 || d != 66)//TPOS
                        {
                            a = archivo.readByte();
                            contador++;
                            b = archivo.readByte();
                            contador++;
                            c = archivo.readByte();
                            contador++;
                            d = archivo.readByte();
                            contador++;
                            if (a != 87 || b != 80 || c != 85 || d != 66) 
                            {
                                contador = contador - 3;
                                archivo.seek(contador);
                            }
                            end++;
                            if (end == 99999) 
                            {
                                a = 87;
                                b = 80;
                                c = 85;
                                d = 66;
                            }
                        }
                        if (end < 99999) 
                            WPUB = contador;
                        else 
                            WPUB = -1;
                    }
                }
            }
            n=n+25;
            barra.setValue(n);
            String genero = "";
            if (TCON != -1) 
            {
                archivo.seek(TCON);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        genero = genero + (char) aux;
                }
                nuevos.setGenero(genero);
                nuevos.setPistaDireccion(ruta);
            }
            String pagD = "";
            if (WPUB != -1) 
            {
                archivo.seek(WPUB);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        pagD = pagD + (char) aux;
                }
                nuevos.setEnlacesDisquera(pagD);
            }
            String pagA = "";
            if (WOAR != -1) 
            {
                archivo.seek(WOAR);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        pagA = pagA + (char) aux;
                }
                nuevos.setEnlacesArtista(pagA);
            }
            String letra = "";
            if (USLT != -1) 
            {
                archivo.seek(USLT);
                int longitud = archivo.readInt() + 2;
                byte aux = 0;
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        letra = letra + (char) aux;
                    if (aux == 0 || aux == 12 || aux == 10) 
                        letra = letra + (char) aux;
                }
                nuevos.setPistaLetra(letra);
            }
            String track = "";
            if (TRCK != -1) 
            {
                archivo.seek(TRCK);
                byte aux = 0;
                short longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        track = track + (char) aux;
                }
                nuevos.setDatos(track);
            }
            String año = "";
            if (TYER != -1)
            {
                archivo.seek(TYER);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        año = año + (char) aux;
                }
                nuevos.setAlbumAño(aux);
            }
            n=n+25;
            barra.setValue(n);
            String NoA = "";
            if (TPOS != -1) 
            {
                archivo.seek(TPOS);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        NoA = NoA + (char) aux;
                }
                nuevos.setAlbumNumero(NoA);
            }
            String alb = "";
            if (TALB != -1) 
            {
                archivo.seek(TALB);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        alb = alb + (char) aux;
                }
                nuevos.setAlbum(alb);
            }
            String art1 = "";
            if (TPE1 != -1) 
            {
                archivo.seek(TPE1);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        art1 = art1 + (char) aux;
                }
                nuevos.setArtista(art1);
            }
            String cancion = "";
            if (TIT2 != -1) 
            {
                archivo.seek(TIT2);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        cancion = cancion + (char) aux;
                }
                nuevos.setPistaNombre(cancion);
            }
            String disquera = "";
            if (TPUB != -1) 
            {
                archivo.seek(TPUB);
                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) 
                    longitud = archivo.readByte();
                for (int i = 0; i < 2; i++) 
                    archivo.readByte();
                for (int i = 0; i < longitud; i++) 
                {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) 
                        disquera = disquera + (char) aux;
                }
                nuevos.setDisquera(disquera);
            }
            n=n+25;
            barra.setValue(n);
            archivo.close();
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (IOException ex) 
        {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(nuevos);
        f.escribir(list);
    }
}