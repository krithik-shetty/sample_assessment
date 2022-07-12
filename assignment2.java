import java.util.*;
public class assignment2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        double a1=sc.nextDouble();
        double a2=sc.nextDouble();
        if(a1>0 &&a1<1&&a2>0&&a2<1){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}