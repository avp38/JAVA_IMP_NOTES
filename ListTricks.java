/*
LinkedList Tricks --> LeetCode Sum : 406
This is used when you want to insert an element at position index
and you want the remaining elements to move forward in the list
*/

// Note this step takes O(n^2) time complexity
// Since every insert is O(n)
List<int[]> list = new LinkedList<>();
for (int[] p : people) {
    list.add(p[1], p);
}

// This is a very IMP STEP below
// Here we convert List<int[]> to int[][]
// so we use toArray() function --> Take a close look at syntax
// It is (new int[list.size()][]);
return list.toArray(new int[list.size()][]);
