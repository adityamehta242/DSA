#include<iostream>
 
using namespace std;

int main()
{
	int Arr[5];
	Arr[0] = 10;
	Arr[1] = 20;
	Arr[2] = 30;
	
	printf("IS it Working \n");
	cout<<"Size of Array : "<<sizeof(Arr)<<endl;
	
	for(int i = 0; i<3;i++)
	{
		cout<<Arr[i]<<endl;
	}
	
	return 0;
}
