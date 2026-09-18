# Searching

- Searching is an operation that finds whether a specific element (or its position) exists in a collection of data.

- For example, given the list `[10, 25, 30, 45, 60]`, searching for `30` → found at index 2.

- Searching returns one of the following:
  - When found:
    1. `boolean` → `true` / `false` (exists or not)
    2. `index` → position number
    3. `object` → the found element
    4. `reference` → pointer to node
  - When not found → `-1`, `null`, `false`, or `undefined`

## Types of Searching

### 1. Linear Search

- Checks the entire dataset one by one, from start to end.
- Works on unsorted data.
- Gets slower as the dataset grows.

#### Time Complexity for Linear Search

- O(n)
  - Best: O(1) (target present at first index, 1 comparison only)
  - Worst: O(n) (target present at end or absent, comparisons = number of elements)

#### Space Complexity for Linear Search

- O(1) : Uses only a constant amount of extra memory regardless of dataset size.
- No extra space required for searching.

#### Algorithm for Linear Search

1. With any loop (`for`, `enhanced-for`, `while`, `do-while`) start the traversing the loop form one end to another
2. With every iteration check data, it condition matches mark, copy, move or delete the data or if the condition did'nt match with any of the data exit the loop.

#### Implementation for Linear Search

```java example: find the value in give array

import java.util.Arrays;

class ArrayLinerSearch {
  public static void main(String[] args) {
    int arr[] = { 18, 12, 9, 14, 77, 50 };
    int target1 = 9;
    int result1 = linearSearch(arr, target1);

    if (result1 != -1) 
      System.out.println("Found " + target1);
    else 
      System.out.println("Found Not " + target1);
  }

  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i; // Condition Matched
    }
    return -1; // No Condition Matched
  }
}
```

### 2. Binary Search

- Takes a sorted dataset and repeatedly divides it in half.
- The only requirement is that the data must be sorted beforehand in ascending or descending order
- Optimized and Ridiculously fast compare to linear searching.

#### Time Complexity for Binary Search

- O(log n)
  - Best: O(1) (target present at middle index)
  - Worst: O(log n) (target absent or at extremes)

#### Space Complexity for Binary Search

- O(1) : Uses only a constant amount of extra memory regardless of dataset size.
- No extra space required for searching.

#### Algorithm for Binary Search

1. Take a sorted collection where the search value and all elements are of the same type and ordered.
2. Mark the start and end of the collection, then find the middle element and compare it with the target. This gives 3 cases:
   1. Element matches target, return the index or a boolean flag indicating success.
   2. Element is greater than target, in an ascending array the target lies on the left, so move end to `mid-1`.
   3. Element is lesser than target, in an ascending array the target lies on the right, so move start to `mid+1`.
   4. Repeat until start becomes greater than end.

#### Implementation for Binary Search

```java find the element in sorted array
public class BinarySearch{
    public static void main(String args[]){
        int arr[] = new int[] {1, 3, 4, 7, 8, 11, 12, 16, 17, 19, 21, 23, 24, 27, 29, 31};
        System.out.println(binarySearch(arr, 11));

    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // int mid = (start+end)/2; bug
            int mid = start + (end - start) / 2;
            if (arr[mid]==target){
                return mid;
            }else{
                if (arr[mid]>target) end = mid -1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
```

- why it fails
  - `int mid = (start + end) / 2;`
  - `start + end` can overflow `int` datatype range when the search space is huge.
  - Example: start = -2,000,000,000 and end = 2,000,000,000 gives 4,000,000,000, which is bigger than Integer.MAX_VALUE (2,147,483,647).
  - This makes `mid` wrong, causing incorrect results or an infinite loop.

- how to fix
  - Use subtraction instead: `int mid = start + (end - start) / 2`
  - `end - start` never overflows, so `mid` stays correct.

- How `(start + end) / 2` equals `start + (end - start) / 2`
  - Take the right side: `start + (end - start) / 2`
  - Put everything over a common denominator of 2: `= (2*start + end - start) / 2`
  - Simplify the numerator (`2start - start = start`): `= (start + end) / 2`
  - Which is exactly the left side: `(start + end) / 2`, so both give the same answer
  - The only difference is the order of operations is `(start + end) / 2` adds first, which can overflow and `start + (end - start) / 2` subtracts first, which never overflows.

#### Why binary search is better ?

![Reduction in Search space of binary search](./binary-search-space-reduction%20.png)

#### Why binary search is better?

- Linear search checks elements one by one, so it takes O(n) time.
- Binary search divides the dataset in half each time, so it takes O(log n) time.
- For example, in a dataset of 1,000,000 elements:
  - Linear search may need up to 1,000,000 comparisons.
  - Binary search needs at most about 20 comparisons.
- It is much faster and efficient than linear search for large datasets  because it eliminates half of the remaining elements in every step.

- maths behind binary search
  - Binary search works by repeatedly cutting the search range in half.
  - Let n be the number of elements in the sorted dataset.
    - Step 1: search range = n
    - Step 2: search range = n/2
    - Step 3: search range = n/4
    - and so on...
  - After k steps, the remaining search range is n / 2^k.
  - We stop when the search range becomes 1 (only one element left to check).
  - So we set n / 2^k = 1
  - n = 2^k
  - Taking log base 2 on both sides: k = log2(n)
  - Therefore, the number of steps needed is log2(n).
  - So the time complexity of binary search is O(log n). Note: the base of the logarithm does not matter in Big O notation, because log base change only multiplies by a constant. So O(log2 n) is written as O(log n).
  - example
    - n = 1,000,000,000 (1 billion)
    - log2(1,000,000,000) ≈ 30
    - So at most 30 comparisons are needed

> Rules of thumb for DSA problems based on index-based operations, for a sorted collection, try binary search and for an unsorted collection, use linear search


1. when `while(start<=end)` is run at last the `start` is `end+1`