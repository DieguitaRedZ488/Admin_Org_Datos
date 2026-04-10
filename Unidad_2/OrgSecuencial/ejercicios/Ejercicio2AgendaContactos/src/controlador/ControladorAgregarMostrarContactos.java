package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloMostrarContacto;
import modelo.ModeloAgregarContacto;
import vista.VistaContactos;

public class ControladorAgregarMostrarContactos {
    ModeloAgregarContacto objModAggContact;
    VistaContactos objViewContacto;
    ModeloMostrarContacto objModMostContact;

    public ControladorAgregarMostrarContactos(VistaContactos objViewContacto) {
        this.objModAggContact = new ModeloAgregarContacto();  
        this.objViewContacto = objViewContacto;
        this.objModMostContact =  new ModeloMostrarContacto();
    }
    
    public void agregarContacto(
    String nombre,
    String telefono,
    String email){
    
    this.objModAggContact.agregarContacto (nombre, telefono, email);
    }
    
    
    
    public void mostrarContactos(String[] columnas){
        Object[][] datos;
        datos = this.objModMostContact.mostrarContactos(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);        
        this.objViewContacto.tblContactos.setModel(modelo);         
    }
  
}
