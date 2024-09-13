import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int n=arr.length;
		Map<String,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<n;i++){
		    if(map.containsKey(arr[i])){
		        map.put(arr[i],map.get(arr[i])+1);
		    }
		    else{
		        map.put(arr[i],1);
		    }
		}
		List<String> brr=new LinkedList<>();
		for(Map.Entry<String,Integer> e:map.entrySet()){
		    if(e.getValue()>1){
		        brr.add(e.getKey());
		    }
		}
		for(int i=0;i<brr.size();i++){
		    for(int j=0;j<brr.size()-1;j++){
		        if((brr.get(j)).length()<(brr.get(j+1)).length()){
		            String t=brr.get(j);
		            brr.set(j,brr.get(j+1));
		            brr.set(j+1,t);
		        }
		    }
		}
	//	System.out.println(brr);
	if(brr.size()==0){
	    System.out.println("-1");
	}
	else{
	    for(String y:brr){
	        System.out.print(y+" ");
	    }
	}

	}
}
