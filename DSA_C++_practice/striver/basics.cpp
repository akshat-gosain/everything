#include <bits/stdc++.h>
using namespace std;


void explainPair(){
    pair<int, int> p = {1, 3};
    cout << p.first << " " << p.second << endl;

    pair<int, pair<int, int>> p1 = {1, {3, 4}};
    cout << p1.first << " " << p1.second.first << " " << p1.second.second << endl;

    pair<int, int> arr[] = {{1, 2}, {2, 5}, {5, 1}};
    cout << arr[0].first << " " << arr[0].second << endl;
    cout << arr[1].first << " " << arr[1].second << endl;
}

void explainVector(){
    vector<int> v;
    v.push_back(1);
    v.push_back(2);
    v.emplace_back(3);
    v.emplace_back(4);
    

    cout << v[0] << " " << v[1] << " " << v[2] << " " << v[3] << endl;
    cout << v.at(2) << endl;
    cout << v.back() << endl;
    cout << v.front() << endl;
    cout << v.size() << endl;
    
    

    vector<pair<int, int>> v_p = {{1, 2}, {2, 5}, {5, 1}};
    cout << v_p[0].first << " " << v_p[0].second << endl;
    cout << v_p[1].first << " " << v_p[1].second << endl;

    v_p.push_back({1,2});
    cout << v_p[3].first << " " << v_p[3].second << endl;
    cout << v_p.capacity() << endl;
    cout << v_p.max_size() << endl;

    vector<int> v1(10, 2);
    cout << v1[1] << endl;
    cout << v1.size() << endl;
    cout << v1.capacity() << endl;
    cout << v1.max_size() << endl;

    vector<int> v2(10);
    cout << v2.size() << endl;
    cout << v2.capacity() << endl;
    cout << v2.max_size() << endl;

    vector<int> v3{1, 2, 3, 4, 5};
    cout << v3.size() << endl;
    cout << v3.capacity() << endl;
    cout << v3.max_size() << endl;

    vector<int> v4(v1);
    cout << v4[1] << endl;
}
int main(){
    
    explainPair();
    explainVector();

    return 0;
   
}