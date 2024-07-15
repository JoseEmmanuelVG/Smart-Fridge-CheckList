/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user     //JEVG
 */
public abstract class ClienteAbstracto extends ClienteHotel
{
public abstract void addMembresia(MembresiaCliente M);
public abstract boolean removeMembresia(int index);
public abstract int getNumMembresia();
public abstract MembresiaCliente getMembresia(int index);
}                   //JEVG
