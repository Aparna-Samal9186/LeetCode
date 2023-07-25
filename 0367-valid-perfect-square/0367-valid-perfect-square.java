class Solution {
    public boolean isPerfectSquare(int num) {
        
        double dblSqroot=Math.sqrt(num);
        if(dblSqroot % 1.0==0.0){
            return true;
        }
        else{
            return false;
        }
    }
}