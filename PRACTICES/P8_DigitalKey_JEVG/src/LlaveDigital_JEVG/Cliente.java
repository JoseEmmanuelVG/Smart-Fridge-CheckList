/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlaveDigital_JEVG;

import java.util.ArrayList;

/**
 *
 * @author Israel Cianca
 */
public class Cliente {
    protected String nombre;
    protected int edad;
    private ArrayList <Cuenta> Cuentas;    
    public Cliente(){
        Cuentas=new ArrayList();
    }
    public void AsignarNombre(String S){
        nombre=S;
    }
    public boolean AsignarEdad(int E){
        if (E>=18){
            edad=E;
            return true;
        }
        return false;
    }
    public void AgregarCuenta(Cuenta c){
        Cuentas.add(c);    
    }
    public int ObtenerNumCuentas(){
        return Cuentas.size();
    }
    public Cuenta ObtenerCuenta(int index){
        if ( (index<0) || (ObtenerNumCuentas()==0) || (index>=ObtenerNumCuentas()) )
            return null;
        return Cuentas.get(index);
    }
    public String ObtenerNombre(){
        return nombre;
    }
    public int ObtenerEdad(){
        return edad;
    }
}
