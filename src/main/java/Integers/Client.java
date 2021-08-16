package Integers;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;
import java.util.List;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 8080);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

        List<Integer> message = List.of(10,20,30,0,50);
        objectOutputStream.writeObject(message);

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        int response = (Integer) objectInputStream.readObject();

        System.out.println("Message: " + message + "\nResponse: " + response);

    }
}
