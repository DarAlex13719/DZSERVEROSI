import java.io.IOException;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        String host = "localHost";
        int port = 8089;

        try(Socket clientSocket = new Socket(host, port);
            PrintWriter out = new
                    PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Netology.ru");
            String resp = in.readLine();
            System.out.println(resp);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}