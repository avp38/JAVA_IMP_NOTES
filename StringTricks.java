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
start.compareTo(str)<=0 && end.compareTo(str)>=0 --> then str is in the range between start and end
 Will also work For Timestamps ex: below
String start="2017:01:01:00:00:00"; String end="2017:05:31:23:59:59"; String str="2017:03:01:23:59:59";

s1.compareTo(s2)
if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0 
*/


// NOTE: Regex split method splits on regular expressions, and . in a regular expression means "any character"
// Therefore str.split(".") --> will not work
// Use
String[] parts = str.split("//.");
/*NOTE: Problem with String[] parts = split(".");
if(1.1.1.1) --> parts.length is 4
if(1.1.1.1.) --> Still parts.length is 4 --> does not handle the last "."
But if(.1.1.1.1) --> parts.length is 5 --> handles first "." 
*/

/* Understand meaning of regex statement used
https://stackoverflow.com/questions/225337/how-do-i-split-a-string-with-any-whitespace-chars-as-delimiters
http://www.rexegg.com/regex-quickstart.html
One more IMP NOTE --> when using split --> for example:  String[] parts= s.split(" ")
if the string s is " abc def" i.e. there is whitspace at beginning
then first element of parts array will be " " (blank space)
To avoid this --> trim the string
So should be String[] parts= s.trim().split(" ") OR String[] parts= s.trim().split("\\s+")
Also NOTE--> that if there is space in last element ("abc def ") it will ignore 
*/

// To check if String is numeric --> [NOTE: StringUtils method is not supported in LeetCode] *************
String s = "123";
StringUtils.isNumeric(s);
// To check if Alphanumeric (only letters and digit) --> use
StringUtils.isAlphanumeric(s);

// Using regex --> Both integer and floating point 
//NOTE:--> Only USE IF REQD --> MAKES PROGRAM SLOW *************
public boolean isNumeric(String s) {
    return s.matches("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)");
}

// To check if String a is lexicographicall smaller --> use compareTo method
//ex: String s1 = "a"; String s2 = "b"
a.compareTo(b) //--> This will give number less than 0 --> since "a" is lexicographically smaller than "b"
 
// Sort List of Strings based on lexicographical order and increasing length
// List<String> d 
Collections.sort(d, (a,b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) :  a.compareTo(b));


// NOTE that indexOf(String s, int index) method will search first occurence of s starting from index 
 
