package EJ.FActura;

import java.util.Scanner;


public class Prueba_Factura {

    public Prueba_Factura() {
    }

    public static void main(String[] args) {
        Factura f1 = new Factura();
        Scanner sc = new Scanner(System.in);
        Factura f2;

        System.out.println("Nombre del cliente: ");
        String nombre = sc.next();
        f1.setNombre(nombre);

        System.out.println("Numero de cedula del cliente: ");
        String cedula = sc.next();
        f1.setCedula(cedula);

        System.out.println("Ingrese descripcion del Articulo: ");
        String elemento = sc.next();
        f1.setElemento(elemento);

        System.out.println("Ingrese numero del articulo");
        int numeroArticulo = Integer.parseInt(sc.next());
       f1.setNumeroArticulo(numeroArticulo);

        System.out.println("Ingrese catidad de productos:");
        int cantidadArticulo = Integer.parseInt(sc.next());
        f1.setNumeroelementos(cantidadArticulo);

        System.out.println("Ingrese el valor por unidad:");
        double precioPorArticulo = Double.parseDouble(sc.next());
        f1.setValorUnidad(precioPorArticulo);

        System.out.println("Nombre:" + f1.getNombre());
        System.out.println("Cedula:" + f1.getCedula());
        System.out.println("Numero de Articulo:" + f1.getNumeroArticulo());
        System.out.println("Descripcion Sticulo: " + f1.getElemento());
        System.out.println("Cantidad de articulos: " + f1.getNumeroelementos());
        System.out.println("Valor por unidad: $" + f1.getValorUnidad());
        System.out.println("monto a pagar: " +f1.calculoValorTotalPorPieza());

        System.out.println("Nombre del cliente: ");
         nombre = sc.next();


        System.out.println("Numero de cedula del cliente: ");
       cedula = sc.next();


        System.out.println("Ingrese descripcion del Articulo: ");
        elemento = sc.next();


        System.out.println("Ingrese numero del articulo");
         numeroArticulo = Integer.parseInt(sc.next());


        System.out.println("Ingrese catidad de productos:");
        cantidadArticulo = Integer.parseInt(sc.next());

        System.out.println("Ingrese el valor por unidad:");
        precioPorArticulo = Double.parseDouble(sc.next());

        f2=new Factura(nombre,cedula,cantidadArticulo,precioPorArticulo,elemento,numeroArticulo);

        System.out.println("Nombre:" + f2.getNombre());
        System.out.println("Cedula:" + f2.getCedula());
        System.out.println("Numero de Articulo:" + f2.getNumeroArticulo());
        System.out.println("Descripcion Sticulo: " + f2.getElemento());
        System.out.println("Cantidad de articulos: " + f2.getNumeroelementos());
        System.out.println("Valor por unidad: $" + f2.getValorUnidad());
        System.out.println("monto a pagar: " +f2.calculoValorTotalPorPieza());



    }
}
