//Question link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

//Sliding window approach
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        
        int i=0, j=0, max = 0;
        while(i< s.length() && j< s.length()){
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, j-i);
                
            }
            else{
                
                set.remove(s.charAt(i++));
                
            }
            
        }
         return max;
        
        }
        
    }
