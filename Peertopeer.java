package peertopeer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Peertopeer {

    public static void main(String[] args) {
        try {
            int fileSize = 364;
            String desiredFile = "file.txt";
            List<Peer> peers = getPeers();
            Peer myPc = new Peer("MY PC");
            int intervall = fileSize/peers.size();
            peers.get(0).sendFile(desiredFile, 0, 0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<Peer> getPeers() {
        List<Peer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Peer p = new Peer("P" + i);
            p.addToFileNames("file.txt");
            list.add(p);
        }
        return list;
    }
}
