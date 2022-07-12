
import java.util.*;
public class assignment1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] a=new int[5];
        for (int i =0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a[0]==a[1] && a[0]==a[2]&&a[0]==a[3]){
            System.out.print("equal");
        }
        else{
            System.out.print("not equal");
        }
    }
    
}
