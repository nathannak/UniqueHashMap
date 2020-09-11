import java.util.*;

public class Main {

    static  int sum=0;

    public static void main(String[] args) {

//        System.out.println(
//                hashMap( new String[]{ "addToValue",
//                "addToKey",
//                "addToKey",
//                "insert",
//                "addToValue",
//                "addToValue",
//                "insert",
//                "get",
//                "get",
//                "insert"},
//                new int[][]{{-2},
//                 {-3},
//                 {0},
//                 {-3,1},
//                 {-2},
//                 {-4},
//                 {2,-4},
//                 {2},
//                 {2},
//                 {3,-1}}));

        System.out.println(
                hashMap(new String[]{
                                "addToValue",
                                "addToValue",
                                "insert",
                                "insert",
                                "insert",
                                "addToValue",
                                "addToValue",
                                "addToKey",
                                "get",
                                "addToKey",
                                "insert",
                                "addToKey",
                                "addToKey",
                                "insert",
                                "get",
                                "addToValue",
                                "addToValue",
                                "insert",
                                "get",
                                "addToValue",
                                "addToKey",
                                "addToValue",
                                "addToValue",
                                "get",
                                "insert",
                                "insert",
                                "get",
                                "get",
                                "get",
                                "addToValue",
                                "addToKey",
                                "addToKey",
                                "insert",
                                "addToKey",
                                "insert",
                                "get",
                                "get",
                                "get",
                                "addToKey",
                                "insert",
                                "addToValue",
                                "addToValue",
                                "get",
                                "addToKey",
                                "get",
                                "get",
                                "addToValue",
                                "addToValue",
                                "addToValue",
                                "insert",
                                "addToValue",
                                "addToKey",
                                "insert",
                                "addToValue",
                                "get",
                                "addToKey",
                                "insert",
                                "addToValue",
                                "addToValue",
                                "addToValue",
                                "addToValue",
                                "get",
                                "get",
                                "addToKey",
                                "insert",
                                "insert",
                                "addToKey",
                                "addToValue",
                                "addToKey",
                                "addToKey",
                                "insert",
                                "get",
                                "addToValue",
                                "addToKey",
                                "insert",
                                "addToKey",
                                "get",
                                "get",
                                "addToValue",
                                "addToValue",
                                "get",
                                "insert",
                                "insert",
                                "addToKey",
                                "addToValue",
                                "insert",
                                "addToKey",
                                "insert",
                                "addToKey",
                                "insert",
                                "addToKey",
                                "addToKey",
                                "get",
                                "insert",
                                "insert",
                                "addToValue",
                                "get",
                                "get",
                                "addToValue",
                                "addToValue"},
                        new int[][]{
                                {
                                        -10
                                },
                                {
                                        -32
                                },
                                {
                                        -37,
                                        32
                                },
                                {
                                        -45,
                                        26
                                },
                                {
                                        -25,
                                        -23
                                },
                                {
                                        23
                                },
                                {
                                        49
                                },
                                {
                                        -14
                                },
                                {
                                        -39
                                },
                                {
                                        15
                                },
                                {
                                        3,
                                        44
                                },
                                {
                                        3
                                },
                                {
                                        -35
                                },
                                {
                                        40,
                                        22
                                },
                                {
                                        -56
                                },
                                {
                                        -34
                                },
                                {
                                        38
                                },
                                {
                                        6,
                                        -39
                                },
                                {
                                        -29
                                },
                                {
                                        1
                                },
                                {
                                        43
                                },
                                {
                                        -30
                                },
                                {
                                        37
                                },
                                {
                                        -33
                                },
                                {
                                        -23,
                                        45
                                },
                                {
                                        -48,
                                        -21
                                },
                                {
                                        -23
                                },
                                {
                                        49
                                },
                                {
                                        14
                                },
                                {
                                        3
                                },
                                {
                                        28
                                },
                                {
                                        -29
                                },
                                {
                                        38,
                                        11
                                },
                                {
                                        -46
                                },
                                {
                                        20,
                                        20
                                },
                                {
                                        -95
                                },
                                {
                                        -33
                                },
                                {
                                        -70
                                },
                                {
                                        -19
                                },
                                {
                                        -14,
                                        36
                                },
                                {
                                        16
                                },
                                {
                                        -42
                                },
                                {
                                        -79
                                },
                                {
                                        20
                                },
                                {
                                        3
                                },
                                {
                                        6
                                },
                                {
                                        36
                                },
                                {
                                        -32
                                },
                                {
                                        24
                                },
                                {
                                        7,
                                        -12
                                },
                                {
                                        34
                                },
                                {
                                        -33
                                },
                                {
                                        -46,
                                        1
                                },
                                {
                                        -14
                                },
                                {
                                        -26
                                },
                                {
                                        35
                                },
                                {
                                        -21,
                                        -48
                                },
                                {
                                        -2
                                },
                                {
                                        -1
                                },
                                {
                                        41
                                },
                                {
                                        7
                                },
                                {
                                        5
                                },
                                {
                                        -69
                                },
                                {
                                        5
                                },
                                {
                                        -40,
                                        33
                                },
                                {
                                        -48,
                                        -20
                                },
                                {
                                        38
                                },
                                {
                                        49
                                },
                                {
                                        48
                                },
                                {
                                        40
                                },
                                {
                                        -14,
                                        -9
                                },
                                {
                                        39
                                },
                                {
                                        42
                                },
                                {
                                        -25
                                },
                                {
                                        48,
                                        34
                                },
                                {
                                        -41
                                },
                                {
                                        88
                                },
                                {
                                        -4
                                },
                                {
                                        -47
                                },
                                {
                                        -23
                                },
                                {
                                        12
                                },
                                {
                                        -45,
                                        -43
                                },
                                {
                                        39,
                                        -30
                                },
                                {
                                        8
                                },
                                {
                                        -1
                                },
                                {
                                        -44,
                                        46
                                },
                                {
                                        -27
                                },
                                {
                                        -25,
                                        13
                                },
                                {
                                        28
                                },
                                {
                                        -31,
                                        -27
                                },
                                {
                                        -37
                                },
                                {
                                        -30
                                },
                                {
                                        -110
                                },
                                {
                                        -2,
                                        -14
                                },
                                {
                                        -20,
                                        -31
                                },
                                {
                                        -36
                                },
                                {
                                        -60
                                },
                                {
                                        -50
                                },
                                {
                                        -48
                                },
                                {
                                        -13
                                }
                        }));
    }
    
    static long hashMap(String[] queryType, int[][] query) {

        Map<Integer,Integer> map = new HashMap<>();

        int index=0;
        int sum = 0;

        for(String str : queryType){

            if(str.equals("insert")){

                int[] arr = query[index++];

                System.out.println("to be inserted key " + arr[0] + " to be inserted val " + arr[1]);

                map.put(arr[0],arr[1]);

                for(Map.Entry<Integer,Integer> entry : map.entrySet()){

                    int key = entry.getKey();

                    int val = entry.getValue();

                    System.out.println("key: " + key + "val " + val);

                }

                System.out.println("done with insert");

            }else if(str.equals("addToValue")) {

                int[] arr = query[index++];
                System.out.println("adding to val: " + arr[0]);

                for(int k : map.keySet()) {

                    int newVal = (map.getOrDefault(k,0)+arr[0]);
                    map.put(k,newVal);

                }

                System.out.println("after val");


                for(Map.Entry<Integer,Integer> entry : map.entrySet()){

                    int key = entry.getKey();

                    int val = entry.getValue();

                    System.out.println("key: " + key + "val " + val);

                }

                System.out.println("done with val");

            }else if(str.equals("addToKey")) {

                int[] arr = query[index++];

                System.out.println("adding to keys: " + arr[0]);

                if(arr[0]>0) {


                    List<Integer> keys = new ArrayList<>(map.keySet());
                    Collections.sort(keys,Collections.reverseOrder());

                    List<Integer> newKeys = new ArrayList<>();

                    for(int k : keys) {

                        int val = map.getOrDefault(k,0);
                        int newKey = k+arr[0];
                        newKeys.add(newKey);
                        map.put(newKey,val);

                    }

                    //remove old one's they will cause problem
                    for(int k : keys) {
                        if(!newKeys.contains(k))
                            map.remove(k);
                    }


                }else if (arr[0]<0) {

                    List<Integer> keys = new ArrayList<>(map.keySet());
                    Collections.sort(keys);

                    List<Integer> newKeys = new ArrayList<>();

                    for(int k : keys) {

                        int val = map.getOrDefault(k,0);
                        int newKey = k+arr[0];
                        newKeys.add(newKey);
                        map.put(newKey,val);

                    }

                    //remove old one's they will cause problem
                    for(int k : keys) {
                        if(!newKeys.contains(k))
                            map.remove(k);
                    }

                }


                for(Map.Entry<Integer,Integer> entry : map.entrySet()){

                    int key = entry.getKey();

                    int val = entry.getValue();

                    System.out.println(" [after add to key] key: " + key + "val " + val);

                }

                System.out.println("done with key");

            }else if (str.equals("get")) {

                int[] arr = query[index++];
                System.out.println("getting: " + arr[0]);

                for(Map.Entry<Integer,Integer> entry : map.entrySet()){

                    int key = entry.getKey();

                    int val = entry.getValue();

                    System.out.println("key: " + key + "val " + val);

                }

                sum += map.getOrDefault(arr[0],0);

            }
        }

        return sum;

    }


}
