<div align="center">
  <h3 align="center">Tree Data Structure and It's Implementation</h3>

  <p align="center">
    More About Tree!
    <br />
  </p>
</div>


## About Tree

<h5> Root: </h5>  The root node is the topmost node in the tree hierarchy. In other words, the root node is the one that doesn't have any parent. In the above structure, node numbered 1 is the root node of the tree. If a node is directly linked to some other node, it would be called a parent-child relationship.

<h5> Child node: </h5> If the node is a descendant of any node, then the node is known as a child node.
<h5> Parent: </h5> If the node contains any sub-node, then that node is said to be the parent of that sub-node.
<h5> Sibling: </h5> The nodes that have the same parent are known as siblings.
<h5> Leaf Node:- </h5> The node of the tree, which doesn't have any child node, is called a leaf node. A leaf node is the bottom-most node of the tree. There can be any number of leaf nodes present in a general tree. Leaf nodes can also be called external nodes.
<h5> Internal nodes: </h5> A node has atleast one child node known as an internal
<h5> Ancestor node:- </h5> An ancestor of a node is any predecessor node on a path from the root to that node. The root node doesn't have any ancestors. In the tree shown in the above image, nodes 1, 2, and 5 are the ancestors of node 10.
<h5> Descendant:  </h5>The immediate successor of the given node is known as a descendant of a node. In the above figure, 10 is the descendant of node 5.

![tree3](https://user-images.githubusercontent.com/53571060/191899858-2980829f-3169-46cc-85a3-fe656b5cec07.png)

## Implementation of Tree!

![tree4](https://user-images.githubusercontent.com/53571060/191900838-6084862f-c430-4d86-9a7c-6f7c5f622f1a.png)

        int data;
        Node left;
        Node right;
        
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }



## To Make New Node

       Node root = new Node(10);   // start by making root node
       root.left = new Node(20);   // making left child of root
       root.right = new Node(20);   // making right child of root
