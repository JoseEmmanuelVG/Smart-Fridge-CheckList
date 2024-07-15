/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlaveDigital_JEVG;

/**
 *
 * @author Israel Cianca
 */
public class CuentaInversion extends Cuenta{
    double ISR;
    double ISRRetenido;
    double Utilidad;
    double TasaInversion;
    
    public CuentaInversion(double ISR,double TasaInversion){
        Utilidad=0;
        ISRRetenido=0;
        this.ISR=ISR;
        this.TasaInversion=TasaInversion;
    }
    
    @Override
    public boolean RetirarDinero(double Retiro){
        if (saldo>=Retiro){
            if ((saldo-Utilidad)>Retiro){
                saldo=saldo-Retiro;
                return true;
            }
            else{
                saldo=saldo-Retiro;
                ISRRetenido=ISRRetenido+((Utilidad-saldo)*ISR);
                Utilidad=saldo;
                return true;
            }
        }
        return false;
    }
    
    public void CalcularUtilidadMensual(){
        Utilidad=Utilidad+(saldo*(TasaInversion/12));
        saldo=saldo+(saldo*(TasaInversion/12));               
    }
    
    
    
}

