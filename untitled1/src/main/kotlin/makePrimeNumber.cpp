#include <vector>
#include <iostream>
using namespace std;
int isPrime(int sum)
{
    for(int i = 2 ; i < sum; i++)
        if(sum%i == 0) return false;
    return true;
}

int solution(vector<int> nums) {
    int answer = -1;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    // cout << "Hello Cpp" << endl;

    int sum = 0;
    int count = 0;
    for(int i = 0 ; i < nums.size(); i++)
    {
        for(int j = i+1 ; j < nums.size(); j++ )
        {
            for(int k = j+1 ; k < nums.size(); k++)
            {
                sum = nums.at(i)+nums.at(j)+nums.at(k);

                //for(int x = 2 ; x < sum ; x++)
                //    if(sum % x == 0)
                //        break;
                // count++;
                if(isPrime(sum)) count++;
            }
        }
    }
    answer = count;

    return answer;
}