// To sort any Collections --> (ex: ArrayList,..)
//Suppose ArrayList a;
Collections.sort(a);
//Also to reverse use
Collections.reverse(a);

// If you neeed powers of 2 --> ALWAYS USE Binary Manipulation Instead of Math.pow
// Binary Manipulation is very FAST compared to Math.pow
// NOTE: For POWERS OF TWO ONLY
// 2^n = 1<<n; 
// But be CAREFUL that n>=0, If nbecomes negative --> will give weird results

// IMP NOTE --> This sum shows way to use List<Integer> with LinkedList<>()
// Main Idea:
// Do not use addFirst or addLast --> since these methods are not defined for List<Integer>
// But instead use --> add(0,val) & add(val) --> Both have O(1) complexity with LinkedLis
