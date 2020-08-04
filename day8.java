//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int phone = sc.nextInt();
            // Write code here
            myMap.put(name, phone);

        }
        while(sc.hasNext()){
            String s = sc.next();
            // Write code here
            if (myMap.get(s)!=null)                
                System.out.println(s + "=" + myMap.get(s) );
            else
                System.out.println("Not found");
        }
        sc.close();
    }
}
