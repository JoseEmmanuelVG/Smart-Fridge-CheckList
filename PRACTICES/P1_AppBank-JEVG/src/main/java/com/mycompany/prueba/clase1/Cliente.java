/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.clase1;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Cliente             //JEVG
{
    protected String NombreCliente;
    protected int EdadCliente;
    private ArrayList <Cuenta> Cuentas;
    
    public Cliente()
    {
        Cuentas=new ArrayList();
    }

    public void AsignarNombreCliente(String S)
    {
        NombreCliente=S;
    }
    
    public boolean AsignarEdadCliente(int E)
    {
        if (E>=18)
        {
            EdadCliente=E;
            return true;
        }
        return false;
    }
    
    public void AgregarCuenta(Cuenta c)
    {
        Cuentas.add(c);
    }

    public int ObtenerNumCuentas()
    {
        return Cuentas.size();
    }

    public Cuenta ObtenerCuenta(int index)
    {
        if ( (index<0) || (ObtenerNumCuentas()==0) || (index>=ObtenerNumCuentas()) )
        return null;
        return Cuentas.get(index);
    }

    public String ObtenerNombreCliente()
    {
        return NombreCliente;
    }

    public int ObtenerEdadCliente()             
    {   
        return EdadCliente;     
    }                               //JEVG
}                                                                                //JEVG
