#include<iostream>
using namespace std;

int countBits(int a, int b){

	int count = 0;

	for(int i=a; i<=b; i++){
		int n = i;
		while(n){
			n = n & (n-1);
			count++;
		}
	}

	return count;
}

int main() {
	int t;
	cin>>t;

	while(t--){
		int a,b;
		cin>>a>>b;

		cout<<countBits(a,b)<<endl;
	}
}
