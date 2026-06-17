public class Algorithms {
    public static int linearSearch(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public static int binarySearch(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var0.length - 1;

      while(var2 <= var3) {
         int var4 = (var2 + var3) / 2;
         if (var0[var4] == var1) {
            return var4;
         }

         if (var0[var4] < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      return -1;
   }
}
