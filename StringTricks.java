// For char -- Important functions
(java.lang packages)
Character.isLetterOrDigit(char ch)
Character.toLowerCase(char ch)

// To calculate ASCII value
char c = 'a';
int ascii = (int) c;
// Important ASCII VALUES
// 65-90 --> 'A'-'Z' ||| 97-122 --> 'a'-'z' ||| 48-57 --> '0'-'9'

/* If there are two range strings and if you have to check if between that range
Then use compareTo
String start="2000"; String end="2008"; String str="2004";
start.compareTo(str)<=0 && start.compareTo(str)>=0 --> then str is in the range between start and end
 Will also work For Timestamps ex: below
String start="2017:01:01:00:00:00"; String end="2017:05:31:23:59:59"; String str="2017:03:01:23:59:59";
*/
