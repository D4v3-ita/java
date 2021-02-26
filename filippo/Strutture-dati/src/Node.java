public class Node extends List{
    // il valore da memorizzare
    private int value;

    // classe che ci permette di salvarsi il collegamento all'oggetto dopo
    private List next;

    // COSTRUTTORE
    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "value=" + value + ", next=" + next.toString();
    }

    @Override
    public List addLast(int x) {
        // chiamata ricorsiva
        this.next = next.addLast(x);
        // returniamo noi stessi
        return this;
    }

    public void addLast2(int x){
        if(this.next instanceof Nil)
            this.next = new Node(x, this.next);
        else
            this.next.addLast2(x);
    }

}
