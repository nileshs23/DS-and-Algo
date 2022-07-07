const Node = class {
	constructor(nodeData) {
		this.data = nodeData;
		this.next = null;
	}
};

class LinkedList {
	constructor() {
		this.head = null;
	}

	add(data) {
		let temp = new Node(data);
		let current;
		if (this.head == null) {
			this.head = temp;
		} else {
			current = this.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
	}

	addAfterElement(ele, data) {
		let temp = new Node(data);
		let current = this.head;
		//assume we have already that element and no repetitions
		while (current.data != ele) {
			current = current.next;
		}
		// console.log(current.data);
		temp.next = current.next;
		current.next = temp;
	}

	addBeforeElement(ele, data) {
		let temp = new Node(data);
		let current = this.head;
		let prev = null;
		while (current.data != ele) {
			prev = current;
			current = current.next;
		}
		temp.next = current;
		prev.next = temp;
	}

	addAfterNode(address, data) {
		let temp = new Node(data);
		let current = this.head;
		let i = 1;

		while (current.next != null) {
			if (i == address) {
				break;
			}
			i++;
			current = current.next;
		}
		// console.log(i, current.data);
		temp.next = current.next;
		current.next = temp;
	}

	addBeforeNode(address, data) {
		let temp = new Node(data);
		let current = this.head;
        let prev=null;
		let i = 1;

		while (current.next != null) {
			if (i == address) {
				break;
			}
			i++;
            prev = current;
			current = current.next;
		}
		// console.log(i, current.data,prev.data);
		temp.next = current;
		prev.next = temp;
	}

	printList() {
		let current = this.head;
		let arr = [];
		if (current == null) {
			return;
		} else {
			while (current.next != null) {
				arr.push(current.data);
				current = current.next;
			}
			arr.push(current.data);
		}

		console.log(arr.join(" --> "));
	}
}

var l1 = new LinkedList();
l1.add(10);
l1.add(20);
l1.add(30);
l1.printList();
l1.addBeforeNode(2, 40);
l1.printList();

// function insertNodeAtHead(head, data) {
// 	let temp = new LinkedListNode(head);
// 	temp.data = data;
// 	temp.next = null;
// 	return temp;
// }

// insertNodeAtHead(head, 10);
