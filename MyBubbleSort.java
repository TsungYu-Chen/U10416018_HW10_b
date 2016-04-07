import java.util.Scanner;

public class MyBubbleSort{
	public static void bubbleSort(int[] list){
		boolean needNextPass = true;
		
		for(int k = 1; k < list.length && needNextPass; k++){
			needNextPass = false;
			for(int i = 0; i < list.length - k; i++){
				if(list[i] > list[i + 1]){
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("想輸入幾個數字?");
		int num = input.nextInt();
		int[] list = new int[num];
		
		System.out.println("請輸入 " + num + " 個數字 :");
		for(int i = 0; i < num; i++){
			list[i] =  input.nextInt();
			bubbleSort(list);
		}
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
	}
}
