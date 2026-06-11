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

    
    
}
