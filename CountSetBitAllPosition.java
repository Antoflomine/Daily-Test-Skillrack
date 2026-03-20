import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		String[] bin=new String[n];
		int ml=0;
	
		for(int i=0; i<n; i++) {
            String b = Integer.toBinaryString(arr[i]);
            StringBuilder sb=new StringBuilder(b).reverse();
            bin[i]=sb.toString();
            if(ml<bin[i].length()){
                ml=bin[i].length();
            }
		}
			System.out.println(ml);
			for(int i=0;i<n;i++){
			    if(bin[i].length()<ml){
			        String y="";
			           y+=bin[i];
			        for(int j=0;j<ml-bin[i].length();j++){
			            y+='0';
			        }
			     
			        bin[i]=y;
			      
			    }
			}
			System.out.println(Arrays.toString(bin));


		for(int i=0;i<ml;i++){
		    int c=0;
		    for(int j=0;j<n;j++){
		        if(bin[j].charAt(i)=='1'){
		            c++;
		        }
		    }
		    System.out.print(c+" ");
		}
	
	}
}
