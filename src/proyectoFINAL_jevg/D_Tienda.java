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
public abstract class D_Tienda 
{
    protected String nombre;
    protected double precio;
    
      /*public D_Tienda(String N, double P)
    {
        nombre=N;
        precio=P
    }*/
    
    public void AsignarNombre(String N)
    {
        nombre = N;
    }
    
    public boolean AsignarPrecio(double p)
    {
        if (p>0)
        {
            precio=precio+p;
            return true;
        }
        return false;
    }
        
   /* public boolean AsignarPrecio(int P)
    {
        precio = P;
        return false;
    }*/
        
    public String ObtenerNombre()
    {
        return nombre;
    }

    public double ObtenerPrecio()
    {
        return precio;
    }
}
