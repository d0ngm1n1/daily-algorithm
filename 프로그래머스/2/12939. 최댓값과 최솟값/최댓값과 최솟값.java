class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String n : s.split(" ")) {
            int num = Integer.parseInt(n);

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        return min + " " + max;
    }
}