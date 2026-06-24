class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int ss=0;
        while(n>0){
           int r=n%10;
           sum= sum+r;
          ss=ss+(r*r);
           n=n/10;
        }
        if((ss-sum)>=50){
            return true;
        }
        else{
            return false;
        }

        
        
    }
}