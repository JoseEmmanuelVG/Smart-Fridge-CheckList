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
public class Banco                      //JEVG
{
    protected String NombreBanco;
    protected String DireccionBanco;
    private ArrayList <Cliente> clientes; 
    
    public Banco()
    {
        clientes=new ArrayList();
    }
    
    public void AgregarCliente(Cliente Ce)
    {
        if (clientes==null)
        {

            clientes=new ArrayList();
        }
        clientes.add(Ce);
    }
    
    public int ObtenerNumClientes()
    {
        return clientes.size();
    }
    
    public Cliente ObtenerCliente(int index)
    {
        return clientes.get(index);
    }
    
    public void AsignarDatosdelBanco(String n, String d)
    {
        NombreBanco=n;
        DireccionBanco=d;
    }
    
    public String ObtenerNombreBanco()
    {
        return NombreBanco;
    }
    public String ObtenerDireccionBanco()
    {
        return DireccionBanco;
    }
}                                           //JEVG

