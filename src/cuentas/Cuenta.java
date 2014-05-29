/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Date;

/**
 * @author Carolina Berrios
 */
public class Cuenta {

    private String numeroCuenta;
    private double saldoInicial;
    private String fechaCreacion;

    //al crear varios constructores, se pueden generar varias opciones de llamado del objeto
    public Cuenta() {
    }

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldoInicial = saldoInicial;
        //la fecha actual --- new date
        this.fechaCreacion = new Date().toString();

    }

    public Cuenta(String numeroCuenta, double saldoInicial, String fechaCreacion) {
        this.numeroCuenta = numeroCuenta;
        this.saldoInicial = saldoInicial;
        this.fechaCreacion = fechaCreacion;
    }

    //------------------------fin constructor--------------------
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
