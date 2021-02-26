// SERVE PER CONCLUDERE LA LISTA, POICHÉ LA LISTA È DINAMICA
public class Nil extends List{
    @Override
    public String toString() {
        // stampiamo nulla poiché la lista sarà finita
        return "";

        // metodo ricorsivo, va all'infinito (in realtà si ferma prima di occupare ...
        // ... tutta quanta la RAM
//        return "" + this.toString();
    }

    @Override
    public List addLast(int x) {
        return new Node(x, this);
    }

    @Override
    public void addLast2(int x) {
    }
}
