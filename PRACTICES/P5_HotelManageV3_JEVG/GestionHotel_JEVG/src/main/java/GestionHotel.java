
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user  /  JEVG
 */
public class GestionHotel {
    //IMPLEMENTACIÓN DE LAS CLASES EHEREDADAS EN EL MAIN 
       //HOTELV2
   
    public static void main(String[]rgs)
    {
        // Todo code aplication logic here
        HotelV2 Transilvania;
        int opc;
                Transilvania=new HotelV2();
                do
                {
                    System.out.println("1. Menu Clientes");
                    System.out.println("2. Menu Habitaciones");
                    System.out.println("3. Menu de Reservaciones");
                    System.out.println("9. Salir");
                    opc=Opcion();
                    switch(opc)
                    {
                        case 1 -> MenuCliente(Transilvania);
                        case 2 -> MenuHabitacionesHotel(Transilvania);
                        case 3 -> MenuReservaciones(Transilvania);
                    } 
                }while (opc!=9);
    }
 
//Codigo Reservaciones Profesor ISRAEL
    public static void MenuReservaciones(HotelV2 HV2){
        int opc;
        do{
            System.out.println("1. Agregar Reservación");
            System.out.println("2. Listar reservaciones");
            System.out.println("3. Realizar Check In");
            System.out.println("4. Realizar Check Out");
            System.out.println("5. Eliminar reservación");
            System.out.println("9. Regresar");
            opc=Opcion();
            switch(opc){
                case 1 -> AgregarReservacion(HV2);
                case 2 -> ListarReservaciones(HV2);
                case 3 -> RealizarCheckIn(HV2);
                case 4 -> RealizarCheckOut(HV2);
                case 5 -> EliminarReservacion(HV2);
            }
            
        }while(opc!=9);
    }
    
    public static void RealizarCheckIn(HotelV2 HV2){
        int opc;
        ReservacionHotel Aux;
        ListarReservaciones(HV2);
        System.out.println("Ingresa el indice de la reservacion");
        opc=Opcion();
        Aux=HV2.getReservacionHotel(opc);
        Aux.setCheckIn(true);
    }
    
    public static void RealizarCheckOut(HotelV2 HV2){
        int opc;
        ReservacionHotel Aux;
        ListarReservaciones(HV2);
        System.out.println("Ingresa el indice de la reservacion");
        opc=Opcion();
        Aux=HV2.getReservacionHotel(opc);
        Aux.setCheckOut(true);
    }
    
    public static void EliminarReservacion(HotelV2 HV2){
        int opc;
        ListarReservaciones(HV2);
        System.out.println("Ingresa el indice a eliminar");
        opc=Opcion();
        HV2.removeReservacionHotel(opc);
    }
    
    public static void ListarReservaciones(HotelV2 HV2){
        int i,num;
        num=HV2.sizeReservacionHotel();
        for(i=0;i<num;i++){
            ReservacionHotel Aux;
            Aux=HV2.getReservacionHotel(i);
            System.out.println("Reservación "+i);
            System.out.println("Cliente:"+Aux.getClienteHotel().ObtenerNombre());
            System.out.println("Fecha:"+Aux.getFecha());
            System.out.println("Habitacion:"+Aux.getHabitacionHotel().getIDCuarto());
            System.out.println("Check In:"+Aux.isCheckIn()+" Check Out:"+Aux.isCheckOut());
        }
    }
    
    public static void AgregarReservacion(HotelV2 HV2){
        ReservacionHotel Aux;
        String Fecha;
        int Dias;
        ClienteHotel C;
        HabitacionHotel h;
        System.out.println("Ingrese la fecha de la reservacion");
        Fecha=Info();
        ListarCliente(HV2);
        System.out.println("Ingresa el índice del Cliente");
        C=HV2.getClienteHotel(Opcion());
        ListarHabiacionHotel(HV2);
        System.out.println("Ingresa el índice de la habitación");
        h=HV2.getHabitacionHotel(Opcion());
        Aux=new ReservacionHotel();
        Aux.setFecha(Fecha);
        Aux.setHabitacionHotel(h);
        Aux.setClienteHotel(C);
        HV2.addReservacionHotel(Aux);
    }      
//Codigo Reservaciones Profesor ISRAEL

    
    public static void MenuCliente(HotelV2 HV2)
    {
        int opc;
        do
        {
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Listar Clentes");
        System.out.println("3. Eliminar Clientes");
        System.out.println("9. Regresar"); 
        opc=Opcion();
            switch(opc)
            {
                case 1 -> AgregarCliente(HV2);
                case 2 -> ListarCliente(HV2);
                case 3 -> EliminarCliente(HV2);
            }
        }while(opc!=9);
    }
    
    public static void AgregarCliente(HotelV2 HV2)
    {
        int edad;
        String nombre;
        ClienteHotel C;
        C=new ClienteHotel();
        System.out.println("Nombre del Cliente");
        nombre=Info();
        System.out.println("Edad del Cliente");
        edad=Opcion();
        C.AsignarNombre(nombre);
        C.AsignarEdad(edad);
        HV2.addClienteHotel(C);        
    }
    
     public static void ListarCliente(HotelV2 HV2)
    {
        int Num,i;
        Num=HV2.sizeClienteHotel();
        for(i=0;i<Num;i++)
        {
            ClienteHotel Aux;
            Aux=HV2.getClienteHotel(i);
            System.out.println(i+" "+Aux.ObtenerNombre()+"Edad"+Aux.ObtenerEdad());
        }
    }  
     
       public static void EliminarCliente(HotelV2 HV2)
    {
        int index;
        System.out.println("Ingresa el indice del Cliente");
        index=Opcion();
        HV2.removeClienteHotel(index);
    }

//Ejercicio 01 - Gestión de un Hotel -> 2. Alta y baja de habitaciones (Realizado por el estudiante)
        
         public static void MenuHabitacionesHotel(HotelV2 HV2)
    {
        int opc;
        do
        {
        System.out.println("1. Agregar Habitación");
        System.out.println("2. Listar Habitación");
        System.out.println("3. Eliminar Habitación");
        System.out.println("9. Regresar"); 
        opc=Opcion();
            switch(opc)
            {
                case 1 -> AgregarHabitacionHotel(HV2);
                case 2 -> ListarHabiacionHotel(HV2);
                case 3 -> EliminarHabitacionHotel(HV2);
            }
        }while(opc!=9);
    }
    
    public static void AgregarHabitacionHotel(HotelV2 HV2)          //JEVG
    {
    int Hab, Serv;
        int NumCuarto;
        HabitacionHotel Aux;
        do
        {
            Aux=new HabitacionHotel();  
            System.out.println("Tipo de Habitación ");
            System.out.println("1. Suite ");
            System.out.println("2. Residente");
            System.out.println("3. Grupal");
            System.out.println("9. Regresar");
            Hab=Opcion();
            if(Hab!=9)
                {
                System.out.println("Ingresa número de habitación");
                NumCuarto=Opcion();
                Aux.setIDCuarto(NumCuarto);
                } 
                switch(Hab)
                {
                    case 1 ->               //JEVG
                    {
                    Aux.setTipo('S');
                    do
                    {
                        System.out.println("Servicios ");
                        System.out.println("1. Añadir ");
                        System.out.println("2. Listar");
                        System.out.println("3. Borrar");
                        System.out.println("9. Regresar");
                        Serv=Opcion();
                        switch(Serv)
                        {
                            case 1 -> 
                            {
                                int NewServ=1;
                                while(NewServ!=0)
                                {
                                    HabSuite(HV2);
                                    System.out.println("Para ingresar otro servicio [1] Para salir [0]");
                                    NewServ=Opcion();
                                }
                                HV2.addHabitacionHotel(Aux);
                            }
                            case 2 -> ListarServicios(HV2);
                            case 3 -> EliminarServicio(HV2);
                        }
                    } while (Serv!=9);
                    }                       //JEVG
                    
                     case 2 ->              //JEVG
                    {
                    Aux.setTipo('R');
                    do
                    {
                        System.out.println("Inquilinos");
                        System.out.println("1. Añadir ");
                        System.out.println("2. Listar");
                        System.out.println("3. Borrar");
                        System.out.println("9. Regresar");
                        Serv=Opcion();
                        switch(Serv)
                        {
                            case 1 -> 
                            {
                                Residente(HV2);
                                HV2.addHabitacionHotel(Aux);
                            }
                            case 2 -> ListarInquilino(HV2);
                            case 3 -> EliminarInquilino(HV2);
                        }
                    } while(Serv!=9);
                    }                               //JEVG             
                    
                    case 3 ->                       //JEVG
                    {
                    Aux.setTipo('G');
                    do
                    {
                        System.out.println("Camas ");
                        System.out.println("1. Añadir ");
                        System.out.println("2. Listar");
                        System.out.println("3. Borrar");
                        System.out.println("9. Regresar");
                        Serv=Opcion();
                        switch(Serv)
                        {
                            case 1 -> 
                            {
                                HabGrupal(HV2);
                                HV2.addHabitacionHotel(Aux);
                            }
                            case 2 -> ListarCamas(HV2);
                            case 3 -> EliminarCamas(HV2);
                        }
                    } while(Serv!=9);
                    }
                }                                   //JEVG
            
        }while(Hab!=9);
    }
    
    public static void ListarHabiacionHotel(HotelV2 HV2)
    {
        int Num,i;
        Num=HV2.sizeHabitacionHotel();
        for(i=0;i<Num;i++)
        {
            HabitacionHotel Aux;
            Aux=HV2.getHabitacionHotel(i);
            System.out.println(i+" Habitacion No: "+Aux.getNumCamas()+" Número de Camas: "+Aux.getIDCuarto());
        }
    }  
    
    public static void EliminarHabitacionHotel(HotelV2 HV2)
    {
        int index;
        System.out.println("Ingresa el número de Habitación");
        index=Opcion();
        HV2.removeHabitacionHotel(index);
    }   
     
//En la habitación Suite se podrá indicar los servicios adicionales requeridos (Lavandería, Planchado, Despertador, etc.)
    
    public static void HabSuite(HotelV2 HV2)               // JEVG
    {
        String SN,SD;
        Servicio S;
        S= new Servicio();
        System.out.println("Ingresa nombre servicio");
        SN=Info();
        System.out.println("Ingresa Descripcion");
        SD=Info();
        S.setNombre(SN);
        S.setDescripcion(SD);
        HV2.addServicio(S);
    }    
    public static void ListarServicios (HotelV2 HV2){
      int Num,i;
        Num=HV2.sizeServicio();
        for(i=0;i<Num;i++){
            Servicio S;
            S=HV2.getServicio(i);
            System.out.println(i+") Nombre Servicio:"+S.getNombre()+"|| Descripcion:"+S.getDescripcion());
        }   
 }
    public static void EliminarServicio(HotelV2 HV2){
        int index;
        System.out.println("Ingresa el indice del cliente");
        index=Opcion();
        HV2.removeServicio(index);
    }                                                         // JEVG
//FINAL En la habitación Suite se podrá indicar los servicios adicionales requeridos (Lavandería, Planchado, Despertador, etc.)

//En la habitación Residente se podrá mantener información de los huéspedes (inquilinos)
  public static void Residente(HotelV2 HV2)             //JEVG
  {
    int i,Tam,save=0,correct;
    String name;
    Inquilino Inq;
    ClienteHotel C;
    do
    {
        ListarCliente(HV2);
        System.out.println("Ingresa el cliente del cual eres Inquilino");
        i=Opcion();
        i=i-1;
        Tam=HV2.sizeClienteHotel();
        if(i<=Tam)
        {
            C=HV2.getClienteHotel(i);
            System.out.println((i+1)+") Cliente : "+C.ObtenerNombre());
            System.out.println("Confirmar [1] Para cancelar [0]");
            correct=Opcion();
            while(correct==1)
            {
                Inq= new Inquilino();
                System.out.println("Ingresa tu nombre");
                name=Info();
                Inq.AsignarNombre(name);
                Inq.setCliente(C);
                HV2.addInquilino(Inq);
                System.out.println("Deseas agregar otro Inquilino a este Cliente ");
                System.out.println("Confirmar [1] Para cancelar [0]");
                correct=Opcion();
            }
            save=9;
        } 
        else {System.out.println("Cliente no encontrado");}
    } while(save!=9);
}   
        public static void ListarInquilino(HotelV2 HV2)
        {
        int i,Tam;
        Tam=HV2.sizeInquilino();
        Inquilino Inq;
        for (i=0;i<Tam;i++){
            Inq=HV2.getInquilino(i);
            System.out.println((i+1)+") Nombre Inquilino :"+Inq.ObtenerNombre());
        }
        }
        public static void EliminarInquilino(HotelV2 HV2)
        {
            int index;
            System.out.println("Ingresa el indice del cliente");
            index=Opcion();
            HV2.removeInquilino(index);
        }                               //JEVG
//FINAL En la habitación Residente se podrá mantener información de los huéspedes (inquilinos)
  
//En la habitación Grupal información del número y tipos de camas
    public static void HabGrupal (HotelV2 HV2)              //JEVG
    {
        int NumCamas;

        HabitacionGrupal Aux;
        Aux=new HabitacionGrupal();
        System.out.println("Ingresa número de camas");
        NumCamas=Opcion();
        Aux.setNumCamas(NumCamas);
        for(int i=1;i<=NumCamas;i++){
         System.out.println("Tipo de cama ["+i+"]: ");
        TiposCama(HV2);
        }
        ListarCamas(HV2); 
    }
        public static void TiposCama(HotelV2 HV2)
        {
            TipoCama T;
            T= new TipoCama(); 
            String tC;
            int personas;
             tC=Info();
            System.out.println("Ingresa número de Personas");
            personas=Opcion();
            T.setNumPersonas(personas);
            T.setNombre(tC);
            HV2.addCama(T);    
        }
    
        public static void ListarCamas(HotelV2 HV2)
        {
            int i,Tam;
            Tam=HV2.sizeCama();
            TipoCama T;
            for (i=0;i<Tam;i++)
            {
                T=HV2.getCama(i);
                System.out.println((i+1)+")Cama:"+T.getNombre()+"|| Num.Personas: "+T.getNumPersonas());
            }
        }
        public static void EliminarCamas(HotelV2 H2)
        {
        int index;
        System.out.println("Ingresa el indice del cliente");
        index=Opcion();
        H2.removeCama(index);
        }                       //JEVG
//FINAL En la habitación Grupal información del número y tipos de camas
   
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
}                                               //JEVG


       //HOTEL BÁSICO
/*    public static void main(String[]rgs)
    {
        // Todo code aplication logic here
        Hotel Transilvania;
        int opc;
                Transilvania=new Hotel();
                do
                {
                    System.out.println("1. Menu Clientes");
                    System.out.println("2. Menu Habitaciones");
                    System.out.println("3. Menu de Reservaciones");
                    System.out.println("9. Salir");
                    opc=Opcion();
                    switch(opc)
                    {
                        case 1 -> MenuCliente(Transilvania);
                        case 2 -> MenuHabitacionesHotel(Transilvania);
                        case 3 -> MenuReservaciones(Transilvania);
                    } 
                }while (opc!=9);
    }
 
//Codigo Reservaciones Profesor ISRAEL
    public static void MenuReservaciones(Hotel H){
        int opc;
        do{
            System.out.println("1. Agregar Reservación");
            System.out.println("2. Listar reservaciones");
            System.out.println("3. Realizar Check In");
            System.out.println("4. Realizar Check Out");
            System.out.println("5. Eliminar reservación");
            System.out.println("9. Regresar");
            opc=Opcion();
            switch(opc){
                case 1 -> AgregarReservacion(H);
                case 2 -> ListarReservaciones(H);
                case 3 -> RealizarCheckIn(H);
                case 4 -> RealizarCheckOut(H);
                case 5 -> EliminarReservacion(H);
            }
            
        }while(opc!=9);
    }
    
    public static void RealizarCheckIn(Hotel H){
        int opc;
        ReservacionHotel Aux;
        ListarReservaciones(H);
        System.out.println("Ingresa el indice de la reservacion");
        opc=Opcion();
        Aux=H.getReservacionHotel(opc);
        Aux.setCheckIn(true);
    }
    
    public static void RealizarCheckOut(Hotel H){
        int opc;
        ReservacionHotel Aux;
        ListarReservaciones(H);
        System.out.println("Ingresa el indice de la reservacion");
        opc=Opcion();
        Aux=H.getReservacionHotel(opc);
        Aux.setCheckOut(true);
    }
    
    public static void EliminarReservacion(Hotel H){
        int opc;
        ListarReservaciones(H);
        System.out.println("Ingresa el indice a eliminar");
        opc=Opcion();
        H.removeReservacionHotel(opc);
    }
    
    public static void ListarReservaciones(Hotel H){
        int i,num;
        num=H.sizeReservacionHotel();
        for(i=0;i<num;i++){
            ReservacionHotel Aux;
            Aux=H.getReservacionHotel(i);
            System.out.println("Reservación "+i);
            System.out.println("Cliente:"+Aux.getClienteHotel().ObtenerNombre());
            System.out.println("Fecha:"+Aux.getFecha());
            System.out.println("Habitacion:"+Aux.getHabitacionHotel().getIDCuarto());
            System.out.println("Check In:"+Aux.isCheckIn()+" Check Out:"+Aux.isCheckOut());
        }
    }
    
    public static void AgregarReservacion(Hotel H){
        ReservacionHotel Aux;
        String Fecha;
        int Dias;
        ClienteHotel C;
        HabitacionHotel h;
        System.out.println("Ingrese la fecha de la reservacion");
        Fecha=Info();
        ListarCliente(H);
        System.out.println("Ingresa el índice del Cliente");
        C=H.getClienteHotel(Opcion());
        ListarHabiacionHotel(H);
        System.out.println("Ingresa el índice de la habitación");
        h=H.getHabitacionHotel(Opcion());
        Aux=new ReservacionHotel();
        Aux.setFecha(Fecha);
        Aux.setHabitacionHotel(h);
        Aux.setClienteHotel(C);
        H.addReservacionHotel(Aux);
    }      
//Codigo Reservaciones Profesor ISRAEL

    
    public static void MenuCliente(Hotel H)
    {
        int opc;
        do
        {
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Listar Clentes");
        System.out.println("3. Eliminar Clientes");
        System.out.println("9. Regresar"); 
        opc=Opcion();
            switch(opc)
            {
                case 1 -> AgregarCliente(H);
                case 2 -> ListarCliente(H);
                case 3 -> EliminarCliente(H);
            }
        }while(opc!=9);
    }
    
    public static void AgregarCliente(Hotel H)
    {
        int edad;
        String nombre;
        ClienteHotel C;
        C=new ClienteHotel();
        System.out.println("Nombre del Cliente");
        nombre=Info();
        System.out.println("Edad del Cliente");
        edad=Opcion();
        C.AsignarNombre(nombre);
        C.AsignarEdad(edad);
        H.addClienteHotel(C);        
    }
    
     public static void ListarCliente(Hotel H)
    {
        int Num,i;
        Num=H.sizeClienteHotel();
        for(i=0;i<Num;i++)
        {
            ClienteHotel Aux;
            Aux=H.getClienteHotel(i);
            System.out.println(i+" "+Aux.ObtenerNombre()+"Edad"+Aux.ObtenerEdad());
        }
    }  
     
       public static void EliminarCliente(Hotel H)
    {
        int index;
        System.out.println("Ingresa el indice del Cliente");
        index=Opcion();
        H.removeClienteHotel(index);
    }

//Ejercicio 01 - Gestión de un Hotel -> 2. Alta y baja de habitaciones (Realizado por el estudiante)
        
         public static void MenuHabitacionesHotel(Hotel H)
    {
        int opc;
        do
        {
        System.out.println("1. Agregar Habitación");
        System.out.println("2. Listar Habitación");
        System.out.println("3. Eliminar Habitación");
        System.out.println("9. Regresar"); 
        opc=Opcion();
            switch(opc)
            {
                case 1 -> AgregarHabitacionHotel(H);
                case 2 -> ListarHabiacionHotel(H);
                case 3 -> EliminarHabitacionHotel(H);
            }
        }while(opc!=9);
    }
    
    public static void AgregarHabitacionHotel(Hotel H)
    {
        int NumCamas;
        int IDCuarto;
        HabitacionHotel HH;
        HH=new HabitacionHotel();
        System.out.println("Numero de Camas");
        NumCamas=Opcion();
        System.out.println("Numero de Habitación");
        IDCuarto=Opcion();
        HH.setNumCamas(NumCamas); 
        HH.setIDCuarto(IDCuarto);   
        H.addHabitacionHotel(HH);
    }
    
     public static void ListarHabiacionHotel(Hotel H)
    {
        int Num,i;
        Num=H.sizeHabitacionHotel();
        for(i=0;i<Num;i++)
        {
            HabitacionHotel Aux;
            Aux=H.getHabitacionHotel(i);
            System.out.println(i+" Habitacion No: "+Aux.getNumCamas()+" Número de Camas: "+Aux.getIDCuarto());
        }
    }  
       public static void EliminarHabitacionHotel(Hotel H)
    {
        int index;
        System.out.println("Ingresa el número de Habitación");
        index=Opcion();
        H.removeHabitacionHotel(index);
    }
       
//IMPLEMENTACIÓN DE LAS CLASES EHEREDADAS EN EL MAIN 
       //HOTELV2
       
        
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
}                                               //JEVG
*/