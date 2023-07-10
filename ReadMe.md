
## Problem 01: Distinct Substrings Count

Given a string `s`, return the number of distinct substrings in it.

A substring is a contiguous sequence of characters within the string.

### Example 1:

Input: s = "abc"
Output: 6
Explanation: Six distinct substrings: "a", "b", "c", "ab", "bc", "abc".

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "abc")

### Example 2:

Input: s = "aaa"
Output: 3
Explanation: Three distinct substrings: "a", "aa", "aaa".

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "aaa")

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.

Sure, here are five test cases:

Test Case 1:
```java
"abc" // Outputs: 6
```

Test Case 2:
```java
"aaa" // Outputs: 3
```

Test Case 3:
```java
"abcd" // Outputs: 10
```

Test Case 4:
```java
"zzz" // Outputs: 3
```

Test Case 5:
```java
"racecar"// Outputs: 24
```

## Problem 02: Anagrams Count

Given two strings `s` and `t`, return the number of distinct substrings in `s` that are anagrams of `t`.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

A substring is a contiguous sequence of characters within the string.

### Example 1:

Input: s = "cbaebabacd", t = "abc"
Output: 2
Explanation: Two substrings are anagrams of "abc": "cba" and "bac".

{Try it}(sh .guides/runner2.sh javac Problem01.java java -cp . Problem01 "cbaebabacd" "abc")

### Example 2:

Input: s = "abab", t = "ab"
Output: 3
Explanation: Three substrings are anagrams of "ab": "ab", "ba" and "ab".

{Try it}(sh .guides/runner2.sh javac Problem01.java java -cp . Problem01 "abab" "ab")

Constraints:

1 <= s.length, t.length <= 1000
s and t consist of lowercase English letters.

Sure, here are five test cases for the anagram substring count problem:

Test Case 1:
```java
"cbaebabacd" "abc" // Outputs: 2
```

Test Case 2:
```java
"abab" "ab" // Outputs: 3
```

Test Case 3:
```java
"xxyyxx" "yx" // Outputs: 4
```

Test Case 4:
```java
"jumbledletters" "del" // Outputs: 2
```

Test Case 5:
```java
"longstringwithmultipleanagramsofanagram" "gram" // Outputs: 2
```