import java.util.Scanner;
class Multipication_of_2d_matrix{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int aI,aJ,bI,bJ;
		do{
		System.out.println("Enter the size of matrix A:");
		aI=scan.nextInt();
		aJ=scan.nextInt();
		System.out.println("\nEnter the size of matrix B:");
		bI=scan.nextInt();
		bJ=scan.nextInt();
		if(aI!=bJ){
			System.out.println("\nError: The column of matrixA and row of matrixB should be equal.\n\n");
		}
		}while(aI!=bJ);
		int[][] matA=new int[aI][aJ],matB=new int[bI][bJ],matC=new int[aI][bJ];
		int sum=0;
		System.out.println("\nEnter elements of matrix A of size:"+aI+"x"+aJ+"");
		for(int i=0;i<aI;i++){
			for(int j=0;j<aJ;j++){
				matA[i][j]=scan.nextInt();
			}
		}
		System.out.println("\nEnter elements of matrix B of size:"+bI+"x"+bJ+"");
		for(int i=0;i<bI;i++){
			for(int j=0;j<bJ;j++){
				matB[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<aI;i++){
			for(int j=0;j<bJ;j++){
				for(int k=0;k<aJ;k++){
					sum=sum+matA[i][k]*matB[k][j];
				}
				matC[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("\nProduct of matrices:");
		for(int i=0;i<aI;i++){
			for(int j=0;j<bJ;j++){
				System.out.print(matC[i][j]+"\t");
			}
			System.out.println();
		}
	}
}