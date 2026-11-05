
package filehandling1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bookread {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("book.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Book obj;
        ArrayList<Book> al = new ArrayList<>();

        try {
            while (true) {
                obj = (Book) ois.readObject();
                al.add(obj);
            }
        }
        catch (EOFException e) {
            // Reading completed
        }

        for (Book b : al) {
            b.display();
        }

        highestPrice(al);
        totalPrice(al);

        ois.close();
        fis.close();
    }

    // Find highest price
    static void highestPrice(ArrayList<Book> b) {

        float max = b.get(0).price;
        int pos = 0;

        for (int i = 1; i < b.size(); i++) {

            if (b.get(i).price > max) {
                max = b.get(i).price;
                pos = i;
            }
        }

        System.out.println("Highest Price Book:");
        b.get(pos).display();
    }

    // Calculate total price
    static void totalPrice(ArrayList<Book> b) {

        float total = 0;

        for (int i = 0; i < b.size(); i++) {
            total = total + b.get(i).price;
        }

        System.out.println("Total Price = " + total);
    }
}
