import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<Integer> sizes = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		String[] c=str.split("[0-9]");
		String[] nm=str.split("[a-zA-Z]");
		for(int i=0;i<c.length;i++){
		    if(!c[i].equals("")){
		        chars.add(c[i].charAt(0));
		    }
		}
		for(int i=0;i<nm.length;i++){
		    if(!nm[i].equals("")){
		        sizes.add(Integer.parseInt(nm[i]));
		    }
		}
	
		int n = chars.size();
		int max = Collections.max(sizes);
		for(int row=0; row<max; row++) {
		    for(int i=0; i<n; i++) {
		        int size = sizes.get(i);
		        char ch = chars.get(i);
		        if(row < size) {
		            for(int col=0; col<size; col++) {
		                System.out.print(ch + " ");
		            }
		        }
		        else {
		            for(int col=0; col<size; col++) {
		                System.out.print("* ");
		            }
		        }
		    }
		    System.out.println();
		}
	}
}
