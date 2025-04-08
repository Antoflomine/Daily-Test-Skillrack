import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] m1=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        m1[i][j]=sc.nextInt();
		    }
		}
		int[][] m2=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        m2[i][j]=sc.nextInt();
		    }
		}
		List<Integer> b1=getBorder(m1,r,c);
		List<Integer> b2=getBorder(m2,r,c);
		//System.out.println(b1);
		
		System.out.println(isRotated(b1,b2)?"YES":"NO");

	}
	public static List<Integer> getBorder(int[][] m,int r,int c){
	    List<Integer> b=new ArrayList<Integer>();
	    
	    for(int j=0;j<c;j++){
	        b.add(m[0][j]);
	    }
	    for(int i=1;i<r-1;i++){
	        b.add(m[i][c-1]);
	    }
	    for(int j=c-1;j>=0;j--){
	        b.add(m[r-1][j]);
	    }
	    for(int i=r-2;i>0;i--){
	        b.add(m[i][0]);
	    }
	    return b;
	}
	public static boolean isRotated(List<Integer> b1,List<Integer> b2){
	    if(b1.size()!=b2.size()) return false;
	    
	    List<Integer> doub=new ArrayList<>(b1);
	    doub.addAll(b1);
	    
	    StringBuilder sb1=new StringBuilder();
	    for(int h:doub){
	        sb1.append(h).append(",");
	    }
	    StringBuilder sb2=new StringBuilder();
	    for(int y:b2){
	        sb2.append(y).append(",");
	    }
	    return sb1.toString().contains(sb2.toString());
	}
}
