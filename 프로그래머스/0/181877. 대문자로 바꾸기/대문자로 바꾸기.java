class Solution {
    public String solution(String myString) {
        // String answer = "";
        // answer = myString.toUpperCase();
        // return answer;
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
        char c = myString.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                c -= 32; // 소문자를 대문자로 변환
            }
            answer.append(c);
        }
        return answer.toString();
    }
}