//squaring the elements in array and sorting in ascending order

public int square(int nums[]){
    int n=nums.length;

    int result[]=new int[n];
    int i=0;
    int j=n-1;
    int k=n-1;

    while(i<=j){
        int leftsq=nums[i]*nums[i];
        int rightsq=nums[j]*nums[j];

        if(leftsq>rightsq){
            result[k]=leftsq;
            i++;
        }
        else{
            result[k]=rightsq;
            j--;
        }
        k--;
    }
    return result;
}