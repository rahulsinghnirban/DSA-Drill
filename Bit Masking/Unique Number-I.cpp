#include<iostream>
using namespace std;
int main() {
	int n;
	cin>>n;

	int arr[n];
	
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}

	int temp = arr[0];

	for(int i=1; i<n; i++){
		temp = temp ^ arr[i];
	}

	cout<<temp;
}
