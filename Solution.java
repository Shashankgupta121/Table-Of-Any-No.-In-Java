import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
//name your java file Solution
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        while(i<=100){
            int k = N*i;
            System.out.println(N + " x " + i + " = " + k);
            i++;
        }
        bufferedReader.close();
    }
}
