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

abstract class NewspaperDecorator implements Newspaper {
    private Newspaper newspaper;

    public NewspaperDecorator(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public void create() {
        newspaper.create();
    }
}