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
    
}
