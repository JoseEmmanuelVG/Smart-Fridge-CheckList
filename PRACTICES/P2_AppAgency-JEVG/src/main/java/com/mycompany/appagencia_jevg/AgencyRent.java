/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appagencia_jevg;

/**
 *
 * @author JEVG
 */
import java.util.ArrayList;

    public class AgencyRent extends Agencia
    {
    protected ArrayList<CarRent> CarRenta;
    public AgencyRent()
    {
        CarRenta=new ArrayList();   
    } 

    public boolean removeCarRenta(int index)
    {
    try
    {
        CarRenta.remove(index);
        return true;
    }
    catch(IndexOutOfBoundsException e)
    {
    return false;
    }
    }
    
    public void addCarRenta(CarRent CR)
    {
        CarRenta.add(CR);
    }
    
    public int sizeCarRenta()
    {
        return CarRenta.size();
    }
    
    public CarRent getCarRenta(int index)
    {
        return CarRenta.get(index);
    }
}
