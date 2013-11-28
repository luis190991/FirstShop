
import org.junit.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createCustomersTest() {
        new Customer("Gustavo", "Ruiz", "Chimborazo", "Chihuahua", "Chihuahua", "31000", "123456789", "", "henry@correo.com", "12345678","").save();
        new Customer("Luis", "Ramirez", "Decima", "Delicias", "Chihuahua", "31000", "876543", "", "luis@correo.com", "12345678","").save();
        new Customer("Francisco", "Frances", "Tecnologico", "Chihuahua", "Chihuahua", "31000", "984574", "", "pancho@correo.com", "12345678","").save();
        new Customer("Samuel", "Herrera", "Martires Agraristas", "Chihuahua", "Chihuahua", "31000", "456456", "", "samuel@correo.com", "12345678","").save();
        new Customer("Juan", "Perez", "Una Calle", "Chihuahua", "Chihuahua", "31000", "123456789", "54f", "juan@correo.com", "12345678","").save();

    }

    @Test
    public void createItemsTest() {
        new Item("El verde reverdece", "Francoise Paton", 15000.00).save();
        new Item("Cuadro", "Henroise", 2000000.00).save();
        new Item("Estatua", "Panchito Paton", 100.00).save();
        new Item("La iliada", "Homero", 15000.00).save();
        new Item("La divina comedia", "Dante Alighieri", 15000.00).save();
        new Item("El enfermo imaginario", "Moliere", 23341.00).save();
        new Item("Historia de dos ciudades", "Charles Dickens", 2500.00).save();
        new Item("Fausto", "Goethe", 37000.00).save();
        new Item("Justine", "Marqués de Sade", 78000.00).save();
        new Item("Una temporada en el infierno", "Goethe", 175590.00).save();
        new Item("Les raboteurs", "Gustave Caillebotte", 35699.00).save();
        new Item("Verano", "Mary Cassatt", 243800.00).save();
        new Item("La casa del ahorcado en Auvers-sur-Oise", "Paul Cezanne", 123000.00).save();
        new Item("La Avenida bajo la lluvia", "Childe Hassam", 100000.00).save();

    }
    }
