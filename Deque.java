// How to use Deque
// Advantage -->  Can be used to read from both ends with O(1)
// For more details --> https://www.tutorialspoint.com/java/util/java_util_arraydeque.htm
// use deque.push()
// then to access from opposite end --> use deque.removeLast()
// ex: 

Deque<String> deque = new ArrayDeque<>();
deque.push("a");
deque.push("b");
deque.pop(); // Will give "b"
deque.push("c");
deque.push("d");
deque.push("e");
deque.push("f");
deque.removeLast(); // Will give "a" --> allows access to first element of stack 

