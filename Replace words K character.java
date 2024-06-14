import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		String[] t=words.split(" ");
        String st=sc.nextLine();
        String str="";
        for(int i=0;i<st.length();i++){
            if(Character.isUpperCase(st.charAt(i))){
                str+=Character.toLowerCase(st.charAt(i));
                }
                else{
                    str+=st.charAt(i);
                }
        }
        String word="";
        for(int i=0;i<words.length();i++){
            if(Character.isUpperCase(words.charAt(i))){
                word+=Character.toLowerCase(words.charAt(i));
            }
            else{
                word+=words.charAt(i);
            }
        }
        //System.out.println(str);
        String[] w=word.split(" ");
        String[] s=str.split(" ");
        String[] ss=st.split(" ");
        
       // System.out.println(Arrays.toString(s));
        
     int n=Integer.parseInt(w[1]);
     String g=w[0].substring(0,n);
    // System.out.println(n);
    // System.out.println(s.length);
     for(int i=0;i<ss.length;i++){
         String h="";
         
         if(s[i].length()>=n){
         h=s[i].substring(0,n);
         }
        if(h.equals(g)){
            ss[i]=t[0];
        }
     }
     for(int i=0;i<ss.length;i++){
     System.out.print(ss[i]+" ");
     }

	}
}
