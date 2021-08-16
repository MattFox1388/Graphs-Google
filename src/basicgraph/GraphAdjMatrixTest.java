package basicgraph;

import junit.framework.TestCase;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class GraphAdjMatrixTest extends TestCase {

    public void testGetDistance2() {
        Graph subject = new GraphAdjMatrix();
        subject.addVertex();
        subject.addVertex();
        subject.addVertex();
        subject.addEdge(0,1);
        subject.addEdge(0,2);
        subject.addEdge(1,2);
        subject.addEdge(2,1);
        final List<Integer> distance2 = subject.getDistance2(0);
        System.out.println("2 hoppers: " + distance2.toString());
        assertArrayEquals(List.of(1,2).toArray(), distance2.toArray());
    }
}