// to check whether the given string is a pallindrome or not

public boolean ispallindrome(String s){
    s=s.toLowerCase();
    s=s.replace(" ","");

    int i=0;
    int j=s.length()-1;

    while(i<j){
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);

        if(!(ch1>='a'&& ch1<='z' || ch1>='0' && ch1<='9')){
            i++;
            continue;
        }
        if(!(ch2>='a'&& ch2<='z' || ch2>='0' && ch2<='9')){
            j--;
            continue;
        }
        if(ch1!=ch2){
            return false;
        }
        i++;
        j--;
    }
    return true;
}