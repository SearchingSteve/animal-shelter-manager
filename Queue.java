class Queue {
    private Node head, tail;
    private int size;

    private class Node {
        int data;
        String animalType; // Type of the animal ("Dog" or "Cat")
        Node next;

        Node(int data, String animalType) {
            this.data = data;
            this.animalType = animalType;
            this.next = null;
        }
    }

    public Queue() {
        this.head = this.tail = null;
        this.size = 0;
    }

    // Enqueue an animal (dog or cat)
    public void enqueue(int newData, String type) {
        Node newNode = new Node(newData, type);
        if (head == null) {
            head = this.tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(newData + " enqueued to queue (" + type + ")");
    }

    // Dequeue the oldest animal (any type)
    public void dequeueAny() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(head.data + " dequeued from queue (" + head.animalType + ")");
        head = head.next;
        size--;
    }

    // Dequeue the oldest cat
    public void dequeueCat() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        if ("Cat".equals(head.animalType)) {
            System.out.println(head.data + " dequeued from queue (Cat)");
            head = head.next;
            size--;
            return;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null && !"Cat".equals(curr.animalType)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            System.out.println(curr.data + " dequeued from queue (Cat)");
            if (prev != null) {
                prev.next = curr.next;
            }
            if (curr == tail) {
                tail = prev;
            }
            size--;
        } else {
            System.out.println("No cat in the queue");
        }
    }

    // Dequeue the oldest dog
    public void dequeueDog() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        if ("Dog".equals(head.animalType)) {
            System.out.println(head.data + " dequeued from queue (Dog)");
            head = head.next;
            size--;
            return;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null && !"Dog".equals(curr.animalType)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            System.out.println(curr.data + " dequeued from queue (Dog)");
            if (prev != null) {
                prev.next = curr.next;
            }
            if (curr == tail) {
                tail = prev;
            }
            size--;
        } else {
            System.out.println("No dog in the queue");
        }
    }

    // Get the head of the queue (oldest animal)
    public int getHead() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    // Get the tail of the queue (newest animal)
    public int getTail() {
        if (tail == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return tail.data;
    }

    // Get the size of the queue
    public int getSize() {
        return size;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print the queue (for debugging purposes)
    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "(" + temp.animalType + ") ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue shelter = new Queue();

        // Enqueue some dogs and cats
        shelter.enqueue(1, "Dog");
        shelter.enqueue(2, "Cat");
        shelter.enqueue(3, "Dog");
        shelter.enqueue(4, "Cat");

        // Print the queue
        shelter.printQueue();

        // Dequeue any animal (oldest)
        shelter.dequeueAny();

        // Dequeue a dog
        shelter.dequeueDog();

        // Dequeue a cat
        shelter.dequeueCat();

        // Print the queue again
        shelter.printQueue();
    }
}
