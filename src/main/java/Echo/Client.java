package Echo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 8080);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

        String message = "hello server";
        objectOutputStream.writeObject(message);

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        String response = (String) objectInputStream.readObject();

        System.out.println("Message: " + message + "\nResponse: " + response);

    }
}
