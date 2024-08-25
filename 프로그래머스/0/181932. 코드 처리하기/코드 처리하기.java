class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char[] codeArray  = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < codeArray.length; i++) {
            if(codeArray[i] == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if(mode == 0 && i % 2 == 0) {
                    sb.append(codeArray[i]);
                } else if(mode == 1 && i % 2 == 1) {
                    sb.append(codeArray[i]);
                }
            }
        }
        
        String answer = sb.toString();
        
        return answer.isEmpty()? "EMPTY" : answer;
    }
}