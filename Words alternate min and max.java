import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int n=arr.length;
		int i=0,j=arr.length-1;
		
		while(i<n/2){
		    if(i%2==0){
		        if(arr[i].length()<arr[j].length()){
		            System.out.print(arr[i]+" ");
		        }
		        else if(arr[i].length()==arr[j].length()){
		            System.out.print(arr[i]+" "+arr[j]+" ");
		        }
		        else{
		            System.out.print(arr[j]+" ");
		        }
		    }
		    else{
		        if(arr[i].length()>arr[j].length()){
		            System.out.print(arr[i]+" ");
		        }
		        else if(arr[i].length()==arr[j].length()){
		            System.out.print(arr[i]+" "+arr[j]+" ");
		        }
		        else{
		            System.out.print(arr[j]+" ");
		        }
		    }
		    i++;
		    j--;
		}

	}
}
