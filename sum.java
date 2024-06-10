import java.util.*;
class sum {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner a=new Scanner(System.in);
        System.out.println("enter a no:");
        int x=a.nextInt();
        int sumOfDigits=0;
        while(true){
            sumOfDigits=sumOfDigits+(x%10);
            x/=10;
            if(x<1){
                break;
            }
        }
        System.out.print(sumOfDigits);
    }
}
