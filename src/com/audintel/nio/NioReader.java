package com.audintel.nio;

import java.io.IOException;
        import java.io.RandomAccessFile;
        import java.nio.ByteBuffer;
        import java.nio.channels.FileChannel;
        import java.nio.charset.Charset;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.nio.file.StandardOpenOption;
        import java.util.HashSet;
        import java.util.Set;
public class NioReader {
    public static void main(String[] args) throws IOException {
        writeFileChannel (ByteBuffer.wrap("Java nio".getBytes()));
        readFileChannel();
    }
    public static void readFileChannel() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("C:\\D\\useful-skaviligit.txt", "rw");

        FileChannel fc = raf.getChannel();
        ByteBuffer bf = ByteBuffer.allocate(512);
        Charset ch = Charset.forName("US-ASCII");
        while(fc.read(bf) > 0) {
            bf.rewind();
            System.out.print(ch.decode(bf));
            bf.flip();
        }
        fc.close();
        raf.close();
    }
    public static void writeFileChannel(ByteBuffer byteBuffer) throws IOException
    {
        Set<StandardOpenOption> opt = new HashSet<>();
        opt.add(StandardOpenOption.CREATE);
        opt.add(StandardOpenOption.APPEND);
        Path p = Paths.get("C:\\D\\useful-skaviligit.txt");
        FileChannel fc1 = FileChannel.open(p, opt);
        fc1.write(byteBuffer);
        fc1.close();
    }
}
