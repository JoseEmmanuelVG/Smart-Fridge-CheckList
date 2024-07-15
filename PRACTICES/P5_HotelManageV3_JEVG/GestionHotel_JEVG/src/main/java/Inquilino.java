/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author user         //JEVG
 */
public class Inquilino extends ClienteHotel
{
    ClienteHotel C;
    HabitacionResidente H;
    
    protected void setCliente(ClienteHotel c)
    {
        C=c;
    }
    protected ClienteHotel getCliente()
    {
        return C;
    }
}                       //JEVG
