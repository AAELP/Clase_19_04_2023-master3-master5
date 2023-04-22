package rejistros_medicos;

import java.util.Scanner;

/*3.17 (Computarización de los registros médicos) Un problema relacionado con la salud que ha estado últimamente en las
noticias es la computarización de los registros médicos. Esta posibilidad se está tratando con mucho cuidado, debi- do a
las delicadas cuestiones de privacidad y seguridad, entre otras cosas. [Trataremos esas cuestiones en ejercicios poste-
riores.] La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir sus perfiles
e historiales médicos con los diversos profesionales de la salud que consulten. Esto podría mejorar la calidad del servicio
médico, ayudar a evitar conflictos de fármacos y prescripciones erróneas, reducir los costos y, en emergencias, ayudar a
salvar vidas. En este ejercicio usted diseñará una clase inicial llamada Perfi Medico para una persona. Los atributos de
la dase deben llevar el primer nombre de la persona, su apellido, sexo, fecha de nacimiento (que debe consistir de atributos
separados para el día, mes y año de nacimiento), altura (en centímetros) y peso (en kilogramos). Su clase debe tener un
constructor que reciba estos datos. Para cada atributo, debe proveer los métodos establecer y obtener. La clase también
debe tener métodos que calculen y devuelvan la edad del usuario en años, la frecuencia cardiaca máxima y el rango de frecuen-
cia cardiaca esperada (vea el ejercicio 3.16), además del índice de masa corporal (BMI; vea el ejercicio 2.33).
Escriba una aplicación de Java que pida la información de la persona, cree una instancia de un objeto de la clase Perfi
1Medico para esa persona e imprima la información de ese objeto (debe contener el primer nombre de la persona, apellido,
sexo, fecha de nacimiento, altura y peso), y que después calcule e imprima la edad de esa persona en años, junto con el
BMI, la fre- cuencia cardiaca máxima y el rango de frecuencia cardiaca esperada. También debe mostrar la tabla de valores
del BMI del ejercicio 2.33.



*/
public class Registros_medicos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Paciente p1;
        System.out.print("Ingrese nombre del paciente: ");
        String nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        String apellido=sc.next();
        System.out.print("Ingrese Sexo del paciente: ");
        String sexo =sc.next();
        System.out.print("Ingrese dia de nacimiento: ");
        int dia=Integer.parseInt(sc.next());
        System.out.print("Ingrese Mes de nacimiento: ");
        int mes=Integer.parseInt(sc.next());
        System.out.print("Ingrese año de nacimiento: ");
        int ano=Integer.parseInt(sc.next());
        System.out.print("Ingrese Peso del paciente (KG): ");
        Double peso=Double.parseDouble(sc.next());
        System.out.print("Ingrese Altura del paciente(cm): ");
        Double altura=Double.parseDouble(sc.next());
        p1=new Paciente(nombre,apellido,sexo,dia,mes,ano,altura,peso);
        System.out.println(" ");
        System.out.printf("*************INFORMACION PACIENTE***********************");
        System.out.println(" ");
        System.out.println("Sexo: "+p1.getSexo());
        System.out.println("Nombre del paciente: "+p1.getNombre());
        System.out.println("Apellido del paciente: "+p1.getApellido());
        System.out.println("Dia de nacimiento: "+p1.getDia());
        System.out.println("Mes de nacimiento: "+p1.getMes());
        System.out.println("Año de nacimiento: "+p1.getAno());
        System.out.println("Edad: "+p1.calcularEdad()+"años");
        System.out.println("Altura: "+p1.getAltura()+"metros");
        System.out.println("Frecuencia cardiaca maxima: "+p1.calcularFrecuencia());
        System.out.println("Indice masa corporal es de: "+p1.calcularMasacorporal());
        System.out.println(p1.calcularFrecuenciaespetrada());

        System.out.println("*************TABLA BMI***********************");
        System.out.println("Tabla de valores de BMI:");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");






    }
}
