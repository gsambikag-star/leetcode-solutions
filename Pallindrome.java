public boolean ispallindrome(int x){
    if(x<0){
        return false;
    }
    int num=x;
    int revnum=0;
    while(n>0){
        int d=num%10;
        revnum=revnum*10+d;
        num=num/10;
    }
    if(revnum==x){
        return true;
    }
    else{
        return false;
    }
}