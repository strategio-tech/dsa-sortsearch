# DSA Assignment: Sorting & Searching (REQUIRED)

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignments

### E01 - Find Three Largest Numbers

*REQUIRED, Difficulty rating: Easy*

Write a function that takes in an array of at least three integers and, **without sorting the input array,** returns a sorted array of the three largest integers in the input array. 

The function should return duplicate integers if necessary; for example, it should return `[10, 10, 12]` for an input array of `[10, 5, 9, 10, 12]`.

You should be able to do this in O(n) time and O(1) space, where n is the length of the input array.

Sample Input
```
array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
```

Sample Output
```
[18, 141, 541]
```

## Hints


<details>
  <summary>Hint 1</summary>
  
   Can you keep track of the three largest numbers in an array as you traverse the input array?
</details>

<details>
  <summary>Hint 2</summary>
  
   Following the suggestion in Hint #1, try traversing the input array and updating the three largest numbers if necessary by shifting them accordingly.
</details>

- Many of these problems have corresponding LeetCode challenges or similar. Google is your friend, but try the problem first.
