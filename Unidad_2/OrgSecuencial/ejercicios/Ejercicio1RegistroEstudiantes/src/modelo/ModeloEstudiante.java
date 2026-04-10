package modelo;
public class ModeloEstudiante {
    String numControl;
    String nombre;
    String carrera;
    double promedio;

    public ModeloEstudiante(String numControl, String nombre, String carrera, double promedio) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public ModeloEstudiante() {
        this("","","",0);
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEstudiante) {
        this.nombre = nombreEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
   
    
  
    

    @Override
     public String toString(){
        return this.getNumControl() + "," +
               this.getNombre()+ ","+
                this.getCarrera() + ", " +
                this.getPromedio();
    }    
   
}
