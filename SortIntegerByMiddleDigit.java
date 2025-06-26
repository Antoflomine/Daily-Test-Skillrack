import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-1;j++){
		        if(arr[j].charAt(arr[j].length()/2)>arr[j+1].charAt(arr[j+1].length()/2)){
		            String t=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=t;
		        }
		        else if( arr[j].charAt(arr[j].length()/2)==arr[j+1].charAt(arr[j+1].length()/2)){
		            if(Long.parseLong(arr[j])> Long.parseLong(arr[j+1])){
		                String t=arr[j];
		                arr[j]=arr[j+1];
		                arr[j+1]=t;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	}
}
