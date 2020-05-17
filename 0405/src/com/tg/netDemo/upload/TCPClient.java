package com.tg.netDemo.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description: TCPClient
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("0405/src/com/tg/IODemo/a.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }
}
