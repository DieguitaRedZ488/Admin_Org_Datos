package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarEstudiante;
import modelo.ModeloRegistrarEstudiante;
import vista.VistaRegistrarConsultarEstudiante;

public class ControladorRegistrarConsultarEstudiante {
    ModeloRegistrarEstudiante objModRegConEst;
    VistaRegistrarConsultarEstudiante objViewRegConEst;
    ModeloListarEstudiante objModListEst;

    public ControladorRegistrarConsultarEstudiante(VistaRegistrarConsultarEstudiante objViewRegConEst) {
        this.objModRegConEst = new ModeloRegistrarEstudiante();  
        this.objViewRegConEst = objViewRegConEst;
        this.objModListEst =  new ModeloListarEstudiante();
    }
    
    public void registrarEstudiante(
    String numControl,
    String nombre,
    String carrera,
    double promedio){
    
    this.objModRegConEst.guardarEstudiante (numControl, nombre, carrera, promedio);
    }
    
    
    
    public void listarEst(String[] columnas){
        Object[][] datos;
        datos = this.objModListEst.listarEstudiantes(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);        
        this.objViewRegConEst.tblEstudiantes.setModel(modelo);         
    }
  
}
