import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		StringBuilder str=new StringBuilder();
		for(int i=0;i<n;i++){ //2 
		    for(int j=0;j<arr[i];j++){ //
		        str.append(arr[i]); //2 2
		    }
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		//System.out.println(max);
		printStr(str);
		char y='1';
		int c=1;
		while(c<max){
		for(int i=0;i<str.length();i++){
		    if(y==str.charAt(i)){
		        str.setCharAt(i,'*');
		    }
		   
		}
		y++;
		c++;
		printStr(str);
		}
	}
	public static void printStr(StringBuilder str){
	    for(int i=0;i<str.length();i++){
	        System.out.print(str.charAt(i)+" ");
	    }
	    System.out.println();
	}
}
