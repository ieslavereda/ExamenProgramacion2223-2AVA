package es.ieslavereda.exercise3;

public class Lista<T>{

    private Node<T> head;
    private int size;

    public Lista(){
        head = null;
        size = 0;
    }

    public int size(){ return size;}
    public boolean isEmpty() {return size==0;}

    public void add(T elem){
        Node<T> node = new Node<>(elem);
        if(!isEmpty())
            node.setNext(head);
        head = node;
        size++;
    }

    public T get(int index){
        if (index < 0 || index >= size || isEmpty())
            return null;
        Node<T> aux = head;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }
        return aux.getElem();
    }

    public T remove(int index){
        if (index < 0 || index >= size || isEmpty())
            return null;
        Node<T> aux = head;
        Node<T> aux2 = head.getNext();
        if(index==0){
            aux = head;
            head = head.getNext();
            size--;
            return aux.getElem();
        }
        for (int i = 0; i < index-1; i++) {
            aux = aux2;
            aux2 = aux2.getNext();
        }
        aux.setNext(aux2.getNext());
        size--;
        return aux2.getElem();
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
    }
}
