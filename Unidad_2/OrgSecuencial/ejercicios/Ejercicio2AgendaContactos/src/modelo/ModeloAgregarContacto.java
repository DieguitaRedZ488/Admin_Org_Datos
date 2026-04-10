package modelo;
public class ModeloAgregarContacto {
    ArchivoTexto objArch;

    public ModeloAgregarContacto() {
        objArch = new ArchivoTexto();
    }
    
    public void agregarContacto(String nombre, String telefono, String email ){
        ModeloContacto objModContacto = new ModeloContacto();
        objModContacto.setNombre(nombre);
        objModContacto.setTelefono(telefono);
        objModContacto.setEmail(email);
       
        
        objArch.abrirArchivoTexto('w', "contactos.txt");
        objArch.crearLinea(objModContacto.toString());
        objArch.cerrarArchivo('w');
    }

    
    
}
