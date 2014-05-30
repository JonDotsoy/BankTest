/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.ArrayList;
import movimientos.Movimiento;

/**
 * @author Carolina Barría
 */
public class CuentaCorriente extends Cuenta {

    private LineaCredito laLineadeCredito;
    private ArrayList<Movimiento> listaMovimientos;

    //constructor
    public CuentaCorriente(String Numerodecuenta, String Rut) {
        
        this.listaMovimientos = new ArrayList<>();
        super.setNumeroCuenta(Numerodecuenta);
        this.setLaLineadeCredito(new LineaCredito(getNumeroCuenta() + Rut));

    }

    //Geteadores-------------------------------------------------------------
    public LineaCredito getLaLineadeCredito() {
        return laLineadeCredito;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    //Seteadores-------------------------------------------------------------
    public void setLaLineadeCredito(LineaCredito laLineadeCredito) {
        this.laLineadeCredito = laLineadeCredito;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    //-----------------------------------------------------------------------
    public void GiroCredito(double cantidad) {

        laLineadeCredito.Giro(cantidad);

    }

}
