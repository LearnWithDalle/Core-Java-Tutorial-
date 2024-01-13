

**Multi-dimensional Array Example:**

Maan lijiye aapke paas ek do-dimensional array hai, jise `a` naam diya gaya hai. Uski declaration aur initialization yeh hai:

```java
int[][] a = new int[4][5];
```

Yeh ek table ki tarah hota hai jisme 4 rows aur 5 columns hain. Har cell mein ek integer value ho sakti hai.

**Array Elements:**

Array `a` kuch is tarah dikhega:

```
[[0, 0, 0, 0, 0],
 [0, 0, 0, 0, 0],
 [0, 0, 0, 0, 0],
 [0, 0, 0, 0, 0]]
```

Har number ek cell ko represent karta hai. For example, `a[0][0]` pehla cell hai (upar-left kone mein), `a[0][1]` pehli row mein doosre cell ko represent karta hai, aur aise hi aage.

Aap in cells ki values ko access ya change kar sakte hain, unke row aur column indices ka istemal karke. Jaise ki:

```java
int value = a[1][2]; // Dusri row aur teesre column mein jo value hai, woh mil jaayegi.
```

Aap apne zarurat ke hisaab se is array ko khud bhar sakte hain. Jaise ki:

```
[[1, 2, 3, 4, 5],
 [6, 7, 8, 9, 10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
```

Umeed hai ki ab samajh gaye honge.