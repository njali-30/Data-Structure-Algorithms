import java.util.Scanner;

public class PowerofX {
    public static int power(int num, int e){
        if(e == 0) return 1;
        if(e < 0){
            return 1 / power(num, -e);
        }
        int temp = power(num, e/2);
        if(e % 2 == 0){
            return temp * temp;
        }
        else{
            return num * temp * temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent : ");
        int b = sc.nextInt();
        System.out.print(a+"^"+b+" = " + power(a,b));
    }

}
