package br.com.devmpoda.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

        public void post(String url, Map<String, Object> dados) {
            // lógica para enviar dados via HTTP
            try {
                URL urlDaApi = new URL(url);
                URLConnection openConnection = urlDaApi.openConnection();
                openConnection.connect();
            } catch (Exception e) {
                throw new RuntimeException("Erro ao enviar requisição HTTP",e);
            }
        }
}
