`Deque` (Double Ended Queue) ek interface hai Java Collection Framework mein, jo ek linear collection hai jisme aap elements dono ends se add aur remove kar sakte hain. `Deque` interface `Queue` aur `Stack` dono ka combination hai, jiska matlab hai ki aap ismein front (shuruwat) aur rear (akhir) dono ends se elements ko manage kar sakte hain.

Kuch important points about `Deque`:

1. **Insertion and Removal at Both Ends:** Aap `Deque` mein elements ko dono ends se insert (`addFirst` or `addLast`) aur remove (`removeFirst` or `removeLast`) kar sakte hain.

2. **Null Elements:** `Deque` allows null elements.

3. **No Capacity Restrictions:** Unlike arrays, `Deque` implementation typically does not have a fixed size limit. It grows or shrinks as necessary to accommodate elements.

4. **Implementation Classes:** Java provides two main classes that implement the `Deque` interface: `ArrayDeque` and `LinkedList`. `ArrayDeque` is based on resizable array implementation, and `LinkedList` is based on doubly-linked list implementation.


Is example mein `Deque` (ArrayDeque ka instance) ka use dikhaya gaya hai. Aap dekh sakte hain ki elements front se bhi aur rear se bhi add aur remove kiye ja sakte hain.