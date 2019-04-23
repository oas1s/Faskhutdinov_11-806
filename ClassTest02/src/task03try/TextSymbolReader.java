package task03try;

import java.io.IOException;

public class TextSymbolReader extends Thread {
    private Read product;

    public TextSymbolReader(Read product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isWrited()) {
                    System.out.println("Написан ли?");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                try {
                    product.ReadOneSymbol();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                product.notify();
                System.out.println("Прочитал");
            }
        }
    }
}