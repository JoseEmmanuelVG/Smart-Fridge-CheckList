/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author user             //JEVG
 */
public class C_Producto
{
    protected String Nombre;
    protected String FechaEntrada;
    protected String FechaCad;
    protected int DiasCad;
    private ArrayList <D_Tienda> Tiendas;    

      public C_Producto(String N, String FE, String FC, int DC)
    {
        Nombre=N;
        FechaEntrada=FE;
        FechaCad=FC;
        DiasCad=DC;
    }
    
    
    public C_Producto()
    {
        Tiendas=new ArrayList();
    }
    
       
     public void AsignarNombre(String N)
    {
        Nombre = N;
    }
    public void AsignarFechaEntrada(String FE)
    { 
        FechaEntrada = FE;
    }
    public void AsignarFechaCad(String FC)
    {
        FechaCad = FC;
    }
      
    public String ObtenerNombre()
    {
        return Nombre;
    }
    public String ObtenerFechaEntrada()
    {
        return FechaEntrada;
    }
        public String ObtenerFechaCad()
    {
        return FechaCad;
    }
        
        public int DiasCad() throws ParseException
        {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date fechaEntrada=dateFormat.parse(FechaEntrada);
	Date fechaCad=dateFormat.parse(FechaCad);
        DiasCad =(int) ((fechaCad.getTime()-fechaEntrada.getTime())/86400000);
        return DiasCad;
        }
  
        public void AgregarTienda(D_Tienda t)
        {
            Tiendas.add(t);    
        }   
            public int ObtenerNumTiendas()
        {
            return Tiendas.size();
        }
        public D_Tienda ObtenerTienda(int index)
        {
            if ( (index<0) || (ObtenerNumTiendas()==0) || (index>=ObtenerNumTiendas()) )
                return null;
            return Tiendas.get(index);
        }
}
