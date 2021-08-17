package Echo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket socket = serverSocket.accept();

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            String inputMessage = (String) objectInputStream.readObject();
            String outputMessage = inputMessage.toUpperCase();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(outputMessage);
        }
    }
}
