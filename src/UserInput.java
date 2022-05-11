import java.util.Scanner;
class UserInput {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]=new int[a];
        for(int i=0; i<arr.length; i++){
            int x = sc.nextInt();
            x = arr[i];
        }
        for(int c:arr){
            System.out.println(c);
        }
        System.out.println(a);


    }
}
