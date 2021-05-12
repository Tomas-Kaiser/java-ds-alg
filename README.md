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

## LinkedList

We use LinkedList to store list of object in sequence but inlike arrays LinkedList can grow shrink automatically.
LinkedList consists of a group of nodes in squence. Each node holds two pieces of data. One is a value and the other is
the address of the next node. We call the first node as head and the last one tail.

Time of complexity:

- Lookup O(n)
- By index O(n)
- Insert
	- At the end O(1)
	- At the beginning O(1)
	- At the middle O(n)
- Delete
	- From the end O(n)
	- From the beginning O(1)
	- From the middle O(n)

## Arrays vs LinkedList

- Static arrays have fixed size
- Dynamic arrays grow by 50-100%
- LinkedList do not waste memory (but takes a bit memory as it stores value and the pointer to the next node)
- Use arrays if you know the number of items to store
- We can set initial size in arrayList like new ArrayList(100)
