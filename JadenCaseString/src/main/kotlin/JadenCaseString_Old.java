class Solution {
    public String solution(String s) {
        String answer = "";
        //int i = s.charAt(0);
        //if(i>=97&&i<=122)
        //    i += 32;
        //s.setCharAt(0, (char)i);

        /*
        String A = s.toLowerCase();
        int i = s.charAt(0);
        if(s.charAt(0)>=97&&s.charAt(0)<=122)
            s.setCharAt(0, i+32);
        answer = A;
        */

        StringBuilder sb = new StringBuilder(s.toLowerCase());
        //int i = (int)sb.charAt(0);
        //if(sb.charAt(0)>=97&&sb.charAt(0)<=122)
        //    sb.setCharAt(0, (char)(i+32));
        String firstletter = sb.substring(0,1);
        firstletter = firstletter.toUpperCase();
        String lastletter = sb.substring(1,sb.length());
        answer = firstletter + lastletter;



        return answer;
    }
}