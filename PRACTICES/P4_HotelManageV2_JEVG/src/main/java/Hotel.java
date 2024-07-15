
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user  / JEVG
 */
public class Hotel {
    private ArrayList <ClienteHotel> Clientes;
    private ArrayList <HabitacionHotel> Habitaciones;
    private ArrayList <ReservacionHotel> Reservaciones;
    
    public Hotel ()
    {
        Clientes=new ArrayList();
        Habitaciones=new ArrayList();
        Reservaciones=new ArrayList();
    }
    public void removeClienteHotel(int index)
    {
        Clientes.remove(index);
    }
    public void addClienteHotel(ClienteHotel C)
    {
        Clientes.add(C);
    }
    
    public int sizeClienteHotel()
    {
        return Clientes.size();
    }
    
    public ClienteHotel getClienteHotel(int index)
    {
        return Clientes.get(index);
    }
    
     public void addHabitacionHotel(HabitacionHotel C)
    {
        Habitaciones.add(C);
    }
    
    public int sizeHabitacionHotel()
    {
        return Habitaciones.size();
    }
    
    public HabitacionHotel getHabitacionHotel(int index)
    {
        return Habitaciones.get(index);
    }
    
    public void removeHabitacionHotel(int index)
    {
        Habitaciones.remove(index);
    }
    
    public void addReservacionHotel(ReservacionHotel C)
    {
        Reservaciones.add(C);
    }
    
    public int sizeReservacionHotel()
    {
        return Reservaciones.size();
    }
    
    public ReservacionHotel getReservacionHotel(int index)
    {
        return Reservaciones.get(index);
    }
    
      public void removeReservacionHotel(int index)
    {
        Reservaciones.remove(index);
    }
    
    public void checkIn(ReservacionHotel R)
    {
        R.setCheckIn(true);
    }
    
    public void checkOut(ReservacionHotel R)
    {
         R.setCheckOut(true);
    }
}                                       //JEVG
