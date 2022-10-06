class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> ans = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            String ansStr = "";
            if (i%3 ==0) {
                ansStr += "Fizz";
            }
            if (i%5 ==0) {
                ansStr += "Buzz";
            }
            
            if (ansStr.equals("")) {
                ansStr = String.valueOf(i);
            }
                
            ans.add(ansStr);
        }
        return ans;
    }
}