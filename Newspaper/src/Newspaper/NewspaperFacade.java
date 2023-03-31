/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newspaper;

/**
 *
 * @author ANDRES REALP
 */
class NewspaperFacade {
    private Newspaper newspaper;

    public NewspaperFacade() {
        newspaper = new SimpleNewspaper("Newspaper");
        newspaper = new CarsSection(newspaper);
        newspaper = new AirplanesSection(newspaper);
        newspaper = new ShipsSection(newspaper);
    }

    public void createNewspaper() {
        newspaper.create();
    }
}