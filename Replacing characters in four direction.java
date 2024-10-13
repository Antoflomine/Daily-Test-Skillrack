import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
        char[][] arr=new char[r][c];
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<r;i++){
          
            for(int j=0;j<c;j++){
                if(arr[i][j]=='R'){
                    
                    for(int k=j;k<c;k++){
                        if(arr[i][k]!='R' && arr[i][k]!='L' && arr[i][k]!='T' && arr[i][k]!='B'){
                        arr[i][k]='*';
                        }
                    }
                }
                else if(arr[i][j]=='L'){
                  
                    for(int k=0;k<j;k++){
                        if(arr[i][k]!='R' && arr[i][k]!='L' && arr[i][k]!='T' && arr[i][k]!='B'){
                        arr[i][k]='*';
                        }
                    }
                }
                else if(arr[i][j]=='T'){
                    
                    for(int k=0;k<i;k++){
                        if(arr[k][j]!='R' && arr[k][j]!='L' && arr[k][j]!='T' && arr[k][j]!='B'){
                        arr[k][j]='*';
                        }
                    }
                    
                }
                else if(arr[i][j]=='B'){
                    for(int k=i;k<r;k++){
                        if(arr[k][j]!='R' && arr[k][j]!='L' && arr[k][j]!='T' && arr[k][j]!='B'){
                        arr[k][j]='*';
                        }
                    }
                }
            }
        }
       // System.out.println(Arrays.deepToString(arr));
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
	}
	
}
