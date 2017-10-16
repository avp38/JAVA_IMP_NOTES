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
