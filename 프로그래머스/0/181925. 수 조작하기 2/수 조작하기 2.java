class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int startNumber = 0;
        System.out.println("size = " + numLog.length);
        for (int i=0; i<numLog.length-1; i++){
            startNumber = numLog[i+1] - numLog[i];
            if(startNumber==1){
                answer+="w";
            }else if (startNumber==-1){
                answer+="s";
            }else if (startNumber==10){
                answer+="d";
            }else if (startNumber==-10){
                answer+="a";
            }
        }
        return answer;
    }
}