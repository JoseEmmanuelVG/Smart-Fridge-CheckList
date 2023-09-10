/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

/**
 *
 * @author user
 */
public class O_TiendaFrameObjetos 
{

    String Product, Nombre, Precio;

    public O_TiendaFrameObjetos(String Product, String Nombre, String Precio) {
        this.Product = Product;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

 
   

        
         /* String Nombre;
    double Precio;

    public O_TiendaFrameObjetos(String Nombre, double Precio) 
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }*/

    public O_TiendaFrameObjetos(String Product) {
        this.Product = Product;
    }
}
