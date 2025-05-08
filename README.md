
# Java Task Manager with Deque

This project is a **Java-based Task Manager** application that allows users to organize and manage tasks using a **Deque** (Double-Ended Queue). Tasks can be handled in either **LIFO** (Last In First Out) or **FIFO** (First In First Out) order, depending on user preference.

## Features
- **Task Addition**: Users can add tasks with details like name, creation date and time, due date and time.
- **Task Removal**: Tasks can be removed from the queue according to the chosen order (LIFO or FIFO).
- **Task Display**: Users can view all the tasks currently in the system.
- **Choice of Deque Implementation**: The user can choose between **LinkedList** or **ArrayDeque** as the underlying implementation for the `Deque`.

---

## Concepts Used

### **Deque**
A `Deque` (Double-Ended Queue) is a part of the Java Collections Framework that allows insertion and deletion of elements at both ends (front and rear). This is useful for managing tasks where we may want to either add new tasks at the front or at the end of the list, and similarly remove them in different orders.

- **LinkedList**: This implementation uses a doubly linked list, where each element points to the previous and next elements. It allows efficient insertions and removals from both ends but may use more memory due to the additional pointers.
  
- **ArrayDeque**: This implementation uses a resizable array. It provides faster operations compared to `LinkedList` when the deque is used in a typical queue manner, but its resizing may incur some overhead in certain cases.

### **LIFO (Last In First Out)**
In the **LIFO** order, the most recently added task is the first one to be removed. This is typical for a **stack** where you "push" items onto the stack and "pop" them in reverse order.

### **FIFO (First In First Out)**
In the **FIFO** order, the first task that was added is the first one to be removed. This is typical for a **queue** where tasks are processed in the order they were added.

### **DequeUtil Class**
The `DequeUtil` class allows users to select between the two different types of Deques available (`LinkedList` and `ArrayDeque`). This class contains the following method:

#### `chooseDequeType()`
- **Purpose**: Prompts the user to choose between a `LinkedList` or `ArrayDeque` and returns the corresponding Deque implementation.

## TaskManager_UsingDeque Class
This class is the main program where the user can interact with the task manager. It uses the **Deque** implementation provided by `DequeUtil` to add, remove, and display tasks.

### Task Addition:
- The user is prompted to enter task details such as name, due date, and due time. Tasks are added to the `Deque` based on the chosen order (`LIFO` or `FIFO`).

### Task Removal:
- Users can remove tasks based on the selected order (`LIFO` or `FIFO`).

### Task Display:
- All tasks currently in the `Deque` are displayed.

---

## Example Workflow
1. The program asks the user to choose between **FIFO** (First In First Out) or **LIFO** (Last In First Out).
2. Based on the user's choice, tasks are added, displayed, and removed in the chosen order.
3. The user can add multiple tasks and view or remove them accordingly.

---

## How to Run

1. Clone this repository to your local machine.
    ```bash
   git clone https://github.com/Ananthadatta02/Java-Task_Organizer.git
    ```
3. Open the project in your favorite Java IDE.
4. Compile and run the `TaskManager_UsingDeque` class.
5. Follow the on-screen instructions to manage your tasks.

---

## Conclusion
This project demonstrates the usage of **Deque** for task management with **LIFO** and **FIFO** options. By choosing different types of Deques and orders, users can manage tasks effectively in various ways, which can be expanded for more complex task management applications.
