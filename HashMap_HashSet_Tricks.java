// HashMap Tricks

// 1. Access all keys of HashMap & get their values
HashMap<Character, Integer> map = new HashMap<>();
for (char key : map.keySet()) {
  int frequency = map.get(key); // Get value
  ...
}

// In order to automatically set default value when value does not exist in map --> USE
map.getOrDefault(i, -1);
// In the above case, it first tries to find key with value i; if not present it returns default value of -1


// To subtract elements of Set A from Set B --> Use following
Set<String> a = new HashSet<>();
Set<String> b = new HashSet<>();
b.removeAll(a);

