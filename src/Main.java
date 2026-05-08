import staticStrutures.queue.Fila;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Fila<String> fila = new Fila<>(10);
        
        fila.adiciona("Gustavo");
        System.out.println(fila);
        fila.adiciona("Mateus");
        System.out.println(fila);
        fila.adiciona("Maria");
        System.out.println(fila);
        fila.retira();
        System.out.println(fila);
        
        
    }
}