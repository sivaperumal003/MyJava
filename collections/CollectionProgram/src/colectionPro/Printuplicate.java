package colectionPro;

import java.util.Arrays;

public class Printuplicate {

	public static void main(String[] args) {
		
      double d[]= {2.1,3.13,4.1};
      int a[]=new int[d.length];
      double b[]=new double[d.length];
      
      for(int i=0;i<d.length;i++) {
    	  int a1=(int)d[i];
    	  a[i]=a1;
    	  
    	  double b1=(d[i]-a1);
    	  b[i] = Math.round(b1 * 100.0) / 100.0;;
      }
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
	}

}
