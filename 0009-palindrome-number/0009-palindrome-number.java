class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        int og = x;
         if(x<0 || x!=0 && x%10 ==0 ) return false; // check this
        while(x!=0){
            int digit = x%10;
            rev = rev *10 + digit;
            x = x/10;
        }
        if(og == rev){
            return true;
        }
        else return false;
    }
}