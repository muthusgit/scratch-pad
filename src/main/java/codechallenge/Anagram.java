package codechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by muthu on 18/03/2017.
 */
public class Anagram {
    public static void main(String args[]){
        List<String> lstOfStr = new ArrayList<String>(Arrays.asList("solvers","lovers","slaca", "scala", "avaj", "avja"));
        lstOfStr.stream().collect(
                Collectors.toMap(s -> sortString(s.toString()), s -> s)
                );
        
    }

    private static String sortString(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return c.toString();
    }
}
