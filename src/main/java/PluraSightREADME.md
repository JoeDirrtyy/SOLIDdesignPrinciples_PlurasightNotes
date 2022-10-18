-Junit tests are code that executes target code can
be a class method or function
-Initialize a unit test with @Test followed by the method you would like to test
-This inidcated for java to prefrom a "Test"
-unit tests are disigned to fail first before passing
-the body of the unit tests method should contain setup code, Setup, execute, verify
-Assertions or Assert can be used to execute
-if ypu get an error, clicking the link in the terminal will bring you to the code in question
-You can use assertNotNull and assertEquals to compare String values
-assertSame will verify that to objects being compared, are the same object in memory, vice vera with assertNotSame
-assertEquals/True/False will pronbably be used 80% of the time
-@BeforeAll will run once before each method in the class
-@BeforeEach will run once before each test method
-@After each will run once after  each test method
-@AfterAll will run once after all tests in the class have completed
-assertThrows is for giving a runtime exception if and invalid value is entered
-You can use a @Disabled to basically turn a test off
-You can use @Tag expressions to run groups of tests
-Code can be difficult to test if already written before, you can have trouble accessing it
-A given unit of code should only have 1 reason to change
-Extraction is used for seperating target code from the rest of the code
-you can move the target code into a new method, class, or a static function
-Extraction method is useful when getting user input or using a scanner
-You can right click to trigger an exctract method
-Test Double are patterns that allow us to control dependencies between the tested unit
-Test Driven Deleopment is rather than implemnting a feature first, and then writing a test for that feature,
instead, drive development from the test, state in the test the next thing the feature should do, then implement that.
and then go back to the test for the part
-the end result is almost frequent switching between stating something in the test and creating production code to make the test happy
-Test driven development helps keep you on task
-Helps keep a cleaner code style
-write just enough code to fail
-then write just enough code to pass
-finally, refactor what what wrriten if need be and repeat the cycle
-nested tests is used to express the relationship among several groups of tests and to represent tests in hierarchy
-@Nested annotation allows you to have an inner class in a test class and that is another test class
-There is a "FAke is until you make is" way of satifying test cases
-Break Test Driven Devlopment into cycles


-Topics to Cover:
-JUnit 5 Library
-Unit Testing
-Testing existing code
-Test Driven Development
