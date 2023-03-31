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
class SimpleNewspaper implements Newspaper {
    private String name;

    public SimpleNewspaper(String name) {
        this.name = name;
    }

    @Override
    public void create() {
        try {
            FileWriter writer = new FileWriter(name + ".html");
            writer.write("<html>\n<head>\n<title>" + name + "</title>\n</head>\n<body>\n");
            writer.write("<h1>" + name + "</h1>\n");
            writer.write("<button onclick=\"window.location.href='ships.html'\">Open Ships Section</button>\n");
            writer.write("<button onclick=\"window.location.href='cars.html'\">Open Cars Section</button>\n");
            writer.write("<button onclick=\"window.location.href='airplanes.html'\">Open Airplanes Section</button>\n");
            writer.write("</body>\n</html>");
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}