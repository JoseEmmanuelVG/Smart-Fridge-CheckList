/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user             //JEVG
 */
public class HabitacionGrupal 
{
    private ArrayList <TipoCama> Camas;

//Agregar Camas
//Retirar Camas

    public void addCamas(TipoCama i)
    {
        Camas.add(i);
    }

    public boolean removeCamas(int index)
    {
        try
        {
             Camas.remove(index);
            return true;
        }
        catch(IndexOutOfBoundsException e)
        {
              return false;
        }
}

    void setNumCamas(int NumCamas) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}                                   //JEVG
