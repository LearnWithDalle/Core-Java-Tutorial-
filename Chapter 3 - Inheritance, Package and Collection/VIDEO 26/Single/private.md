Java mein `protected` keyword ek access modifier hai jo yeh batata hai ki ek field ya method sirf apne hi package mein aur uske subclasses mein hi access kiya ja sakta hai. Jab koi field ya method `protected` ke roop mein declare hota hai, toh iska matlab hai ki yeh field ya method same class mein aur uske subclasses mein hi access kar sakte hain, chahe wo subclasses kisi bhi package mein ho.

Diye gaye Java code mein:

```java
class Student {
    protected String name;
    protected int rollNo;
    protected String course;

    // ... baaki code ...
}
```

`protected` keyword `name`, `rollNo`, aur `course` fields ke saamne istemal hua hai. Iska matlab hai ki ye fields `Student` class ke andar aur uske subclasses (jaise ki `Test` class) mein hi access kiye ja sakte hain, chahe woh subclasses kisi bhi package mein kyun na ho.

types of keyword: 

- **private:** Sirf same class mein hi access kiya ja sakta hai.
- **default (package-private):** Sirf same package mein access kiya ja sakta hai.
- **protected:** Same package mein aur subclasses mein access kiya ja sakta hai, package ke bina koi farq nahi padta.
- **public:** Kahi bhi se access kiya ja sakta hai.