package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {
        implementation.Node<E> node = new implementation.Node<>(data);
        if(isEmpty()){
            root = node;
        }
        else{
            implementation.Node<E> temp = (implementation.Node<E>)root;
            implementation.Node<E> parent = null;
            while(temp != null){
                parent = temp;
                if(data.compareTo(temp.getData()) <= 0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            //identifying the position left or right
            //to insert new node
            if(data.compareTo(parent.getData()) <= 0){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }

    }
    public boolean isEmpty(){
        return root==null;
    }

    @Override
    public boolean search(E elemnet) {
        boolean response=false;
        implementation.Node<E> temp= (implementation.Node<E>) root;
        while (temp !=null){
            if(elemnet.compareTo(temp.getData())==0){
                response=true;
                break;
            }
            else if(elemnet.compareTo(temp.getData())<=0){
                temp=temp.getLeft();

            }
            else{
                temp=temp.getRight();
            }
        }


        return response;
    }

    @Override
    public void inOrder(Node<E> node) {
    if(node!=null){
        inOrder( ((implementation.Node<E>)node).getLeft());

        System.out.print(((implementation.Node<E>)node).getData()+", ");

        inOrder(((implementation.Node<E>)node).getRight());
    }

    }

    @Override
    public void preOrder(Node<E> node) {
        if (node != null){

            System.out.print((((implementation.Node<E>)node).getData())+ ", ");

            preOrder(((implementation.Node<E>)node).getLeft());

            preOrder(((implementation.Node<E>)node).getRight());
        }

    }

    @Override
    public void postOrder(Node<E> node) {
        if(node!=null){
            postOrder(((implementation.Node<E>)node).getLeft());

            postOrder(((implementation.Node<E>)node).getRight());

            System.out.println(((implementation.Node<E>)node).getData());



        }


    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
