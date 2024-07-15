package com.mycompany.appagencia_jevg;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author user /JEVG
 */
public class AgenciaApp_JEVG            //JEVG
{
    public static void main(String[]rgs)
    {
        // Todo code aplication logic here ---> Agregar, listar y seleccionar un cliente
        Agencia JEVG;
        int opc;
        JEVG=new Agencia();
                do
                {
                    System.out.println("1. Agregar Cliente");
                    System.out.println("2. Listar Cliente");
                    System.out.println("3. Seleccionar Cliente");
                    System.out.println("4. Eliminar Cliente");
                    System.out.println("9. Salir");
                    opc=Opcion();
                    switch(opc)
                    {
                        case 1 -> AgregarCliente(JEVG);
                        case 2 -> ListarCliente(JEVG);
                        case 3 -> SeleccionarCliente(JEVG);
                        case 4 -> EliminarCliente(JEVG);
                    } 
                }while (opc!=9);
    }
    
    public static void AgregarCliente(Agencia A)
    {
        String Nombre;
        int Edad;
        System.out.println("Nombre del Cliente");
        Nombre=Informacion();
        System.out.println("Ingresa Edad");
        Edad=Seleccion();
        Cliente Aux;
        Aux=new Cliente();
        Aux.setNombre(Nombre);
        Aux.setEdad(Edad);
        A.addCliente(Aux);      
    }
    
    public static void ListarCliente( Agencia A)
    {
        int i,Tam;
        Tam=A.getClientes();
        for(i=0;i<Tam;i++)
        {
            Cliente Aux;
            Aux=A.getCliente(i+1);
            System.out.println((i+1)+". "+Aux.getNombre()+"\t"+Aux.getEdad());
        }
    }
    
    public static void SeleccionarCliente(Agencia A)
    {
        int opc=0;
        System.out.println("Ingresa el numero cliente");
        opc=Seleccion();
        Cliente Aux;
        try{
            Aux=A.getCliente(opc);
            OperacionAuto(Aux);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Cliente no encontrado");
            
        }     
 /**       int opc;
        Cliente Aux;
        if (A.getClientes()==0)
        {
            System.out.println("No hay Clientes Registrados");
        }
        else
        {   
            System.out.println("Ingrese el Numero de Cliente");
            opc=(Opcion()-1);
            try
            {
                Aux=A.getCliente(opc);
            }
            catch(IndexOutOfBoundsException e)
            {
                 Aux=null;
            }
            if(Aux!=null)
            {
                 OperacionAuto(Aux);
            }
            else
            {
                System.out.println("Número de Cliente NO Valido");   
            }
        }
*/  }
       public static void EliminarCliente(Agencia A)
    {
       /* int index;
        System.out.println("Ingresa el indice del Cliente");
        index=(Opcion()-1);
        A.removeCliente(index);*/
        int index;
        ListarCliente(A);
        System.out.println("Ingresa el número de cliente a eliminar");
        index=Seleccion();
        try{
            A.removeCliente(index);
        }     
        catch(IndexOutOfBoundsException e){
            System.out.println("Número de cliente no encontrado");
        }
    }
       
/**       public static void OperacionAuto(Cliente C)
            {    //  ---> El segundo paso consiste en crear 
                int opc; //la clase principal que interactúa con el modelo
                do
                {
                    System.out.println("1. Agregar Auto");
                    System.out.println("2. Listar Auto");
                    System.out.println("3. Seleccionar Auto");
                    System.out.println("4. Eliminar Auto");
                    System.out.println("9. Salir");
                    opc=Opcion();
                    switch (opc)
                    {
                        case 1 -> AgregarAuto(C); 
                        case 2 -> ListarAuto(C);
                        case 3 -> SeleccionarAuto(C);
                        case 4 -> EliminarAuto(C);
                    }
                }while(opc!=9);
            }
        
        public static void AgregarAuto(Cliente C)
        {
            Auto Aux;
            Aux=new Auto();
            System.out.println("Ingresa el modelo de Auto");
            Aux.setModelo(Info());
            
            System.out.println("Ingresa la marca de Auto");
            Aux.setMarca(Info());
            
            System.out.println("Ingresa el año de Auto");
            Aux.setAño(Opcion());
            
            C.addCar(Aux);
        } 
        
        public static void ListarAuto(Cliente C)
        {
            int Tam,i;
            Tam=C.getCars();
            System.out.println("Auto Registrado");
            for(i=0;i<Tam;i++)
            {
                Auto Aux;
                Aux=C.getCar(i);
                System.out.println((i+1)+".- Modelo el Auto:"+Aux.getModelo()+" Marca: "+Aux.getMarca()+" Año: "+Aux.getAño());
            }
        }
        
        public static void SeleccionarAuto(Cliente C)
        {
            int opc;
            Auto Aux;
            if (C.getCars()==0)
                System.out.println("El cliente no tiene cuentas de Auto asignadas");
            else
            {
                ListarAuto(C);
                System.out.println("Seleccione el indice del Auto:");
                opc=(Opcion()-1);
                Aux=C.getCar(opc);
                    if (Aux!=null)
                        ListarAuto(C);
                    else
                        System.out.println("Numero de auto no válido");
            }
        }
                       
         public static void EliminarAuto(Cliente C)
        {
            int index;
            System.out.println("Ingresa el indice del Auto");
            index=(Opcion()-1);
            C.removeAuto(index);
        }
*/        
 //     Por lo que se tendrá que modificar la aplicación principal con la finalidad de proporcionar la funcionalidad solicitada.
    public static void OperacionAuto(Cliente C){
        int opc=0, opcRC;
        do
        {
            System.out.println("1. Agregar auto");
            System.out.println("2. Listar autos");
            System.out.println("3. Seleccionar auto");
            System.out.println("4. Elminar auto");
            System.out.println("9. Regresar");
            opc=Seleccion();
            switch(opc)
            {
                case 1 -> {
                    System.out.println("¿Desea Comprar un vehiculo o  Rentar?");
                    System.out.println("Presiona :  [1] Comprar    ó      [2]Rentar");
                    opcRC=Seleccion();
                    if(opcRC==1){
                        
                        AgregarAutomovil(C);break;
                    } else {
                        
                        RentarAuto(C);
                    }
                }
                case 2 -> ListarAutomoviles(C);
                case 3 -> SeleccionarAutomovil(C);
                case 4 -> EliminarAutomovil(C);
            }           
        }while(opc!=9);
    }
      public static void RentarAuto(Cliente C)
      {
         int D;
         String Fecha;
         int Año;
         String Modelo,Marca;
         System.out.println("Ingresa la Marca del Auto");
        Marca=Informacion();
        System.out.println("Ingresa el modelo del Auto");
        Modelo=Informacion();
        System.out.println("Ingresa el año del auto");
        Año=Seleccion();
        System.out.println("Ingresa la Fecha de inicio de Renta");
        Fecha=Informacion();
        System.out.println("Numero de dias a Renar?");
        D=Seleccion();
        CarRent renta;
        renta=new CarRent();
        renta.setTipo('R');
        renta.setFecha(Fecha);
        renta.setNumDias(D);
        renta.setC(C);
        renta.setMarca(Marca);
        renta.setModelo(Modelo);
        renta.setAño(Año);
        C.addCar(renta);
        AgencyRent AR;
        AR=new AgencyRent();
        AR.addCarRenta(renta);   
    }
    public static void SeleccionarAutomovil(Cliente C)
    {  
        int opc,opc2,opc3;
        char t;
        System.out.println("Ingresa el indice del automovil");
        opc=Seleccion();
        CarRent Aux;
        Aux=(CarRent)C.getCar(opc);
        System.out.println("Seleccionaste el auto");
        System.out.println("Marca:"+Aux.getMarca()+"\tModelo:"+Aux.getModelo()+"\tAño:"+Aux.getAño());
        t=Aux.getTipo();
        if(t=='R')
    {
          System.out.println("El estado del Auto es Rentado");
          System.out.println("Fecha de Adquicision:"+Aux.getFecha());
          System.out.println("Número de días:"+Aux.getNumDias());
    }
        System.out.println("¿Desea entrar al menu de Mantenimiento?");
        System.out.println("Presiona:    [1] Si         [2]No");
        opc2=Seleccion();
        if(opc2==1)
        {
              Mantenimiento (Aux);
        } 
    }
    
    public static void Mantenimiento (CarRent CR)
    {
        int opc3=0;
        do
        {
           System.out.println("1. Agregar  Mantenimiento");
           System.out.println("2. Listar Mantenimientos");
           System.out.println("3. Eliminar Mantenimiento");
           System.out.println("9. Regresar");
           opc3=Seleccion();
           switch(opc3)
           {
                case 1 -> AgregarMantenimiento(CR);
                case 2 -> ListarMantenimiento(CR);
                case 3 -> EliminarMantenimiento(CR);
              }
          } while(opc3!=9);
    }
    
    public static void AgregarMantenimiento(CarRent CR){
       int Km;
       String Descripcion,Fecha;
            System.out.println("Ingresa el Fecha del Mantenimiento");
       Fecha=Informacion();
            System.out.println("Descripcion: ");
       Descripcion=Informacion();
            System.out.println("Kilometros: ");
       Km=Seleccion();
       Maintence m;
       m=new Maintence();
       m.setDescripcion(Descripcion);
       m.setFecha(Fecha);
       m.setKm(Km);
       CR.addCarMaintence(m);
    }
    
    public static void EliminarMantenimiento(CarRent CR)
    {
        int opc;
        System.out.println("Seleccione la opcion a eliminar");
        opc=Seleccion();
        CR.removeCarMaintence(opc);
    }
     
    public static void ListarMantenimiento(CarRent CR)
    {
        int i,mant;
        System.out.println("Mantenimientos:");
        mant=CR.sizeCarMaintence();
        for(i=0;i<mant;i++)
        {
            Maintence Aux;
            Aux=CR.getCarMaintence(i+1);
            System.out.println((i+1)+") Fecha: "+Aux.getFecha());
        }
        System.out.println("Sin mas registros");
    }
    
    public static void EliminarAutomovil(Cliente C)
    {
        int opc;
        ListarAutomoviles(C);
        System.out.println("Seleccione el automovil a eliminar");
        opc=Seleccion();
        C.removeAuto(opc);
    }
    
    public static void ListarAutomoviles(Cliente C)
    {
        int i,tam;
        System.out.println("Nombre:"+C.getNombre());
        System.out.println("Edad:"+C.getEdad());
        System.out.println("Automoviles:");
        tam=C.getCars();
        System.out.println("Marca\tModelo\tAño\tTipo");
        for(i=0;i<tam;i++){
            Auto Aux;
            Aux=C.getCar(i+1);
            System.out.println(Aux.getMarca()+"\t"+Aux.getModelo()+"\t"+Aux.getAño()+"\t"+Aux.getTipo());
        }
        System.out.println("Sin mas registros");
    }
    
    public static void AgregarAutomovil(Cliente C)
    {
        int Año;
        String Modelo,Marca;
        System.out.println("Ingresa la Marca del Automovil");
        Marca=Informacion();
        System.out.println("Ingresa el modelo del Automovil");
        Modelo=Informacion();
        System.out.println("Ingresa el año del automovil");
        Año=Seleccion();
        CarRent carro;
        carro=new CarRent();
        carro.setMarca(Marca);
        carro.setModelo(Modelo);
        carro.setAño(Año);
        carro.setTipo('C');
        C.addCar(carro);
    }
// Fin de la modificacion   
         
    public static int Opcion()
    {
        Scanner Teclado;
        Teclado=new Scanner(System.in);     
        return Teclado.nextInt();
    }

    public static String Info()
    {
        Scanner Teclado;
        Teclado=new Scanner(System.in);     
        return Teclado.nextLine();
    }        
    
    public static String Informacion()
    {
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
    }
    
    public static int Seleccion()
    {
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        try{
            return Teclado.nextInt();
        }
        catch(InputMismatchException e){
            return 0;
        }
    }
}                                   //JEVG
