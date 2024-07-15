/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appagencia_jevg;
import java.util.ArrayList;
/**
 *
 * @author /JEVG
 */
public class Cliente                //JEVG
{
    protected String Nombre;
    int Edad;
    private ArrayList <Auto> Autos;
    
    public Cliente(String Nombre, int Edad)
    {
        this.Nombre=Nombre;
        this.Edad=Edad;
    }
    
    public Cliente()
    {
        Autos=new ArrayList();
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public int getEdad() 
    {
        return Edad;
    }

    public void setEdad(int Edad)
    {
        this.Edad = Edad;
    }
    
    public void addCar(Auto a)
   {
       Autos.add(a);
   }
   
   public int getCars()
   {
       return Autos.size();
   }
   
   public Auto getCar(int index)
   {
       return Autos.get(index-1);
   }
   
   public boolean removeAuto(int index)
   {
       if (Autos.remove(index-1)==null)
           return false;
              return true;      

   }    
}                               //JEVG
