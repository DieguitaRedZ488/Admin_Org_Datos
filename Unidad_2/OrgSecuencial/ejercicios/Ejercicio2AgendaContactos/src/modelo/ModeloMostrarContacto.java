package modelo;
public class ModeloMostrarContacto {
    ArchivoTexto objArch;
    
    
    public Object [][] mostrarContactos(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"contactos.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
    
    
    }
    
    
    
    
    
    
}
