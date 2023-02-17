package Java;

import java.util.Scanner;

public class tandaPenaltis {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int puntosCpu = 0;
      int puntosJugador = 0;

      System.out.println("Introduce tu nombre");
      char jugador = sc.next().charAt(0);

      System.out.println("Empieza la tanda de penaltis");

      do {

         int paradaCpu = (int)(Math.random() * 3 + 1);
         int ladoTiroCpu = (int)(Math.random() * 3 + 1);

         int tiroFueraRandom = (int)(Math.random() * 10 + 1);
         int tiroFuera = (int)(Math.random() * 2 + 1);

         System.out.println(jugador + " elige donde tirar (I(Izquierda), D(Derecha) o C(Centro))");
         char ladoTiro = sc.next().charAt(0);

         switch (ladoTiro) {

            case 'I':
            System.out.println(jugador + " decide tirar a la izquierda");
               break;
            
            case 'D':
            System.out.println(jugador + " decide tirar a la derecha");
               break;
   
            case 'C':
            System.out.println(jugador + " decide tirar al centro");
               break;
   
            default:
               System.out.println("Opcion no valida");
               break;
         }

         if (tiroFuera == tiroFueraRandom)
         {
            System.out.println(jugador + " ha tirado fuera");
         }
         else
         {

            if (paradaCpu == ladoTiro)
         {
            System.out.println("PARADA!!!");
         }
         else if (paradaCpu != ladoTiro)
         {
            ++puntosJugador;
            System.out.println("GOOOOOOOOL!!!");
         }
         else
         {
            System.out.println("Opcion no valida");
         }

         }
         

         System.out.println("CPU " + puntosCpu + " - " + jugador + " " + puntosJugador);

         switch (ladoTiroCpu) {

            case 1:
            ladoTiroCpu = 'I';
               break;
            
            case 2:
            ladoTiroCpu = 'D';
               break;
   
            case 3:
            ladoTiroCpu = 'C';
               break;
   
            default:
               System.out.println("Opcion no valida");
               break;
         }

         System.out.println(jugador + " intenta parar (I(Izquierda), D(Derecha) o C(Centro))");
         char parada = sc.next().charAt(0);

         if (tiroFuera == tiroFueraRandom)
         {
            System.out.println("CPU ha tirado fuera");
         }
         else
         {
         if (parada == ladoTiroCpu)
         {
            System.out.println("PARADA!!!");
         }
         else if (parada != ladoTiroCpu)
         {
            ++puntosCpu;
            System.out.println("GOOOOOOOOL!!!");
         }
         else
         {
            System.out.println("Opcion no valida");
         }
         }
         System.out.println("CPU " + puntosCpu + " - " + jugador + " " + puntosJugador);
         
      } while (puntosJugador == puntosCpu);


      sc.close();
   }

}