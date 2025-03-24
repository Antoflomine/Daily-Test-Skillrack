import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
		    for(int j=0; j<arr.length-1; j++) {
		        if(arr[j] > arr[j+1]) {
		            char ch = arr[j];
		            arr[j] = arr[j+1];
		           arr[j+1] = ch;
		        }
		    }
		}
	//	System.out.println(Arrays.toString(arr));
		int res=0;
	
		    int count=0;
		    
		for(int i=0;i<arr.length-1;i++){
		    if(arr[i+1]-arr[i]==1){
		        count++;
		    }
		    else{
		        if(count>0){
		            res++;
		        }
		        count=0;
		    }
		}
		if(count>0){
		    res++;
		}
		if(res==0){
		    System.out.println("-1");
		}
		else{
		System.out.println(res);
		}
		
	}
}
