package br.ufs.dcomp.ExemploUdpJava; 

import java.net.*;

public class AppUDP2 {

    public static void main(String[] args) throws SocketException {
        try{

            System.out.print("[ Allocating UDP Port                  ..................  ");
    	    DatagramSocket socket = new DatagramSocket(30000);
            System.out.println("[OK] ]");

            byte[] buf = new byte[15];
            DatagramPacket pack = new DatagramPacket(buf, buf.length);

            System.out.print("[ Waiting for message receival  ..................  ");
            socket.receive(pack);
            System.out.println("[OK] ]");
            
            byte[] received_data = pack.getData();
            String received_msg = new String(received_data); 
            InetAddress origin_address = pack.getAddress();
            int origin_port = pack.getPort();
            
            System.out.println("  Message:             "+received_msg);
            System.out.println("  Origin Adress:   "+origin_address.getHostAddress());
            System.out.println("  Origin Port:      "+origin_port);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }    
        
        
        
        

    }
}