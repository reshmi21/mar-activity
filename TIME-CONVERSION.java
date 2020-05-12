   GIVEN A TIME IN 12-HOUR AM/PM FORMAT, CONVERT IT TO MILITARY (24-HOUR) TIME.

	NOTE: MIDNIGHT IS 12:00:00AM ON A 12-HOUR CLOCK, AND 00:00:00 ON A 24-HOUR CLOCK.
	NOON IS 12:00:00PM ON A 12-HOUR CLOCK, AND 12:00:00 ON A 24-HOUR CLOCK.
	
	SOLUTION-
	import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        //String str[]=new String[3];
        int i,j,k,hh1=0;
         String hr1="";
            String str[]=s.split(":");
            String time=str[2];
             String hr=str[0];
             int hh=Integer.parseInt(hr);
            String mm=str[1];
            for(i=0;i<time.length();i++)
            {
                if(time.charAt(i)=='P')
                {
                    j=i;
                    if(hh==12)
                    hh1=hh;
                    else
                      hh1=hh+12;
                    time=time.substring(0,j);
                     hr1=Integer.toString(hh1);
                    }
                    else if(time.charAt(i)=='A')
                    {
                        k=i;
                        if(hh==12)
                         hh1=0;
                         else
                       hh1=hh;
                    hr1='0'+Integer.toString(hh1);
                    time=time.substring(0,k);
                    }
                    else
                      continue;
            }
                    
        String res=hr1+":"+mm+":"+time;
        return(res);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
