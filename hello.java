import java.util.Scanner;

public class Main{
public static void main(){

    int arr[ ]={1,2,3,4,5};
    Scanner scan = new Scaner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = scan.nextInt();
        System.out.println(arr[i]);
    }
}

}
