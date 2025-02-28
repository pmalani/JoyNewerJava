# Joy of New(er) Java

## Text Blocks
- Before 
  - [BeforeStrings.java](src/main/java/m/strings/BeforeStrings.java)
- After 
  - [AfterStrings.java](src/main/java/m/strings/AfterStrings.java)
- Be aware of space
  - [AfterTextBlocks.java](src/main/java/m/strings/AfterTextBlocks.java)

## Records
- Before
  - [BeforeRecords.java](src/main/java/m/records/BeforeRecords.java)
- With Lombok
  - [WithLombok.java](src/main/java/m/records/WithLombok.java)
- After
  - [AfterRecords.java](src/main/java/m/records/AfterRecords.java)
  - Notice `id()` method instead of `getId()`
  - To summarize: a record is an immutable (shallow) named tuple
- Immutability is hard!
  - [Setup.java](src/main/java/m/immutability/Setup.java)
  - Fixing attempt 1 using `unmodifiableSet`
    - [Attempt1.java](src/main/java/m/immutability/Attempt1.java)
    - Notice the use of **canonical** constructor
    - Can also have **overloaded** constructor(s)
  - Fixing attempt 2 using `copyOf`
    - [Attempt2.java](src/main/java/m/immutability/Attempt2.java)

## Data-Oriented Programming (DOP)
- Setting up a classic example; Object-Oriented Programming (OOP) 101 
  - [Setup.java](src/main/java/m/dop/Setup.java)
- This program can evolve in two main dimensions (again classic tug-of-war)
  - Add a new shape
    - [AddShape.java](src/main/java/m/dop/AddShape.java)
  - Add a new method / behavior
    - [AddMethod.java](src/main/java/m/dop/AddMethod.java)
- Unhappy about too many changes 
- Centralize the changes
  - [DopSetup.java](src/main/java/m/dop/DopSetup.java)
  - Evolving this program in the two main dimensions is left as exercise
- Simplifying `instanceof`
  - [DopInstanceOf.java](src/main/java/m/dop/DopInstanceOf.java)
  - Look ma! No explicit casting!
- Same with `switch`
  - [DopSwitch.java](src/main/java/m/dop/DopSwitch.java)
- With enhanced switch and `sealed`
  - [Dop.java](src/main/java/m/dop/Dop.java)
  - No `default` clause!
- Putting it all together
  - [DopRecords.java](src/main/java/m/dop/DopRecords.java)
  - Check out the switch record pattern patching / deconstruction 

## References
- [Java Language Updates](https://docs.oracle.com/en/java/javase/21/language/index.html)
- [Data Oriented Programming](https://www.infoq.com/articles/data-oriented-programming-java/)
- [Pattern Matching in Java - Past, Present, Future](https://www.youtube.com/watch?v=GurtoM8i2TE)