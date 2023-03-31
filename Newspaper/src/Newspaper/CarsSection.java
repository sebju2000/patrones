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
class CarsSection extends NewspaperDecorator {
    public CarsSection(Newspaper newspaper) {
        super(newspaper);
    }

    @Override
    public void create() {
        super.create();
        try {
            FileWriter writer = new FileWriter("cars.html");
            writer.write("<h2>Cars Section</h2>\n");
            //writer.write("<button onclick=\"window.location.href='cars.html'\">Open Cars Section</button>\n");
            writer.write("<h2>ESTA ES LA SECCION DE CARROS</h2>\n");
            writer.write("<button onclick=\"window.location.href='Newspaper.html'\">ATRAS</button>\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



