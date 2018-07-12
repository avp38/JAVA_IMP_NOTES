// Priority Queue --> Min Heap
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);
pq.peek();// To peek top most min element --> Will not remove element
pq.poll();//To get top most min element --> Will remove element


// Priority Queue --> Max Heap (Using Lambda Function)
PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
pq.add(10);
pq.add(5);
pq.peek();// To peek top most min element --> Will not remove element
pq.poll();//To get top most min element --> Will remove element


// If it is a user-definbed class --> Then lambda function cannot be used
// So use comparator function
PriorityQueue<Element> pq = new PriorityQueue<Element>(new Comparator<Element>() {
			public int compare(Element a, Element b) {
				return a.value - b.value;
			}
		});


// Sort Priority Queue (Sort HashMap qty in descending order) and if same qty --> then string shd be in ascending order
// Create Heap
PriorityQueue<Map.Entry<String, Integer> pq = new PriorityQueue<>( 
    (a,b) -> a.getValue()==b.getValue() ?  a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue(); 
);

// NOTE: This definition will not word with double array since the compare method expects a integer --> But will work for 
// integer array
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]); //--> const


// V-IMP Method if you need min heap of fraction --> suppose you have nums[i] and you want heap of all fractions
// Then just use this lambda function (a,b)->a[0]*b[1] - a[1]*b[0]
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]*b[1]-a[1]*b[0]);
// Also note you can add an a and b can be indexes of an array in the lambda function
PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> A[a[0]] * A[b[1]] - A[a[1]] * A[b[0]]);
