| Abstract class                                                       | Interface                                           |
| -------------------------------------------------------------------- | --------------------------------------------------- |
| Includes abstract and non-abstract methods                           | Can include only abstract methods                   |
| Supports default and static methods                                  | Does not support default and static methods         |
| Does not support multiple inheritance                                | Supports multiple inheritance                       |
| Can use final, non-final, static, and non-static variables           | Can use only static and final variables             |
| Provides implementation                                              | Does not provide implementation                     |
| Uses the "abstract" keyword                                          | Uses the "interface" keyword                        |
| Can extend another Java class and implement multiple Java interfaces | Can extend another Java interface only              |
| Uses "extends" keyword to extend an abstract class                   | Uses "implements" keyword to implement an interface |
| Allows private, protected, etc. class members                        | By default members are public                       |

Example of Abstract class:

```java
  public abstract class Movie {
      public abstract void trailer();
  }
```

Example of interface:

```java
public interface Movie {
    void trailer();
}
```
