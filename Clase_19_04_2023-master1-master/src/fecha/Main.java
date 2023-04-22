package fecha;

import java.util.Scanner;

/*3.15 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día
(tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe
asumir que los valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener para cada
variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales().
Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
*/
public class Main {
    public static void main(String[] args) {
        Fecha f1= new Fecha();
        Scanner sc=new Scanner(System.in);
        Fecha f2;
        int dia,mes,ano;

        System.out.print("Ingrese el dia: ");
        dia =Integer.parseInt(sc.next());
        f1.setDia(dia);
        System.out.print("Ingrese el Mes: ");
        mes =Integer.parseInt(sc.next());
        f1.setMes(mes);
        System.out.print("Ingrese el Año: ");
        ano =Integer.parseInt(sc.next());
        f1.setAno(ano);

        System.out.println(+f1.getDia()+"/"+f1.getMes()+"/"+f1.getAno());

        System.out.println("**************SEGUNDA FECHA*********************");

        System.out.print("Ingrese el dia: ");
        dia =Integer.parseInt(sc.next());

        System.out.print("Ingrese el Mes: ");
        mes =Integer.parseInt(sc.next());

        System.out.print("Ingrese el Año: ");
        ano =Integer.parseInt(sc.next());

        f2= new Fecha(dia,mes,ano);

        System.out.println(+f2.getDia()+"/"+f2.getMes()+"/"+f2.getAno());


    }
}