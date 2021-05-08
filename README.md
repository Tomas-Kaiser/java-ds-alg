# Data Structure and Algorithms

I will cover as follow DS:

Linear DS
- Arrays
- Linked List
- Stacks
- Queues
- Hast Tables

Unlinear DS
- Trees
- Graphs

## Big O Notation

We use a big O notation to describe the performance of an algorithm O(n) (run time complexity).

- constant O(1)
- logarithmic O(log n)
- linear O(n)
- quadratic O(n^2)
- exponential O(2^n)

We also have space complexity

## Arrays

We use it to store list of items seqentially.

Arrays are static! It has fix size.

- lookup by index O(1)
- lookup by value O(n)
- insert O(n) > if we increase a size we have to copy all items into a new one
- delete O(n) > if we delete the first item all the rest items must be shifted to the left
- delete O(1) > if we delete the last item but in big O Notation we have to take the worst case  scenario (not the best one like here)

We have two types of dynamic arrays:

- Vector which grows 100% and it is synchronized
- ArrayList which grows 50% and it is NOT synchronized

We cannot use Vector for multi-thread application because it is synchronized instead we can use the ArrayList!!


