class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        x = int(math.sqrt(num))
        return x * x == num
         
        