/**************************************************************
    Problem: 2810
    User: premiummina9401
    Language: Java
    Result: Success
    Time:133 ms
    Memory:9252 kb
****************************************************************/
 
 
import java.math.BigInteger;
import java.util.Scanner;
 
public class TileChange {
    static int gcd(int x, int y){
        if(x%y==0) return y;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd_result=gcd(x,y);
        BigInteger big_x=new BigInteger(Integer.toString(x));
        BigInteger big_y=new BigInteger(Integer.toString(y));
        BigInteger result1=big_x.multiply(big_y);
        BigInteger result2=new BigInteger((Integer.toString(gcd_result*gcd_result)));
        BigInteger result3=result1.divide(result2);
        System.out.print(result3);
    }
}
