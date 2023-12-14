import java.util.Scanner;
class Student{
	int id,marks;

	Student(){
		id=10;
		marks=20;
	}

	Student(int a,int b){
	}

	Student(Student a){

	}

	public static void main(String args[]){
		Student s1=new Student();
		Student s2=new Student(s1.id,s1.marks);
		Student s3=new Student(s1);
	}

	
}