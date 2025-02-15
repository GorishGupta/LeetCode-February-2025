class Solution {
    public int punishmentNumber(int n) {
        long res = 0;
        //long curSum = 0;
        int cur = 1;
        while (cur <= n) {
            if (valid(cur, cur * cur)) {
                res += cur * cur;
              //  System.out.println(cur);
            }
            cur++;
        }
        return (int)res;
    }

    public boolean valid(int tar, int sq) {

        if (sq == tar) {
             //System.out.println("find ! " + sq);
            return true;
           
        } else if (sq < tar || tar < 0) {
            return false;
        }
        int ge = 0;
        int ten = 1;
        while (sq > 10) {
            ge += sq % 10 * ten; 
            if (valid(tar - ge, sq / 10)) {
                //System.out.println("find ! " + ge + " rem: " + sq);
                return true;
            } 
            sq /= 10;
            ten *= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.punishmentNumber(100));
    }

}