# Java Lambda

## Description
These exercises are designed to help you practice **Java lambdas, method references, Functional Interfaces, and list manipulation**. You will gain experience in:

- Filtering lists with lambdas
- Sorting heterogeneous lists
- Using method references
- Implementing and using Functional Interfaces

---

## Exercises Overview

### 🟢 Exercise 1 – Filter Strings containing 'o'
- Task: From a list of Strings, return all strings that contain the letter `'o'`.
- Action: Print the resulting list.

---

### 🟡 Exercise 2 – Filter Strings containing 'o' and longer than 5 characters
- Task: Extend Exercise 1.
- Requirement: Strings must **contain 'o'** and have **more than 5 characters**.
- Action: Print the resulting list.

---

### 🔵 Exercise 3 – Print months using a lambda
- Task: Create a list with the **names of the months**.
- Action: Print all elements using a **lambda expression**.

---

### 🟣 Exercise 4 – Print months using a method reference
- Task: Same as Exercise 3.
- Difference: Use a **method reference** instead of a lambda.

---

### 🔺 Exercise 5 – Functional Interface for Pi
- Task: Create a **Functional Interface** with a method `getPiValue()` returning a `double`.
- Implementation:
  - Instantiate the interface using a **lambda** that returns `3.1415`.
  - Call the method and print the result.

---

### 🔹 Exercise 6 – Sort list by string length
- Task: Create a **list with numbers and strings**.
- Action: Sort the list from **shortest to longest string**.

---

### 🔻 Exercise 7 – Sort list by string length in reverse
- Task: Use the list from Exercise 6.
- Action: Sort the list from **longest to shortest string**.

---

### ⚡ Exercise 8 – Functional Interface to reverse a string
- Task: Create a **Functional Interface** with a method `reverse()` that takes a `String` and returns a `String`.
- Implementation:
  - Implement the interface with a **lambda** that reverses the string.
  - Invoke the method with a sample string and verify the result.

---

## 💻 Technologies Used
- Java 17  
- Maven - Dependency management and build  
- IntelliJ IDEA - Integrated Development Environment  
- Git - Version control  
- JUnit 5 (Jupiter) - Testing framework  

---

## 📋 Requirements
To run these exercises you need:

- Java Development Kit (JDK) 17 or higher  
- Maven 3.6+ (optional, if you want to run tests via Maven)  
- IntelliJ IDEA (Community or Ultimate) or any Java-compatible IDE  
- Git to clone the repository

---

## 🛠️ Installation
Clone this repository:  
git clone https://github.com/cristhianchulca49/S1.08.Lambdas.git

---
🤝 Contributions are welcome! 
- Please follow these steps to contribute: 
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
