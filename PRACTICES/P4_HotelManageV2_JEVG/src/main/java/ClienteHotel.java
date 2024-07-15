/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user  /  JEVG
 */
public class ClienteHotel {
    protected String Nombre;
    protected int Edad;
    //set (Asignar) get(Obtener)
    public void AsignarNombre(String nombre)
    {
        Nombre=nombre;
    }
    
    public void AsignarEdad(int edad)
    {
        Edad=edad;
    }
    
    public String ObtenerNombre()
    {
        return Nombre;
    }
    
    public int ObtenerEdad()
    {
        return Edad;
    }
}                   //JEVG
