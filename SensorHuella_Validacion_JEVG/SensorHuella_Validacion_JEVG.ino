/*
ACCESO HUELLA - JEVG  
    CONEXIONES
ARDUINO 1  SENSOR   LED
  5V        V+
  2         TX      
  3         RX
  GND       GND     GND
  5                 SEÑAL
  
*/


#include <Adafruit_Fingerprint.h>    // Libreria  para el Sensor de huella dactilar


SoftwareSerial mySerial(2, 3);     // Crear Serial para Sensor  Rx, TX del Arduino
Adafruit_Fingerprint finger = Adafruit_Fingerprint(&mySerial);  // Crear el objeto Finger comunicacion pin 2 , 3 

void setup()  
{
  pinMode(5, OUTPUT);
  Serial.begin(9600);
  while (!Serial);       //  Yun/Leo/Micro/Zero/...
  delay(100);
  Serial.println("Sistema de apertura con huella dactilar");
  delay(1000);
  // set the data rate for the sensor serial port
  finger.begin(57600);  // inicializa comunicacion con sensor a 57600 Baudios
  delay(500);
  if (finger.verifyPassword())
  {
    Serial.println("Detectado un sensor de huella!");
    delay(1000);
  } 
  else 
  {
    Serial.println("No hay comunicacion con el sensor de huella");
    Serial.println("Revise las conexiones");
    delay(1000);
    while (1) { delay(1); }
  }

  finger.getTemplateCount();
  Serial.print("El sensor contiene "); Serial.print(finger.templateCount); Serial.println(" plantillas");
  Serial.println("Esperando por una huella valida...");
  delay(2000);
}

void loop()                    
{
  getFingerprintIDez();
  delay(50);            //retardo de 50 milisegundos entre lecturas
}

void EncenderLedValidacion() 
{
  Serial.println("        BIENVENIDO      "); 
  delay(800);
  Serial.println("HUELLA AUTORIZADA"); 
  digitalWrite(5, HIGH);   // Encender led
  delay(1000);
  //digitalWrite(5, LOW);     // Apagar Led
}


void Mal_Registro() 
{      // Activa otro led rojo
  Serial.println(" HUELLA DENEGADA *** "); 
  digitalWrite(7, HIGH);
  delay(200);
  digitalWrite(7, LOW);
  delay(100);
  digitalWrite(7, HIGH);
  delay(200);
  digitalWrite(7, LOW);
  Serial.println(" INTENTA NUEVAMENTE *** "); 
}

int getFingerprintIDez() 
{
  uint8_t p = finger.getImage();
  if (p != FINGERPRINT_OK)  return -1;

  p = finger.image2Tz();
  if (p != FINGERPRINT_OK)  return -1;

  p = finger.fingerFastSearch();
  if (p != FINGERPRINT_OK) { 
    Mal_Registro();
    return -1;
  }
  // Si hay coincidencias de huella
  Serial.print("ID #"); Serial.print(finger.fingerID); 
  Serial.print(" coincidencia del "); Serial.println(finger.confidence);
   if(finger.fingerID==2){
     SoftwareSerial mySerial(3,HIGH); 
     EncenderLedValidacion();
   }
  SoftwareSerial mySerial(3,LOW);
  return finger.fingerID; 
}
