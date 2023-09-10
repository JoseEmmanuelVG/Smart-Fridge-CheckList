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
public class F_TiendaLinea extends D_Tienda 
{
   String NombreLinea;
   double PrecioLinea;
   int NewPrecio; 
   int Presupuesto; 


    /*public F_TiendaLinea(String N, double P) 
    {
        super(N, P);
    }*/
   /*  F_TiendaLinea(String NL, double PL)
    {
        NombreLinea=NL;
        PrecioLinea=PL;
    }
*/   
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
