package EJ1;

public class Empleado {
    private String nombre;
    private String apellido;
    private Double salarioMensual;

    //COSTRUCTOR

    public Empleado(){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;

    }

    public Empleado(String nombre, String apellido, Double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (salarioMensual<0){
            salarioMensual = 0.0;
        }
        this.salarioMensual=salarioMensual;
    }


    //GET y SET


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(Double salarioMensual) {
        if (salarioMensual<0){
            salarioMensual = 0.0;
        }
        this.salarioMensual=salarioMensual;
    }
    //METODOS


}