package rejistros_medicos;

public class Paciente {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;

    //CONSTRUCTOR


    public Paciente(String nombre, String apellido, String sexo, int dia, int mes, int ano, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    //GET Y SET


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //METODOS
    public int calcularEdad (){
        return( 2023-this.ano);
    }
    public int calcularFrecuencia(){
        return (220-calcularEdad());
    }

    public  double calcularMasacorporal(){return ((peso)/((altura/100*altura/100)));}

    public String calcularFrecuenciaespetrada(){
        double calcularFrecuenciaesperadamin=0.5*calcularFrecuencia();
        double calcularFrecuenciaesperadamax=0.85*calcularFrecuencia();
        return ("Su frecuencia cardiaca minima esperada es de "+calcularFrecuenciaesperadamin+" y su frecuencia cardiaca maxima esperada es de "+calcularFrecuenciaesperadamax);
    }




}
