/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.clase1;

/**
 *
 * @author user
 */
public class CuentaAhorro extends Cuenta
{
    String Clave="1234";
    
    public boolean RetirarDinero(double Retiro, String Password)
    {
        if(Clave.equals(Password)==false)
        {
            return false;
        }
        else
        {
            return super.RetirarDinero(Retiro);
        }
    }
    
    public boolean setClave(String ClaveAnterior,String ClaveActual)
    {
        if(Clave.equals(Clave)==true)
        {
            Clave=ClaveActual;
            return true;
        }
        return false;
    }
}
