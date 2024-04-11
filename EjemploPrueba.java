import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EjemploPrueba {

    @Autowired
    private MiServicio miServicio;

    @Test
    public void testEjemplo() {
        // Lógica de prueba
        int resultado = miServicio.sumar(2, 3);

        // Verificación de resultado
        assertEquals(5, resultado);
    }
}
