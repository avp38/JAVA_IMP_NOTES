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


// Return array of specific size by directly initializing it
return new int[]{incr, decr};
//OR
return new int[]{1,0}; // NOTE Here a common mistake is to add the size ex: return new int[2]{1,0}; --> This is wrong

// If you only want to return empty array --> Then it is
return new int[2]; 
// Whenever you are doing direct initialization --> never mention size of array


//NOTE: for iterator if using next() --> always use typecasting --> V-IMP --> since it returns object
int val = (int)it.next(); // Example

// NOTE: -- V-IMP
char c = '1';
Integer.valueOf(c);// --> will give 49(Ascii value) and not 1 --> But works for Strings 

// NOTE : if youy want to add shortcut expression ina addition statement it has to be in brackets otherwise will give wrong ans
dp[i][j] = 2+ (len>2 ? dp[i+1][j-1] : 0); // It has to be written this way
// dp[i][j] = 2+ len>2 ? dp[i+1][j-1] : 0;// If you write without brackets --> it will give wrong ans
