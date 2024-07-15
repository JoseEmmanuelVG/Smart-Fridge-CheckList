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
public class Cuenta                    //JEVG
{
    protected int NumCuenta;
    protected double SaldoCuenta;
    
    public boolean AsignarNumeroCuenta(int d)
    {
    if (d>0)
    {
        NumCuenta=d;
        return true;
    }
    return false;
    }
    
    public boolean AbonarDinero(double d)
    {
        if (d>0)
        {
            SaldoCuenta=SaldoCuenta+d;
        return true;
        }
        return false;
    }
    
    public boolean RetirarDinero(double d)
    {
        if(d>=0)
        {
            if (SaldoCuenta>=d)
            {
                SaldoCuenta=SaldoCuenta-d;
                return true;
            }        
        }
        return false;
    }
    
    public double ObtenerSaldoCuenta()
    {
    return SaldoCuenta;
    }
    
    public int ObtenerNumCuenta()
    {
    return NumCuenta;
    }
}                                   //JEVG                         

