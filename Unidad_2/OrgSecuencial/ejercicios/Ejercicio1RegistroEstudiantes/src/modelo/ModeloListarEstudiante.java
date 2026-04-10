package modelo;
public class ModeloListarEstudiante {
    ArchivoTexto objArch;
    
    
    public Object [][] listarEstudiantes(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"estudiantes.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
    
    
    }
    
    
    
    
    
    
}
