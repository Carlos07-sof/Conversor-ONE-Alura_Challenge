
package Conexion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;

public class apiClient {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "c205a440e5e23d80e7a1f694";
    private static final Logger LOGGER = Logger.getLogger(apiClient.class.getName());
    
    
    public String fetchData(String endpoint){
        StringBuilder response = new StringBuilder();
        HttpURLConnection connection = null;
        
        try {
            URL url = new URL(API_URL + endpoint);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, null, e);
            
        }finally{
            if(connection != null){
                connection.disconnect();
            }
        }  
        return response.toString();
    }

}
