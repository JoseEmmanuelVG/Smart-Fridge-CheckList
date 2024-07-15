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
public class CuentaCredito extends Cuenta
{
    double LimiteCredito;
    
    public void SetLimit(double L)                      //saldo=0
    {                                                   //Limite de credito 100
        LimiteCredito =L;                               //Abono 1000 ---
    }                                                   //
                                                        //
    @Override                                           //
    public boolean RetirarDinero(double Retiro)         //
    {                                                   //
        if((-SaldoCuenta+Retiro)<=LimiteCredito)              //
        {                                               //
            SaldoCuenta=SaldoCuenta-Retiro;                         //
            return true;                                //
        }                                               //
        return false;                                   //
    }                                                   //
}

