class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {

            for (int ele : pieces[i]) {
                map.put(ele, i);
            }

        }
        int arrIndex = 0;
        while (arrIndex < arr.length) {
            if(!map.containsKey(arr[arrIndex]))
              return false;
            int piecesIndex = map.get(arr[arrIndex]);
            for (int i = 0; i < pieces[piecesIndex].length; i++) {
                if (arr[arrIndex++] != pieces[piecesIndex][i])
                    return false;
            }

        }

        return true;

    }
}