## Person application

1. Write the Person class (see assignment on course web page).
2. Complete the Main class.
3. Run it.
4. Change the Person's `name` attribute to be "static".  Run Main class again.
5. Answer this question. 

If we declare a Person's name to be `static`, then when we create several Person objects they have the wrong name.  Why?

**Answer:**



### Example code with static attribute

```java
public class Person {
    private static String name;
    private String email = "";
    
    /** constructor initializes a new Person */
    public Person( String aname ) {
        this.name = aname;
    }
    public String toString() {
        if (email.isEmpty()) return name;
        return String.format("%s <%s>", name, email);
    }
```