/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogit;

public class DocumentFacade implements Document {
    private CarSection carSection;
    private AirplaneSection airplaneSection;
    private ShipSection shipSection;
    
    public DocumentFacade() {
        this.carSection = new CarSectionImpl();
        this.airplaneSection = new AirplaneSectionImpl();
        this.shipSection = new ShipSectionImpl();
    }
    
    public String createDocument() {
        String html = "<html><head><title>Document</title></head><body>";
        html += carSection.create();
        html += airplaneSection.create();
        html += shipSection.create();
        html += "</body></html>";
        return html;
    }
}