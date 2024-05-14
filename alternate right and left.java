import java.util.*;
public class Hello {

    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 int max=0,id=0;
	 for(int i=0;i<n;i++){
	     arr[i]=sc.nextInt();
	     if(max<arr[i]){
	         max=arr[i];
	         id=i;
	     }
	 }
	 System.out.print(max+" ");
	 int a=id-1;
	 int b=id+1;
	 
	 while(a>=0 || b<n){
	     if(a>=0){
	         System.out.print(arr[a]+" ");
	         a--;
	     }
	     if(b<n){
	         System.out.print(arr[b]+" ");
	         b++;
	     }
	 }
	 

	}
}
