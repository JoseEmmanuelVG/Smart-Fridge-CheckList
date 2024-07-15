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
public class CuentaInversion 
{
    double ISR;             //Si el deposito son 1000 ---> ganancia 200 (Total 1200) ---> Puedo retirar 1000 sin ISR
    double ISRRetenido;     //Retiro 1100 1000(No ISR) 100 pagar ISR ---> 1000+90+10(ISR retenido)
    double Utilidad;        //Saldo de 0 UTILIDAD de 100 || Retirar 100 ---> 90+10 (ISRRetenido)
    double TasaInversion;
    private double SaldoCuenta;
    
    public CuentaInversion(double ISR, double TasaInversion)
    {
        Utilidad=0;
        ISRRetenido=0;
        this.ISRRetenido=ISR;
        this.TasaInversion=TasaInversion;
    }
    
    public boolean RetirarDinero(double retiro)
    {
        if(SaldoCuenta>=retiro)
        {
            if((SaldoCuenta-Utilidad)>retiro)
            {
                SaldoCuenta=SaldoCuenta-retiro;
            }
            else
            {
                SaldoCuenta=SaldoCuenta-retiro;
                ISRRetenido=ISRRetenido+((Utilidad-SaldoCuenta)*ISR);
                return true;
            }
        }return false;
    }
    
    public void CalcularUtilidadMensual()   //TI = 12% Tasa Mensual 1% Saldo 100
    {                                       //Utilidad=1;
        Utilidad=Utilidad+(SaldoCuenta*(TasaInversion*12));
    }

}

