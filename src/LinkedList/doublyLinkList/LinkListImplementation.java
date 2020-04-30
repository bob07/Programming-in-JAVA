package LinkedList.doublyLinkList;


public class LinkListImplementation {
    Node head;
    Node tail;
    int list_size = 0;

    public Node create_node(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.Previous = null;
        return node;
    }

    public void insert_node_at_the_end(int data) {
        Node newNode = create_node(data);
        Node tempNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.Previous = tempNode;
        }
        list_size++;
        print_list();
    }


    public void insert_node_at_the_start(int data) {
        Node newNode = create_node(data);
        newNode.next = head;
        head.Previous = newNode;
        head = newNode;
        list_size++;
        print_list();
    }



    //delete if exist
    public void delete_node_with_data(int data) {
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.data == data) {
                tmp.Previous.next = tmp.next;
                tmp.next.Previous = tmp.Previous;
                list_size--;
                break;
            }
            tmp = tmp.next;
        }

    }

    public void print_list() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.printf("->" + tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println("->" + tempNode.data);
        System.out.println("list_size = " + list_size);
    }
}