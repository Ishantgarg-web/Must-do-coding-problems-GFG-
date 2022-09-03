//problem link: https://practice.geeksforgeeks.org/problems/check-frequencies4211/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Strings&sortBy=submissions

class Solution {
    boolean issafe(HashMap<Character,Integer> hm)
    {
        if(hm.size()==1) return true;
        int max=-1;
        for (Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(max==-1)
            {
                max=entry.getValue();
            }else{
                if(max!=entry.getValue()){
                    return false;
                }
            }
        }
        return true;
    }
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        if(hm.size()<=1) return true;
        if(issafe(hm)) return true;
        for (int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            hm.put(c1,hm.get(c1)-1);
            if(hm.get(c1)==0){
                hm.remove(c1);
            }
            if(issafe(hm)){
                return true;
            }
            if(hm.containsKey(c1)){
                hm.put(c1,hm.get(c1)+1);
            }else{
                hm.put(c1,1);
            }
        }
        return false;
    }
}