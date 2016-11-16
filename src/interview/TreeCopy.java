package interview;

public class TreeCopy {

	/* 주어진 트리를 복사하기 */
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 9, 3, 5, 0 };
		int size = arr.length;
		Tree t = new Tree();
		Queue q = new Queue(size);
		for (int idx = 0; idx < size; idx++) {
			q.push(arr[idx]);
			t.insertNode(arr[idx]);
		}
		for (int idx = 0; idx < size; idx++) {
			System.out.print(q.pop() + " ");
		}

	}
}

class TreeNode {
	int val;
	TreeNode right;
	TreeNode left;

	public TreeNode(int val) {
		this.val = val;
		this.right = null;
		this.left = null;
	}
}

class Tree {
	TreeNode rootNode;

	public void insertNode(int element) {
		/* root에 값이 없으면, root에 값을 넣는다. */
		if (rootNode == null) {
			rootNode = new TreeNode(element);

		} else {
			TreeNode head = rootNode;
			TreeNode currentNode;

			while (true) {
				currentNode = head;

				if (head.val > element) {
					head = head.left;

					if (head == null) {
						currentNode.left = new TreeNode(element);
						break;
					}
				} else {
					head = head.right;

					if (head == null) {
						currentNode.right = new TreeNode(element);
						break;
					}
				}
			}
		}
	}
}

class Queue {
	private int front;
	private int rear;
	private int size;
	int[] queue;

	public Queue(int size) {
		rear = front = -1;
		queue = new int[size];
	}

	/* 넣기 */
	public void push(int element) {
		++rear;
		if (rear == size) {
			size = size + 1;
			int[] newQueue = new int[size];
			for (int idx = 0; idx < size - 1; idx++) {
				newQueue[idx] = queue[idx];
			}
			queue = newQueue;
		}
		queue[rear] = element;
	}

	/* 빼기 */
	public int pop() {
		++front;
		return queue[front];
	}
}