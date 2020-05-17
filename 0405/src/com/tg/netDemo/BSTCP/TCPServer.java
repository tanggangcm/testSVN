package com.tg.netDemo.BSTCP;

import java.io.*;
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
        ServerSocket serverSocket = new ServerSocket(8080);

        while(true) {
            Socket accept = serverSocket.accept();

            new Thread(() -> {
                try {
                    InputStream is = accept.getInputStream();
                    /*byte[] bytes = new byte[1024];
                    int len = 0;
                    while((len = is.read(bytes)) != -1) {
                        System.out.println(new String(bytes, 0, len));
                    }*/

                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String htmlPath = br.readLine().split(" ")[1].substring(1);
                    System.out.println(htmlPath);
                    FileInputStream fis = new FileInputStream(htmlPath);
                    OutputStream os = accept.getOutputStream();

                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write("\r\n".getBytes());

                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = fis.read(bytes)) != -1) {
                        os.write(bytes, 0, len);
                    }

                    fis.close();
                    accept.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }).start();
        }
//        serverSocket.close();
    }
}
