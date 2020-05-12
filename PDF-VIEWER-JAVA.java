
QUESTION
 WHEN YOU SELECT A CONTIGUOUS BLOCK OF TEXT IN A PDF VIEWER, THE SELECTION IS HIGHLIGHTED WITH A BLUE RECTANGLE.
 IN THIS PDF VIEWER, EACH WORD IS HIGHLIGHTED INDEPENDENTLY


SOLUTION
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
            int i,max=h[0],p;
 int l=word.length();
 
    for(i=1;i<maxletter(word);i++)
    {
        if(h[i]>max)
        max=h[i];
    }
  
    int area=l*max;
    return(area);

    }
    static int maxletter(String word)
    {
        int i;
        int maxl=word.charAt(0);
        for(i=1;i<word.length();i++)
        {
            if((int)word.charAt(i)>maxl)
            maxl=(int)word.charAt(i);
        } 
        return((maxl-97)+1);  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
