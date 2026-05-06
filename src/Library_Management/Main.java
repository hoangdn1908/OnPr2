package Library_Management;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // --- 1. Tạo dữ liệu ---
        Book b1 = new Book("B001", "Clean Code", "Robert C. Martin", "978-0132350884");
        Book b2 = new Book("B002", "Effective Java", "Joshua Bloch", "978-0134685991");
        Book b3 = new Book("B003", "Design Patterns", "Gang of Four", "978-0201633610");
        Magazine m1 = new Magazine("M001", "National Geographic", 245, "March 2024");
        Magazine m2 = new Magazine("M002", "Science Today", 89, "April 2024");

        // --- 2. LibraryManager (Generic) ---
        LibraryManager<LibraryItem<?>> manager = new LibraryManager<>();
        manager.addItem(b1);
        manager.addItem(b2);
        manager.addItem(b3);
        manager.addItem(m1);
        manager.addItem(m2);

        System.out.println();
        manager.printAllItems(); // Polymorphism: getInfo() đa hình

        // --- 3. Tìm kiếm ---
        System.out.println();
        LibraryItem<?> found = manager.findById("B002");
        System.out.println("Found by ID: " + (found != null ? found.getInfo() : "Not found"));

        // --- 4. Member mượn sách ---
        System.out.println();
        Member alice = new Member("M001", "Alice");
        Member bob   = new Member("M002", "Bob");

        try {
            alice.borrowItem(b1);
            alice.borrowItem(m1);
            alice.borrowItem(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 5. Test ItemAlreadyBorrowedException ---
        System.out.println();
        System.out.println("--- Test: borrow same item twice ---");
        try {
            bob.borrowItem(b1); // Alice đã mượn rồi
        } catch (ItemAlreadyBorrow e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 6. Test MemberBorrowLimitExceededException ---
        System.out.println();
        System.out.println("--- Test: exceed borrow limit ---");
        try {
            alice.borrowItem(b3); // Alice đã có 3 cuốn -> vượt giới hạn
        } catch (MemberBorrowLimitExceededException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 7. Test ItemNotAvailableException ---
        System.out.println();
        System.out.println("--- Test: borrow unavailable item ---");
        try {
            bob.borrowItem(b1); // b1 đang được Alice mượn
        } catch (ItemNotAvailable e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 8. Trả sách và mượn lại ---
        System.out.println();
        System.out.println("--- Alice returns b1, Bob borrows b1 ---");
        alice.returnItem(b1);
        try {
            bob.borrowItem(b1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- 9. In danh sách đang mượn ---
        System.out.println();
        alice.printBorrowedItems();
        bob.printBorrowedItems();

        // --- 10. Polymorphism: List hỗn hợp ---
        System.out.println();
        System.out.println("--- Polymorphism demo: mixed list ---");
        List<LibraryItem<?>> mixedList = new ArrayList<>();
        mixedList.add(new Book("B099", "Java Concurrency", "Brian Goetz", "978-0321349606"));
        mixedList.add(new Magazine("M099", "Tech Weekly", 12, "May 2024"));
        for (LibraryItem<?> item : mixedList) {
            System.out.println(item.getInfo()); // đa hình
        }
    }
}
