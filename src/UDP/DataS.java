package UDP;

import java.io.IOException;
import java.net.*;

public class DataS {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte [] bys ="Hello DategramSocket".getBytes();

        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"),10086);

        ds.send(dp);

        ds.close();

    }
}
