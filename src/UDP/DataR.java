package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class DataR {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10086);

        byte[]  bys = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        ds.receive(dp);

        System.out.println("������"+new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
