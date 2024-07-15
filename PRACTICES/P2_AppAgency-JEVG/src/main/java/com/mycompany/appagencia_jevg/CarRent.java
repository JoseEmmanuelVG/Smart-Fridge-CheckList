/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appagencia_jevg;

/**
 *
 * @author JEVG
 */
public class CarRent extends Auto 
{
    Cliente C;
    String fecha;
    int NumDias;
    public Cliente getC() 
    {
        return C;
    }

    public void setC(Cliente C) 
    {
        this.C = C;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public int getNumDias() 
    {
        return NumDias;
    }

    public void setNumDias(int NumDias)
    {
        this.NumDias = NumDias;
    }   
}
