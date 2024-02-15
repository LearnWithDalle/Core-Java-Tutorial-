# Exceptions

- Java mein unexpected events ko handle karne ke liye use hoti hain. Jab koi unexpected condition aati hai, jaise file na milna ya divide by zero, program exception generate karta hai. Try block mein risky code hota hai jo exception generate kar sakta hai, jo catch block mein handle hota hai. Finally block optional hota hai aur cleanup code ke liye use hota hai, jo hamesha execute hota hai, chahe exception aaye ya na aaye.

1. **try:**

   - `try` block ek section hota hai jahan aap code likhte hain jo potentially exceptions generate kar sakta hai.
   - Aap try block mein code likhte hain jisme exception aa sakti hai.

2. **catch:**

   - `catch` block ek section hota hai jahan aap code likhte hain jo exception ko handle karta hai.
   - Agar try block mein exception generate hoti hai, toh control catch block mein chala jaata hai.
   - Catch block exception ko handle karne ka logic provide karta hai.

3. **throw:**

   - `throw` keyword se aap manually ek exception ko throw kar sakte hain.
   - Jab aapki program mein kuch unexpected hota hai, toh aap apne code mein `throw` keyword ka use karke custom exceptions throw kar sakte hain.

4. **throws:**

   - `throws` keyword ka use method signature mein hota hai.
   - Agar ek method mein exceptions handle nahi kiye jaate hain, toh method signature mein `throws` clause add kiya jaata hai.
   - Isse caller ko pata chalta hai ki yeh method exceptions generate kar sakta hai, aur caller ko unko handle karne ka responsibility hota hai.

5. **finally:**
   - `finally` block ek optional section hota hai jo try-catch-finally ke saath use hota hai.
   - `finally` block mein code likha jaata hai jo hamesha execute hota hai, chahe exception aaye ya na aaye.
   - Finally block commonly cleanup code jaise file close, database connection close, etc., ke liye use hota hai.

**Example:**

```java
        try {
            // Block of code jho tume lagta hai ki error dega
        } catch (errorName) {
            // Error ko catch karega jho try block main aayega or use bacch jayega
        }
         catch (catchName) {
            // catch se bhi kuch nahi huva tho dusra catch jho use dusra option hog jho error throw nahi karega
        } finally {
            // Cleanup code: Closing the file
        }
```

