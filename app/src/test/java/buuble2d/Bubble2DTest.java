package buuble2d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bubble2DTest {
    
    @Test
    void testBubbleSort2DAscendente() {
        int[][] matriz = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] esperado = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Bubble2D.bubbleSort2D(matriz, true);
        
        assertArrayEquals(esperado, matriz);
    }
    
    @Test
    void testBubbleSort2DDescendente() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] esperado = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        Bubble2D.bubbleSort2D(matriz, false);
        
        assertArrayEquals(esperado, matriz);
    }
    
    @Test
    void testBubbleSort2DMatrizVacia() {
        int[][] matriz = new int[0][0];
        Bubble2D.bubbleSort2D(matriz, true);
        // Si no lanza excepción, el test pasa
    }
    
    @Test
    void testBubbleSort2DMatrizNula() {
        int[][] matriz = null;
        Bubble2D.bubbleSort2D(matriz, true);
        // Si no lanza excepción, el test pasa
    }
    
    @Test
    void testBubbleSort2DMatrizConDuplicados() {
        int[][] matriz = {
            {5, 2, 5},
            {2, 3, 1},
            {7, 5, 2}
        };
        
        int[][] esperado = {
            {1, 2, 2},
            {2, 3, 5},
            {5, 5, 7}
        };
        
        Bubble2D.bubbleSort2D(matriz, true);
        
        assertArrayEquals(esperado, matriz);
    }
}
