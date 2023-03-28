#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;


    int count=0;
    int max=0, min=0;
    for(int i = 0 ; i < lottos.size();i++)
        if(lottos.at(i)==0)
            max++;

    for(int i = 0 ; i < lottos.size();i++)
        for(int j = 0 ; j < win_nums.size();j++)
            if(lottos.at(i)==win_nums.at(j))
                count++;

    max += count;
    min += count;

    switch(max)
    {
        default: answer.push_back(6); break;
        case 2: answer.push_back(5); break;
        case 3: answer.push_back(4); break;
        case 4: answer.push_back(3); break;
        case 5: answer.push_back(2); break;
        case 6: answer.push_back(1); break;
    }
        switch(min)
    {
        default: answer.push_back(6); break;
        case 2: answer.push_back(5); break;
        case 3: answer.push_back(4); break;
        case 4: answer.push_back(3); break;
        case 5: answer.push_back(2); break;
        case 6: answer.push_back(1); break;
    }


    //answer.push_back(max);
    //answer.push_back(min);
    return answer;
}