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

public class CarMaintence extends Auto
{
    protected ArrayList<Maintence> M;
    
    public CarMaintence()
    {
        M=new ArrayList();   
    } 

    public boolean removeCarM(int index)
    {
    try
    {
        M.remove(index);
        return true;
    }
    catch(IndexOutOfBoundsException e)
    {
    return false;
    }
    }
    
    public void addCarM(Maintence CM)
    {
        M.add(CM);
    }
    

    public int sizeCarM()
    {
        return M.size();
    }
    

    public Maintence getCarM(int index)
    {
        return M.get(index);
    }
}
