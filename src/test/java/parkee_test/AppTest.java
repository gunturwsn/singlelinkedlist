package parkee_test; // kalau kamu pakai package ini

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
    private SingleLinkedList list;   
    private OperationLinkedList ops;

    @Before
    public void setUp() {
        list = new SingleLinkedList(); 
        // create LinkedList: 1 -> 2 -> 3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        list.head = node1;
        ops = new OperationLinkedList(list);
    }
    @Test
    public void testListInitializedCorrectly() {
        assertEquals(1, list.head.data);
        assertEquals(2, list.head.next.data);
        assertEquals(3, list.head.next.next.data);
    }

    // @Test
    // public void testDisplay(){
    //     ops.display();
    // }

    @Test
    public void testInsertAtEnd() {
        ops.insertAtEnd( 4);
        assertEquals(4, list.head.next.next.next.data);
        assertNotEquals("4", list.head.next.next.next.data);        
    }

    @Test
    public void testDeleteByValue(){
        ops.display();
        ops.deleteByValue(1);
        ops.display();
        assertNotEquals(1, list.head.next.data);
        assertEquals(2, list.head.data);
    }

    @Test
    public void testInsertAtBeginning() {
        ops.insertAtBeginning(0);
        assertEquals(1, list.head.next.data);
        assertNotEquals("1", list.head.next);
    }
}
