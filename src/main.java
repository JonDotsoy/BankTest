
import clientes.Cliente;
import cuentas.Cuenta;
import cuentas.CuentaAhorro;
import cuentas.CuentaCorriente;
import informes.InformeMovimientos;
import java.util.ArrayList;
import java.util.Scanner;
import movimientos.Movimiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * hi
 */
/**
 * @author Carolina Barría
 */
public class main {

    //clientes, lo intancie para llamar al objeto Cliente
    static Cliente cli[] = new Cliente[5]; //esta es arreglo vacio, le designo el tipo de objeto que puede almacenar y la cantidad de espacio
    //inicio de trabajo informes
    static InformeMovimientos lmovimientos;

    //se ejecuta toda la accion 
    public static void main(String[] args) {
        // estructura: tipo <nombre> = new tipo([[arg],arg...]);
        //en la posiscion 0 del arreglo cli, instacie al objeto Cliente 
        cli[0] = new Cliente(
                //instanciando los argumentos del constructor de Cliente
                "1",
                "17766872-9",
                "Barría",
                "Castillo",
                "Carolina Aracelli",
                "0303456",
                "las montañas con caballito blanco",
                new ArrayList<Cuenta>());

        cli[1] = new Cliente(
                "2",
                "18123420-4",
                "Delgado",
                "Zamorano",
                "Jonathan Jaime",
                "1234567",
                "pajaritos con pollitos",
                new ArrayList<Cuenta>());

        cli[2] = new Cliente(
                "3",
                "19012343-7",
                "Zapata",
                "Brocoli",
                "Elsa",
                "4832822",
                "Las zapatillas con zuela",
                new ArrayList<Cuenta>());

        cli[3] = new Cliente(
                "4",
                "20123456-7",
                "Perez",
                "Gonzales",
                "Disney Landia",
                "4746354",
                "Los castillos con princesas",
                new ArrayList<Cuenta>());

        cli[4] = new Cliente(
                "5",
                "21456754-3",
                "Garcia",
                "Lorca",
                "Super Nintendo",
                "7463534",
                "Los yoshies con manzanas",
                new ArrayList<Cuenta>());

        System.out.println("Inicia la configuracion...");
        //creacion de cunetas 
        CuentaCorriente cc01 = new CuentaCorriente("001", "729"); //tipo de objeto, nombre variable 
        CuentaCorriente cc001 = new CuentaCorriente("002", "729");
        CuentaCorriente cc02 = new CuentaCorriente("003", "204");
        CuentaCorriente cc002 = new CuentaCorriente("004", "204");
        CuentaCorriente cc03 = new CuentaCorriente("005", "437");
        CuentaCorriente cc04 = new CuentaCorriente("006", "567");
        CuentaCorriente cc05 = new CuentaCorriente("007", "543");
        CuentaAhorro ca01 = new CuentaAhorro("008");
        CuentaAhorro ca02 = new CuentaAhorro("009", 20000);

        //llamar al cliente que usara la cuenta
        cli[0].getListaCuentas().add(cc01);
        cli[0].getListaCuentas().add(cc001);
        cli[0].getListaCuentas().add(ca01);
        cli[1].getListaCuentas().add(cc02);
        cli[1].getListaCuentas().add(cc002);
        cli[1].getListaCuentas().add(ca02);
        cli[2].getListaCuentas().add(cc03);
        cli[3].getListaCuentas().add(cc04);
        cli[4].getListaCuentas().add(cc05);

        // Primera transaccion para la cuenta 01 del cliente 01
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);
        ((CuentaCorriente) cli[0].getListaCuentas().get(0)).GiroCredito(5000);
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);
        ((CuentaCorriente) cli[0].getListaCuentas().get(0)).GiroCredito(3000);
        ((CuentaCorriente) cli[2].getListaCuentas().get(0)).GiroCredito(1000);
        ((CuentaCorriente) cli[0].getListaCuentas().get(1)).GiroCredito(20000);
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);
        ((CuentaCorriente) cli[1].getListaCuentas().get(0)).GiroCredito(1000);
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);
        ((CuentaAhorro) cli[1].getListaCuentas().get(2)).Giro(1);

        System.out.println("Configuracion terminada...[OK]");
        // Lista de movimientos
        //InformeMovimientos.listarMovimientos();

        //// Inicia interfas de usuario
        /// Es while:true para que se ejecute eternamente.
        /*
         * fuente : http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n== Menu ==\n");
            System.out.println("\t1) Selecciona cliente");
            System.out.println("\t2) Listar clientes");
            System.out.println("\t3) Informe movimientos");
            System.out.println("\t0) Salir de la aplicacion\n");
            System.out.print("Indique modulo:");
            int index = sc.nextInt();// recibo indicacion del usuario
            /*
             * Si el usuario indica 0 sale de la aplicacion
             */
            if (index == 0) {
                System.out.println("Gracias por preferirnos.");
                System.exit(0);
            }
            /*
             * Seleccionar clientes 
             */
            if (index == 1) {
                System.out.print("Seleccione N° cliente:");
                int nclinte = sc.nextInt();
                System.out.print("Seleccione N° cuenta:");
                int ncuenta = sc.nextInt();
                while (true) {
                    System.out.println("-- Menu : Seleccionar clientes --");
                    System.out.println("\t1) Girar.");
                    System.out.println("\t2) Consultar Saldo.");
                    System.out.println("\t3) Info movimientos.");
                    System.out.println("\t4) Depositar.");
                    System.out.println("\t0) Salir.");
                    System.out.print("Ingre opcion:");
                    int selecUser = sc.nextInt();
                    if (selecUser == 0) {
                        break;
                    }
                    if (selecUser == 1) {
                        
                    }
                }
            }
            /*
             * Listado de cliente 
             */
            if (index == 2) {
                System.out.println("");
                for (int i = 0; i < cli.length; i++) {
                    System.out.println("\t"+i+". "+cli[i].getApaterno()+" "+cli[i].getNombres());
                    for (int j = 0; j < cli[i].getListaCuentas().size(); j++) {
                        System.out.print("\t\t"+j+". "+cli[i].getListaCuentas().get(j).getNumeroCuenta());
                        if (cli[i].getListaCuentas().get(j) instanceof CuentaCorriente) {
                            System.out.println(" - Cuenta Corriente.");
                        }
                        if (cli[i].getListaCuentas().get(j) instanceof CuentaAhorro) {
                            System.out.println(" - Cuenta de Ahorro.");
                        }
                    }
                }
            }
            /*
             * Informe de movimientos 
             */
            if (index == 3) {
                System.out.println("--- Todos los movimientos ---");
                ArrayList<Movimiento> lmts = informes.InformeMovimientos.getGuardamovimientos();
                for (Movimiento mvt : lmts) {
                    System.out.println(" [" + mvt.getNumeroMovimiento() + "]: monto=" + mvt.getMonto() + ", tipoMovimiento=" + mvt.getTipoMovimiento() + ", fechaMovimiento=" + mvt.getFechaMovimiento() + ", comision=" + mvt.getComision());
                }
                System.out.println("-----------------------------");
            }
        }
        //// Finaliza interfas de usuario

    }

}
