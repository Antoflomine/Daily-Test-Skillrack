import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		ArrayList<int[]> li=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int a=0,b=0;
		    for(int j=i+1;j<n;j++){
		        
		        if(arr[i]==arr[j]){
		           a=i;
		           b=j;
		           //break;
		        }
		    }
		    int y=0;
		    //for(int k=a;k<=b;k++){
		        int[] h=new int[(b-a)+1];
		      for(int k=a;k<=b;k++){
		      h[y++]=arr[k];    
		      
		    }
		    li.add(h);
		}
	
// 		for(int i=0;i<li.size();i++){
// 		System.out.println(Arrays.toString(li.get(i)));
// 		}
            int max=0,r=0,q=0;
        for(int i=0;i<li.size();i++){
            int y=li.get(i).length;
          //  System.out.println(y);
            if(max<y){
                max=y;
            
          
            
             }
        }
           
           for(int i=0;i<li.size();i++){
               if(li.get(i).length==max){
                   r=li.get(i)[0];
               }
           if(q<r){
               q=li.get(i)[0];
           }
            
         }   // r=u[0];
            
        
            System.out.println(q);
        

	}
}
