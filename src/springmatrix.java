import java.util.*;
public class springmatrix {
	public static void spiralmatrix(int matrix[][]) {
		int startrow=0;
		int endrow=matrix.length-1;
		int startcol=0;
		int endcol=matrix.length-1;
		while(startrow<=endrow && startcol<=endcol) {
			//top
			for(int i=startcol;i<=endcol;i++) {
				System.out.print(matrix[startrow][i]+" ");
		}
			//right
			for(int j=startrow+1;j<=endrow;j++) {
				System.out.print(matrix[j][endcol]+" ");
			}
			//bottom
			for(int k=endcol-1;k>=startcol;k--) {
				if(startrow==endrow) {
					break;
				}
				System.out.print(matrix[endrow][k]+" ");
			}
			//left
			for(int m=endrow-1;m>=startrow+1;m--) {
				if(startrow==endrow) {
					break;
				}
				System.out.print(matrix[m][startcol]+" ");
			}
			startrow++;
			endrow--;
			startcol++;
			endcol--;

		}
				
	}
     public static void main(String[] args) {
	      int matrix[][]= {{1,2,3,4},
	                  {5,6,7,8},
	                  {9,10,11,12},
	                  {13,14,15,16}};
	      spiralmatrix(matrix);
     }
}

