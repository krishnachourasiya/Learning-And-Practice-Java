import java.util.*;

public class find_greater_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 = ");
        int num3 = sc.nextInt();

    //  Trick 1 to find greater number
        if(num1 >= num2 && num1 >= num3){
            System.out.println("num1 is big");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is big");
        }
        else{
            System.out.println("num3 is big");
        }
/*
    //  Trick 2 to find greater number
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
    //  Trick 3 to find greater number
        int max = 0;
        if(num1 > num2){
            max = num1;
        }
        else{
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
    //  Trick 4 to find greater number
        int max = Math.max(num3,Math.max(num1,num2));
        System.out.println("Max value is: "+ max);
*/
        sc.close();
    }
}
