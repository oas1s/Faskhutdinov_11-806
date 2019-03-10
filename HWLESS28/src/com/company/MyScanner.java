
package com.company;

import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    private InputStream is;

    public MyScanner(InputStream is) {
        this.is = is;
    }

    public int nextInt() throws IOException {
        int result = 0;
        int x = is.read();
        while (x>=48 && x<= 57) {
            result = result*10 +x-'0';
            x = is.read();
        }
        return result;
    }

    public double nextDouble() throws IOException {
        double result = 0;
        int x = is.read();
        int c = 0;
        double d = 1;
        boolean hasDot = false;
       while (((x>='0' && x<='9') | x == '.')) {
            if (hasDot) {
                c++;
            }
           if (x == '.') {
               hasDot = true;
               x = is.read();
           } else {
               result = result * 10 + x - '0';
               x = is.read();
           }
        }
        for (int i = 0; i <c; i++) {
            d = d*10;
        }
        return result/d;
    }

    public String next() throws IOException {
        String result = "";
        int x = is.read();
        while (x != -1 && x!= '\n') {
            result = result + (char)x;
            x = is.read();
        }
        return result;
    }

    public String nextLine() throws IOException {
        return next();
    }
}