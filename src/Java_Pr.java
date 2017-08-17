/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import org.jsoup.Jsoup;


public class Java_Pr {

    String Ajan_tm(String lati,String loni) throws IOException {
        //double lat=40.6700,lon=73.9400;
        //String line = "http://www.islamicfinder.org/prayer_service.php?&country=bangladesh&city=sylhet_district&state=86&zipcode=&latitude="+lati+"&longitude="+loni+"&timezone=6";
        String line ="http://www.islamicfinder.org/prayer_service.php?latitude="+lati+"&longitude="+loni+"&timezone=6&HanfiShafi=2&pmethod=3" ;

        org.jsoup.nodes.Document doc = Jsoup.connect(line).get();
        String text = doc.body().getElementsByClass("IslamicData").text();
        
        return text;
    }

}
