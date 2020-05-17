package com.tg.netDemo;

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
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        socket.close();
    }
}
