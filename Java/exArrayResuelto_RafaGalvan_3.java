public class exArrayResuelto_RafaGalvan_3 {

   static final int max=24;
   public static void main(String[] args) {
       int[][] matriz=new int[5][10];
       rellenar(matriz);
       imprimir(matriz);
       cambiar(matriz);
       imprimir(matriz);
   }
   /**
    * rellena un matriz de numero aleatorio entre 0 y 4
    * @param matriz
    */
   static void rellenar(int[][]matriz){
       for (int fila = 0; fila < matriz.length; fila++) {
           for (int columna = 0; columna < matriz[fila].length; columna++) {
               int random=(int)(Math.random()*5);
               matriz[fila][columna]=random;
           }
       }
   }
   static void imprimir(int[][] matriz){
       //imprimir la fila
       for (int fila = 0; fila < matriz.length; fila++) {
           //imprimir el numero de fila
           System.out.print("Fila "+(fila+1)+": ");
           //imprimir los numeros
           for (int columna = 0; columna < matriz[fila].length; columna++) {
               System.out.print(matriz[fila][columna]+"\t");
           }
           //imprimir el tot
           System.out.println("| == "+sumaFila(matriz[fila]));
       }
       System.out.println("------------------------------------------------------------------------------------------------");
       //imprimir el resultado de columna
       System.out.print("\t");
       for (int columna = 0; columna < matriz[0].length; columna++) {
           int tot=0;
           for (int fila = 0; fila < matriz.length; fila++) {
               tot=matriz[fila][columna];
           }
           System.out.print(tot+"\t");
       }
       System.out.println();
   }
   /**
    * cambiar la matriz para que la suma de cada fila sea 24 cuando hay 0 y que no es 24
    * @param matriz
    */
   static void cambiar(int[][]matriz){
       for (int fila = 0; fila < matriz.length; fila++) {
           //declarar como double para redondearlo hacia arriba
           double numCero=contarZero(matriz[fila]);
           for (int columna = 0; columna < matriz[fila].length; columna++) {
               if (matriz[fila][columna]==0) {
                   // cambiar el 0 por el numero deseado;
                   int tot=sumaFila(matriz[fila]);
                   int num=(int)Math.ceil((max-tot)/numCero);
                   System.out.println(num);
                   matriz[fila][columna]=num;
                   numCero--;
               }
           }
       }
   }
   /**
    * devuelve el total de un array
    * @param array
    * @return
    */
   static int sumaFila(int[] array){
       //tot de la fila
       int tot=0;
       for (int i = 0; i < array.length; i++) {
           tot+=array[i];
       }
       return tot;
   }
   /**
    * conta la cantidad de 0 en un array
    * @param array
    * @return
    */
   static int contarZero(int[] array){
       int cantidad=0;
       for (int i = 0; i < array.length; i++) {
           if (array[i]==0) {
               cantidad++;
           }
       }
       return cantidad;
   }
  }

