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
