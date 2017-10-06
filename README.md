# JavaBinarySearchTree
[![Build Status](https://travis-ci.org/martip23/JavaBinarySearchTree.svg?branch=master)](https://travis-ci.org/martip23/JavaBinarySearchTree)

A basic binary search tree with an add and inorder traverse method written in java.

# Class Diagram
![Class Diagram](/BstDiagram.JPG)

## Getting Started
These instructions will help you get a copy of the project up and running on your local machine.

### Prerequisites
    Must install any java JDK
    Project ready for Eclipse IDE
    Any IDE should work, source code is in /src
    In Eclipse IDE import .project file

## Program Requirements
* Package must implement a binary tree data structure.
* Node should have integer key.
* Tree should have method for inserting a node.
* Tree should have method for performing in-order tree walk
* Tree walk method should output list of keys in ascending order.
* Classes should be in package binTree.
* Files should be archived **(zipped?)** into file named *BinTreePM*
* Archive file should contain
    1.	UML class diagram for the program generated by the SDE plug-in
    2.	Commented source code (comments per each class and method)
    3.	API docs produced by javadoc
* Should pass the tests listed below
```
    // testcase 2
        System.out.println();
        System.out.println("testcase 1:");
        BinTree binTree2 = new BinTree();
        binTree2.insertNode(new Node(3));
        binTree2.insertNode(new Node(201));
        binTree2.insertNode(new Node(60));
        binTree2.insertNode(new Node(30));
        binTree2.insertNode(new Node(45));
        binTree2.treeWalk();

    // testcase 3
        System.out.println();
        System.out.println("testcase 2_1:");
        BinTree binTree3 = new BinTree();
        binTree3.insertNode(new Node(-10));
        binTree3.insertNode(new Node(-150));
        binTree3.insertNode(new Node(4));
        binTree3.insertNode(new Node(300));
        binTree3.insertNode(new Node(45));
        binTree3.treeWalk();
        binTree3.insertNode(new Node(-50));
        binTree3.insertNode(new Node(200));
        System.out.println();
        System.out.println("testcase 2_2:");
        binTree3.treeWalk();
```

### Built With
* [Eclipse](https://eclipse.org/ide/) - Eclipse Java Integrated Development Environment (IDE)

### Authors
* **Patrick Martinez** - *Initial work* - [martip23](www.github.com/martip23)
