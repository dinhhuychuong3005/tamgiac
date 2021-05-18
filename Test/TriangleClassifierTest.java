import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifierTest() {
        int a = 2;
        int b = 2;
        int c = 8;
        String mongmuon = "không phải tam giác";
        String result = TriangleClassifier.TriangleClassifierTest(2,2,8);
        assertEquals(mongmuon,result);
    }
}