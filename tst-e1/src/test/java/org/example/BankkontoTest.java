package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BankkontoTest {
    

    @Test
    void testErfolgreichesAbheben() {
        // Arrange (Vorbereitung)
        Bankkonto konto = new Bankkonto(100.0);

        // Act (Ausführung)
        konto.abheben(40.0);

        // Assert (Überprüfung)
        // Erwartet werden 60.0. Das letzte Argument (0.001) ist die erlaubte Ungenauigkeit bei Kommazahlen.
        assertEquals(60.0, konto.getKontostand(), 0.001); 
    }

    @Test
    void testAbhebenOhneGuthaben_WirftException() {
        // Arrange
        Bankkonto konto = new Bankkonto(50.0);

        // Act & Assert
        // Wir prüfen, ob eine IllegalArgumentException geworfen wird, wenn wir 100 abheben wollen.
        Exception fehler = assertThrows(IllegalArgumentException.class, () -> {
            konto.abheben(100.0); 
        });

        // Optional: Du kannst sogar prüfen, ob die Fehlermeldung exakt stimmt
        assertEquals("Nicht genügend Guthaben.", fehler.getMessage());
    }

     @Test
    void testAbheben_ExakterBetragLeertKonto() {
        // Arrange
        Bankkonto konto = new Bankkonto(50.0);
        
        
        konto.abheben(50.0);
        
        // Assert
        assertEquals(0.0, konto.getKontostand(), 0.001);
    }
    
}
