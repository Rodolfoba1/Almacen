package Reproductor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Leer_mp3 {

        Lista nuevo = new Lista();
    
    
        public void mostrar(){
            nuevo.listar();
        }
                
        public Lista devolver(){
            return nuevo;
        }
    
        GuardarDatos gd = new GuardarDatos();
                
    
    public void lectura(String ruta) {

        int fin,Titl2 = 0,TConn = 0,TYear = 0,Talbu = 0,TRack = 0,TPoss = 0,TPe1 = 0,TPubl = 0,TPe2 = 0,WPubl = 0,WoArr = 0,Usltt = 0;
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "r");
            int s = -52;
            int cont = 0;
            //comparar archivo si es ID3
            if ((char) archivo.readByte() == 'I') {
                cont++;
                if ((char) archivo.readByte() == 'D') {
                    cont++;
                    if ((char) archivo.readByte() == '3') {
                        cont++;
                        byte x = archivo.readByte();
                        cont++;

                        int a = 0, b = 0, c = 0, d = 0;
                        fin = 0;
                        
                        while (a != 84 || b != 73 || c != 84 || d != 50) {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 73 || c != 84 || d != 50) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }

                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 73;
                                c = 84;
                                d = 50;
                            }
                        }

                        if (fin < 2000) {
                            Titl2 = cont;
                        } else {
                            Titl2 = -1;
                        }

                        //Busqueda de TPE2 
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 80 || c != 69 || d != 50) {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 80 || c != 69 || d != 50) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 80;
                                c = 69;
                                d = 50;

                            }
                        }

                        if (fin < 2000) {
                            TPe2 = cont;
                        } else {

                            TPe2 = -1;
                        }
                        //Busqueda donde termina TALB
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        
                        // Num TALB 
                        while (a != 84 || b != 65 || c != 76 || d != 66)
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 65 || c != 76 || d != 66) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 65;
                                c = 76;
                                d = 66;
                            }
                        }

                        if (fin < 2000) {
                            Talbu = cont;
                        } else {
                            Talbu = -1;
                        }
                        //Busca donde termina TPE1 
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 80 || c != 69 || d != 49) {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 80 || c != 69 || d != 49) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 80;
                                c = 69;
                                d = 49;
                            }
                        }

                        if (fin < 2000) {
                            TPe1 = cont;
                        } else {
                            TPe1 = -1;
                        }
                        
                        //buscar donde termina TPE1
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 80 || c != 85 || d != 66)//TPE1
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 80 || c != 85 || d != 66) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 80;
                                c = 85;
                                d = 66;
                            }
                        }

                        if (fin < 2000) {
                            TPubl = cont;
                        } else {
                            TPubl = -1;
                        }
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 89 || c != 69 || d != 82)
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 89 || c != 69 || d != 82) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 89;
                                c = 69;
                                d = 82;
                            }
                        }

                        if (fin < 2000) {
                            TYear = cont;///fin de tag TIT2
                        } else {
                            TYear = -1;
                        }
                        
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 67 || c != 79 || d != 78)
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 67 || c != 79 || d != 78) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 2000) {
                                a = 84;
                                b = 67;
                                c = 79;
                                d = 78;
                            }
                        }

                        if (fin < 2000) {
                            TConn = cont;
                        } else {
                            TConn = -1;
                        }

                        
                        cont = 3;
                        archivo.seek(3);
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 80 || c != 79 || d != 83)
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 80 || c != 79 || d != 83) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 99999) {
                                a = 84;
                                b = 80;
                                c = 79;
                                d = 83;
                            }
                        }

                        if (fin < 99999) {
                            TPoss = cont;///fin de tag TIT2
                        } else {
                            TPoss = -1;
                        }

                        cont = 3;
                        archivo.seek(3);

                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 84 || b != 82 || c != 67 || d != 75)//TPOS
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 84 || b != 82 || c != 67 || d != 75) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 99999) {
                                a = 84;
                                b = 82;
                                c = 67;
                                d = 75;
                            }
                        }

                        if (fin < 99999) {
                            TRack = cont;///fin de tag TIT2
                        } else {
                            TRack = -1;
                        }
                        
                        cont = 3;
                        archivo.seek(3);

                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 85 || b != 83 || c != 76 || d != 84)//TPOS
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 85 || b != 83 || c != 76 || d != 84) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 99999) {
                                a = 85;
                                c = 76;
                                d = 84;
                            }
                        }

                        if (fin < 99999) {
                            Usltt = fin;///termina tag TIT2
                        } else {
                            Usltt = -1;
                        }

                        cont = 3;
                        archivo.seek(3);

                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;
                        while (a != 87 || b != 79 || c != 65 || d != 82)//TPOS
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 87 || b != 79 || c != 65 || d != 82) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 99999) {
                                a = 87;
                                b = 79;
                                c = 65;
                                d = 82;
                            }
                        }

                        if (fin < 99999) {
                            WoArr = cont;///fin de tag TIT2
                        } else {
                            WoArr = -1;
                        }

                        cont = 3;
                        archivo.seek(3);

                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                        fin = 0;

                        while (a != 87 || b != 80 || c != 85 || d != 66)//TPOS
                        {
                            a = archivo.readByte();
                            cont++;

                            b = archivo.readByte();
                            cont++;

                            c = archivo.readByte();
                            cont++;

                            d = archivo.readByte();
                            cont++;
                            if (a != 87 || b != 80 || c != 85 || d != 66) {
                                cont = cont - 3;
                                archivo.seek(cont);
                            }
                            fin++;
                            if (fin == 99999) {
                                a = 87;
                                b = 80;
                                c = 85;
                                d = 66;
                            }
                        }

                        if (fin < 99999) {
                            WPubl = cont;//fin de tag TIT2
                        } else {
                            WPubl = -1;
                        }

                    }

                }

            }
           
            
            String genero = "";
            if (TConn != -1) {

                archivo.seek(TConn);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();

                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        genero = genero + (char) aux;
                    }
                }
               

            } else {
                
                genero = "Desconocido";
            }
            
            
            String pagDisquera = "";
            if (WPubl != -1) {

                archivo.seek(WPubl);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();

                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        pagDisquera = pagDisquera + (char) aux;
                    }
                }
               

            } else {
                
                pagDisquera = "Desconocido";
            }

            //pagina de artista
            String pagArt = "";
            if (WoArr != -1) {

                archivo.seek(WoArr);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        pagArt = pagArt + (char) aux;
                    }
                }

            } else {
                pagArt = "Desconocido";
            }
            
            //letras
            String letra = "";
            if (Usltt != -1) {

                archivo.seek(Usltt);

                int longitud = archivo.readInt() + 2;
                byte aux = 0;
                
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();

                    if (aux > 31 && aux < 124) {
                        letra = letra + (char) aux;
                    }
                    if (aux == 0 || aux == 12 || aux == 10) {
                        letra = letra + (char) aux;
                    }
                }

            } else {
                letra = "Desconocido";
            }
            
            // num de cancion
            String track = "";
            if (TRack != -1) {

                archivo.seek(TRack);

                byte aux = 0;
                short longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        track = track + (char) aux;
                    }
                }

            } else {
                
                track = "Desconocido";
            }
            
            //año
            String anio = "";
            if (TYear != -1) {

                archivo.seek(TYear);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        anio = anio + (char) aux;
                    }
                }

            } else {
                anio = "Desconocido";
            }
            
            //num de album
            String NumAlbum = "";
            if (TPoss != -1) {

                archivo.seek(TPoss);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        NumAlbum = NumAlbum + (char) aux;
                    }
                }
                System.out.println("No. Album " + NumAlbum);

            } else {
                
                NumAlbum = "Desconocido";
            }
            
            //album
            String album = "";
            if (Talbu != -1) {

                archivo.seek(Talbu);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        album = album + (char) aux;
                    }
                }
                

            } else {
                
                album = "Desconocido";
            }
            
            
            //artista 2
            String artista2 = "";
            if (TPe2 != -1) {

                archivo.seek(TPe2);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        artista2 = artista2 + (char) aux;
                    }
                }
                
            } else {
                
                artista2 = "Desconocido";
            }
            
            //artista;
            String artista1 = "";
            if (TPe1 != -1) {

                archivo.seek(TPe1);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        artista1 = artista1 + (char) aux;
                    }
                }
                

            } else {
               
                artista1 = "Desconocido";
            }
            
            //obtener cancion
            String cancion = "";
            if (Titl2 != -1) {
                archivo.seek(Titl2);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        cancion = cancion + (char) aux;
                    }
                }
               

            } else {
                
                cancion = "Desconocido";
            }
            
            //disquera;
            String disquera = "";
            if (TPubl != -1) {

                archivo.seek(TPubl);

                byte aux = 0;
                byte longitud = 0;
                for (int i = 0; i <= 3; i++) {
                    longitud = archivo.readByte();
                }

                for (int i = 0; i < 2; i++) {
                    archivo.readByte();
                }
                for (int i = 0; i < longitud; i++) {
                    aux = archivo.readByte();
                    if (aux > 31 && aux < 124) {
                        disquera = disquera + (char) aux;
                    }
                }
                

            } else {
                
                disquera = "Desconocido";
            }

            nuevo.agregarAlInicio(ruta,cancion,artista1,album,disquera,letra,pagArt,pagDisquera,genero,track,NumAlbum,anio);
         
            archivo.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leer_mp3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Leer_mp3.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    gd.escribir(nuevo);

    }
 
}
    

