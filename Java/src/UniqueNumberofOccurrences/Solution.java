package UniqueNumberofOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!hashmap.containsKey(arr[i])){
                hashmap.put(arr[i], 1);
            }else{
                hashmap.put(arr[i], hashmap.get(arr[i])+1);
            }
        }
        Set<Integer> hashset = new HashSet<>();
        for(Integer value : hashmap.values()){
            if(hashset.contains(value)){
                result = false;
                break;
            }else{
                hashset.add(value);
            }
        }
        return result;
    }
}
