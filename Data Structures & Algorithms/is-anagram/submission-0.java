class Solution {
    public boolean isAnagram(String s, String t) {
      char[] m=s.toCharArray();
      char[] n=t.toCharArray();
      Arrays.sort(m);
      Arrays.sort(n);
      if(Arrays.equals(m,n)){
        return true;
      }
      else{
        return false;
      }
    }
}
