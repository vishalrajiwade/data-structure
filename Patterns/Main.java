import java.util.Scanner;

class Main {

    public static void pattern1(int n){
        for (int i=1;i<=n;i++ ){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=0; i<n; i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pattern6(n);
        }
    }

}