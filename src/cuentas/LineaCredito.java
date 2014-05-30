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
public class LineaCredito {

    private String numero;
    private double monto;
    private String fechaExpiracion;
    private double saldo;
    private ArrayList<Movimiento> listaMovimientos;

    //constrctor
    public LineaCredito(String numero) {
        this.numero = numero;
        listaMovimientos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
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

    //metodo para condicionar los giros
    public void Giro(double cantidad) {

        if (true) {

            saldo = saldo - cantidad;

            System.out.println("Transaccion completa");

            Movimiento movimiento = new Movimiento((float) cantidad, 1, new Date().toString(), 0);

            listaMovimientos.add(movimiento);

        } else {
            System.out.println("Saldo insuficiente");

        };

    }

    void deposito(double cantidad) {
        saldo = saldo + cantidad;
        
        Movimiento movimiento = new Movimiento((float) cantidad, 2, new Date().toString(), 0);

        listaMovimientos.add(movimiento);
    }
    
    public void consultarSaldo(){
        System.out.println("Tu saldo es: " + this.saldo);
    }
}
