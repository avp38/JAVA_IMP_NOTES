// HashMap Tricks

// 1. Access all keys of HashMap & get their values
HashMap<Character, Integer> map = new HashMap<>();
for (char key : map.keySet()) {
  int frequency = map.get(key); // Get value
  ...
}


