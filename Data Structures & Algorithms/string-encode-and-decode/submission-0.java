class Solution {

    public String encode(List<String> strs) {
        StringBuffer res =new StringBuffer();
        for(String s: strs){
            StringBuffer dummy =new StringBuffer();
            dummy.append(s.length());
            dummy.append("*");
            dummy.append(s);
            res.append(dummy);
        }return res.toString();
    }

    public List<String> decode(String str) {
       List<String> res= new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int len=0;
            while(str.charAt(i)!='*'){
                len = len*10 + (str.charAt(i)-'0');
               
                 i++;

            }
            i++;
            String word = str.substring(i, i+len);
            res.add(word);
            i= i+len;
        }
        return res;
    }
}