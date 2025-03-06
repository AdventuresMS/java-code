import java.util.Scanner;
public class MazePath{
    public static int maze(int row,int col,int n,int m){
        if (row > n || col > m) {
            return 0;
        }

        if (row == n && col == m) {
            return 1;
        }


        int rightWays = maze(row,col+1,m,n);
        int downWays = maze(row+1,col,m,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m number");
        int m = sc.nextInt();
        System.out.println("Enter n number");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        sc.close();
    }
}