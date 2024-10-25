## StringBuilder in Java

`StringBuilder` is a mutable class used for efficient string manipulation in Java. Unlike `String`, which is immutable, `StringBuilder` allows you to modify its contents without creating new objects, making it ideal for frequent string modifications like appending, inserting, or deleting characters.
Default capacity of `StringBuilder` is 16.

### Why use `StringBuilder`?

- **Efficiency**: It allows direct modification of strings, reducing memory overhead.
- **Performance**: Best suited for scenarios where strings are modified multiple times, such as in loops or dynamic content generation.
- **Mutability**: Unlike `String`, changes to `StringBuilder` don't create new objects in memory, making operations faster.

## StringBuilder Methods in Java

- **`append(String str)`**: Adds the specified string to the end of the `StringBuilder`.
- **`insert(int offset, String str)`**: Inserts the specified string at the given index.
- **`replace(int start, int end, String str)`**: Replaces characters between the specified indices with the given string.
- **`delete(int start, int end)`**: Removes the characters between the specified indices.
- **`deleteCharAt(int index)`**: Deletes the character at the specified index.
- **`reverse()`**: Reverses the sequence of characters.
- **`length()`**: Returns the current length of the `StringBuilder`.
- **`capacity()`**: Returns the current capacity of the `StringBuilder`.
- **`charAt(int index)`**: Returns the character at the specified index.
- **`setCharAt(int index, char ch)`**: Sets the character at the specified index.
- **`substring(int start)`**: Returns a substring starting from the specified index.
- **`substring(int start, int end)`**: Returns a substring from the specified start to end index.
- **`indexOf(String str)`**: Returns the index of the first occurrence of the specified string.
- **`lastIndexOf(String str)`**: Returns the index of the last occurrence of the specified string.
- **`setLength(int newLength)`**: Sets the length of the `StringBuilder` to the specified value.
- **`toString()`**: Converts the `StringBuilder` object to a `String`.

### Example Usage:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");    // Modifies the existing StringBuilder object
sb.insert(5, ",");      // Inserts a comma after "Hello"
sb.reverse();           // Reverses the string content
System.out.println(sb);
```

## When to Avoid:

StringBuilder is not thread-safe, so it's not suitable for multi-threaded environments. If you need synchronization, use StringBuffer instead.
