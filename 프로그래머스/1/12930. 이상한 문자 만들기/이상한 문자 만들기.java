class Solution {
   public String solution(String s) {

        String[] words = s.split(" ", -1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
           StringBuilder sb = new StringBuilder();
            String convert = "";

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if(j % 2 == 0) {
                   sb.append(Character.toUpperCase(c));
                } else {
                   sb.append(Character.toLowerCase(c));
                }
            }

            result.append(sb);

            if (i < words.length - 1) {
                result.append(" ");
            }

        }


        return result.toString();
    }
}