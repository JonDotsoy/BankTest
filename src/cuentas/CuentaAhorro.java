/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.ArrayList;
import java.util.Date;
import movimientos.Movimiento;


/**
 * @author Carolina Barría
 */
public class CuentaAhorro extends Cuenta {

    private float comisionPorGiro;
    private int valorMaximoGiro;
    private int cantidadGiros;
    private double saldo;
    private ArrayList<Movimiento> listaMovimientos;

    //constructor  
    public CuentaAhorro(String Numerodecuenta) {
        this.comisionPorGiro = 0;
        super.setNumeroCuenta(Numerodecuenta);
        this.valorMaximoGiro = 30000;
        cantidadGiros = 0;
        listaMovimientos = new ArrayList<Movimiento>(); //todo nuevo objeto se termina con un parentesis
    }

    public CuentaAhorro(String Numerodecuenta, double i) {
        this(Numerodecuenta);
        this.setSaldoInicial(i);
        this.saldo = i;
    }

    public float getComisionPorGiro() {
        return comisionPorGiro;
    }

    public void setComisionPorGiro(float comisionPorGiro) {
        this.comisionPorGiro = comisionPorGiro;
    }

    public int getValorMaximoGiro() {
        return valorMaximoGiro;
    }

    public void setValorMaximoGiro(int valorMaximoGiro) {
        this.valorMaximoGiro = valorMaximoGiro;
    }

    public int getCantidadGiros() {
        return cantidadGiros;
    }

    public void setCantidadGiros(int cantidadGiros) {
        this.cantidadGiros = cantidadGiros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    //FALTA AGREGAR ESTOS METODOS
    public void ingresomonto(double monto) {
        this.saldo = this.saldo + monto;
    }

    public void consultarSaldo() {
        System.out.println("Tu saldo es: " + this.saldo);
    }

    //metodo para condicionar los giros
    public void Giro(double cantidad) {

        if ((saldo - cantidad >= 10000) && (cantidad <= valorMaximoGiro) && (cantidadGiros < 4)) {

            saldo = saldo - cantidad;
            cantidadGiros = cantidadGiros + 1;

            System.out.println("OK");

            Movimiento movimiento = new Movimiento((float) cantidad, 1, new Date().toString(), comisionPorGiro);

            listaMovimientos.add(movimiento);

        } else {
            System.out.println("Transaccion cuekkkkk");

        };

    }

}
