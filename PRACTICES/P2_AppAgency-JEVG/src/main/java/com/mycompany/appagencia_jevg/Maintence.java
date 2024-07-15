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
public class Maintence 
{
    String fecha;
    String Descripcion;
    int km;
    
    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getKm() 
    {
        return km;
    }

    public void setKm(int km) 
    {
        this.km = km;
    }
}
