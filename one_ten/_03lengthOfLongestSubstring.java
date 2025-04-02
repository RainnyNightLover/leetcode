package one_ten;


public class _03lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if( s.length() < 1 ){
            return 0;
        }
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++){
            int tempLen = 1;
            for (int j = i+1; j < s.length();j++){
                String subStr = s.substring(i,j);
                //关注substring的截取范围
                if (j+1 <= s.length()){
                    if (subStr.contains(s.substring(j,j+1))){
                        break;
                    }else{
                        tempLen++;
                        if (tempLen > maxLen){
                            maxLen = tempLen;
                        }
                    }
                }
            }
            //theck the boundry here
            if (maxLen >= (s.length() - i )){
                break;
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        _03lengthOfLongestSubstring _03lengthOfLongestSubstring = new _03lengthOfLongestSubstring();
        System.out.println(_03lengthOfLongestSubstring.lengthOfLongestSubstring("bbbb"));
    }

}
