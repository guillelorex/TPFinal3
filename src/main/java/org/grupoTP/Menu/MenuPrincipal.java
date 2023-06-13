package org.grupoTP.Menu;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal(){}

    public void menuPrincipal(){

        Scanner scanMenu=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Bienvenido a la aplicacion de gestion hotelera");
            System.out.println("1. Gestion del Hotel");
            System.out.println("2. Gestion de Personal");
            System.out.println("3. Gestion de Reserva");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion=scanMenu.nextInt();
            switch (opcion){
                case 1:
                    gestionDeHotel();
                    break;
                case 2:
                    gestionDeEmpleados();
                    break;
                case 3:
                    gestionDeReservas();
                    break;
                case 4:
                    System.out.println("Saliendo... ");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while(opcion!=4);
        scanMenu.close();
    }

    public static void gestionDeReservas(){
        Scanner scanSub3=new Scanner(System.in);
        System.out.println("Gestion de Reservas");
        int opcionSub3;
        do{
            System.out.println("1. Guardar Reserva");
            System.out.println("2. Listar Reserva");
            System.out.println("3. Agregar Reserva");
            System.out.println("4. Buscar Reserva");
            System.out.println("5. Eliminar Reserva");
            System.out.println("6. Volver a Menu Principal");
            System.out.println("Seleccione una opcion: ");
            opcionSub3=scanSub3.nextInt();
            switch (opcionSub3){
                case 1:
                    System.out.println("Guardando.....");
                    break;
                case 2:
                    System.out.println("Listando.......");
                    break;
                case 3:
                    System.out.println("Agregando.......");
                    break;
                case 4:
                    System.out.println("Buscando.........");
                    break;
                case 5:
                    System.out.println("Eliminando..........");
                    break;
                case 6:
                    System.out.println("Volviendo al Menu Principal......");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcionSub3!=6);
        scanSub3.close();

    }

    public static void gestionDeEmpleados(){
        Scanner scanSub2=new Scanner(System.in);
        System.out.println("Gestion de Personal");
        int opcionSub2;
        do{
            System.out.println("1. Modificar Empleado");
            System.out.println("2. Listar Empleado");
            System.out.println("3. Agregar Empleado");
            System.out.println("4. Buscar Empleado");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Volver al Menu Principal");
            System.out.println("Seleccione una opcion: ");
            opcionSub2=scanSub2.nextInt();
            switch (opcionSub2){
                case 1:
                    System.out.println("Modificando Empleado....");
                    break;
                case 2:
                    System.out.println("Listando Empleado....");
                    break;
                case 3:
                    System.out.println("Agregando Empleado....");
                    break;
                case 4:
                    System.out.println("Buscando Empleado....");
                    break;
                case 5:
                    System.out.println("Eliminando Empleado....");
                    break;
                case 6:
                    System.out.println("Volviendo al Menu Principal....");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcionSub2!=6);
        scanSub2.close();
    }

    public static void gestionDeHotel(){
        Scanner scanSub1=new Scanner(System.in);
        System.out.println("Gestion de Hotel");
        int opcionSub1;
        do{

            System.out.println("1. Listar Habitacion");
            System.out.println("2. Agregar Habitacion");
            System.out.println("3. Buscar Habitacion");
            System.out.println("4. Eliminar Habitacion");
            System.out.println("5. Volver a Menu Principal");
            System.out.println("Seleccione una opcion: ");

            opcionSub1=scanSub1.nextInt();
            switch (opcionSub1){

                case 1:
                    System.out.println("Listando.......");
                    break;
                case 2:
                    System.out.println("Agregando.......");

                    break;
                case 3:
                    System.out.println("Buscando.........");
                    break;
                case 4:
                    System.out.println("Eliminando..........");
                    break;
                case 5:
                    System.out.println("Volviendo al Menu Principal......");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcionSub1!=6);
        scanSub1.close();
    }

}

