class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
     if((my_string.length() >= 1 && my_string.length() <= 1000) && (overwrite_string.length() >= 1 && overwrite_string.length()<=1000)){
            String answer = "";
            answer += my_string.substring(0,s) + overwrite_string;
            answer += my_string.substring(answer.length(), my_string.length());
            return answer;
        }else{
            return "null";
        }
    }
}