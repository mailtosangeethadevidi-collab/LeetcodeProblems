class Solution {
    public long minimumMaxValue(int n, int index, int value) {
    
        if (value == 1)
            return -1;
        long primefactor = value;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                primefactor= i;
                break;
            }
        }

        if (value -primefactor+2 <= 2L * index)
            return -1;

        if (index == n - 1)
            return value;

        return value +  primefactor-2+2L *(n - 1 - index);

    }
}