import java.util.Scanner;
class Matrix_addition_array{
	public static void main(String args[]){
		int[][] a=new int[2][3],b=new int[2][3],c=new int[2][3];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter elements of 2x3 matrix A:");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter elements of 2x3 matrix B:");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				b[i][j]=scan.nextInt();
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Displaying matrix C, where C=A+B:\n");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}