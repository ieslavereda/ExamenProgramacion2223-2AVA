package es.ieslavereda.exercise2;

import es.ieslavereda.exercise1.Pet;
import java.util.Set;

public class MyModelTAD<T>{

    private Node<T> head;
    private int size;

    public MyModelTAD(){
        head = null;
        size = 0;
    }

    public int size(){ return size;}
    public boolean isEmpty() {return size==0;}

    public void add(T elem){
        Node<T> node = new Node<>(elem);
        if(isEmpty()){
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public T get(int index){
        if (index < 0 || index > size)
            return null;
        Node<T> aux = head;
        for (int i = 0; i < index; i++) {
            aux = head;
        }
        return aux.getElem();
    }

    public T remove(int index){
        if (index < 0 || index > size)
            return null;
        Node<T> aux = head;
        Node<T> aux2 = head.getNext();
        if(index==0){
            aux = head;
            head = head.getNext();
            return aux.getElem();
        }
        for (int i = 0; i < index-1; i++) {
            aux = head.getNext();
            aux2 = head.getNext().getNext();
        }
        return aux.getElem();
    }

    public boolean update(T elem){
        Node<T> aux = head;
        for (int i = 0; i < size; i++) {
            if (elem.equals(aux.elem)){
                return true;
            }
            aux = head.getNext();
        }
        return false;
    }

    private class Node<T>{
        T elem;
        Node<T> next;

        public Node(T elem){
            this.elem = elem;
        }

        public T getElem(){return elem;}
        public Node<T> getNext(){return next;}
        public void setNext(Node<T> node){next = node;}

        @Override
        public boolean equals(Object o){
            if(!(o instanceof Node))
                return false;
            Node<T> node = (Node) o;
            return elem.equals(node.getElem());
        }

    }
}
