/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user                         //JEVG
 */
public class HabitacionResidente extends HabitacionHotel
{
    private ArrayList<Inquilino> Inquilinos;
    
    public HabitacionResidente()
    {
        Inquilinos=new ArrayList();
    }
    
    //Agregamos mecanismos (metodos) de suit   
    
    public void addInquilino(Inquilino S)
    {
        Inquilinos.add(S);
    }
    
    public int getNumServicios()
    {
        return Inquilinos.size();
    }
    
    public Inquilino getInquilino(int index)
    {
        return Inquilinos.get(index);
    }
    
    public boolean removeInquilino(int index)
    {
        try
        {
            Inquilinos.remove(index);
            return true;
        }
        catch(IndexOutOfBoundsException e)
        {
            return false;
        }
    }
}                                   //JEVG
