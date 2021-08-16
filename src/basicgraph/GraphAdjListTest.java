package basicgraph;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class GraphAdjListTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetDistance2() {
        Graph subject = new GraphAdjList();
        for (int i = 0; i < 6; i++) {
            subject.addVertex();
        }
        subject.addEdge(0, 1);
        subject.addEdge(0, 3);
        subject.addEdge(1, 4);
        subject.addEdge(1, 3);
        subject.addEdge(2, 1);
        subject.addEdge(2, 4);
        subject.addEdge(2, 5);
        subject.addEdge(3, 1);
        subject.addEdge(3, 4);
        subject.addEdge(4, 3);
        subject.addEdge(5, 5);

        List<Integer> actual = subject.getDistance2(1);
        System.out.println("actual: " + actual.toString());
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3,4));
        System.out.println("expected: " + expected.toString());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    public void testGetDistance2WithSelfLoop() {
        Graph subject = new GraphAdjList();
        for (int i = 0; i < 6; i++) {
            subject.addVertex();
        }
        subject.addEdge(0, 1);
        subject.addEdge(0, 3);
        subject.addEdge(1, 4);
        subject.addEdge(1, 3);
        subject.addEdge(2, 1);
        subject.addEdge(2, 4);
        subject.addEdge(2, 5);
        subject.addEdge(3, 1);
        subject.addEdge(3, 4);
        subject.addEdge(4, 3);
        subject.addEdge(5, 5);

        List<Integer> actual = subject.getDistance2(5);
        List<Integer> expected = new ArrayList<>(List.of(5));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    public void testGetDistance2WithNoSecondNeighbors() {
        Graph subject = new GraphAdjList();
        for (int i = 0; i < 6; i++) {
            subject.addVertex();
        }
        subject.addEdge(0, 1);
        subject.addEdge(0, 3);
        subject.addEdge(1, 4);
        subject.addEdge(1, 3);
        subject.addEdge(2, 1);
        subject.addEdge(2, 4);
        subject.addEdge(2, 5);
        subject.addEdge(4, 3);
        subject.addEdge(5, 5);

        List<Integer> actual = subject.getDistance2(4);
        System.out.println("actual: " + actual.toString());
        List<Integer> expected = new ArrayList<>(List.of());
        System.out.println("expected: " + expected.toString());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    public void testGetDistance2WithOneVertex() {
        Graph subject = new GraphAdjList();
        subject.addVertex();
        List<Integer> actual = subject.getDistance2(0);
        List<Integer> expected = new ArrayList<>(List.of());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}