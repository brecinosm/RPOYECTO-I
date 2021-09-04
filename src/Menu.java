package ProyectoI;
import java.util.Scanner;

/***
 * @author User
 * clase principal Menu
 */
public class Menu {

    /**
     * @param args
     * menu principal
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int op, vehiculo, op1, op2, op3, op4,  motos, auto, camion, segundomoto, tarifamoto, segundoauto, tarifaauto, segundocamion, tarifacamion;
        String placamoto, placaauto, placacamion, placamoto2, placaauto2, placacamion2, nitcliente;

        do {
            System.out.println("*****MENÚ PRINCIPAL*****");
            System.out.println("1. Administración");
            System.out.println("2. Ingreso de vehiculos");
            System.out.println("3. Egreso de vehiculos");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese su opcion: ");
            op = entrada.nextInt();

            switch (op){
                case 1:
                    do {
                        System.out.println("*****MENÚ ADMINISTRACIÓN*****");
                        System.out.println("1. Número de estacionamientos habiles");
                        System.out.println("2. Precio del estacionamiento");
                        System.out.println("3. Salir al menú principal");
                        System.out.print("Ingrese su opcion: ");
                        op1 = entrada.nextInt();

                        switch (op1){
                            case 1:
                                do {
                                    System.out.println("Tipo de vehiculo");
                                    System.out.println("1. Motos");
                                    System.out.println("2. Automovil");
                                    System.out.println("3. Camiones");
                                    System.out.println("4. Salir al menu administracion");
                                    System.out.print("Ingrese su opcion: ");
                                    op2 = entrada.nextInt();

                                    switch (op2){
                                        case 1:
                                            System.out.print("ingrese el numero de motos: ");
                                            motos = entrada.nextInt();
                                            break;
                                            case 2:
                                            System.out.print("ingrese el numero de automoviles: ");
                                            auto = entrada.nextInt();
                                            break;
                                        case 3:
                                            System.out.print("ingrese el numero de camiones: ");
                                            camion = entrada.nextInt();
                                            break;
                                    }

                                }while (op2 !=4);
                                break;
                            case 2:
                                System.out.println("***MOTO***");
                                System.out.print("Ingrese los segundos: ");
                                segundomoto = entrada.nextInt();
                                System.out.print("Ingrese la tarifa: ");
                                tarifamoto = entrada.nextInt();
                                System.out.println("***AUTO***");
                                System.out.print("Ingrese los segundos: ");
                                segundoauto = entrada.nextInt();
                                System.out.print("Ingrese la tarifa: ");
                                tarifaauto = entrada.nextInt();
                                System.out.println("***CAMION***");
                                System.out.print("Ingrese los segundos: ");
                                segundocamion = entrada.nextInt();
                                System.out.print("Ingrese la tarifa: ");
                                tarifacamion = entrada.nextInt();
                                break;
                        }
                    }while (op1 !=3);
                break;

                case 2:
                    do {
                        System.out.println("*****MENÚ INGRESO DE VEHICULOS*****");
                        System.out.println("Ingresar vehiculo y validar disponibilidad");
                        System.out.println("1. Moto");
                        System.out.println("2. Automovil");
                        System.out.println("3. Camion");
                        System.out.println("4. Salir al menu principal");
                        System.out.print("Ingrese su opcion: ");
                        op3 = entrada.nextInt();

                        switch (op3){

                            case 1:
                                entrada.nextLine();
                                System.out.println("Ingrese el numero de placa de su moto: ");
                                placamoto = entrada.nextLine();
                                break;
                            case 2:
                                System.out.println("Ingrese el numero de placa de su automovil: ");
                                placaauto = entrada.nextLine();
                                break;
                            case 3:
                                System.out.println("Ingrese el numero de placa de su camion: ");
                                placacamion = entrada.nextLine();
                                break;
                        }

                    }while (op3 !=4);
                break;

                case 3:
                    do {
                        System.out.println("*****MENÚ EGRESO DE VEHICULOS*****");
                        System.out.println("Retirar vehiculo y pagar");
                        System.out.println("1. Moto");
                        System.out.println("2. Automovil");
                        System.out.println("3. Camion");
                        System.out.println("4. Salir al menu principal");
                        System.out.print("Ingrese su opcion: ");
                        op4 = entrada.nextInt();

                        switch (op4){

                            case 1:
                                System.out.print("Ingrese la placa de la moto que desea retirar: ");
                                placamoto2 = entrada.nextLine();
                                entrada.nextLine();
                                System.out.print("Ingrese su nit: ");
                                nitcliente = entrada.nextLine();
                                break;
                            case 2:
                                System.out.print("Ingrese la placa del automovil que desea retirar: ");
                                placaauto2 = entrada.nextLine();
                                System.out.print("Ingrese su nit: ");
                                nitcliente = entrada.nextLine();
                                break;
                            case 3:
                                System.out.print("Ingrese la placa del camion que desea retirar: ");
                                placacamion2 = entrada.nextLine();
                                System.out.print("Ingrese su nit: ");
                                nitcliente = entrada.nextLine();
                                break;


                        }

                    }while (op4 != 4);
                    break;
            }




        } while (op != 4);

    }
}