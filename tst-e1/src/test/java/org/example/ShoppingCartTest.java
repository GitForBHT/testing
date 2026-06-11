package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;






 class ShoppingCartTest {

    @Test
    void testEmptyCartHasZeroTotal() {
        // Arrange
        ShoppingCart cart = new ShoppingCart();

        // Act
        int total = cart.getTotal();

        // Assert
        assertEquals(0, total, "Ein leerer Warenkorb sollte 0 als Summe haben");
    }

    @Test
    void testAddItemIncreasesTotal() {
        // Arrange
        ShoppingCart cart = new ShoppingCart();
        Item cola = new Item(50);

        // Act
        cart.addItem(cola);
        int total = cart.getTotal();

        // Assert
        assertEquals(50, total, "Nach dem Hinzufügen eines Artikels mit Preis 50 sollte die Summe 50 sein");
    }

    @Test
    void testAddMultipleItemsSumsTotal() {
        // Arrange
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item(50)); // Cola für 50 Cent
        cart.addItem(new Item(30)); // Kong Strong für 30 Cent
        
        // Act
        int total = cart.getTotal();
        
        // Assert
        assertEquals(80, total, "Die Summe aus 50 und 30 Cent sollte 80 Cent sein");
    }

    @Test
    void testGetQuantityOfItem() {
        // Arrange
        ShoppingCart cart = new ShoppingCart();
        Item apple = new Item(50);
        Item banana = new Item(30);
        
        
        cart.addItem(apple);
        cart.addItem(apple);
        cart.addItem(banana);
        
        // Act
        int appleCount = cart.getQuantity(apple);
        
        // Assert
        assertEquals(2, appleCount, "Es sollten genau 2 Äpfel im Korb sein");
    }

    @Test
    void testRemoveItem() {
        // Arrange
        ShoppingCart cart = new ShoppingCart();
        Item apple = new Item(50);
        Item banana = new Item(30);
        
        cart.addItem(apple);
        cart.addItem(banana);
        
        // Act: Wir entfernen den Apfel wieder
        cart.removeItem(apple);
        
        // Assert: Jetzt darf nur noch die Banane berechnet werden
        assertEquals(30, cart.getTotal(), "Nach dem Entfernen des Apfels sollte die Summe 30 sein");
        assertEquals(0, cart.getQuantity(apple), "Die Anzahl der Äpfel sollte jetzt 0 sein");
    }   
}
