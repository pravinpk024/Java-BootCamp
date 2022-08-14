import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		int res=sc.nextInt();
		for(int i=0;i<r-1;i++){
		    for(int j=0;j<c-1;j++){
		        int temp=mat[i][j]+mat[i][j+1]+mat[i+1][j]+mat[i+1][j+1];
		        if(temp==res)
		        System.out.print(mat[i][j]+" "+mat[i][j+1]+" "+mat[i+1][j]+" "+mat[i+1][j+1]);
		        return ;
		    }
		}
	}
}


