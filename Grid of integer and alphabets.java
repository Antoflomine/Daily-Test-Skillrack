import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n*n];
		for(int i=0;i<n*n;i++){
		    if((i+1)%2==0)
		    {
		        if((i+1)<=9){
		        //arr[i]=(char)((i+1)+'0');
		        arr[i]=Integer.toString(i+1);
		        }
		        else{
		            int a=i+1;
		            String s=Integer.toString(a);
		           arr[i]=s;
		        }
		        
		    }
		    else{
		        char b;
		        if(i<26){
		         b=(char)(i+97);
		        }
		        else{
		             b=(char)((i%26)+97);
		        }
		        arr[i]=String.valueOf(b);
		        
		        if(arr[i].equals("a")|| arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
		         //   arr[i]=(char)((i+1)+'0');
		         arr[i]=Integer.toString(i+1);
		        }
		        
		       
		       
		       
		    }
		}
		int o=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[o]+" ");
		        o++;
		    }
		    System.out.println();
		}
	//	System.out.println(Arrays.toString(arr));
	}
}
