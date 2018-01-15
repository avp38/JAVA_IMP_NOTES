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

// If you want to convert a List<Integer> to int[] --> you have to do it manually
// There is no other better way OR better write your own method 
int[] toIntArray(List<Integer> list){
  int[] ret = new int[list.size()];
  for(int i = 0;i < ret.length;i++)
    ret[i] = list.get(i);
  return ret;
}

// Return List<Integer> in initialized form --> Similar to --> return new int[]{-1,-1} 
return Arrays.asList(-1,-1); // NOTE: Here it is () instead of {}
