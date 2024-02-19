#include<iostream>
#include<stdio.h>
 
using namespace std;

int main()
{
	int Arr[3];
	Arr[0] = 10;
	Arr[1] = 20;
	Arr[2] = 30;
	
	cout<<"Size of Array : "<<sizeof(Arr)<<endl;
//	Access Array Using For Each Loop

	for(int x :Arr)
	{
		cout<<x<<endl;
	}
	
	return 0;
}
