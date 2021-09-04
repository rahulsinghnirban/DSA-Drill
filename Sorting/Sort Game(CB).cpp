Submission ID: #11105921
#include<iostream>
#include<algorithm>
// #include<utility>
// #include<bits/stdc++.h>
using namespace std;

bool compare(pair<string, int> e1, pair<string, int> e2){
	if(e1.second == e2.second){
		return e1.first < e2.first;
	}

	return e1.second > e2.second;
}

int main() {
	int x,n;
	cin>>x>>n;

	string str = "";
	int num = 0;

	pair<string, int> emp[100000];

	for(int i=0; i<n; i++){
		cin>>str>>num;
		emp[i].first = str;
		emp[i].second = num;
	}

	sort(emp, emp+n, compare);

	for(int i=0; i<n; i++){
		if(emp[i].second >= x){
			cout<<emp[i].first<<" "<<emp[i].second<<endl;
		}
	}
  
}
