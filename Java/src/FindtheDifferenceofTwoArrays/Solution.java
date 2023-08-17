package FindtheDifferenceofTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i],i);
            }
        }
        System.out.println(map1);

        for(int j = 0; j < nums2.length; j++){
            if(!map2.containsKey(nums2[j])){
                map2.put(nums2[j],j);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map1.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                list1.add(entry.getKey());
            }

        }
        for(Map.Entry<Integer, Integer> entry: map2.entrySet()){
            if(!map1.containsKey(entry.getKey())){
                list2.add(entry.getKey());
            }

        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}
