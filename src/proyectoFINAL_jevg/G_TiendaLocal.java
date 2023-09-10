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
public class G_TiendaLocal extends D_Tienda 
{
     int NewPrecio; 
   int Presupuesto; 

    /*public G_TiendaLocal(String N, double P) {
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
