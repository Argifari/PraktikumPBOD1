/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jarkom;

/**
 *
 * @author argif
 */
/**
 * * Non Blocking I/O
 * */

import java.io.IOException;
import java.util.concurrent.Future;
import org.apache.hc.client5.http.async.methods.SimpleHttpRequest;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;

public class JavaApacheHTTPClientReactive {
    public static void main(String[] args) throws IOException, Exception {
        // Membuat HTTP async client
        try (CloseableHttpAsyncClient client = HttpAsyncClients.createDefault()) {
            client.start();
            
            // Membuat permintaan GET ke example.com
            SimpleHttpRequest request = SimpleHttpRequest.create("GET", "http://example.com");
            
            // Mengeksekusi request secara asynchronous dan menunggu hasilnya
            Future<SimpleHttpResponse> future = client.execute(request, null);
            
            // Mendapatkan response
            SimpleHttpResponse response = future.get();
            
            // Menampilkan status code atau body (tambahan agar hasilnya terlihat di konsol)
            System.out.println("Response Status: " + response.getCode());
            System.out.println(response.getBodyText());
        }
    }
}