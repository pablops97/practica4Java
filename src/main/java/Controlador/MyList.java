package Controlador;

import Modelo.Empleado;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyList <E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actualNode;
    private int contador = -1;
    
    
    public MyList(){
        this.firstNode = null;
        this.lastNode = null;
        this.actualNode = null;
        
    }
    
    public void showMyList(){
        Node<E> temporary = this.firstNode;
        while (temporary != null){
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary=temporary.getNextNode();
        }
    }
    
    public void inverseShowMyList(){
        Node<E> temporary = this.lastNode;
        while (temporary != null){
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary=temporary.getPreviousNode();
        }
    }
    
    public void add(E p, int index){
        
        contador++;
        Node<E> newNode = new Node(p, index);
        
        //creas empleado 1 y lo añades
        
        if(firstNode == null){
            this.lastNode = newNode;
            this.firstNode = newNode;
            this.actualNode = newNode;
    
        }else{
            
            firstNode.setPreviousNode(newNode);
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
        this.actualNode = firstNode;
    }
    
    
    public void removeElement(){

        //no se ni como lo he hecho
        
        if(actualNode == lastNode){
            lastNode = actualNode.previousNode;
        }else if(actualNode == firstNode){
            firstNode = actualNode.nextNode;
        }else{
            actualNode.nextNode.setPreviousNode(actualNode.previousNode);
            actualNode.previousNode.setNextNode(actualNode.nextNode);
        }
        contador--;
    }
    
    public boolean existe(int numeroEmpleado){
        
        Node aux = firstNode;
            while(aux != null){
                if(aux.getIndex() == numeroEmpleado){
                return true;
                }
                aux = aux.getNextNode();   
            }            
        return false;
    }
    
    public void intercambiar(int numEmp1, int numEmp2){
        
        Node aux = firstNode;
        
        Node posicionNum1 = null;
        Node posicionNum2 = null;
        int contador = 0;
        
        
                try{
                while (aux != null){
                    if(aux.getIndex() == numEmp1){
                        posicionNum1 = aux;
                        contador++;
                    }else if(aux.getIndex() == numEmp2){
                        posicionNum2 = aux;
                        contador++;
                    }

                    aux = aux.getNextNode();

                    //Si los dos elementos se han encontrado se sale del bucle
                    if(contador == 2){
                        break;
                    }
                }
            }catch(NullPointerException n){
                //Si no, sera que ha llegado al final y salta la excepcion por consola
                System.out.println("No se ha encontrado ningun elemento para intercambiar");
            }

            //He creado un metodo que clone el nodo, porque si lo igualo sin mas
            //lo que hace es un puntero a ese nodo de la lista
            aux = cloneNode(posicionNum1);
            posicionNum1.setMain(posicionNum2.getMain());
            posicionNum1.setIndex(posicionNum2.getIndex());
            posicionNum2.setMain(aux.getMain());
            posicionNum2.setIndex(aux.getIndex());
     

    }
    
    

    
    public boolean sort(){
        

        boolean controlador = false;
        int nuevoContador = 0;
        
        if(this != null){
           for(int i = 0; i < contador+1; i++){
            Node temp = this.firstNode;
               System.out.println(i);
            for(int j = 0; j < contador - nuevoContador; j++){
                System.out.println(j);
                //si el siguiente no es nulo porque me daba un error ya que llegaba hasta el siguiente del ultimo
                if(temp.getNextNode()!= null){
                  if(temp.getIndex() > temp.getNextNode().getIndex()){
                      
                      intercambiar(temp.getIndex(), temp.getNextNode().getIndex());
                      controlador = true;
                    }
                    temp = temp.getNextNode();
                    
                    }
                
                }
            
            if(!controlador){
                return true;
            }
            
            }
               
        }
        return false; 
    }
        public void intercambiarMain(Node n1, Node n2){
        Node<E> node1 = n1;
        Node<E> node2 = n2;

        int indexAux = node1.getIndex();
        node1.setIndex(node2.getIndex());
        node2.setIndex(indexAux);

        E tempMain= node1.getMain();
        node1.setMain(node2.getMain());
        node2.setMain(tempMain);
        //System.out.println("Intercamio realizado");
    }
    
    public void sortMejorado(){
        boolean cambiar = false;
        int listSize = this.contador;
        do{
            cambiar= false;
            Node<E> node1 = this.firstNode;
            Node<E> node2  = node1.getNextNode();
            for(int i=0;i<listSize;i++){
                if(node1.getIndex()>node2.getIndex()){
                    intercambiarMain(node1,node2);
                    cambiar = true;
                }
                node1 = node1.getNextNode();
                node2 = node2.getNextNode();
            }
            System.out.println("QUEDAN "+listSize+" LINEAS");
            listSize--;
        }while(cambiar);
    }
    

    
    public void serializacion(String ruta) throws FileNotFoundException, IOException{
        
        //mejorar metiendolo en un arraylist y serializar el arrayList
        Node aux = this.firstNode;
        FileOutputStream fileOut = new FileOutputStream(ruta);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        while(aux != null){
            try
            {
                E objeto = (E) aux.getMain();
                out.writeObject(objeto);
                aux = aux.getNextNode();
                }
            catch(IOException i)
            {
                i.printStackTrace();
            } 
        }
        
        out.close();
        fileOut.close();
        
        
        System.out.printf("Datos serializados");
        
    }
    
    public ArrayList deserializar(String ruta){
        
        //devolver un arraylist de objetos y despues eso en el main extraerlo y meterlo en una MyList
        ArrayList<E> lista = new ArrayList();
        E emp = null;
        try
        {
            FileInputStream fileIn = new FileInputStream(ruta);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            try{
               while(true){
                emp = (E) in.readObject();
                lista.add(emp);
                
                } 
            }catch(EOFException ex){}
        in.close();
        fileIn.close();     
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Clase Empleado no encontrada");
            c.printStackTrace();
        }
        return lista;
    }
    
    public void nextNode(){
        this.actualNode = actualNode.getNextNode();
    }
    
    public void previousNode(){
        this.actualNode = actualNode.getPreviousNode();        
    }
    
    public void goingFirstNode(){
        this.actualNode = firstNode;
    }
    
    public void goingLastNode(){
        this.actualNode = lastNode;
    }
    
    public boolean isFirst(){
        return (actualNode == firstNode);
    }
    
    public boolean isLast(){
        
        return (actualNode == lastNode);
    
    }
    
    
    public void vaciarLista(){
        this.actualNode = null;
        this.firstNode = null;
        this.lastNode = null;
        this.contador = -1;
    }
    
    public Node<E> cloneNode(Node<E> originalNode) {
    if (originalNode == null) {
        return null; // No se puede clonar un nodo nulo
    }
    
    // Crear una nueva instancia del nodo clonado
    Node<E> clonedNode = new Node<>(originalNode.getMain(), originalNode.getIndex());

    
    return clonedNode;
}

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    public Node<E> getActualNode() {
        return actualNode;
    }

    public void setActualNode(Node<E> actualNode) {
        this.actualNode = actualNode;
    }

    
    
    
// Inner class

    public class Node<E>{
        private Node<E> nextNode;
        private Node<E> previousNode;
        E main;
        int index = 1;
        
        public Node(E p,int index){
            this.nextNode = null;
            this.main = p;
            this.index = index;
            
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

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node<E> getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node<E> previousNode) {
            this.previousNode = previousNode;
        }

        @Override
        public String toString() {
            return "Node{" + "main=" + main + '}';
        }
        
        
        
        
    }
}
