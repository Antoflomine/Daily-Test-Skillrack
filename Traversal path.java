import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[r][c];
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        arr[i][j]=sc.nextInt();
	    }
	}
	int f=sc.nextInt()-1;
	int g=sc.nextInt()-1;
	//System.out.println(g);
	sc.nextLine();
	String s=sc.nextLine();
//	System.out.println(s);
    
	ArrayList<Integer> res=new ArrayList<>();
	res.add(arr[f][g]);
	for(int i=0;i<s.length();i++){
	   if(s.charAt(i)=='>'){
	   try{
	        g=g+1;
	        res.add(arr[f][g]);
	   }
	   catch(Exception e){
	       System.out.println("Invalid Path");
	       return;
	   }
	       
	       // System.out.print(arr[f][g]+" ");
	    }
	    else if(s.charAt(i)=='<'){
	        try{
	        g=g-1;
	        res.add(arr[f][g]);
	        }catch(Exception e){
	            System.out.println("Invalid Path");
	            return;
	       // System.out.print(arr[f][g]+" ");
	        }
	    }
	    else if(s.charAt(i)=='^'){
	        try{
	        f=f-1;
	        res.add(arr[f][g]);
	        }
	        catch(Exception e){
	            System.out.println("Invalid Path");
	            return;
	        }
	        //System.out.println(arr[f][g]+" ");
	        
	    }
	    else{
	        try{
	        f=f+1;
	        res.add(arr[f][g]);
	        }
	        catch(Exception e){
	            System.out.println("Invalid Path");
	            return;
	        }
	        //System.out.print(arr[f][g]+" ");
	    }
	}
	//System.out.println("*"+res.size());
	if(res.size()==s.length()+1){

	    for(int h:res){
	        System.out.print(h+" ");
	    }
	}

	}
}
