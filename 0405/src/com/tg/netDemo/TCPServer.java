package com.tg.netDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: TCPServer
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
//        while((len = is.read(bytes)) != -1) {
//            System.out.println(new String(bytes, 0, len));
//        }

        OutputStream os = accept.getOutputStream();
        os.write("收到".getBytes());

        accept.close();
        serverSocket.close();
    }
}
