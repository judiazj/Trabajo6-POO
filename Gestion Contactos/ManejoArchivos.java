package trabajo6individual;

import java.io.*;


public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        try {
            File archivo = new File(nombreArchivo); 
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
            
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String identificacion, String nombre, String apellido){
        try {
            File archivo = new File(nombreArchivo); 
            PrintWriter salida = new PrintWriter(archivo);
            salida.println("Identificicacion = " + identificacion);
            salida.println("Nombre = " + nombre);
            salida.println("Apellido = " + apellido);
            salida.println();
            salida.close();
            System.out.println("Se ha escrito al archivo");
            
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void anexarArchivo(String nombreArchivo, String identificacion, String nombre, String apellido){
        try {
            File archivo = new File(nombreArchivo); 
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println("Identificicacion = " + identificacion);
            salida.println("Nombre = " + nombre);
            salida.println("Apellido = " + apellido);
            salida.println();
            salida.close();
            System.out.println("Se ha anexado informacion al archivo");
            
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
