### Scanner vs BufferedReader

Java mein input read karne ke liye `Scanner` aur `BufferedReader` do popular classes hain. Yahan main in dono classes ke beech antar ko samjhaunga.

#### Scanner
- **Functionality:**
  - `Scanner` ek bahut versatile class hai jo primitive types aur strings ko regular expressions ke saath parse karne mein kaam aata hai.
  - Isse formatted input parse karna asaan hota hai.

- **Use Case:**
  - Formatted input padhna ho, jaise ki integers, doubles, ya strings ko alag-alag taur par padhna.

- **Example:**
  ```java
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = scanner.nextLine();
  System.out.println("Hello, " + name + "!");
  scanner.close();
  ```

#### BufferedReader
- **Functionality:**
  - `BufferedReader` zyadatar unformatted text ko line by line padhne mein use hota hai.
  - Isse large amounts of text ko efficiently padhna asaan hota hai.

- **Use Case:**
  - Unformatted text ya lines of text ko efficient taur par padhna ho, jahan performance maayne rakhta hai.

- **Example:**
  ```java
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter your age: ");
  int age = Integer.parseInt(br.readLine());
  System.out.println("You are " + age + " years old.");
  br.close();
  ```

#### Antar (Differences)

1. **Functionality:**
   - `Scanner` formatted input parse karne mein asaan hai.
   - `BufferedReader` unformatted text ko efficiently padhne mein mahir hai.

2. **Ease of Use:**
   - `Scanner` beginners ke liye asaan hota hai.
   - `BufferedReader` ko control ke saath text padhne mein use karna chahiye.

3. **Performance:**
   - `BufferedReader` large amounts of text ko efficiently padhne mein zyada efficient hota hai.
   - `Scanner` ki parsing capabilities ke wajah se iski performance mein thoda giraavat ho sakti hai.

4. **Error Handling:**
   - `Scanner` `InputMismatchException` throw karta hai agar input expected type ke saath match nahi karta.
   - `BufferedReader` `IOException` throw karta hai, jise handle karne ke liye extra code ki zarurat hoti hai.

Yeh dono classes apne-apne use cases ke liye makhsoos hain. Aapko apne program ke requirement ke according choose karna chahiye ki kaunsa better hoga.