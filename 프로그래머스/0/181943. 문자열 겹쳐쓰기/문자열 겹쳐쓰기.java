class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String front = my_string.substring(0, s);
        if(my_string.length() <= s+overwrite_string.length()){
            answer = front + overwrite_string;
        } else{
        String after = my_string.substring(s+overwrite_string.length());
        answer = front + overwrite_string + after;
        }
        return answer;
    }
}