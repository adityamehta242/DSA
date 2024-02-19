#include <iostream>

using namespace std;

int main()
{
    int length , sum = 0;
    cin>>length;
    int *marks = new int[length];
    for(int i = 0; i < length;i++)
    {
        cin>> *(marks+i);
    }
        delete[] marks;
        
    for(int i = 0; i< length; i++)
    {
        sum += *(marks+i);
    }
    
    cout<<"sum is "<<sum <<endl;

    return 0;
}
