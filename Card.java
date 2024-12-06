package ejercicio2;

public class Card {

    // Declaración de los atributos públicos suit y value
    public String suit;
    public String value;
    
    // Constructor de la clase Card que inicializa los atributos suit y value
    public Card (String suit, String value) {
        this.suit = suit;   // Asigna el valor del parámetro suit
        this.value = value; // Asigna el valor del parámetro value
    }
    
    // Método toString que devuelve una representación en cadena de la carta
    public String toString () {
        return (this.suit + "-" + this.value);
    }
}
