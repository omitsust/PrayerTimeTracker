/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pr;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MyGeo {
    public static void main(String ar[]) throws Exception 
    {
        System.out.println(new MyGeo().getAddress("13.031067,80.239656"));
    }
    public String getAddress(String latlong)
    {
        String address = null;
        String gURL = "http://maps.google.com/maps/api/geocode/xml?latlng=" + latlong + "&sensor=true"; 
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            Document dom = db.parse(gURL);
            Element docEl = dom.getDocumentElement();
            NodeList nl = docEl.getElementsByTagName("result");
            if (nl != null && nl.getLength() > 0)
            {
                address=((Element)nl.item(0)).getElementsByTagName("formatted_address").item(0).getTextContent();
                for(int i=0;i<nl.getLength();i++)
                {
                    String temp=((Element)nl.item(i)).getElementsByTagName("formatted_address").item(0).getTextContent();
                }
            }
        } catch (Exception ex) {
            address = "Err";
        }
        return address;
    }
    public String getAddress(String lat, String lon) 
    {
        return getAddress(lat+ "," + lon);
    }
    public String getAddress(double lat, double lon) 
    {
        return getAddress("" + lat, "" + lon);
    }
}