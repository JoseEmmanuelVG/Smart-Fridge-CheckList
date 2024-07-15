
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user                     //JEVG
 */
public class ClienteNegocios extends ClienteAbstracto 
{
protected ArrayList<MembresiaCliente> Membresia ;
    
@Override
    public void addMembresia(MembresiaCliente M)
    { 
     Membresia.add(M);
    }
    
@Override
    public boolean removeMembresia(int index)
    {
        try
        {
            Membresia.remove(index);
            return true;
        }catch(IndexOutOfBoundsException e)
        {
        return false;
        }
    }
    
@Override
    public int getNumMembresia()
    {
    return Membresia.size();
    }
    
@Override
    public MembresiaCliente getMembresia(int index)
    {
    return Membresia.get(index);
    }     
}                                       //JEVG
