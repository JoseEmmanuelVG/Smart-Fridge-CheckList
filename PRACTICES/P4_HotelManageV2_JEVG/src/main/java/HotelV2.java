/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user         JEVG
 */
public class HotelV2  extends Hotel            //JEVG
{
    protected ArrayList<Servicio> ServiciosHotel;
    protected ArrayList<Inquilino> InquilinoHotel;
    protected ArrayList<TipoCama> TiposCama;
    
    //Agregar,Eliminar, Numero , Obtener Servicio
    public HotelV2()
    {
        ServiciosHotel=new ArrayList();
        InquilinoHotel=new ArrayList();
        TiposCama=new ArrayList();
    }
    public boolean removeServicio(int index)
    {
        try
        {
        ServiciosHotel.remove(index);
        return true;
        }
        catch(IndexOutOfBoundsException e)
        {
             return false;
        }
    }
    
    public void addServicio(Servicio S)
    {
        ServiciosHotel.add(S);
    }
    
    public int sizeServicio()
    {
        return ServiciosHotel.size();
    }
    
    public Servicio getServicio(int index)
    {
        return ServiciosHotel.get(index);
    }
 
     public boolean removeInquilino(int index)
     {
        try
        {
            InquilinoHotel.remove(index);
            return true;
        }
        catch(IndexOutOfBoundsException e)
        {
            return false;
        }
        }
    
    public void addInquilino(Inquilino i)
    {
        InquilinoHotel.add(i);
    }
    
    public int sizeInquilino()
    {
        return InquilinoHotel.size();
    }
    
    public Inquilino getInquilino(int index)
    {
        return InquilinoHotel.get(index);
    }
    
    public boolean removeCama(int index)
    {
        try
        {
            TiposCama.remove(index);
            return true;
        }
        catch(IndexOutOfBoundsException e)
        {
             return false;
        }
        }
    
    public void addCama(TipoCama c)
    {
        TiposCama.add(c);
    }
    
    public int sizeCama()
    {
        return TiposCama.size();
    }
    
    public TipoCama getCama(int index)
    {
        return TiposCama.get(index);
    }
}                               //JEVG
