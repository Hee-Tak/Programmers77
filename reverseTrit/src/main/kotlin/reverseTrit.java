class Solution {
    public int solution(int n) {

        if(n==1 || n==2)
            return n;
        int answer = 0;
        //int a = n; //몫
        int b = 0; //나머지
        int cnt = 0; //아래의 for문이 얼마나 도는지 체크
        StringBuffer sb = new StringBuffer(); //앞뒤 반전(3진법) 의 수를 담고 있을 그릇 
        for(int i = 0; ; i++)
        {
            //a = n / 3;
            b = n % 3;
            n = n / 3;
            //System.out.print(b);
            sb.append(Integer.toString(b));
            cnt++;
            if(n <= 2)
            {
                //System.out.print(n);
                sb.append(Integer.toString(n));
                break;
            }
        }

        String s = sb.toString();
        double k = 0; //10진법으로 표현할 수 저장, 원래는 int로 할라햇는데 pow때매 double로.
        for(int i = 0; i <=cnt ; i++)
        {
            //k = k + Math.pow(Integer.parseInt(Character.toString(s.charAt(i))),cnt-i);
            k = k + (Math.pow(3, cnt-i) * Integer.parseInt(Character.toString(s.charAt(i))));

            System.out.println(k);
        }

        answer = (int)k;
        return answer;
    }
}