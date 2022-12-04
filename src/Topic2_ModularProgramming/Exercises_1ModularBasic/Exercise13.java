package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/*
Completeu la classe Forecast.java per a que retorni la temperatura, humitat, pressió, vent (velocitat i direcció) o estat general del temps de la ciutat que se li passi per paràmetre al executar el programa. La informació que desitgem recuperar també es passarà per paràmetre (fixeu vosaltres la sintaxi concreta).

Recordeu que els paràmetres que es passen al executar un programa es poden recuperar en en vector d'arguments String[] args del main.

Aquí teniu més informació de la API REST que estem usant per a recuperar la informació del temps: http://openweathermap.org/api

La informació l'heu d'extreure de la cadena XML que retorna la API, usant els mètodes de la classe String (per exemple split()).
 */
public class Exercise13 {

    public static void main(String[] args) {
        String current = Topic2_ModularProgramming.Exercises_1ModularBasic.Exercise13.getHTML("https://api.openweathermap.org/data/2.5/weather?q=Barcelona&units=metric&mode=xml&appid=644da4f2a1231c6611d2e2d8abb1fc90");
        System.out.println(current);
    }

    /**
     * Rep una URL i retorna el resultat de cridar-la
     *
     * @param urlToRead URL
     * @return Retorn del servidor al cridar la URL
     */
    public static String getHTML(String urlToRead) {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }
}
