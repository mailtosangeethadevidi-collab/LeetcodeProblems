class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        if(s.charAt(0)=='?'&&n==1){
            
         return "a";
        }
        if (s.charAt(0) == '?' && n > 1) {
            if (s.charAt(1) != 'a' && s.charAt(1)!='?')
                sb.setCharAt(0, (char) (s.charAt(1) - 1));
            else
                sb.setCharAt(0, 'b');
        }

        for (int i = 1; i < sb.length() - 1; i++) {
            char curr = sb.charAt(i);
            char left = sb.charAt(i - 1);
            char right = sb.charAt(i + 1);
            if (curr == '?') {
                if (left != 'a' && right != 'a')
                    sb.setCharAt(i, 'a');
                else if (left != 'b' && right != 'b') {
                    sb.setCharAt(i, 'b');
                } else {
                    sb.setCharAt(i, 'c');
                }
            }
            System.out.println(sb.toString());
        }
        if (sb.charAt(n - 1) == '?') {
             
            if (sb.charAt(n - 2) != 'a'){
                sb.setCharAt(n - 1, (char) (sb.charAt(n - 2) - 1));
                System.out.println("u");
            }
            else
                sb.setCharAt(n - 1, 'b');
        }
        // System.out.println((char) (s.charAt(n - 2) - 1));

        return sb.toString();

    }
}