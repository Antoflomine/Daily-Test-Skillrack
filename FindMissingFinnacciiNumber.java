import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
		    for(int j=0; j<num-1; j++) {
		        if(arr[j] > arr[j+1]) {
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
	//	System.out.println(Arrays.toString(arr));
		int[] fibArray = new int[num];
		fibArray[0] = arr[0]; //2
		fibArray[1] = arr[1]; //5
		for(int i=2; i<num; i++) {
		   
		        fibArray[i] = fibArray[i-1] + fibArray[i-2];
		 
		}
		//System.out.println(Arrays.toString(fibArray));
		int count = 0;
		for(int i=0; i<num; i++) {
		    if(arr[i] != fibArray[i] && arr[i]+arr[i-1]==fibArray[i]) {
		        System.out.println(fibArray[i]);
		        return;
		    }
		    else if(arr[i]!=fibArray[i] && arr[i]+arr[i-1]!=fibArray[i]){
		        System.out.println(arr[i]-arr[i-1]);
		        return;
		    }
		    else if(arr[i]==fibArray[i]) {
		        count++;
		    }
		   
		}
		if(count == num) {
		    System.out.println(arr[num-1]);
		}
	}
}
