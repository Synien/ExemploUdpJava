package br.ufs.dcomp.ExemploUdpJava;

import java.net.*;

public class AppUDP1 {

    public static void main(String[] args) throws SocketException {
        try{
            System.out.print("[ Allocating UDP port      ..................  ");
    	    DatagramSocket socket = new DatagramSocket(10000);
            System.out.println("[OK] ]");
            
            String msg = "Success.";
            
            byte[] msg_buf = msg.getBytes();
            int msg_size = msg_buf.length;
            InetAddress destination_address = InetAddress.getLocalHost();
            int destination_port = 30000; 

            System.out.print("[ Building UDP Datagram  ..................  ");
            DatagramPacket pack = new DatagramPacket(msg_buf, msg_size, destination_address, destination_port);
            System.out.println("[OK] ]");
            
            System.out.print("[ Sending UDP Datagram  ..................  ");
            socket.send(pack);
            System.out.println("[OK] ]");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }    
    }
}