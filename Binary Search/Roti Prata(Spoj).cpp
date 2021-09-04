#include<iostream>
using namespace std;

bool allocation(int arr[], int n, int mid, int b){
	int csum = 0;
	int count = 1;

	for(int i=0; i<n; i++){

		csum += arr[i]; //113

		if(mid < arr[i]) return false;

		if(csum > mid){
			count++;
			csum = 0;
			csum += arr[i];
		}

		// cout<<count<<" ";

	}

	// cout<<endl;

	if(count<=b){
		return true;
	}
	return false;

}

int main() {
	int t;
	cin>>t;

	while(t--){
		int n, b;
		cin>>n>>b;
		int arr[n];
		int sum = 0;

		for(int i=0; i<n; i++){
			cin>>arr[i];
			sum += arr[i];
		}

		int low = arr[0]; // if no of students are equal to number of books then each student must get at least one book so the minimum pages book will be allocated to student which will be book at first index of array cuz it's increasing.
		int high = sum; // the max no of pages of books will be allocated if number of students is one. So, that one student has to read all the books with their respective no of pages so, high = sum of all the pages of book.
		int res = 0;

		while(low<=high){

			int mid = (low+high)/2;
				// cout<<res<<" ";
			if(allocation(arr, n, mid, b)){
				res = mid;
				high = mid-1; // if allocation possible then we'll try to search for a minimum possible number as the question states it that we want the minimum so to get minimum our search space will on the left side so we'll reduce high.
			}
			else{
				low = mid+1; // if allocation is not possible then we have to increase the gap which is the "mid", so to increase it, we have to make our search gap towards the right side and hence, increasing low.
			}

		}

		cout<<res<<endl;
	}
}
