import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();
        String[][] arr=new String[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.next();
            }
        }
        String[][] al=new String[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               String[] b=(arr[i][j].split("[0-9]"));
               //System.out.println(Arrays.toString(b));
               for(int k=0;k<b.length;k++){
                   if(b[k].matches("[a-z]+")){
                       al[i][j]=b[k];
                   }
               }               
            }
        }
        int[][] num=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                String[] b=arr[i][j].split("[a-z]");
                String a="";
                for(int k=0;k<b.length;k++){
                    
                    if(b[k].matches("[0-9]+")){
                         a+=b[k];
                    }
                }
                         //System.out.println(a);
                         num[i][j]=Integer.parseInt(a);
                    
                
            }
        }
        for(int i=0;i<r;i++){
                for(int k=0;k<r-1;k++){
                    for(int j=0;j<c;j++){
                    if(al[k][j].charAt(0)>al[k+1][j].charAt(0)){
                        String t=al[k][j];
                        int tp=num[k][j];
                        num[k][j]=num[k+1][j];
                        al[k][j]=al[k+1][j];
                        num[k+1][j]=tp;
                        al[k+1][j]=t;
                    }
                    if(al[k][j].charAt(0)==al[k+1][j].charAt(0)){
                        if(num[k][j]>num[k+1][j]){
                            int tp=num[k][j];
                            num[k][j]=num[k+1][j];
                            num[k+1][j]=tp;
                        }
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=num[i][j];
            }
            System.out.println(sum);
        }
     //  System.out.println(Arrays.deepToString(num));

	}
}
