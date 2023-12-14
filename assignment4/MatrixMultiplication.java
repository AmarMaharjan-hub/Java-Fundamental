import java.util.Scanner;
class MatrixMultipication{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a1,a2,b1,b2;
		do{
		System.out.println("Enter the size of matrix A:");
		a1=scan.nextInt();
		a2=scan.nextInt();
		System.out.println("\nEnter the size of matrix B:");
		b1=scan.nextInt();
		b2=scan.nextInt();
		if(a1!=b2){
			System.out.println("\nError: The column of matrixA and row of matrixB should be equal.\n\n");
		}
		}while(a1!=b2);
		int[][] matrixA=new int[a1][a2],matrixB=new int[b1][b2],matrixC=new int[a1][b2];
		int sum=0;
		System.out.println("\nEnter elements of matrix A of size:"+a1+"x"+a2+"");
		for(int i=0;i<a1;i++){
			for(int j=0;j<a2;j++){
				matrixA[i][j]=scan.nextInt();
			}
		}
		System.out.println("\nEnter elements of matrix B of size:"+b1+"x"+b2+"");
		for(int i=0;i<b1;i++){
			for(int j=0;j<b2;j++){
				matrixB[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<a1;i++){
			for(int j=0;j<b2;j++){
				for(int k=0;k<a2;k++){
					sum=sum+matrixA[i][k]*matrixB[k][j];
				}
				matrixC[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("\nProduct of matrices:");
		for(int i=0;i<a1;i++){
			for(int j=0;j<b2;j++){
				System.out.print(matrixC[i][j]+"\t");
			}
			System.out.println();
		}
	}
}