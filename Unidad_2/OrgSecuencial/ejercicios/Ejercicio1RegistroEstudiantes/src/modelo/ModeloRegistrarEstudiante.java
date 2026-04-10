package modelo;
public class ModeloRegistrarEstudiante {
    ArchivoTexto objArch;

    public ModeloRegistrarEstudiante() {
        objArch = new ArchivoTexto();
    }
    
    public void guardarEstudiante(String numControl,String nombre, String carrera, double promedio ){
        ModeloEstudiante objModEst = new ModeloEstudiante();
        objModEst.setNumControl(numControl);
        objModEst.setNombre(nombre);
        objModEst.setCarrera(carrera);
        objModEst.setPromedio(promedio);
        
        objArch.abrirArchivoTexto('w', "estudiantes.txt");
        objArch.crearLinea(objModEst.toString());
        objArch.cerrarArchivo('w');
    }
    
}
