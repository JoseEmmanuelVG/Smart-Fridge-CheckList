/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appagencia_jevg;

import java.util.ArrayList;

/**
 *
 * @author JEVG
 */
public class Auto                       //JEVG
{
    private String Modelo;
    private String Marca;
    private int Año;
    private char Tipo;
    protected ArrayList<Maintence> Mantenimiento;

    public Auto()
    {
        Mantenimiento=new ArrayList();   
    } 
    public String getModelo() 
    {
        return Modelo;
    }
    // En AgenciaApp -> void AgregarAuto -> Ingresar Modelo
        public void setModelo(String Modelo) 
        {
            this.Modelo = Modelo;
        }

        public String getMarca() 
        {
            return Marca;
        }
    // En AgenciaApp -> void AgregarAuto -> Ingresar Marca
        public void setMarca(String Marca) 
        {
            this.Marca = Marca;
        }

        public int getAño() 
        {
            return Año;
        }
    // En AgenciaApp -> void AgregarAuto -> Ingresar Año
        public void setAño(int Año)
        {
            this.Año = Año;
        } 
        public char getTipo() 
        {
            return Tipo;
        }

         public void setTipo(char Tipo) 
         {
            this.Tipo = Tipo;
        }

        public boolean removeCarMaintence(int index)
        {
            try
            {
                Mantenimiento.remove(index-1);
                return true;
            }
            catch(IndexOutOfBoundsException e)
            {
                return false;
            }
        }

        public void addCarMaintence(Maintence CM)
        {
            Mantenimiento.add(CM);
        }

        public int sizeCarMaintence()
        {
            return Mantenimiento.size();
        }

        public Maintence getCarMaintence(int index)
        {
            return Mantenimiento.get(index-1);
        }
}                                           //JEVG
