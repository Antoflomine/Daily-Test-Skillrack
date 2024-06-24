import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> brr=new ArrayList<>();
		//int w=0;
		for(int i=0;i<n;i++){
		    int y=sc.nextInt();
		    for(int j=0;j<y;j++){
		        brr.add(y);
		        //w++;
		    }
		}
		
		int u=0,i=0;
		while(i<brr.size()){
		    for(int j=0;j<n;j++){
		        if(brr.size()<=u){
		            return;
		        }
		        else{
		        System.out.print(brr.get(u)+" ");
		        u++;
		        }
		        
		    }
		    i++;
		    
		    System.out.println();
		}

//System.out.println(str.length());
	}
}
