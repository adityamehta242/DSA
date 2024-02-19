#include<iostream>
using namespace std;

int main()
{
	int A[10] = {10,20,30,40,50};
	
	printf("Dirctly Access the Array %d \n", A[4]);
	
	for(int i  = 0 ;i< 10;i++ )
	{
		printf("%d\n", A[i]);
	}
	
	cout<<"Working fine";
}
