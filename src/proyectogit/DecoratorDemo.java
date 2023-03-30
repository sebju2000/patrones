
package proyectogit;

    public class DecoratorDemo {
    public static void main(String[] args) {
        Document document = new DocumentFacade();
        System.out.println(document.createDocument());
    }
}

