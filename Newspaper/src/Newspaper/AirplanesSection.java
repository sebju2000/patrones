/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newspaper;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ANDRES REALP
 */
class AirplanesSection extends NewspaperDecorator {
    public AirplanesSection(Newspaper newspaper) {
        super(newspaper);
    }

    @Override
    public void create() {
        super.create();
        try {
            FileWriter writer = new FileWriter("airplanes.html");
            writer.write("<h2>Airplanes Section</h2>\n");
           // writer.write("<button onclick=\"window.location.href='airplanes.html'\">Open Airplanes Section</button>\n");
            writer.write("<h2>ESTA ES LA SECCION DE AVIONES</h2>\n");
            writer.write("<button onclick=\"window.location.href='Newspaper.html'\">ATRAS</button>\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




