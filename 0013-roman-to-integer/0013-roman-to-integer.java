class Solution {
    public int romanToInt(String s) {
        String s1=s.replace("IV","IIII");
        String s2=s1.replace("IX","VIIII");
        String s3=s2.replace("XL","XXXX");
        String s4=s3.replace("XC","LXXXX");
        String s5=s4.replace("CD","CCCC");
        s=s5.replace("CM","DCCCC");
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch(c){
                case 'I':
                    ans=ans+1;
                    break;
                case 'V':
                    ans=ans+5;
                    break;
                case 'L':
                    ans=ans+50;
                    break;
                case 'C':
                    ans=ans+100;
                    break;  
                case 'D':
                    ans=ans+500;
                    break;
                case 'M':
                    ans=ans+1000;
                    break;
                case 'X':
                    ans=ans+10;
                    break;  
            }
        }
        return ans;
    }
}