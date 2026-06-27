class Solution {
    public int findDuplicate(int[] nums) {


   
        Map<Integer, Integer> elementCount = new HashMap<>();
        
        
        for (int i : nums) {
            elementCount.put(i, elementCount.getOrDefault(i, 0) + 1);
        }
        
       
        
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }

    
return -1;

    } 
    }
