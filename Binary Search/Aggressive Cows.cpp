#include<iostream>
#include <algorithm>
using namespace std;

bool canPlace(int arr[], int n, int mid, int c){

	int count = 1;
	int left = 0;

	for(int i=1; i<n; i++){
		if(arr[i] - arr[left] >= mid){
			count++;
			left = i;
		}
	}
	
	if(count >= c){
		return true;
	}
	
	return false;

}

int main() {
	
	int n, c;
	cin>>n>>c;
	int arr[n];

	for(int i=0; i<n; i++){
		cin>>arr[i];
	}

	sort(arr, arr+n);

	int low = 0; // 1
	int high = arr[n-1] - arr[0]; // 6
	int count = 1;
	int res = 0;

	while(low <= high){

		int mid = (high + low) / 2;

		if(canPlace(arr, n, mid, c)){
			res = mid;
			low = mid+1;
		}
		else{
			high = mid-1;
		}
		
	}

	cout<<res<<endl;


}
