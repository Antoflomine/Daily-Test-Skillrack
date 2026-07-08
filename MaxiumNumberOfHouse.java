import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	 
	    int N=sc.nextInt();
	    sc.nextLine();
	   int[] arr=new int[N];
	   int max=0;
	    for(int i=0;i<N;i++){
	        String s=sc.nextLine();
	        int c=0;
	        for(int j=0;j<s.length();j++){
	            if(s.charAt(j)=='-'){
	                c++;
	            }
	        }
	        if(max<c){
	            max=c;
	        }
	        arr[i]=c;
	    }
	    
	    for(int i=0;i<N;i++){
	        if(arr[i]==max){
	            System.out.println(i+1);
	        }
	    }
	    
// 		System.out.println(max);
	}
}
