import java.util.Scanner;


public class input {
  public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("����һ�������س�����");
	  int x = sc.nextInt();
	  int []arr=new int[x];
	  int b=1;
	  for(int i=0;i<arr.length;i++){
		  arr[i]=b;
		  b++;
		  System.out.println(arr[x]);
		  
	  }
	  
  }

}
