import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<n;i++){
		    if(arr[i]>max){
		       
		       max=arr[i];
		       index=i;
		    }
		}
		
	//System.out.println(max);
	
	int l=index-1;
	int r=index+1;
	int cd=max;
	while(cd>0 &&(l>=0 || r<n)){
	    if(l>=0){
	        arr[l]++;
	        cd--;
	    }
	    if(cd==0){
	        break;
	    }
	    if(r<n){
	        arr[r]++;
	        cd--;
	    }
	    if(cd==0){
	        break;
	    }
	    l--;
	    r++;
	}
	arr[index]=cd;
	for(int i=0;i<n;i++){
	    System.out.print(arr[i]+" ");
	}
//	System.out.println(Arrays.toString(arr));
}
}
