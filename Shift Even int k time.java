import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++){
		    arr=shiftEven(arr);
	//	System.out.println(Arrays.toString(arr));
	for(int j=0;j<n;j++){
	    System.out.print(arr[j]+" ");
	}
	System.out.println();
		}
        
	}
	public static int[] shiftEven(int[] number){
	    Queue<Integer> evenNumber=new LinkedList<>();
	    for(int num:number){
	        if(num%2==0){
	            evenNumber.add(num);
	        }
	    }
	    if(evenNumber.size()>1){
	        int first=evenNumber.poll();
	        evenNumber.add(first);
	    }
	    
	    int[] shifted=Arrays.copyOf(number,number.length);
	    for(int i=0;i<number.length;i++){
	        if(shifted[i]%2==0){
	            shifted[i]=evenNumber.poll();
	        }
	    }
	    return shifted;
	}
}
