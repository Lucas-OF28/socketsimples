package servidorzinho.src.dev.servidorzinho;

import servidorzinho.src.dev.servidorzinho.Cliente;
import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        
        Cliente cliente = new Cliente("172.23.8.117",12345);
        System.out.println("Cliente concluido!");
        
        
    }
}
