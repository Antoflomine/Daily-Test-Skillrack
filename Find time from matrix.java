import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char[][] arr=new char[12][12];
	    ArrayList<String> am=new ArrayList<>();
	    ArrayList<String> pm=new ArrayList<>();
	    for(int i=0;i<12;i++){
	        for(int j=0;j<12;j++){
	            arr[i][j]=sc.next().charAt(0);
	              if(arr[i][j]!='*'){
	                String a=String.format("%02d",i+1);
	                a+=":";
	                a+=String.format("%02d",j*5);
	                if(arr[i][j]=='A'){
	                a+=" AM";
	                String an=a.trim();
	                am.add(an);
	                }
	                if(arr[i][j]=='P'){
	                    a+=" PM";
	                    String an=a.trim();
	                    pm.add(an);
	                }
	              }
	                
	        }
	    }
	    Collections.sort(am);
	    Collections.sort(pm);
	    int y=0;
	    for(int i=0;i<am.size();i++){
	        if(am.get(i).charAt(0)=='1' && am.get(i).charAt(1)=='2'){
	            y=i;
	            break;
	        }
	    }
	    for(int i=y;i<am.size();i++){
	        System.out.println(am.get(i));
	    }
	    for(int i=0;i<y;i++){
	        System.out.println(am.get(i));
	    }
	    int g=0;
	    for(int i=0;i<pm.size();i++){
	        if(pm.get(i).charAt(0)=='1' && pm.get(i).charAt(1)=='2'){
	            g=i;
	            break;
	        }
	    }
	    for(int i=g;i<pm.size();i++){
	        System.out.println(pm.get(i));
	    }
	    for(int i=0;i<g;i++){
	        System.out.println(pm.get(i));
	    }
	
	}
}
