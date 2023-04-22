package EJ1;/*
3.14 (La clase EJ1.Empleado) Cree una clase llamada EJ1.Empleado, que incluya tres variables de instancia: un primer nombre (tipo
String), un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor que inicialice
las tres variables de instancia. Proporcione un método establecer y un método obtener para cada variable de ins- tancia.
Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba llamada Prueba- EJ1.Empleado,
que demuestre las capacidades de la clase EJ1.Empleado. Cree dos objetos EJ1.Empleado y muestre el salario anual de cada objeto.
Después, proporcione a cada EJ1.Empleado un aumento del 10% y muestre el salario anual de cada EJ1.Empleado otra vez.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre,apellido;

        Empleado e1 = new Empleado();
        Empleado e2=new Empleado();
        Empleado e3;
        Empleado e4;
        Scanner sc=new Scanner(System.in);
        System.out.println("*****EMPLEADO 1*****");
        System.out.print("Ingrese su Primer Nombre: ");
        nombre=sc.next();
        e1.setNombre(nombre);
        System.out.print("Ingrese su Primer Apellido: ");
        apellido=sc.next();
        e1.setApellido(apellido);
        System.out.print("Ingrese Mensual : ");
        double salarioMensual=Double.parseDouble(sc.next());
        e1.setSalarioMensual(salarioMensual);

        System.out.println("*****EMPLEADO 2*****");
        System.out.print("Ingrese su Primer nombre:");
        nombre=sc.next();
        e2.setNombre(nombre);
        System.out.print("Ingrese su Primer Apellido: ");
        apellido=sc.next();
        e2.setApellido(apellido);
        System.out.print("Ingrese Mensual : ");
        double salarioMensual2=Double.parseDouble(sc.next());
        e2.setSalarioMensual(salarioMensual2);


        System.out.println("****************EMPLEADO 1*******************");
        System.out.println("Nombre:"+e1.getNombre());
        System.out.println("Apellido:"+e1.getApellido());
        System.out.println("Salario Mensual:"+e1.getSalarioMensual());
        System.out.println("Salario anual:"+e1.getSalarioMensual()*12);
        System.out.println("*****************EMPLEADO 2*******************");
        System.out.println("Nombre:"+e2.getNombre());
        System.out.println("Apellido:"+e2.getApellido());
        System.out.println("Salario Mensual:"+e2.getSalarioMensual());
        System.out.println("Salario Mensual con 10% de aumento:"+e2.getSalarioMensual()*12);

        System.out.println("****************AUMENTOS*******************");
        System.out.println("****************"+e1.getNombre()+" "+e1.getApellido()+"*******************");
        System.out.println("Salario Mensual con 10% de aumento:"+((e1.getSalarioMensual())+(e1.getSalarioMensual()*0.1)));
        System.out.println("Salario anual: "+((e1.getSalarioMensual())+(e1.getSalarioMensual()*0.1))*12);
        System.out.println("****************"+e2.getNombre()+" "+e2.getApellido()+"*******************");
        System.out.println("Salario Mensual con 10% de aumento:"+((e2.getSalarioMensual())+(e2.getSalarioMensual()*0.1)));
        System.out.println("Salario anual: "+((e2.getSalarioMensual())+(e2.getSalarioMensual()*0.1))*12);

        System.out.println("******************************************************************************************");
        System.out.println("*****EMPLEADO 1*****");
        System.out.print("Ingrese su Primer Nombre: ");
        nombre=sc.next();

        System.out.print("Ingrese su Primer Apellido: ");
        apellido=sc.next();

        System.out.print("Ingrese Mensual : ");
        salarioMensual=Double.parseDouble(sc.next());

        e3=new Empleado(nombre,apellido,salarioMensual);


        System.out.println("*****EMPLEADO 2*****");
        System.out.print("Ingrese su Primer nombre:");
        nombre=sc.next();
        e2.setNombre(nombre);
        System.out.print("Ingrese su Primer Apellido: ");
        apellido=sc.next();
        e2.setApellido(apellido);
        System.out.print("Ingrese Mensual : ");
        salarioMensual2=Double.parseDouble(sc.next());
        e4=new Empleado(nombre,apellido,salarioMensual);

        System.out.println("****************EMPLEADO 1*******************");
        System.out.println("Nombre:"+e3.getNombre());
        System.out.println("Apellido:"+e3.getApellido());
        System.out.println("Salario Mensual:"+e3.getSalarioMensual());
        System.out.println("Salario anual:"+e3.getSalarioMensual()*12);
        System.out.println("*****************EMPLEADO 2*******************");
        System.out.println("Nombre:"+e4.getNombre());
        System.out.println("Apellido:"+e4.getApellido());
        System.out.println("Salario Mensual:"+e4.getSalarioMensual());
        System.out.println("Salario Mensual con 10% de aumento:"+e4.getSalarioMensual()*12);

        System.out.println("****************AUMENTOS*******************");
        System.out.println("****************"+e3.getNombre()+" "+e3.getApellido()+"*******************");
        System.out.println("Salario Mensual con 10% de aumento:"+((e3.getSalarioMensual())+(e3.getSalarioMensual()*0.1)));
        System.out.println("Salario anual: "+((e3.getSalarioMensual())+(e3.getSalarioMensual()*0.1))*12);
        System.out.println("****************"+e4.getNombre()+" "+e4.getApellido()+"*******************");
        System.out.println("Salario Mensual con 10% de aumento:"+((e4.getSalarioMensual())+(e4.getSalarioMensual()*0.1)));
        System.out.println("Salario anual: "+((e4.getSalarioMensual())+(e4.getSalarioMensual()*0.1))*12);







    }
}