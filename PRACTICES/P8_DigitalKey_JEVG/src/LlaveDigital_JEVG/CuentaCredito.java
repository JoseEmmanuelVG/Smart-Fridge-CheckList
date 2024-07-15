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
public class CuentaCredito extends Cuenta{
    double LimiteCredito;
    
    @Override
    public boolean RetirarDinero(double Retiro){
        if ((-saldo+Retiro)<=LimiteCredito){
            saldo=saldo-Retiro;
            return true;
        }
        return false;
    }
    
    public void setLimite(double L){
        LimiteCredito=L;
    }
}


