Java mein errors bhi programming ke different stages mein aate hain, aur unka handling bhi important hai. Yeh kuch types of errors hoti hain:

1. **Syntax Error:**
   - Syntax errors compile time par hi detect hote hain jab code ko compile kiya jaata hai.
   - Yeh errors code mein syntax ki violation hoti hain, jaise missing semicolon, invalid method signature, etc.
   - Example: `int x = 10` (missing semicolon at the end).

2. **Runtime Error:**
   - Runtime errors program execute karne ke time par aati hain.
   - Yeh errors program execution ke doran generate hoti hain, jaise divide by zero, file not found, null pointer exception, etc.
   - Example: `int result = 10 / 0` (divide by zero runtime error).

3. **Logical Error:**
   - Logical errors program ka expected behavior se alag hoti hain.
   - Yeh errors code ke design ya logic mein hoti hain, jaise galat condition ka use, galat algorithm ka selection, etc.
   - Example: Sorting algorithm mein galat logic ka use, jisse incorrect result aata hai.

**Explanation:**
- Syntax errors compile time par detect hote hain aur code ko compile nahi hone dete hain.
- Runtime errors program execute karne ke time par aati hain aur program ko terminate kar deti hain agar unka sahi se handle nahi kiya gaya.
- Logical errors program execute toh hoti hai, lekin output sahi nahi hota.
- Exception handling ka use runtime errors ko gracefully handle karne mein kiya jata hai, jabki logical errors ko debug karne ke liye code review aur testing kiya jata hai.