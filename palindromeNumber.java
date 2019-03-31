class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            String a = ""+x;
            int i = 0;
            int j = a.length()-1;
            while(i<a.length()/2){
                if(a.charAt(i)==a.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}