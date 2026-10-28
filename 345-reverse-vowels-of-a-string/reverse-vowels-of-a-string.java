class Solution {
    public String reverseVowels(String s) {
        char word[] = s.toCharArray();
        int st = 0;
        int end = s.length() - 1;
        String v = "aeiouAEIOU";
        while (st < end) {
            while (st < end && v.indexOf(word[st]) == -1)
                st++;
            while (st < end && v.indexOf(word[end]) == -1)
                end--;
            char temp = word[st];
            word[st] = word[end];
            word[end] = temp;
            st++;
            end--;
        }
        String res = new String(word);
        return res;
    }
}