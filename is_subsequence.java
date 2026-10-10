// find if the string1 is a subsequence of the second string

public boolean subsequence(String s, String t){
    int i=0;
    int j=0;

    while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        }
        else{
            j++;
        }
    }
    return(i==s.length());
}