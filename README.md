package Reproductor;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int op=0;
        do
        {
            System.out.println("1.Agregar");
            System.out.println("2.Mostrar");
            System.out.println("3.Salir");
            op = leer.nextInt();
            switch (op)
            {
                case 1:
                    JFileChooser archivo = new JFileChooser();
                    archivo.setFileFilter(new FileNameExtensionFilter("Archivo MP3", "mp3", "mp3"));
                    archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    archivo.setMultiSelectionEnabled(true);
                    int seleccion = archivo.showOpenDialog(archivo);
                    if (seleccion==JFileChooser.APPROVE_OPTION)
                    {
                        File arc[] = archivo.getSelectedFiles();
                        boolean mp3=false;
                        for(File str : arc)
                        {
                            System.out.println(str.getName()); //esta linea es para leer el nombre de la cancion, hay que cambiar a una forma de leerlos con bytes
                            System.out.println(str.getPath()); //esta linea es para hallar la ruta del archivo ,p3
                        }
                        if (mp3)
                            JOptionPane.showMessageDialog(null, "el archivo seleccionado no es MP3","ERROR", 0);
                    }
                    //despues debe agregar los datos obtenidos de la cancion a un archivo
                    
                    break;
                case 2:
                    
                    break;
                default: 
                    break;
            }
        }while(op!=3);
    }
}



