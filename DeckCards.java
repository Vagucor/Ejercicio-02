package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

    public static void main(String[] args) {

        // Definición de los palos y valores posibles para las cartas
        String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Creación de un ArrayList para almacenar la baraja de cartas
        ArrayList<Card> deck = new ArrayList<Card>();

        // Bucle doble para generar todas las combinaciones de palos y valores
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                // Creación de una nueva carta con el palo y valor actuales
                Card card = new Card(suits[i], values[j]);
                // Añadir la carta creada a la baraja
                deck.add(card);
            }
        }

        // Bucle para mezclar la baraja de cartas
        for (int i = 0; i < deck.size(); i++) {
            // Generar un índice aleatorio
            int j = (int) Math.floor(Math.random() * i);
            // Intercambiar la carta en la posición i con la carta en la posición j
            Card tmp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, tmp);
        }

        // Bucle para imprimir las primeras 5 cartas de la baraja
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

}
