package ch04_pro09;

class ArrayUtil {
	   public static int[] concat(int[] a, int[] b) {
	      int tmp[] = new int[a.length+b.length];
	      int i=0;
	      for(; i<a.length; i++) {
	         tmp[i] = a[i];
	      }
	      
	      for(;i<a.length+b.length;i++) {
	         tmp[i] = b[i-a.length];
	      }
	      return tmp;
	      
	   }
	   public static void print(int[] a) { 
	      System.out.print("[");
	      for(int i=0; i<a.length;i++) {
	         System.out.print(" "+a[i]+" ");
	      }
	      System.out.print("]");
	   }
	}