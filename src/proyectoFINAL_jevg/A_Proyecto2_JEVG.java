/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;
// Proyecto Smart-Fridge-CheckList
// POFESOR: Israel V. C. 
// ALUMNO:  José Emmanuel V. G. 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user        //JEVG
 */
public class A_Proyecto2_JEVG 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException
    {
        // TODO code application logic here
        B_RegistroPrincipal SFC_JEVG;
        int opc;
        SFC_JEVG=new B_RegistroPrincipal();
        H_Inicio GUI;
        GUI = new H_Inicio();
        GUI.setB_RegistroPrincipal(SFC_JEVG);
        GUI.setVisible(true);    

                do
                {
                    System.out.println("Aplicación Smart-Fridge-CheckList");
                    System.out.println("BIENVENIDO");
                    System.out.println("1. Agregar un Nuevo Producto");
                    System.out.println("2. Listar tus Productos");
                    System.out.println("3. Seleccionar un Producto");
                    System.out.println("4. Visualiza tus Productos");
                    System.out.println("9. Salir");
                    opc=Seleccion();
                    switch(opc)
                    {
                        case 1: AgregarProducto(SFC_JEVG);
                        break;
                        case 2: ListarProductos(SFC_JEVG);
                        break;
                        case 3: SeleccionarProducto(SFC_JEVG);
                        break;
                        case 4: VisualizarProductos(SFC_JEVG);
                        break;
                    } 
                }while (opc!=9);
    }
    
    public static void VisualizarProductos(B_RegistroPrincipal RP)
    {
        System.out.println("La camara esta grabando lo siguiente ...");
    }   
        
    public static void AgregarProducto(B_RegistroPrincipal RP) throws ParseException
    {
    int opc;
    do
    {
        String Nombre, FechaEntrada, FechaCad;
        System.out.println("Ingresa el nombre del Producto");
        Nombre=Informacion();
        System.out.println("Ingrese la Fecha en la que introduces el Producto");
        //System.out.println("SIGUE EL FORMATO yyyy-MM-dd");
        System.out.println("SIGUE EL FORMATO dd-MM-yyyy");
        //System.out.println("EJEMPLO 2021-10-13, 13 de Octubre del 2021");
        System.out.println("EJEMPLO 13-10-2021, 13 de Octubre del 2021");
        FechaEntrada=Informacion();       
        System.out.println("Ingresa la Fecha de Caducidad");
        FechaCad=Informacion();
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date fechaEntrada=dateFormat.parse(FechaEntrada);
	Date fechaCad=dateFormat.parse(FechaCad);
        int DiasCad=(int) ((fechaCad.getTime()-fechaEntrada.getTime())/86400000);
        System.out.println("Tu producto caducara en:  "+DiasCad+" dias");
        
        System.out.println("Deseas agregar mas productos?");  
        System.out.println("SI = Presiona 1.   No = Presiona 9");  
        opc=Seleccion();

        C_Producto P;
        P = new C_Producto();
        P.AsignarNombre(Nombre);
        P.AsignarFechaEntrada(FechaEntrada);
        P.AsignarFechaCad(FechaCad);
        RP.AgregarProducto(P);
    }while (opc!=9);
    }   
    
    public static void ListarProductos(B_RegistroPrincipal RP) throws ParseException
    {
        int Tam,i;
        Tam = RP.ObtenerNumProducto();
        if (Tam==0)
            System.out.println("NO hay Productos registrados");
        else{
            System.out.println("Productos Registrados: ");
            for(i=0;i<Tam;i++){
                C_Producto Aux;
                Aux=RP.ObtenerProducto(i);
                System.out.println(i+" "+Aux.ObtenerNombre()+" Caduca en: "+Aux.DiasCad()+" dias");           
            } 
        }       
    }
    
    public static void SeleccionarProducto(B_RegistroPrincipal RP) throws ParseException
    {
        int opc;
        C_Producto Aux;
        if (RP.ObtenerNumProducto()==0)
            System.out.println("No hay Productos Registrados");
        else{
            ListarProductos(RP);
            System.out.println("Ingresa el Número de Producto");
            opc=Seleccion();
            Aux=RP.ObtenerProducto(opc);
            if (Aux!=null)
                OperacionProducto(Aux);
            else
                System.out.println("Numero de Producto");           
        }
    }
     
        public static void OperacionProducto(C_Producto P)
        {
            int opc;
            do{
                System.out.println("1. Agregar Tienda de Compra");
                System.out.println("2. Listar TRiendas");
                System.out.println("3. Seleccionar Tienda");
               // System.out.println("4. Tienda Recomendada");
                System.out.println("9. Salir");
                opc=Seleccion();
                switch (opc)
                {
                    case 1: AgregarTienda(P);
                    break;
                    case 2: ListarTiendas(P);
                    break;
                    case 3: SeleccionarTienda(P);
                    break;
                //    case 4 -> TiendasRecomendadas(P);
                    
                }
            }while(opc!=9);
        }
        
        public static void AgregarTienda(C_Producto P){
           int Opc, Precio;
           String Nombre;
           System.out.println("Cual es el tipo de tienda?");
           System.out.println("Las opciones de Tiendas son las Siguientes: ");
           System.out.println("1. Tienda Física");
           System.out.println("2. Tienda en Linea");
           System.out.println("3. Locales");
           Opc=Seleccion();
           System.out.println("Ingrese el Nombre de la Tienda");
           Nombre=Informacion();
           switch(Opc){
                case 1: { E_TiendaFisica TF;
                    TF=new E_TiendaFisica();
                    TF.AsignarNombre(Nombre);
                    System.out.println("Ingrese el ultimo precio de compra");
                    Precio=Seleccion();
                    TF.AsignarPrecio(Precio);
                    P.AgregarTienda(TF);
                    break;
                        }
                case 2: { F_TiendaLinea TL;
                    TL=new F_TiendaLinea();
                    TL.AsignarNombre(Nombre);
                    System.out.println("Ingrese el ultimo precio de compra");
                    Precio=Seleccion();
                    TL.AsignarPrecio(Precio);
                    P.AgregarTienda(TL);
                    break;
                }
                case 3: { G_TiendaLocal TLO;
                    TLO=new G_TiendaLocal();
                    TLO.AsignarNombre(Nombre);
                    System.out.println("Ingrese el ultimo precio de compra");
                    Precio=Seleccion();
                    TLO.AsignarPrecio(Precio);
                    P.AgregarTienda(TLO);
                    break;
                }
                default: System.out.println("NO se agrego ninguna Tienda");
           }
       }
        public static void ListarTiendas(C_Producto P)
       { 
           int Tam,i;
           Tam=P.ObtenerNumTiendas();
           System.out.println("Tiendas Registradas");
           for(i=0;i<Tam;i++){
               D_Tienda Aux;
               Aux=P.ObtenerTienda(i);
               System.out.println(i+"Tienda: "+Aux.ObtenerNombre()+"Saldo:");
           }
       }
        public static void SeleccionarTienda(C_Producto P)
        {
           int opc;
           D_Tienda Aux;
           if (P.ObtenerNumTiendas()==0)
               System.out.println("Este producto no tiene historial de Tiendas");
           else{
               ListarTiendas(P);
               System.out.println("Seleccione el indice de la Tienda:");
               opc=Seleccion();
               Aux=P.ObtenerTienda(opc);
               if (Aux!=null)
                   OperacionTienda(Aux);
               else
                   System.out.println("Numero de Tienda No valido");           
           }
       }
        
        
            public static void OperacionTienda(D_Tienda T)
            {
                int opc;
                System.out.println("1. Recomendacion de tienda");
                System.out.println("2. Calcula un presupuesto");
                System.out.println("3. Obten el precio real de tu producto");
                System.out.println("4. Ir a Tienda en Linea");
                opc=Seleccion();
                System.out.println("SIGUE EN IMPLEMENTACION ... ");
                switch (opc)
                {
                    case 1: TiendaRecomendada(T);
                    break;
                    case 2: Presupuesto(T);
                    break;
                    case 3: PrecioDescuento(T);
                    break;
                    /*case 4 -> 
                    if (T instanceof TiendaLinea)
                    {
                    IrTienda(T)((TiendaLinea)T);
                    }
                    else
                    System.out.println("No es unatienda en linea");
                    break;*/
                }
            }
              public static void IrTienda(F_TiendaLinea T)
            {
        
                 System.out.println("Indica la tienda a la que quieres ir");
            }  
            public static void PrecioDescuento(D_Tienda T)
            {
                 int Opc;
                 double PrecioInicial, NewPrecio, Descuento;
                 System.out.println("El precio indicado en un inicio o tenia descuento?");
                 System.out.println("Si es el caso, presiona 1. De no ser asi, presiona 9");
                 Opc=Seleccion();
                 do
                 {
                 System.out.println("Indica el descuento %");
                 Descuento=Seleccion();
                 System.out.println("¿Cual fue el precio del producto?");
                 PrecioInicial=Seleccion();
                 NewPrecio = (PrecioInicial)+((PrecioInicial*Descuento)/100);
                 System.out.println("El precio sin descuento es de : "+ "\n$"+NewPrecio);
                 
                 System.out.println("Deseas calcular otro precio?");
                 System.out.println("Si es el caso, presiona 1. De no ser asi, presiona 9");
                 Opc=Seleccion();
                 }while(Opc!=9);
            }  
              public static void TiendaRecomendada(D_Tienda T)
            {
        
                 System.out.println("De acuerdo a los precios que has guardado, lamejor tienda para tu producto es ... ");
            }  
                public static void Presupuesto(D_Tienda T)
            {
                int Presupuesto; 
                 System.out.println("Agrega un presupuesto de gasto en productos");
                 Presupuesto=Seleccion();
                 System.out.println("De acuerdo con tu presupuesto, tu pueds comprar X cantidad en las siguientes tiendas: ");
            }  
    
    public static int calcularDias(int dia, int mes, int anio)
    {
            Calendar inicio = Calendar.getInstance();
            inicio.set(anio,mes-1, anio);
            inicio.set(Calendar.HOUR, 0);
            inicio.set(Calendar.HOUR_OF_DAY,0);
            inicio.set(Calendar.MINUTE, 0);
            inicio.set(Calendar.SECOND,0);
            
            Calendar actual = Calendar.getInstance();
            actual.set(Calendar.HOUR, 0);
            actual.set(Calendar.HOUR_OF_DAY,0);
            actual.set(Calendar.MINUTE, 0);
            actual.set(Calendar.SECOND,0);
            
            long finMS = actual.getTimeInMillis();
            long inicioMS = inicio.getTimeInMillis();
            
            int dias = (int) (Math.abs(finMS - inicioMS) / (1000 * 60 * 60 * 24));
            
            return dias;
    }        
            
    public static int Seleccion()
    {
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextInt();
    }
    public static String Informacion(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
    }   
}
