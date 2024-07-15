/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appagencia_jevg;//JEVG
import java.util.ArrayList;
/**
 *
 * @author user /JEVG
 */
public class Agencia                  //JEVG
{
public static ArrayList <Cliente> Clientes;
private ArrayList <Auto> Autos;
    
    public Agencia()
    {
        Clientes=new ArrayList();
    }
    
    public void addCliente(Cliente c)
    {
        Clientes.add(c);
    }
    
    public int getClientes()
    {
        return Clientes.size();
    }
    
    public Cliente getCliente(int index)
    {
        return Clientes.get(index-1);
         
    }
    
    public boolean removeCliente(int index)
    {
        if ( Clientes.remove(index-1)==null )
            return false;
        return true;            
    }    
}                                     //JEVG
