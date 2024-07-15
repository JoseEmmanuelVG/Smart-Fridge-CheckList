/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.clase1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class AppBanco {                                                         //JEVG
        public static void main(String[]rgs)
        {
            int opc;
            Banco Principal;
            Principal=new Banco ();
            Principal.AsignarDatosdelBanco("Banco UPIITA", "Avenida Instituto Politecnico Nacional");
            do
            {
                System.out.println("Aplicación Banco");
                System.out.println("1. Agregar el cliente");
                System.out.println("2. Seleccionar cliente");
                System.out.println("3. Listar clientes");
                System.out.println("9. Salir");
                opc=Seleccion();
                
                switch(opc)
                {
                    case 1 -> AgregarCliente(Principal);
                    case 2 -> SeleccionarCliente(Principal);
                    case 3 -> ListarCliente(Principal);
                }
            
            } while(opc!=9);
        }
        public static void AgregarCliente(Banco B)
        {
            String Nombre;
            int Edad;
            System.out.println("Ingrese el nombre del cliente");
            Nombre=Informacion();
            System.out.println("Ingrese la edad del cliente");
            Edad=Seleccion();
            Cliente C;                  //Declaracion del objeto C de tipo Cliente
            C=new Cliente();            //Se crea el objeto de Tipo Cliente
            C.AsignarEdadCliente(Edad);
            C.AsignarNombreCliente(Nombre);
            B.AgregarCliente(C);         
        }
        
        public static void SeleccionarCliente(Banco B)
        {
            int opc;
            Cliente Aux;
            if (B.ObtenerNumClientes()==0)
            {
                System.out.println("No hay Clientes Registrados");
            }
            else
            {
                System.out.println("Ingrese el Numero de Cliente");
                opc=Seleccion();
                try
                {
                    Aux=B.ObtenerCliente(opc);
                }
                catch(IndexOutOfBoundsException e)
                {
                    Aux=null;
                }
                if(Aux!=null)
                {
                    OperacionCliente(Aux);
                }
                else
                {
                    System.out.println("Número de Cliente NO Valido");   
                }
            }
        }
        
        public static void OperacionCliente(Cliente C)
        {
            int opc;
            do
            {
                System.out.println("1. Agregar cuenta");
                System.out.println("2. Seleccionar cuenta");
                System.out.println("3. Listar cuentas");
                System.out.println("9. Salir");
                opc=Seleccion();
                switch (opc)
                {
                    case 1 -> AgregarCuenta(C); 
                    case 2 -> SeleccionarCuenta(C);
                    case 3 -> ListarCuentas(C);
                }
            }while(opc!=9);
        }
        
        public static void AgregarCuenta(Cliente C)
        {
            int Opcion1, Opcion2;
            String Clave;
            Cuenta Aux;
            System.out.println("Seleccione el tipo de cuenta");
            System.out.println("1. Cuenta de Ahorro");
            System.out.println("1. Cuenta de Inversión");
            System.out.println("1. Cuenta de Crédito");
            Opcion2=Seleccion();
            System.out.println("Ingrese el Número de Cuena");
            Opcion1=Seleccion();
            switch(Opcion2)
            {
                case 1 -> 
                { 
                    CuentaAhorro CA;
                    CA=new CuentaAhorro();
                    System.out.println("Ingrese nueva Clave");
                    Clave=Informacion();
                    CA.setClave("1234", Clave);
                    C.AgregarCuenta(CA);
                }
                case 2 -> 
                {
                    CuentaInversionISR CI;
                    CI=new CuentaInversionISR(0.15,0.07);
                    CI.AsignarNumeroCuenta(Opcion2);
                    C.AgregarCuenta(CI);
                }
               case 3 -> 
                {
                    CuentaCredito CC;
                    CC=new CuentaCredito();
                    CC.SetLimit(10000);
                    C.AgregarCuenta(CC);
                }
                default: {
                }
}
            System.out.println("Ingrese el número de cuenta:");
            opc=Seleccion();
            Aux=new Cuenta();
            if(Aux.AsignarNumeroCuenta(opc))
            {
            C.AgregarCuenta(Aux);   
            }
            else
            {
            System.out.println("No se agrego cuenta al cliente");   
            }                                 
        } 
        
        public static void SeleccionarCuenta(Cliente C)
        {
            int opc;
            Cuenta Aux;
            if (C.ObtenerNumCuentas()==0)
                System.out.println("El cliente no tiene cuentas asignadas");
            else
            {
                ListarCuentas(C);
                System.out.println("Seleccione el indice de la cuenta:");
                opc=Seleccion();
                Aux=C.ObtenerCuenta(opc);
                    if (Aux!=null)
                        OperacionCuenta(Aux);
                    else
                        System.out.println("Numero de cuenta no válido");
            }
        }
        
        public static void ListarCuentas(Cliente C)
        {
            int Tam,i;
            Tam=C.ObtenerNumCuentas();
            System.out.println("Cuentas registradas");
            for(i=0;i<Tam;i++)
            {
                Cuenta Aux;
                Aux=C.ObtenerCuenta(i);
                System.out.println(i+":"+Aux.ObtenerNumCuenta()+"Saldo:"+Aux.ObtenerSaldoCuenta());
            }
        }
        
        public static void OperacionCuenta(Cuenta C)
        {
            int opc;
            System.out.println("1. Abonar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Obtener Saldo");
            System.out.println("4. Calcular Utilidad Mensual (Cuentas de Inversion) ");
            System.out.println("5. Obtener ISR Retenido");
            opc=Seleccion();
            switch(opc)
            {
                case 1 -> AbonarenCuenta(C);
                case 2 -> RetirarDinero(C);
                case 3 -> ObtenerSaldo(C);
                case 4 -> CalcularGanancias(C);
                case 5 -> ObtenerISRRetenido(C);
            }
        }
        
        public static void ObtenerISRRetenido(Cuenta C)
        {
            if(C instanceof ObtenerISRRetenido)
            {
                double ISRRetenido;
                ISRRetenido=((Cuenta))
                CuentaInversion.CalcularUtilidadMensual);                
            }
            else
            {
            System.out.println("No es una Cuenta de Inversion");    
            }
        }
        
        public static void CalcularGanancias(Cuenta C)
        {
            if(C instanceof CuentaInversion)
            {
                CuentaInversion.CalcularUtilidadMensual);                
            }
            else
            {
            System.out.println("No es una Cuenta de Inversion");    
            }
        }
        
        public static void AbonarenCuenta(Cuenta C)
        {
            double Dinero;
            Scanner Cantidad;
            Cantidad=new Scanner(System.in);
            System.out.println("Ingrese la cantida a abonar:");
            Dinero=Cantidad.nextDouble();
            if (C.AbonarDinero(Dinero))
                System.out.println("Transaccion realizada");
            else
                System.out.println("No se realizo la transaccion");
        }
        
        public static void RetirarDinero(Cuenta C)
        {
            String Clave;
            double Dinero;
            Scanner Cantidad;
            Cantidad=new Scanner(System.in);
            System.out.println("Ingrese la cantida a retirar:");
            Dinero=Cantidad.nextDouble();
            if (C instanceof CuentaAhorro cuentaAhorro)
            {
              System.out.println("Ingrese la Clave"); 
              Clave=Informacion();
                cuentaAhorro.RetirarDinero(Dinero, Clave);
            }
                
            else
            {            
            if (C.RetirarDinero(Dinero))
            System.out.println("Transaccion realizada");
            else
            System.out.println("No se realizo la transaccion");
            }
        }
        
        public static void ObtenerSaldo(Cuenta C)
        {
            System.out.println("El saldo actual es:"+C.ObtenerSaldoCuenta());
        }
                                         
         public static void ListarCliente(Banco B)
        {
            int Tam, i;
            Tam=B.ObtenerNumClientes();
            if(Tam==0)
            {
                System.out.println("No hay clientes Registrados");
            }
            else
            {
            for(i=0;i<Tam;i++)
            {
                Cliente Aux;
                Aux=B.ObtenerCliente(i);
                System.out.println(i+" "+Aux.ObtenerNombreCliente()+" "+Aux.ObtenerEdadCliente());
            }
            }
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
                return Teclado.nextInt();
        }
}                                                                               //JEVG
