import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s);
		String[] a=s.split("\\*");
	//System.out.println(Arrays.toString(a));
		String res="";
		for(int i=0;i<a.length;i++){
		    if(a[i].length()<=2){
		        int y=Integer.parseInt(a[i]);
		        res+=(char)(y+97);
		    }
		    else{
		        char b=s.charAt(s.length()-1);
		       // System.out.println(b);
		      
		       if((i==a.length-1 && (b=='*'))||(i!=a.length-1)){
		            
		       
		        for(int j=0;j<a[i].length()-2;j++){
		            int y=Character.getNumericValue(a[i].charAt(j));
		            res+=(char)(y+97);
		        }
		        int y=Integer.parseInt(a[i].substring(a[i].length()-2));
		        res+=(char)(y+97);
		       }
		    
		       else{
		           for(int j=0;j<a[i].length();j++){
		               int y=Character.getNumericValue(a[i].charAt(j));
		               res+=(char)(y+97);
		           }
		       }
		
		        
		    }
		}
		System.out.println(res);

	}
}
