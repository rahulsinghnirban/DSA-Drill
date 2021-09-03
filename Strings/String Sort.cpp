#include<iostream>
#include<algorithm>
using namespace std;

bool compare(string s1, string s2){
	if(s1.find(s2) == 0 || s2.find(s1) == 0){
		return s1 > s2;
	}

	return s2 > s1;
}

int main() {
	int n;
	cin>>n;
	string arr[n];

	for(int i=0; i<n; i++){
		cin>>arr[i];
	}

	sort(arr, arr+n, compare);

	for(int i=0; i<n; i++){
		cout<<arr[i]<<endl;
	}

}
