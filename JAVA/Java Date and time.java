import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;
class Result {

    

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
         Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        cal.set(year, month-1, day);

        String resultado = sdf.format(cal.getTime()).toUpperCase();

        return resultado;

    }

}

public class Solution {