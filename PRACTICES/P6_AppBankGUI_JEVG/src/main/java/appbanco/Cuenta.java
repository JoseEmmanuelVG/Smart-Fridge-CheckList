/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

import com.mycompany.appbancogui_jevg.*;

/**
 *
 * @author Israel Cianca
 */
public abstract class Cuenta {
    protected int numcuenta;
    protected double saldo;
    public boolean AsignarNumeroCuenta(int d){
        if (d>0){
            numcuenta=d;
            return true;
        }
        return false;
    }
    public boolean AbonarDinero(double d){
        if (d>0){
            saldo=saldo+d;
            return true;
        }
        return false;
    }
    public boolean RetirarDinero(double d){
        if (saldo>=d){
            saldo=saldo-d;
            return true;
        }
        return false;
    }
    public double ObtenerSaldo(){
        return saldo;
    }
    public int ObtenerNumCuenta(){
        return numcuenta;
    } 
}
