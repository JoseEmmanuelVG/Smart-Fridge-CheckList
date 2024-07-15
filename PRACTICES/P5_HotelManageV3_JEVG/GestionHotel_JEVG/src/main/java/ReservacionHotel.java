/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user  /  JEVG
 */
public class ReservacionHotel {
    
    private ClienteHotel C;
    private HabitacionHotel H;
    private String Fecha;
    private boolean CheckIn;
    private boolean CheckOut;

    public ClienteHotel getClienteHotel() {
        return C;
    }

    public void setClienteHotel(ClienteHotel C) {
        this.C = C;
    }

    public HabitacionHotel getHabitacionHotel() {
        return H;
    }

    public void setHabitacionHotel(HabitacionHotel H) {
        this.H = H;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public boolean isCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(boolean CheckIn) {
        this.CheckIn = CheckIn;
    }

    public boolean isCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(boolean CheckOut) {
        this.CheckOut = CheckOut;
    }
    
    
}
