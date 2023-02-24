public class exArrayResuelto_RafaGalvan_1 {
   public static void main(String[] args) {
       int[] array = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};

       int max = findMax(array);
       replaceDuplicates(array, max);
       printArray(array);
   }

   public static int findMax(int[] array) {
       int max = array[0];
       for (int i = 1; i < array.length; i++) {
           max = Math.max(max, array[i]);
       }
       return max;
   }

   public static void replaceDuplicates(int[] array, int max) {
       for (int i = 0; i < array.length; i++) {
           if (array[i] != max) {
               for (int j = i + 1; j < array.length; j++) {
                   if (array[i] == array[j]) {
                       array[j] = max + 1;
                       max++;
                   }
               }
           }
       }
   }

   public static void printArray(int[] array) {
       for (int i = 0; i < array.length; i++) {
           System.out.print(" " + array[i] + " ");
       }
       System.out.println();
   }
}

