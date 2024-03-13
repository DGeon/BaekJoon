class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int max = Math.max(str1.length(), str2.length());

        for(int i =0; i<max; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}