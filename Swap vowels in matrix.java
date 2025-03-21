import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] ch=new char[6];
		for(int i=0;i<6;i++){
		    ch[i]=sc.next().charAt(0);
		}
		int n=sc.nextInt();
		int r=n*3,c=n*4;
		char[][] arr=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]='*';
		    }
		}
		int y=n;
		for(int i=0;i<n;i++){
		    for(int j=y;j<y+n;j++){
		        arr[i][j]=ch[5];
		    }
		}
		for(int i=y;i<y+n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=ch[3];
		    }
		//}
		//for(int i=y;i<(y+n);i++){
		    for(int j=y;j<y+n;j++){
		        arr[i][j]=ch[0];
		    }
		    for(int j=y+n;j<(y+n)+n;j++){
		        arr[i][j]=ch[1];
		    }
		    int u=(y+n)+n;
		    for(int j=u;j<(u+n);j++){
		        arr[i][j]=ch[2];
		    }
		}
		int u=y+n;
		for(int i=u;i<u+n;i++){
		    for(int j=y;j<y+n;j++){
		        arr[i][j]=ch[4];
		    }
		}
		
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
		
	//	System.out.println(Arrays.deepToString(arr));
		

	}
}
