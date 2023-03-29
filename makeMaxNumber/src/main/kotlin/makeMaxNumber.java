class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        //sb.append(number);
        int index = 0;
        for(int i = 0; i < number.length()-k;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = index ; j <= i+k; j++)
            {
                if(max < number.charAt(j)-'0')
                {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}