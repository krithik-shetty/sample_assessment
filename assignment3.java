import java.util.*;
public class assignment3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        String[][] arr=new String[10][10];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.next();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j]=="true"){
                    System.out.println("t");
                }
                if(arr[i][j]=="false"){
                    System.out.println("f");
                }
                System.out.println(" ");
            }
        }
    }
    
}
