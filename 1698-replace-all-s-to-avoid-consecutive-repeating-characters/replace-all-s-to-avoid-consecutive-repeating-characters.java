class Solution {
    public String modifyString(String s) {
        // StringBuilder sb = new StringBuilder(s);
        char arr[]=s.toCharArray();
        int n = arr.length;
        if(arr[0]=='?'&&n==1){   
          return "a";
        }
        if (arr[0] == '?' && n > 1) {
            if (arr[1] != 'a' && arr[1]!='?')
                arr[0]=(char) (arr[1] - 1);
            else
                arr[0]='b';
        }

        for (int i = 1; i < n - 1; i++) {
            char curr = arr[i];
            char left = arr[i-1];
            char right = arr[i+1];
            if (curr == '?') {
                if (left != 'a' && right != 'a')
                    arr[i]='a';
                else if (left != 'b' && right != 'b') {
                   arr[i]='b';
                } else {
                    arr[i]='c';
                }
            }
            // System.out.println(sb.toString());
        }
        if (arr[n-1] == '?') {
             
            if (arr[n-2] != 'a'){
                arr[n-1]= (char) (arr[n-2]-1);
                // System.out.println("u");
            }
            else
                arr[n-1]='b';
        }
        // System.out.println((char) (s.charAt(n - 2) - 1));

       return new String(arr);

    }
}