import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static  int sum=0;

    public static void main(String[] args) {

        System.out.println(
                hashMap( new String[]{ "addToValue",
                "addToKey",
                "addToKey",
                "insert",
                "addToValue",
                "addToValue",
                "insert",
                "get",
                "get",
                "insert"},
                new int[][]{{-2},
                 {-3},
                 {0},
                 {-3,1},
                 {-2},
                 {-4},
                 {2,-4},
                 {2},
                 {2},
                 {3,-1}}));

    }

     static long hashMap(String[] queryType, int[][] query) {

         System.out.println("QueryType size is: " + queryType.length);
         System.out.println("Query size is: " + query.length);

         Map<Integer,Integer> map = new HashMap<>();

        int index=0;

        for(String str : queryType){

            if(str.equals("insert")) {

                System.out.println("Starting insert");

                int[] arr = query[index++];

                System.out.println("To be inserted key " + arr[0] + " to be inserted val " + arr[1]);

                map.put(arr[0],arr[1]);

                System.out.println("Done with insert");

            }else if(str.equals("addToValue")) {

                System.out.println("Starting addToValue");

                int[] arr = query[index++];
                System.out.println("Adding to val: " + arr[0]);

                for(int k : map.keySet()) {

                    int newVal = (map.getOrDefault(k,0)+arr[0]);
                    map.put(k,newVal);

                }

                System.out.println("Done with addToValue");

            }else if(str.equals("addToKey")) {

                System.out.println("Starting addToKey");

                int[] arr = query[index++];

                System.out.println("Adding to keys: " + arr[0]);

                List<Integer> keys = new ArrayList<>(map.keySet());

                for(int k : keys) {

                    int val = map.getOrDefault(k,0);
                    int newKey = k+arr[0];
                    map.put(newKey,val);

                }

                System.out.println("Done with addToKey");

            }else if (str.equals("get")) {

                System.out.println("Starting get");

                int[] arr = query[index++];

                System.out.println("Getting: " + arr[0]);

                sum += map.getOrDefault(arr[0],0);

                System.out.println("Done with get");

            }

        }

        return sum;

    }

}
