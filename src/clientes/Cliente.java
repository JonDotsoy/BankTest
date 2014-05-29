/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes;

import cuentas.Cuenta;
import java.util.ArrayList;

/**
 * @author Carolina Barría
 */
public class Cliente {
  private String codigo;
  private String Rut;
  private String apaterno;
  private String amaterno;
  private String nombres;
  private String fono;
  private String domicilio;
  private ArrayList<Cuenta> listaCuentas ;

  
  //cree un constructor general, ya que tengo todos los datos de los clientes, (generar varios constructore segun la necesidad)
    public Cliente(String codigo, String Rut, String apaterno, String amaterno, String nombres, String fono, String domicilio, ArrayList<Cuenta> listaCuentas) {
        this.codigo = codigo;
        this.Rut = Rut;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.nombres = nombres;
        this.fono = fono;
        this.domicilio = domicilio;
        this.listaCuentas = listaCuentas;
    }
  
   public String toString(){
   
   
   return "Cliente n "+ this.Rut;
   
   
   }
// Geteadores --------------------------------------------------------------
    public String getCodigo() {
        return codigo;
    }

    public String getRut() {
        return Rut;
    }

    public String getApaterno() {
        return apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getFono() {
        return fono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
   
    //Seteadores --------------------------------------------------------------
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    
   
  
   
   
   
   
}
