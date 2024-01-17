# Primitive Types:

Various primitive data types are listed below:

## (i) byte:
- Byte data type is an 8-bit signed two's complement integer.
- Range is -128 to 127.
- Default value is 0.
- Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int.
- Example: `byte a = 100, byte b = -50`

## (ii) short:
- Short data type is a 16-bit signed two's complement integer.
- Minimum value is -32,768 and maximum value is 32,767.
- Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an int.
- Default value is 0.
- Example: `short s = 10000, short r = - 20000`

## (iii) int:
- Int data type is a 32-bit signed two's complement integer.
- Range is -2,147,483,648 to 2,147,483,647.
- Int is generally used as the default data type for integral values unless there is a concern about memory.
- Default value is 0.
- Example: `int a = 100000, int b = -200000`

## (iv) long:
- Long data type is a 64-bit signed two's complement integer.
- Range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
- This type is used when a wider range than int is needed.
- Default value is 0L.
- Example: `long a = 100000L, long b = -200000L.`

## (v) float:
- Float data type is a single-precision 32-bit IEEE 754 floating point.
- Float is mainly used to save memory in large arrays of floating point numbers. Default value is 0.0f.
- Float data type is never used for precise values such as currency.
- Example: `float f1 = 234.5f`

## (vi) double:
- Double data type is a double-precision 64-bit IEEE 754 floating point.
- This data type is generally used as the default data type for decimal values, generally the default choice.
- Double data type should never be used for precise values such as currency.
- Default value is 0.0d.
- Example: `double d1 = 123.4`

## (vii) boolean:
- Boolean data type represents one bit of information.
- There are only two possible values: true and false.
- This data type is used for simple flags that track true/false conditions.
- Default value is false.
- Example: `boolean one = true`

## (viii) char:
- Char data type is a single 16-bit unicode character.
- Minimum value is '\u0000' (or 0).
- Maximum value is '\uffff' (or 65,535 inclusive).
- Char data type is used to store any character.
- Example: `char letterA ='A'`

# Reference Data Types:

Reference data types are made by the logical grouping of primitive data types. These are called reference data types because they contain the address of a value rather than the value itself. Arrays, classes, enums, etc., are examples of reference data types.
