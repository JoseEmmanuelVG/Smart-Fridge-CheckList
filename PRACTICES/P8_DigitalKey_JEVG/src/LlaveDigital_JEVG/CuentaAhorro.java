
package LlaveDigital_JEVG;

public class CuentaAhorro extends Cuenta{
    String Clave="1234";
    
    public boolean RetirarDinero(double Retiro, String Password){
        if (Clave.equals(Password)==false){
            return false;
        }
        else {
            return super.RetirarDinero(Retiro);
        }
    }
    
    public boolean setClave (String ClaveAnterior, String ClaveActual){
        if (Clave.equals(ClaveAnterior)==true){
            Clave=ClaveActual;
            return true;
        }
        else {
            return false;
        }
    }
}




