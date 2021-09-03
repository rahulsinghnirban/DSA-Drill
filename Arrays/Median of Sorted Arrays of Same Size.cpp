//sol1

#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int n;
	cin>>n;
	int a[n];
	int b[n];
	int c[n+n];
	
	for(int i=0; i<n; i++){
		cin>>a[i];
		c[i] = a[i];
	}
	for(int i=0; i<n; i++){
		cin>>b[i];
		c[i+n] = b[i];
	}

	sort(c, c+n+n);

	int ans = (c[n-1] + c[n])/2;

	cout<<ans;
}

//sol 2

#include<iostream>
#include<algorithm>
using namespace std;

int findMedian(int a[], int b[], int n){
	int in1 = 0; //index of first array
	int in2 = 0; //index of second array
	int i = 0; //index of new array
	int arr[n+n];

	while(in1 < n && in2 < n){

		if(a[in1] <= b[in2]){
			arr[i] = a[in1];
			i++;
			in1++;
		}
		else{
			arr[i] = b[in2];
			i++;
			in2++;
		}

		if(in2 == n){
			while(in1 < n){
				arr[i] = a[in1];
				i++;
				in1++;
			}
		}

		if(in1 == n){
			while(in2 < n){
				arr[i] = b[in2];
				i++;
				in2++;
			}
		}

	}

	return (arr[n]+arr[n-1])/2;

}

int main() {
	int n;
	cin>>n;
	int a[n];
	int b[n];
	
	for(int i=0; i<n; i++){
		cin>>a[i];
	}
	for(int i=0; i<n; i++){
		cin>>b[i];
	}

	cout<<findMedian(a, b, n);
	
}
