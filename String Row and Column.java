import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		sc.nextLine();
		int l=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		    l=arr[i].length();
		}
	//	System.out.println(Arrays.toString(arr));
	    int r=n%2==0?n+l-1:n+l-2;
	    int c=n%2==0?r-1:r+1;
	   // System.out.println(r+" "+c);
	   
	   
	   char[][] ch=new char[r][c];
	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	           ch[i][j]='*';
	       }
	   }

	   for(int i=0;i<n;i++){
	       int u=0;
	       for(int j=i;j<c;j++){
	           if(i%2==0 ){
	               ch[i][j]=arr[i].charAt(u);
	               u++;
	               if(u==arr[i].length()){
	                   break;
	               }
	           }
	       }
	   }
	   
	  // for(int i=0;i<r;i++){
	       //int u=0;
	       for(int j=0;j<n;j++){
	           int u=0;
	           for(int i=j;i<r;i++){
	           if(j%2!=0){
	               ch[i][j]=arr[j].charAt(u);
	           
	               u++;
	               if(u==arr[j].length()){
	                   break;
	               }
	           }
	       }
	   }
	   
	   
	  
//System.out.println(Arrays.deepToString(ch));
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(ch[i][j]);
    }
    System.out.println();
}
	}
}
