/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user                 //JEVG
 */
public class HabitacionSuite extends HabitacionHotel   //JEVG
{
    protected ArrayList<Servicio> Servicios;
    
    public HabitacionSuite()
    {
        Servicios=new ArrayList();
    }
    
    public void addServicio(Servicio S)
    {
        Servicios.add(S);
    }
    
    public int getNumServicios()
    {
        return Servicios.size();
    }
    
    public Servicio getServicio(int index)
    {
        return Servicios.get(index);
    }
    
    public boolean removeServicio(int index)
    {
        try
        {
            Servicios.remove(index);
            return true;
        }
        catch(IndexOutOfBoundsException e)
        {
            return false;
        }
    }
}                                   //JEVG
