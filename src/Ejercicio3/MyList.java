package Ejercicio3;

public class MyList <E> {
    private Node<E> firstNode;
    
    public MyList(){
        this.firstNode = null;
    }
    
    public void showMyList(){
        Node<E> temporary = this.firstNode;
        while (temporary != null){
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary=temporary.getNextNode();
        }
    }
    
    public void add(E p){
        Node<E> newNode = new Node(p);
        newNode.setNextNode(this.firstNode); 
        this.firstNode = newNode;
    }
    
// Inner class

    public class Node<E>{
        private Node<E> nextNode;
        E main;
        
        public Node(E p){
            this.nextNode = null;
            this.main = p;                   
        }
        
        public Node<E> getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }
    }
}


