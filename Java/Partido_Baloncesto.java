package Java;

import java.util.Random;

public class Partido_Baloncesto {
    
      //Variables de los equipos
      final static int E1_ACIERTO_2 = 70;
      final static int E2_ACIERTO_2 = 75;
  
      final static int E1_ACIERTO_3 = 45;
      final static int E2_ACIERTO_3 = 35;
  
      final static int E1_JUEGA_DE_2 = 60;
      final static int E2_JUEGA_DE_2 = 70;
  
      final static int E1_REBOTE_DEF = 60;
      final static int E1_REBOTE_ATA = 30;
  
      final static int E2_REBOTE_DEF = 70;
      final static int E2_REBOTE_ATA = 40;
  
      public static void main(String[] args) {
          
          int puntosE1;
          int puntosE2;
  
          System.out.println("Empieza la simulación del partido de baloncesto");
  
          //salto Inicial
          String turno  = salto();
          System.out.println("Ataca el equipo: " + turno);
  
          //Un partido de baloncesto hay unas 150 posesiones de media.
          for(int posesion = 0; posesion < 150; posesion++)
          {
            int valorAtaque = canasta(turno);
              
  
              //Si hay canasta entonces el turno es del equipo que estaba defendiendo
              if (valorAtaque>0)
              {
                  if (turno.equals("E1"))
                  {
                      puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
                  }
                  else
                  {
                      puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
                  }
  
                  System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");

                  imprimirResultado(puntosE1, puntosE2);
                  turno = siguienteTurno(turno);
                  System.out.println("Ataca el equipo: " + turno);
              }
              else 
              {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
              }
          }
          System.out.println("-------------------------");
          System.out.println("FIN de partido");
          imprimirResultado(puntosE1, puntosE2);
  
  
      }
  
  
  
          //Funciones que necesito programar
          /*
          salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
          canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3) 
          actualizarPuntos(valorAcumulado, valorAIncrementar)  
          canasta(tipoTiro, porcentaje) ---> dado un tipo de tiro y el % de acierto devuelve true si hay canasta y false si no     
          tipoTiro() --> devuelve el tipo de tiro que va a realizar el equipo (tiro2 o tiro3)
          tipoTiro(int porcentaje2, int porcentaje3) -> devuelve el tipo de tiro que se produce según los porcentajes indicados
          rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
          rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
                El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo.
          aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
          aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
          imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
          */
      

        public static String salto() {
            Random random = new Random();
            int numero = random.nextInt(2);
            if (numero == 0) {
                return "E1";
            } else {
                return "E2";
            }
        }
    public static int canasta(String turno) {
        Random random = new Random();
        int numero = random.nextInt(100);
        if (turno.equals("E1")) {
            if (numero <= E1_ACIERTO_2) {
                return 2;
            } else if (numero <= E1_ACIERTO_2 + E1_ACIERTO_3) {
                return 3;
            } else {
                return 0;
            }
        } else {
            if (numero <= E2_ACIERTO_2) {
                return 2;
            } else if (numero <= E2_ACIERTO_2 + E2_ACIERTO_3) {
                return 3;
            } else {
                return 0;
            }
        }
    }

    public static int actualizarPuntos(int puntos, int valor) {
        return puntos + valor;
    }

    public static void imprimirResultado(int puntosE1, int puntosE2) {
        System.out.println("Resultado: E1 " + puntosE1 + " - E2 " + puntosE2);
    }

    public static String siguienteTurno(String turno) {
        if (turno.equals("E1")) {
            return "E2";
        } else {
            return "E1";
        }
    }

    public static String rebote(String equipoAtaque, Random random) {
        random = new Random();
        int numero = random.nextInt(100);
        if (equipoAtaque.equals("E1")) {
            if (numero <= E1_REBOTE_ATA) {
                return equipoAtaque;
            } else {
                return "E2";
            }
        } else {
            if (numero <= E2_REBOTE_ATA) {
                return equipoAtaque;
            } else {
                return "E1";
            }
        }
    }

}

//     public static int canasta(String turno, Random r) {
//         int tipoTiro = tipoTiro(r);
//         int acierto;

//         if (turno.equals("E1"))
//         {
//             if (tipoTiro == 2)
//             {
//                 acierto = E1_ACIERTO_2;
//             }
//             else {
//                 acierto = E1_ACIERTO_3;
//             }
//         }
//         else
//         {
//             if (tipoTiro == 2)
//             {
//                 acierto = E2_ACIERTO_2;
//             }
//             else {
//                 acierto = E2_ACIERTO_3;
//             }
//         }
//         if (aleatorio(r, 100) < acierto)
//         {
//             return tipoTiro;
//         }
//         else {
//             return 0;
//         }
//     }
  
//     public static int actualizarPuntos(int puntos, int valorAtaque)
//     {
//         return puntos + valorAtaque;
//     }
    
//     public static void imprimirResultado(int puntosE1, int puntosE2)
//     {
//         System.out.println("Puntos E1: " + puntosE1 + " - Puntos E2: " + puntosE2);
//     }
    
//     public static String siguienteTurno(String turno)
//     {
//         if (turno.equals("E1"))
//         {
//             return "E2";
//         }
//         else {
//             return "E1";
//         }
//     }
    
//     public static int tipoTiro(Random r)
//     {
//         if (aleatorio(r, 100) < E1_JUEGA_DE_2)
//         {
//             return 2;
//         }
//         else {
//             return 3;
//         }
//     }
    
//     public static String rebote(String equipoAtaque, Random r)
//     {
//         int reboteAtaque;
//         int reboteDefensa;

//         if (equipoAtaque.equals("E1"))
//         {
//             reboteAtaque = E1_REBOTE_ATA;
//             reboteDefensa = E2_REBOTE_DEF;
//         }
//         else {
//             reboteAtaque = E2_REBOTE_ATA;
//             reboteDefensa = E1_REBOTE_DEF;
//         }
//         if (aleatorio(r, 100) < reboteAtaque)
//         {
//             return equipoAtaque;
//         }
//         else {
//             return siguienteTurno(equipoAtaque);
//         }
//     }
    
//     public static int aleatorio(Random r, int maximo) {
//         return r.nextInt(maximo);
//     }
// }