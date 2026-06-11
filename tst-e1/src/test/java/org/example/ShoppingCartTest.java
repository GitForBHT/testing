package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Item;
import org.junit.jupiter.api.Test;

import main.java.org.example.ShoppingCart;


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

    
    
}
