/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

import java.util.ArrayList;

/**
 *
 * @author user         //JEVG
 */
public class B_RegistroPrincipal 
{
    public static ArrayList <C_Producto> Productos;

    
    public B_RegistroPrincipal()
    {
        Productos=new ArrayList();
    }
    
    public void AgregarProducto(C_Producto Pr)
    {
        Productos.add(Pr);
    }
    
    public int ObtenerNumProducto()
    {
        return Productos.size();
    }
    
    public C_Producto ObtenerProducto(int index)
    {
         if  ( (index<0) || (Productos.isEmpty()) || (index>=Productos.size()) )
                return null;
        return Productos.get(index);  
    }
    
    /*public boolean removeProducto(int index)
    {
        if ( Productos.remove(index-1)==null )
            return false;
        return true;            
    }*/       
}                                                   
