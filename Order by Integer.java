import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] arr=new int[a];
		int[] brr=new int[b];
		
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++){
		    brr[i]=sc.nextInt();
		}
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<b;i++){
		   
		    for(int j=0;j<a;j++){
		        if(brr[i]==arr[j]){
		            
		            System.out.print(brr[i]+" ");
		        }
		      
		       
		    }
		}
		for(int i=0;i<a;i++){
		    int c=0;
		    for(int j=0;j<b;j++){
		        if(arr[i]!=brr[j]){
		            c++;
		        }
		    }
		    if(c==b){
		        li.add(arr[i]);
		    }
		  //System.out.println(c);
		}
		Collections.sort(li);
		for(int u:li){
		    System.out.print(u+" ");
		}
//System.out.println(li);

	}
}
