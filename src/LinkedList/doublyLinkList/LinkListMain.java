package LinkedList.doublyLinkList;

import java.util.Scanner;

public class LinkListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkListImplementation ll = new LinkListImplementation();


        ll.insert_node_at_the_end(1);
        ll.insert_node_at_the_end(2);
        ll.insert_node_at_the_end(3);
        ll.insert_node_at_the_end(4);
        ll.insert_node_at_the_end(5);
        ll.insert_node_at_the_end(6);
        ll.print_list();
        ll.delete_node_with_data(4);
        ll.delete_node_with_data(5);
        ll.print_list();
    }
}
