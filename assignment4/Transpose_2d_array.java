import java.util.Scanner;
class Transpose_2d_array{
	public static void main(String args[]){
		int[][] num=new int[2][2];

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter elements of 2x2 array:");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				num[i][j]=scan.nextInt();
			}
		}
		System.out.println("Transpose:");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print("\t"+num[j][i]);
			}
			System.out.println();
		}
	}
}