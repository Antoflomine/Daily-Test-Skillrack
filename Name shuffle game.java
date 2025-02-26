import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] f=new String[n];
		String[] l=new String[n];
		int fi=0,li=0;
		for(int i=0;i<n;i++){
		    String a=sc.nextLine();
		    String[] s=a.split(" ");
		    //System.out.println(Arrays.toString(s));
		    f[fi++]=s[0];
		    l[li++]=s[1];
		}
	//	System.out.println(Arrays.toString(f));
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1;j++){
	        if(f[j].charAt(0)> f[j+1].charAt(0)){
	            String t=f[j];
	            f[j]=f[j+1];
	            f[j+1]=t;
	        }
	        }
	    }
	   // System.out.println(Arrays.toString(f));
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1;j++){
	            if(l[j].charAt(l[j].length()-1)> l[j+1].charAt(l[j+1].length()-1)){
	                String t=l[j];
	                l[j]=l[j+1];
	                l[j+1]=t;
	                
	            }
	        }
	    }
	    //System.out.println(Arrays.toString(l));
	  
	    for(int i=0;i<n;i++){
	        System.out.println(f[i]+" "+l[i]);
	    }

	}
}
