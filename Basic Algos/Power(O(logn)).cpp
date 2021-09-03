#include<iostream>
using namespace std;

int pow(int x, int n){

	if(n==0){
		return 1;
	}

	// if n = even, x=x*x, n=n/2; // as 2^4 = 2^2 * 2^2;
  // if n = odd, x=x(x*x), n/2; // as 2^5 = 2 * 2^2 * 2^2;

	return n%2==0 ? pow(x*x, n/2) : x*pow(x*x, n/2);

}

int main() {
	int x, n;
	cin>>x>>n;
	int ans = 1;
	
	cout<<pow(x, n);
}
