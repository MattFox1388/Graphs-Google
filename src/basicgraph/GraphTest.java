package basicgraph;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class GraphTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testDegreeSequence() {
        Graph subject = new GraphAdjList();
        for (int i = 0; i < 6; i++) {
            subject.addVertex();
        }
        subject.addEdge(0, 1);
        subject.addEdge(0, 3);
        subject.addEdge(1, 4);
        subject.addEdge(2, 4);
        subject.addEdge(2, 5);
        subject.addEdge(3, 1);
        subject.addEdge(4, 3);
        subject.addEdge(5, 5);

        List<Integer> res = subject.degreeSequence();
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,2,1,1,1,1));
        assertArrayEquals(expected.toArray(), res.toArray());
    }
}