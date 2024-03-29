// To convert long to Integer
long a = 10;
int b = (int)a;

// Arrays .sort method --> Check all Constructors
// Also works for character array
char[] a ={'1','4','6','3','5'} ;
Arrays.sort(a);
Arrays.sort(a, 2, a.length); // To sort from index position 2 till end (Note: end is last_index+1)

// To get MAX Integer val
int maxInt = Integer.MAX_VALUE;
// Similarly can use for min value --> Also works for long 

//V-IMP --> When multiplying something for long --> make sure it has some long component int it
//ex: 
long high = 10*k +1; //Now if k is int and is INTEGER.MAX_VALUE --> this will give wrong ans
//So use 
long high = 10L*k +1;
