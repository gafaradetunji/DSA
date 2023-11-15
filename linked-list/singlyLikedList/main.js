
class Node {

    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    head

    // a class constructor for the LinkedList 
    constructor() {
        this.head = null;
    }

    // a method to print the linked list
    printLinkedList() {
        let current = this.head;
        while(current !== null){
            console.log(current.data);
            current = current.next;
        }
    }

    // a method to get the length of the linked list
    linkedListLength() {
        let count = 1
        let current = this.head;
        while (current.next !== null){
            count++;
            current = current.next;
        }
        console.log(count);
        return count;
    }

    //insert a new item in the linked list
    insertNode(node) {
        let current = this.head;
        while (current.next !== null){
            current = current.next;
        }
        current.next = node;
    }

    //insert a new item in the linked list at the head
    insertNodeAtHead(node) {
        let current = this.head;
        node.next = current;
        this.head = node;
    }

    insertNodeAtIndex(node, index) {
        let current = this.head;
        let currentIndex = 0
        while(current !== null && currentIndex <= index - 1 ){
            current = current.next;
            currentIndex++;
            console.log('Index', currentIndex);
        }
        if(current !== null){
            node.next = current.next;
            current.next = node;
        }
    }
}

node1 = new Node(1);
node2 = new Node(2);
node3 = new Node(3);
node4 = new Node(10);

head = node1
node1.next = node2
node2.next = node3
node3.next = node4

// console.log(node1, node2, node3, node4);
const list = new LinkedList()
list.head = node1;
node1.next = node2;
node2.next = node3;
node3.next = node4;
// list.printLinkedList(head);
// list.linkedListLength()
list.insertNode(new Node(5));
list.insertNodeAtHead(new Node(0));
list.insertNodeAtIndex(new Node(24), 0);
// list.linkedListLength()
list.printLinkedList();