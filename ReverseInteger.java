class ReverseInteger {
    public int reverse(int x) {
        var holder = 0;
        int ans = 0;
        if(x > 0) {
            holder = 1;
        }  
        if(x < 0) {
            holder = -1;
        }
        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(x)));
        str.reverse();
        System.out.println(str.toString());
        if(holder < 0) {
            ans = (int) Long.valueOf(str.toString()) *-1;
        }else {
            ans = (int) Long.valueOf(str.toString());
        }
        
         return ans ;}
}