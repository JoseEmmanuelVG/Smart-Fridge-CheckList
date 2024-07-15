/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

import com.mycompany.appbancogui_jevg.*;
import java.util.ArrayList;

/**
 *
 * @author Israel Cianca
 */
public class Banco {
    protected String nombre;
    protected String direccion;
    private ArrayList <Cliente> clientes; 
    public Banco(){
        clientes=new ArrayList();
    }
    public void AgregarCliente(Cliente Ce){
        clientes.add(Ce);
    }
    public int ObtenerNumClientes(){
        return clientes.size();
    }   
    public Cliente ObtenerCliente(int index){
        if  ( (index<0) || (clientes.isEmpty()) || (index>=clientes.size()) )
                return null;
        return clientes.get(index);
    }
    public void AsignarDatosdelBanco(String n, String d){
        nombre=n;
        direccion=d;
    }
    public String ObtenerNombre(){
        return nombre;
    }
    public String ObtenerDireccion(){
        return direccion;
    }
}
