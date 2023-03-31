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
class ShipsSection extends NewspaperDecorator {
    public ShipsSection(Newspaper newspaper) {
        super(newspaper);
    }

    @Override
    public void create() {
        super.create();
        try {
            FileWriter writer = new FileWriter("ships.html");
            writer.write("<h2>Ships Section</h2>\n");
            //writer.write("<button onclick=\"window.location.href='ships.html'\">Open Ships Section</button>\n");
            writer.write("<h2> ESTA ES LA SECCION DE SHIPS </h2>\n");
            writer.write("<button onclick=\"window.location.href='Newspaper.html'\">ATRAS</button>\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}