class Solution {
    public boolean isAnagram(String s, String t) {

        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);

        for (int i = 0; i < sb1.length(); i++)
        {
            if ( sb2.indexOf(String.valueOf(sb1.charAt(i))) >= 0 )
            {
                sb2.deleteCharAt(sb2.indexOf(String.valueOf(sb1.charAt(i))));
            }
            else
                return false;
        }

        if ( sb2.length() == 0)
            return true;
        else
            return false;
    
    }
}
