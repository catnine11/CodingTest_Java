class Solution {
   public String solution(String s) {

        String[] words = s.split(" ", -1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
//            StringBuilder sb = new StringBuilder();
            String convert = "";

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if(j % 2 == 0) {
//                    sb.append(Character.toUpperCase(c));
                    char up = Character.toUpperCase(c);
                    convert += up;
                } else {
//                    sb.append(Character.toLowerCase(c));
                    char down = Character.toLowerCase(c);
                    convert += down;
                }
            }

            result.append(convert);

            if (i < words.length - 1) {
                result.append(" ");
            }

        }


        return result.toString();
    }
}