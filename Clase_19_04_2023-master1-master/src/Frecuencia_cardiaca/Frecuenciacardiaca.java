package Frecuencia_cardiaca;
/*
3.16 (Calculadora de la frecuencia cardiaca esperada) Mientras se ejercita, puede usar un monitor de frecuencia cardiaca
para ver que su corazón permanezca dentro de un rango seguro sugerido por sus entrenadores y doctores. De acuerdo con la
Asociación Estadounidense del Corazón (AHA) (www.americanheart.org/), la fórmula para calcular su frecuencia cardiaca
máxima en pulsos por minuto es de 220 menos su edad en años. Su frecuencia cardiaca esperada es un rango que está entre
el 50 y el 85% de su frecuencia cardiaca máxima. [Nota: estas fórmulas son estimaciones proporcio- nadas por la AHA.
Las frecuencias cardiacas máxima y esperada pueden variar de acuerdo con la salud, condición física y sexo del individuo.
el 50 y el 85% de su frecuencia cardiaca máxima. [Nota: estas fórmulas son estimaciones proporcionadas por la AHA.Las
frecuencias cardiacas máxima y esperada pueden variar de acuerdo con la salud, condición física y sexo del individuo.
Siempre debe consultar un médico o a un profesional de la salud antes de empezar o modificar un programa de ejercicios.]
Cree una clase llamada Frecuencias Cardiacas. Los atributos de la clase deben incluir el primer nombre de la persona, su
apellido y fecha de nacimiento (la cual debe consistir de atributos separados para el mes, día y año de nacimiento). Su
clase debe tener un constructor que reciba estos datos como parámetros. Para cada atributo debe proveer métodos establecery
obtener. La clase también debe incluir un método que calcule y devuelva la edad de la perso- na (en años), uno que calcule
obtener. La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años), uno que calcule
y devuelva la frecuencia cardiaca máxima de esa persona, y otro que calcule y devuelva la frecuencia cardiaca esperada de
la persona. Escriba una aplicación de Java que pida la información de la persona, cree una instancia de un objeto de la
clase FrecuenciasCardiacas e imprima la información a partir de ese objeto (incluya el primer nombre de la persona, su
apellido y fecha de nacimiento), y que después calcule e imprima la edad de la persona en (años), frecuencia cardiaca
máxima y rango de frecuencia cardiaca esperada.

 */
import java.util.Scanner;
public class Frecuenciacardiaca {
    public static void main(String[] args) {
        Frecuenciacar f1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese nombre del paciente: ");
        String nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        String apellido=sc.next();
        System.out.print("Ingrese dia de nacimiento: ");
        int dia=Integer.parseInt(sc.next());
        System.out.print("Ingrese Mes de nacimiento: ");
        int mes=Integer.parseInt(sc.next());
        System.out.print("Ingrese año de nacimiento: ");
        int ano=Integer.parseInt(sc.next());
        f1=new Frecuenciacar(nombre,apellido,dia,mes,ano);
        System.out.println();
        System.out.println("Nombre del paciente: "+f1.getNombre());
        System.out.println("Apellido del paciente: "+f1.getApellido());
        System.out.println("Dia de nacimiento: "+f1.getDia());
        System.out.println("Mes de nacimiento: "+f1.getMes());
        System.out.println("Año de nacimiento: "+f1.getAno());
        System.out.println("Edad: "+f1.calcularEdad()+"años");
        System.out.println(f1.CalcularFrecuenciaesperada());


    }
}
