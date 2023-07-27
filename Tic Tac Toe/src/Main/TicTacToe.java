package Main;

	import java.util.Scanner;
public class TicTacToe {
	
	public static void main(String[] args) {
	    char[][] arr=new char[3][3];
	Scanner sc=new Scanner(System.in);
	char tran='x';
boolean gameOver=false;
int ii=0;

	    while(ii<9){
	    	System.out.println("enter row and column of "+tran);
	        int s=sc.nextInt();
	        int s1=sc.nextInt();
	        
	        if(arr[s][s1]=='x' || arr[s][s1]=='o') {
	        	
	        }else {
	        	 arr[s][s1]=tran;
	        tran= tran=='x'?'o':'x';
	        ii++;
	        }
	for(int i=0;i<3;i++){
	       for(int j=0;j<3;j++){
	       System.out.print(arr[i][j]+" ");
	     } 
	     System.out.println();
	    }
	if(ii>3) {
	gameOver=check(arr);
	}
	if(gameOver) {
		return ;
	}
	    }
	    System.out.println("Match Draw");
	}
public static boolean check(char arr[][]) {
	if(arr[0][0]==arr[0][1] && arr[0][2]==arr[0][1] && (arr[0][0] =='x'||arr[0][0] =='o')){
		System.out.println(arr[0][0]+" is win");
		return true;
	}else
	if(arr[1][0]==arr[1][1] && arr[1][2]==arr[1][1] && (arr[1][0] =='x'||arr[1][0] =='o')){
		System.out.println(arr[1][0]+" is win");
		return true;
	}else if(arr[2][0]==arr[2][1] && arr[2][2]==arr[2][1] && (arr[2][0] =='x'||arr[2][0] =='o')){
		System.out.println(arr[2][0]+" is win");
		return true;
	}else
	if(arr[0][0]==arr[1][1] && arr[2][2]==arr[1][1] && (arr[0][0] =='x'||arr[0][0] =='o')){
		System.out.println(arr[0][0]+" is win");
		return true;
	}else
	if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0] && (arr[1][1] =='x'||arr[1][1] =='o')){
		System.out.println(arr[0][2]+" is win");
		return true;
	}else
	if(arr[0][0]==arr[1][0] && arr[2][0]==arr[1][0] && (arr[0][0] =='x'||arr[0][0] =='o')){
		System.out.println(arr[0][0]+" is win");
		return true;
	}else
	if(arr[0][1]==arr[1][1] && arr[2][1]==arr[1][1] && (arr[0][1] =='x'||arr[0][1] =='o')){
		System.out.println(arr[0][0]+" is win");
		return true;
	}else
	if(arr[0][2]==arr[1][2] && arr[2][2]==arr[1][2] && (arr[0][2] =='x'||arr[0][2] =='o')){
		System.out.println(arr[0][0]+" is win");
		return true;
	}
	return false;
}
}
