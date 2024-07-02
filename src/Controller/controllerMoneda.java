
package Controller;

import Conexion.apiClient;
import Interfaces.daoMonedas;
import Model.Moneda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class controllerMoneda extends apiClient implements daoMonedas{
    private apiClient apiClient;
    
    public controllerMoneda(){
        this.apiClient = new apiClient(); 
    }
    
    @Override
    public List<Moneda> getAllconversion() {
        List<Moneda> listmoneda = new ArrayList<>();
        try {
            String endpoint = "latest/USD";
            String response = apiClient.fetchData(endpoint);
            
            JSONObject jsonObject = new JSONObject(response);
            
            JSONObject conversionRates = jsonObject.getJSONObject("conversion_rates");
            
            Iterator<String> keys = conversionRates.keys();
            while (keys.hasNext()) {
                Moneda moneda = new Moneda();
                String tipo = keys.next();
                double cantidad = conversionRates.getDouble(tipo);
                moneda.setTipo(tipo);
                moneda.setCambio(cantidad);
                listmoneda.add(moneda);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return listmoneda;
    }

    @Override
    public double convertCurrency(String from, String to, double amount) {       
        try {
            String endpoint = "/pair/" + from + "/" + to + "/" + amount;
            String response = apiClient.fetchData(endpoint);
            
            JSONObject jsonObject = new JSONObject(response);
            
            double conversionResult = jsonObject.getDouble("conversion_result");

            return conversionResult;
            
        } catch (Exception e) {
            throw e;
        }
    }

    
}
