package task03try;

import java.io.IOException;

public class TextWriter extends Thread {
    private Read product;

    public TextWriter(Read product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isReaded()) {
                    System.out.println("Прочитан ли?");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                try {
                    product.Write();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                product.notify();
                System.out.println("Напечатал");
            }
        }
    }
}