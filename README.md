# Scala TDD Example
This project demonstrates a Test Driven Development cycle for a simple Calculator object in scala. The build files are setup to work with bazel for building and testing.

# TDD Cycle

Test driven development takes some setup and initial overhead work, but should result in higher quality code that can be more easily maintained in the future. The investment of time upfront pays off during the life of the code.

These are the general steps for test driven development

1. Write a Unit Test
1. Run the test, it should fail. This is good because you know the test will catch a failing condition
1. Write just enough code to make the test pass
1. Refactor the code for maintainability and readability as needed
1. Run _all_ the tests in the affected area after every code refactor. 
1. Repeat the process by adding more tests

# Sample Business Requirements

A Math library is needed with a simple calculator object in it. This should be able to add, subtract, multiply, find the remainder of a division operation, etc.

Specifically the requirements are:
- Add two numbers
- Subtract two numbers
- Multiply two numbers
- Modulus - find the remainder of division of two numbers

Use test driven development to build this library in the main/simple/math/Calculator.scala class
Checkout each branch below in sequence to see the progress of writing failing tests, fixing the code for the test to pass and then adding more functionality. 

# To build just the _math_ library

Run this command from the WORKSPACE directory to build the _math_ library
```
bazel build //main/simple/math
```

# To run the tests for the Calculator object
Run this command from the WORKSPACE directory to run the tests in CalculatorSpec.scala. This command will re-build the _math_ library if something has changed there

```
bazel test --test_output=errors //test:calculatorspec
```


# Branches
These branches represent the different iterations of the test driven development effort for this library

- _add-failing-tests_
 - The tests are written first with deliberately failing code, then the tests are executed to ensure that they fail
- _add-passing-tests_
 - The _code_ is fixed so that the tests will pass
- _subtract-failing-tests_
 - The tests are written first with deliberately failing code, then the tests are executed to ensure that they fail
- _subtract-passing-tests_
 - The _code_ is fixed so that the tests will pass
- _multiply-failing-tests_
 - The tests are written first with deliberately failing code, then the tests are executed to ensure that they fail
- _multiply-passing-tests_
 - The _code_ is fixed so that the tests will pass
- _modulus-failing-tests_
 - The tests are written first with deliberately failing code, then the tests are executed to ensure that they fail
- _modulus-passing-tests_
 - The _code_ is fixed so that the tests will pass
- _modulus-refactor-passing-tests_
 - The implementation of the code in _modulus-passing-tests_ was not optimal. With solid tests in place we can re-factor without fear

