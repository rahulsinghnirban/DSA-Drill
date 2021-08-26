/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) { // 5
           
        long li = 1;
        long ri = n;
        long result = n;
        

        
        while(li<=ri){
            
            long mid = (li + ri) / 2; // 4
            
            if(isBadVersion((int)mid) == false){
                li = mid + 1;
            }
            else if(isBadVersion((int)mid) == true){
                
                result = mid;
                ri = mid - 1;
            }
            
            
        }
        
        return (int)result;
        
    }
}
