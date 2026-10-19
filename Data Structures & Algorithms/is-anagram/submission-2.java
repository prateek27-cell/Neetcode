class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char[] k=new char[s.length()];
        char[] j=new char[t.length()];
        for(int i=0; i<s.length();i++){
            k[i] = s.charAt(i);
            j[i] = t.charAt(i);
        }
        Arrays.sort (k);
        Arrays.sort (j);
        return Arrays.equals(k,j);
    }
}
