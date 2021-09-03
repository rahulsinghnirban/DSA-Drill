// we'll search for first index by looking for the element in the left direction and for the last index, we'll look in the right direction by binary search algorithm. So,
// we'll use Binary search two times.

#include<iostream>
using namespace std;
int main() {
	
	int n;
	cin>>n;
	int arr[n];

	for(int i=0; i<n; i++){
		cin>>arr[i];
	}

	int q;
	cin>>q;

	while(q--){
		int num;
		cin>>num;

		// search-1

		int low = 0;
		int high = n-1;
		int fin = -1;

		int mid = 0;

		while(low <= high){
			mid = (low+high)/2; //2

			if(arr[mid] == num){
				fin = mid;
				high = mid-1;
			}
			else if(arr[mid] > num){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
    
    // search -2

		low = 0;
		high = n-1;
		int lin = -1;

		while(low <= high){
			mid = (low+high)/2;

			if(arr[mid] == num){
				lin = mid;
				low = mid+1;
			}
			else if(arr[mid] > num){
				high = mid - 1;
			}
			else{
				low = mid +1;
			}
		}

		cout<<fin<<" "<<lin<<endl;
		
	}


}
