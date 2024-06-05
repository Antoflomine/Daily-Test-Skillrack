import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLong();
		    String a=Long.toBinaryString(arr[i]);
		  //  System.out.println(a);
		    String re=String.format("%32s",a).replace(' ','0');
		   // System.out.println(re);
		    StringBuilder toogle=new StringBuilder();
		   for(int j=0;j<re.length();j++){
		       if(re.charAt(j)=='0'){
		          toogle.append('1');
		       }
		       else{
		           toogle.append('0');
		       }
		   }
		   //System.out.println(toogle);
		   long res=Long.parseLong(toogle.toString(),2);
		   System.out.println(res);
		}
	//	System.out.print(Arrays.toString(arr));

	}
}
