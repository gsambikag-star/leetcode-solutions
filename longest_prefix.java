//to find the longest prefix in the given array of strings
String longestPrefix(String [] strs){
    StringBuilder result=new StringBuilder();

    Arrays.sort(strs);

    char[] first=strs[0].toCharArray();
    char[] last=strs[strs.length-1].toCharArray();

    for(int i=0;i<first.length;i++){
        if(first[i]!=last[i])
        break;
        result.append(first[i]);
    }
    return result.toString();
}