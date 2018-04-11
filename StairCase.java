import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StairCase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        for (int i = 0; i < n ; i++){
            int padding = n - (i + 1) ;
            String repeated = new String(new char[i+1]).replace("\0", "#");
            String padded = new String(new char[padding]).replace("\0", " ");
            System.out.println(padded + repeated);
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
