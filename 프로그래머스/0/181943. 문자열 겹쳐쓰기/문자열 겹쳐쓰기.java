class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        String front = my_string.substring(0, s);
        String after = my_string.substring(s+overwrite_string.length());
        answer = front + overwrite_string + after;
        return answer;
        
        // StringBuilder sb = new StringBuilder(my_string);
        // sb.replace(s, s+overwrite_string.length(), overwrite_string);
        // return sb.toString();
    }
}