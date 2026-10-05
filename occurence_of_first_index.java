//to return the index of the first occurence of the word in haystack

public int Str(String haystack,String needle){
    for(int i=0;i<haystack.length();i++){
        if(haystack.charAt(i)==needle.charAt(0)){
            int j=0;//needle
            int k=i;//haystack
            while(j<needle.length() && k<haystack.length() && haystack.charAt(k)==needle.charAt(j)){
                j++;
                k++;
                if(j==needle.length()){
                    return i;
                }
            }
        }
    }
    return -1;
}