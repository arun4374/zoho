<<<<<<< HEAD
import java.util.*;

public class letterFreq{
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "Arun";
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);
        
    }
=======
import java.util.*;

public class letterFreq{
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "Arun";
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);
        
    }
>>>>>>> 6538695f7751440e06120f7da75ffc29286a5f79
}