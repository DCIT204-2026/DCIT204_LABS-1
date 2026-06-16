# DCIT 204 Lab 1: Searching Algorithms (Linear Search & Binary Search)

## Overview

Welcome to **DCIT 204 Lab 1**.

The purpose of this lab is to help students understand and implement two fundamental searching algorithms:

1. **Linear Search**
2. **Binary Search**

You are required to implement both algorithms in Java and demonstrate their functionality through user interaction.

---

## Learning Objectives

By the end of this lab, you should be able to:

* Understand how Linear Search works.
* Understand how Binary Search works.
* Analyze the differences between the two algorithms.
* Accept user input in Java.
* Work with arrays in Java.
* Write clean and reusable methods.
* Use Git and GitHub for collaboration.

---

## Repository

Repository URL:

`https://github.com/DCIT204-2026/DCIT204_LABS-1.git`

---

## Lab Task

You are required to implement:

### 1. Linear Search

Create a method that searches through an array element by element until the target value is found or the end of the array is reached.

### 2. Binary Search

Create a method that searches for a target value in a **sorted array** by repeatedly dividing the search space into halves.

---

## Program Requirements

Your program must:

* Allow the user to enter the size of the array.
* Allow the user to enter the elements of the array.
* Allow the user to enter the target value to search for.
* Perform a Linear Search on the array.
* Perform a Binary Search on the array.
* Display the search results clearly.
* Indicate whether the target was found.
* Display the index position of the target if found.

---

## Project Structure

The project contains the following files:

```text
src/
│
├── Algorithm.java
└── Main.java
```

### Algorithm.java

This file should contain the implementation of:

```java
linearSearch(...)
```

and

```java
binarySearch(...)
```

methods.

Example:

```java
public class Algorithm {

    public static int linearSearch(int[] array, int target) {
        // Your implementation here
    }

    public static int binarySearch(int[] array, int target) {
        // Your implementation here
    }

}
```

### Main.java

This file should:

* Collect input from the user.
* Create the array.
* Receive the target value.
* Call the methods in `Algorithm.java`.
* Display the results.

Example:

```java
public class Main {

    public static void main(String[] args) {

        // User input

        // Call Linear Search

        // Call Binary Search

        // Display results

    }

}
```

---

## Expected Sample Interaction

```text
Enter array size: 5

Enter element 1: 10
Enter element 2: 25
Enter element 3: 30
Enter element 4: 45
Enter element 5: 50

Enter target value: 45

Linear Search Result:
Target found at index 3

Binary Search Result:
Target found  at index 3
```

---

## Important Note About Binary Search

Binary Search only works correctly on a **sorted array**.

Before performing Binary Search, ensure that the array is sorted.

You may:

* Sort the array before calling Binary Search, or
* Inform the user that Binary Search requires sorted data.

---

## GitHub Workflow

### Step 1: Fork the Repository

Fork the repository to your own GitHub account.

Repository:

`https://github.com/DCIT204-2026/DCIT204_LABS-1.git`

---

### Step 2: Clone Your Fork

```bash
git clone https://github.com/GITHUBUSERNAME/DCIT204_LABS-1.git
```

---

### Step 3: Create a New Branch

```bash
git checkout -b studentID-lab1-solution
```

---

### Step 4: Complete the Task

Implement:

* Linear Search
* Binary Search

inside `Algorithm.java`.

Use `Main.java` to test your implementation.

---

### Step 5: Commit Your Changes

```bash
git add .
git commit -m "Implemented Linear Search and Binary Search"
```

---

### Step 6: Push Your Changes

```bash
git push origin studentID-lab1-solution
```

---

### Step 7: Create a Pull Request

1. Go to your fork on GitHub.
2. Click **Compare & Pull Request**.
3. Create a Pull Request to the original repository.
4. Wait for feedback and review.

---

## Submission Guidelines

Your submission will be evaluated based on:

### Functionality (40%)

* Linear Search works correctly.
* Binary Search works correctly.
* User input is handled properly.

### Code Quality (25%)

* Readable code.
* Meaningful variable names.
* Proper formatting and indentation.

### Algorithm Implementation (25%)

* Correct implementation of both algorithms.
* Proper use of loops and conditions.

### GitHub Workflow (10%)

* Correct use of Git.
* Pull Request submitted successfully.

---

## Academic Integrity

You are encouraged to discuss concepts with classmates, but all code submitted must be your own work.

Copying another student's solution or submitting code generated entirely by others without understanding it may result in penalties according to course regulations.

---

## Deadline

Submit your Pull Request before the announced deadline.

Late submissions may attract penalties unless prior approval has been granted.

---

## Deliverables

Before submission, ensure that:

* [ ] Linear Search is implemented.
* [ ] Binary Search is implemented.
* [ ] User input is working correctly.
* [ ] Code compiles successfully.
* [ ] Changes are committed.
* [ ] Changes are pushed to GitHub.
* [ ] Pull Request has been created.

---

Good luck, and happy coding!
