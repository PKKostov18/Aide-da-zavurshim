/* Реализирайте програма на java, която описва част от дейността на една книжарница – закупуване на книги, изчисляване на обща сума, търсене на книга по заглавие, добавяне на нова книга и изтриване на поръчката след изпълнението и. Приемаме, че заглавията на книгите се въвеждат слято - без интервали между думите.

Приведете в работещ вид предоставения по-долу програмен фрагмент.

Имплементирайте линеен едносвързан списък от структура от данни със следните полета:

ID – номер по ред

nameBook – наименование на книгата (без интервали)

price – цена на книгата

Списъкът трябва да поддържа следните методи:

-        Добавяне на елемент от към началото;

-        Извеждане на всички елементи;

-        Изчисляване на общата сума;

-        Търсене на елемент по заглавие на книгата;

-        Добавяне на елемент от към края на списъка;

-        Премахване (изтриване) на елемент по пореден номер на поръчка;

-        Изтриване на всички елементи от списъка от към началото.

 */




import java.util.Scanner;

public class Node {
    public int ID; // Next number
    public String nameBook;
    public float price;
    public Node nextElement; // Pointer to next element

    // Constructor to initialize nextElement of newly created Node
    public Node() {
        ID = 0;
        nameBook = "";
        price = 0.00f;
        nextElement = null;
    }
}


public class LinkedList {
    public Node head; // Pointing to start of the list

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        // Check whether the head points to null
        return head == null;
    }

    public void insertAtHead(int ID, String nameBook, float price) {
        Node newNode = new Node(); // Creating a new node
        newNode.ID = ID;
        newNode.nameBook = nameBook;
        newNode.price = price;
        newNode.nextElement = head; // Linking newNode to head's pointer
        head = newNode; // Head pointing to the start of the list
    }

    public void insertAtTail(int ID, String nameBook, float price) {
        Node newNode = new Node(); // Creating new node
        newNode.ID = ID;
        newNode.nameBook = nameBook;
        newNode.price = price;

        if (isEmpty()) { // Inserting first element in list
            head = newNode;
            newNode.nextElement = null; // Head will point to first element of the list
        } else {
            Node tail = head; // Last pointing at the head of the list

            // Traversing through the list
            while (tail.nextElement != null) {
                tail = tail.nextElement;
            }
            newNode.nextElement = null; // Point last's nextElement to null
            tail.nextElement = newNode; // Adding the newNode at the end of the list
        }
    }

    // Printing the list
    public boolean printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return false;
        }
        Node temp = head; // Starting from head node
        System.out.print("List: ");

        // Traversing through the List
        while (temp != null) {
            System.out.print(temp.ID + " " + temp.nameBook + " " + temp.price + " -> ");
            temp = temp.nextElement; // Moving on to the temp's nextElement
        }
        System.out.println("null");
        return true;
    }

    public float totalPrice() {
        Node temp = head; // Pointing temp to the head
        float result = 0;

        while (temp != null) {
            result += temp.price;
            temp = temp.nextElement;
        }
        return result;
    }

    public boolean search(String name) {
        Node temp = head; // Pointing temp to the head

        while (temp != null) {
            if (temp.nameBook.equals(name)) { // If passed value matches with temp's data
                return true;
            }
            temp = temp.nextElement; // Pointing to temp's nextElement
        }
        return false; // If not found
    }

    // Deletes by ID
    public boolean deleteNode(int value) {
        boolean deleted = false; // Returns true if the node is deleted, false otherwise

        if (isEmpty()) { // Check if the list is empty
            System.out.println("List is Empty!");
            return deleted; // Deleted will be false
        }

        // If list is not empty, start Traversing it from the head
        Node currentNode = head; // currentNode to traverse the list
        Node previousNode = null; // previousNode starts from null

        if (currentNode.ID == value) { // Deleting value of head
            deleted = deleteAtHead();
            System.out.println(value + " deleted!");
            deleted = true; // True because value found and deleted
            return deleted; // Returns true if the node is deleted
        }
        previousNode = currentNode;
        currentNode = currentNode.nextElement; // Pointing current to current's nextElement
        // Traversing/Searching for Node to Delete
        while (currentNode != null) {
            // Node to delete is found
            if (value == currentNode.ID) {
                // Pointing previousNode's nextElement to currentNode's nextElement
                previousNode.nextElement = currentNode.nextElement;
                currentNode = null;
                currentNode = previousNode.nextElement;
                deleted = true;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.nextElement; // Pointing current to current's nextElement
        }
        // Deleted is true only when value is found and deleted
        if (!deleted) {
            System.out.println(value + " does not exist!");
        } else {
            System.out.println(value + " deleted!");
        }
        return deleted;
    } // End of delete()

    public boolean deleteAtHead() {
        if (isEmpty()) { // Check if the list is empty
            System.out.println("List is Empty!");
            return false;
        }
        // If list is not empty, start traversing it from the head
        Node currentNode = head; // currentNode pointing to head
        head = head.nextElement; // nextNode point to head's nextElement

        currentNode = null;
        return true;
    }
}