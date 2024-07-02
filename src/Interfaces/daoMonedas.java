
package Interfaces;

import Model.Moneda;
import java.util.List;

public interface daoMonedas {
    
    public List<Moneda> getAllconversion();
    double convertCurrency(String from, String to, double amount);

    
}
