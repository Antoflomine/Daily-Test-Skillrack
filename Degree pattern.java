import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=sc.nextInt();
		
		int u=str.length();
		StringBuilder sb=new StringBuilder(str).reverse();
		String g=sb.toString();
		
		if(x==0  || x==360){
		    System.out.println(str);
		    
		}
		else if(x==45){
		    for(int i=0;i<u;i++){
		        for(int j=0;j<=i;j++){
		            if(j==i){
		                System.out.print(str.charAt(j));
		            }
		            else{
		            System.out.print("*");
		            }
		        }
		        System.out.println();
		    }
		}
		else if(x==90){
		    for(int i=0;i<u;i++){
		        System.out.println(str.charAt(i));
		    }
		}
		else if(x==135){
		    
		    for(int i=0;i<u;i++){
		        for(int j=i;j<u;j++){
		            if(j==u-1){
		                System.out.print(str.charAt(i));
		                
		            }
		            else{
		            System.out.print("*");
		            }
		        }
		        System.out.println();
		    }
		}
		else if(x==180){
		    for(int i=str.length()-1;i>=0;i--){
		        System.out.print(str.charAt(i));
		    }
		}
		else if(x==225){
		   
		    for(int i=0;i<u;i++){
		        for(int j=0;j<=i;j++){
		            if(j==i){
		                System.out.print(g.charAt(j));
		            }
		           else{
		            System.out.print("*");
		           }
		        }
		        System.out.println();
		    }
		}
		else if(x==315){
		    for(int i=0;i<u;i++){
		        for(int j=i;j<u;j++){
		            if(j==u-1)
		            System.out.print(g.charAt(i));
		            else{
		                System.out.print("*");
		            }
		        }
		        System.out.println();
		    }
		}
		else if(x==270){
		    for(int i=0;i<g.length();i++){
		        System.out.println(g.charAt(i));
		    }
		}

	}
}
