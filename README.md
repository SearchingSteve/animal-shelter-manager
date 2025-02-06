
# Animal Shelter Queue System

This project implements an **Animal Shelter Queue** system using a queue data structure. The shelter holds two types of animals: dogs and cats. The queue follows the **FIFO (First In, First Out)** principle, with the ability to adopt the oldest animal or adopt a specific type of animal (dog or cat).

### Features:
- **Enqueue**: Add a new animal (dog or cat) to the shelter queue.
- **Dequeue Any**: Adopt the oldest animal from the queue, regardless of its type.
- **Dequeue Dog**: Adopt the oldest dog from the queue.
- **Dequeue Cat**: Adopt the oldest cat from the queue.
- **Queue Management**: Keep track of the size and status of the queue (empty or not).
- **Print Queue**: Display all animals in the queue, including their type and ID.

### How It Works:
1. Animals are enqueued with an ID and a type ("Dog" or "Cat").
2. Users can adopt animals from the shelter by dequeuing the oldest animal or selecting a dog/cat to adopt.
3. The queue supports operations such as `dequeueAny()`, `dequeueDog()`, `dequeueCat()`, and `enqueue()` to manage the shelter effectively.

### Usage:

1. **Enqueue an Animal**:
    ```java
    shelter.enqueue(1, "Dog"); 
    shelter.enqueue(2, "Cat");  
    ```

2. **Dequeue Any Animal**:
    ```java
    shelter.dequeueAny();  // Adopt the first queued animal (oldest in queue) from the shelter
    ```

3. **Dequeue a Dog**:
    ```java
    shelter.dequeueDog();  // Adopt the first queued dog (oldest in queue) from the shelter
    ```

4. **Dequeue a Cat**:
    ```java
    shelter.dequeueCat();  // Adopt the first queued cat (oldest in queue) from the shelter
    ```

### Example:

```java
Queue shelter = new Queue();
shelter.enqueue(1, "Dog");
shelter.enqueue(2, "Cat");
shelter.enqueue(3, "Dog");
shelter.enqueue(4, "Cat");

shelter.printQueue();  // Prints: 1(Dog) 2(Cat) 3(Dog) 4(Cat)

shelter.dequeueAny();  // Dequeues: 1(Dog)
shelter.dequeueDog();  // Dequeues: 3(Dog)
shelter.dequeueCat();  // Dequeues: 2(Cat)
```

### License

This project is licensed for educational purposes only. Redistribution, modification, or commercial use requires prior written permission.

### Author

- **Stephen Crocker**
- GitHub: [SearchingSteve](https://github.com/SearchingSteve)
