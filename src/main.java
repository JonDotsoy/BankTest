
import clientes.Cliente;
import cuentas.Cuenta;
import cuentas.CuentaAhorro;
import cuentas.CuentaCorriente;
import informes.InformeMovimientos;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
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

        // Lista de movimientos
        InformeMovimientos.listarMovimientos();

        System.out.println("END");
    }

}
