package com.albers.fourchapter;

import com.sun.xml.internal.ws.handler.ServerSOAPHandlerTube;
import io.netty.util.CharsetUtil;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Albers
 * @date: 2021/5/12
 * @description:
 */
public class PlainOioServer {
    public void serve(int port)throws IOException{
        final ServerSocket socket = new ServerSocket(port);
        try {
            for (;;){
              final   Socket clientSocket = socket.accept();
                System.out.println("Accepted connection from"+clientSocket);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        OutputStream out;
                        try {
                             out = clientSocket.getOutputStream();
                             out.write("hi!\r\n".getBytes(CharsetUtil.UTF_8));
                             out.flush();
                             clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally {
                            try {
                                clientSocket.close();
                            } catch (IOException e) {

                                //
                            }

                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
