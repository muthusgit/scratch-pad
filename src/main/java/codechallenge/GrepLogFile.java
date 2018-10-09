package codechallenge;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class GrepLogFile {
    public static void main(String[] args) {
        String[] a = {"aaaaa 10.101.201.500aaaaaa","110.101.21.550aaaaaa","","xxxxxxxxxx110.101.201.5zzzz"};
        printMostFrequentlyOccuringIP(a);
    }


    public static void printMostFrequentlyOccuringIP(String[] a){

        Map<String, Integer> m = new HashMap<>();
        if(a.length > 0){
            Arrays.stream(a).forEach(i -> {
                int idx1 = i.indexOf(".");
                if(idx1 > 0){
                    int i1 = getDigits.apply(i.substring(idx1-3,idx1));
                    int idx2 = i.indexOf(".", idx1+1);
                    int i2 = getDigits.apply(i.substring(idx1+1,idx2));
                    int idx3 = i.indexOf(".", idx2+1);
                    int i3 = getDigits.apply(i.substring(idx2+1,idx3));
                    int i4 = getDigits.apply(i.substring(idx3+1,idx3+4));
                    String ip=i1+"."+i2+"."+i3+"."+i4;
                    System.out.println("IP Address : " + i1+"."+i2+"."+i3+"."+i4);
                    if(m.containsKey(ip)){
                        m.replace(ip,m.get(ip)+1);
                    } else {
                        m.put(ip,1);
                    }
                }
            });

            Integer max=0;
            String maxKey="";
            for(Map.Entry<String, Integer> e : m.entrySet()){
                        if(e.getValue() > max){
                            max = e.getValue();
                            maxKey=e.getKey();
                    }
            };
            System.out.println(maxKey);
        }
    }


    static Function<String, Integer> getDigits = s -> {
        String n="";
        try {
            if(s.length()>0){
                for(int i=0; i <= s.length()-1; i++){
                    if(Character.isDigit(s.charAt(i))){
                       n=n+String.valueOf(s.charAt(i));
                    };
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Integer.valueOf(n);
    };


}
