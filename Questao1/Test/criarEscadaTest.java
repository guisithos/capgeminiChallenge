import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class criarEscadaTest {
    @Test
    void testeDegraus() {
        List<String> degrausEsperado = new ArrayList<>();
        degrausEsperado.add("      *");
        degrausEsperado.add("     **");
        degrausEsperado.add("    ***");
        degrausEsperado.add("   ****");
        degrausEsperado.add("  *****");
        degrausEsperado.add(" ******");

        List <String> degraus = new criarEscada(6);

        assertNotNull(degraus);
        assertEquals(3, degraus());


    }

}
