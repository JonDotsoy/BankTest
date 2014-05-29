/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimientos;
//almacena los moviemientos para luego mandarlos a informe

/**
 * @author Carolina Barría
 */
public class Movimiento {

    private int numeroMovimiento;
    private float monto;
    private int tipoMovimiento;
    private String fechaMovimiento;
    private float comision;
    public static int indiceMovimintos = 0;
    // completar

    public Movimiento() {
        this.numeroMovimiento = Movimiento.indiceMovimintos++;
        informes.InformeMovimientos.addMovimiento(this);
    }

    public Movimiento(float monto, int tipoMovimiento, String fechaMovimiento, float comision) {
        this();
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.comision = comision;
    }

    public int getNumeroMovimiento() {
        return numeroMovimiento;
    }

    public void setNumeroMovimiento(int numeroMovimiento) {
        this.numeroMovimiento = numeroMovimiento;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public static int getIndiceMovimintos() {
        return indiceMovimintos;
    }

    public static void setIndiceMovimintos(int indiceMovimintos) {
        Movimiento.indiceMovimintos = indiceMovimintos;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "numeroMovimiento=" + numeroMovimiento + ", monto=" + monto + ", tipoMovimiento=" + tipoMovimiento + ", fechaMovimiento=" + fechaMovimiento + ", comision=" + comision + '}';
    }
}
