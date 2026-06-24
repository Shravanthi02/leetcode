class Solution {
    public boolean validDigit(int n, int x) {
        boolean found = false;
        int temp = n;
        while(temp>0){
            int dig = temp%10;

            if(dig == x){
                found =  true;
            }
            
            temp=temp/10;
        }
      while(n>=10){
          n/=10;
      }
        int fDig = n;
        if(fDig==x)return false;

        
        return found;
      
    }
}