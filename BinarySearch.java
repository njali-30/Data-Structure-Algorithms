import java.util.Scanner;
public class BinarySearch{
	public static int binarySearch(int[] arr, int target){
		int f = 0; 
        int l = arr.length-1;
		while(f<=l){
			int mid = (f+l)/2;
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid]>target){
				l = mid-1;
			}
			else{
				f = mid+1;
			}
		}
            return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total elements:");
		int n = sc.nextInt();

        int[] arr = new int[n];
		System.out.print("Enter the elements:");
		for(int i=0; i<n; i++){
		    arr[i]= sc.nextInt();
		}
		
		System.out.print("Enter the target:");
		int target = sc.nextInt();
		
		int result = binarySearch(arr,target);

		if(result == -1){
			System.out.print("Element not found!");
		}
		else{
			System.out.print("Element found at index: "+result);
		}

        sc.close();
	}
}