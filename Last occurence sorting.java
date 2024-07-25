import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] arr=s2.toCharArray();
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<s2.length();i++){
		    for(int j=s1.length()-1;j>=0;j--){
		        if(s2.charAt(i)==s1.charAt(j)){
		            li.add(j+1);
		            break;
		        }
		    }
		}
// 		System.out.println(li);
// 		System.out.print(Arrays.toString(arr));
        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s2.length()-1;j++){
            if(li.get(j)>li.get(j+1)){
                int t=li.get(j);
                char tc=arr[j];
                li.set(j,li.get(j+1));
                arr[j]=arr[j+1];
                li.set(j+1,t);
                arr[j+1]=tc;
            }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
       // System.out.println(Arrays.toString(arr));
	}
}
