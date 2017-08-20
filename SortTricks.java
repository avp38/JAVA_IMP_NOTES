// To sort Array
// Suppose array is nums[]
Arrays.sort(nums)

// If there is 2D Array and you need to sort the 2D array based on 1 column --> Then Use
// Array is points[][] 
Arrays.sort(points, (a,b)->a[0]-b[0]);
// NOTE: a[0]-b[0] --> Ascending Order
// For descending order --> b[0]-a[0]
