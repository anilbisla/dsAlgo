class Solution {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        System.out.println(array);
        
        int[] values = getValuesOfChar(array);
        
        int curr = 0;
        int prev = 0;
        int sum = 0;
        
        for (int i=0; i<values.length; i++) {
            prev = curr;
            curr = values[i];
            if (prev >= curr) {
                sum = sum + curr;
            } else {
                sum = sum - prev + curr - prev;
            }
        }
        
        return sum;
    }
    
    private int[] getValuesOfChar(char[] array) {
        int[] values = new int[array.length];
        for (int i=0; i<array.length; i++) {
            int val = 0;
            if (Character.compare(array[i], 'I') == 0) {
                val = 1;
            } else if (Character.compare(array[i], 'V') == 0) {
                val = 5;
            } else if (Character.compare(array[i], 'X') == 0) {
                val = 10;
            } else if (Character.compare(array[i], 'L') == 0) {
                val = 50;
            } else if (Character.compare(array[i], 'C') == 0) {
                val = 100;
            } else if (Character.compare(array[i], 'D') == 0) {
                val = 500;
            } else if (Character.compare(array[i], 'M') == 0) {
                val = 1000;
            }
            values[i] = val;
        }
        return values;
    }
}