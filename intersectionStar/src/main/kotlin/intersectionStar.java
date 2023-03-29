import java.util.*;
class Solution {

    long cal_D(int[] a, int[] b)
    {
        return a[0]*b[1] - a[1]*b[0];
    }


    double point_x(int[] a, int[] b)
    {
        return (a[1]*b[2] - a[2]*b[1]) / cal_D(a, b);
    }

    double point_y(int[] a, int[] b)
    {
        return (a[2]*b[0] - a[0]*b[2]) / cal_D(a, b);
    }
    //=====================================================================================
    public String[] solution(int[][] line) {
        String[] answer = {};

        List<long[]> list = new ArrayList<>();
/*
        long min_x = Long.MIN_VALUE;
        long max_x = Long.MAX_VALUE;
        long min_y = Long.MIN_VALUE;
        long max_y = Long.MAX_VALUE;
        //========================OK==================================
        for(int i = 0; i < line.length; i++)
        {
            for(int j = i+1; j < line.length; j++)
            {   

                if(cal_D(line[i], line[j]) == 0) break;
                double a = point_x(line[i], line[j]);
                double b = point_y(line[i], line[j]);
                if(a % 1.0 == 0 && b % 1.0 == 0)
                {
                    list.add(new long[]{(long)a, (long)b});
                    min_x = Math.min(min_x, (long)a);
                    max_x = Math.max(max_x, (long)a);                           
                    min_y = Math.min(min_y, (long)b);
                    max_y = Math.max(max_y, (long)b);
                }
            }
        }
*/
        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;

        for(int i = 0; i < line.length; i++){
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];

            for(int j = i+1; j < line.length; j++){
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long xUp = b*f - e*d;
                long xDown = a*d - b*c;

                long yUp = e*c - a*f;
                long yDown = a*d - b*c;

                if(xDown != 0){
                    double x = xUp / (double)xDown;
                    double y = yUp / (double)yDown;

                    if(x == Math.ceil(x) && y == Math.ceil(y)){
                        list.add(new long[]{(long)x, (long)y});
                        minX = Math.min(minX, (long) x);
                        maxX = Math.max(maxX, (long) x);
                        minY = Math.min(minY, (long) y);
                        maxY = Math.max(maxY, (long) y);
                    }
                }


            }
        }
/*
        boolean[][] star = new boolean[(int)(max_y - min_y +1)][(int)(max_x - min_x +1)];
        
        for(long[] k : list)
        {
            int x = (int)(k[0] - min_x);
            int y = (int)(k[1] - max_y);
            star[Math.abs(y)][Math.abs(x)] = true;
            // 다 땡겨서 새로 점찍기 (표준화)
        }
        
        answer = new String[star.length];
        int i = 0;
        for(boolean[] s : star)
        {
            StringBuilder  sb = new StringBuilder();
            for(boolean b : s)
            {
                if(b) sb.append("*");
                else sb.append(".");
            }
            answer[i] = sb.toString();
            i++;
        }
        
        return answer;
    }
}
*/
        boolean[][] answerTemp = new boolean[(int) (maxY- minY +1)][(int) (maxX - minX + 1)];

        for (long[] ints : list) {
            int x = (int) (ints[0] - minX);
            int y = (int) (ints[1] - maxY);

            answerTemp[Math.abs(y)][Math.abs(x)] = true;
        }

        answer = new String[answerTemp.length];

        int i = 0;
        for (boolean[] bs : answerTemp) {
            StringBuilder sb = new StringBuilder();
            for (boolean b : bs) {
                if(b){
                    sb.append("*");
                }else{
                    sb.append(".");
                }
            }
            answer[i] = sb.toString();
            i++;
        }

        return answer;
    }
}