    /* 
    Problem: Implement Binary Search
    Time-complexity: O(log n)
    Space-complexity: O(log n)
    */ 

class BinarySearch {
    //Test Implementation
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        int result = BinarySearch.findNumberIndex(6, list, 0, list.length - 1);
        System.out.println(result); 
    }

    public static int findNumberIndex(int target, int[] list, int start, int end) {
        if (start > end) {
            return -1; 
        }
        int mid = (start + end) / 2;

        if (list[mid] == target) {
            return mid;
        } else if (list[mid] > target) {
            return findNumberIndex(target, list, start, mid - 1);
        } else {
            return findNumberIndex(target, list, mid + 1, end);
        }
    }
}
    /*
    Can it be better?
    Yes, by solving iteratively:
    Time-complexity: O(log n)
    Space-complexity: O(1)
    TODO: Figure out how to do this
    */