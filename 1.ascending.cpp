#include <iostream>
using namespace std;

int main() {
    int size;
    cout << "Enter the size of the array : \n";
    cin >> size;
    int nums[size];
    
    for(int i=0; i<size; i++){
        cout << "Enter number " << (i+1) << endl;
        cin >> nums[i];
    }

 
    for(int i=0; i<size; i++) {
        for(int j = i+1; j < size; j++){
            if(nums[j] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
    }

    for (int i = 0; i < size; i++)
    {
        cout << nums[i] << " ";
    }
    
    return 0;
}


