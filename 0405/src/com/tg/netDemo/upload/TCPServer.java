package com.tg.netDemo.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @Description: TCPServer
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        //让一个服务器一直处于监听状态（死循环accept方法）
        //让一个客户端上传文件，就保存一个文件
        while(true) {

            Socket accept = serverSocket.accept();

            //使用多线程技术，提高程序的效率
            //有一个客户端上传文件，就开启一个线程，完成上传
            new Thread(() -> {
                try {
                    InputStream is = accept.getInputStream();

                    File file = new File("0405/src/com/tg/netDemo/upload");
                    if (!file.exists()) {
                        file.mkdirs();
                    }

                    String fileName = "tg" + System.currentTimeMillis()
                            + new Random().nextInt(999999) + ".jpg";

                    FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }

                    OutputStream os = accept.getOutputStream();
                    os.write("上传成功".getBytes());

                    fos.close();
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        //服务器不用关闭
//        serverSocket.close();
    }
}
