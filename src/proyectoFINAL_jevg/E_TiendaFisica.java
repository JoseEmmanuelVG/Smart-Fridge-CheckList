/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

/**
 *
 * @author user
 */
public class E_TiendaFisica extends D_Tienda 
{

    public char getNombreTF() {
        return NombreTF;
    }

    public void setNombreTF(char NombreTF) {
        this.NombreTF = NombreTF;
    }
    int NewPrecio; 
   int Presupuesto;
   char NombreTF;

    /*public E_TiendaFisica(String N, double P) {
        super(N, P);
    }*/
   
   public void AsignarNewPrecio(int NP)
    {
        NewPrecio = NP;
    }
       public int ObtenerNewPrecio()
    {
        return NewPrecio;
    }
       
          public void AsignarPresupuesto(int P)
    {
        NewPrecio = P;
    }
       public int ObtenerPresupuesto()
    {
        return NewPrecio;
    }
}
