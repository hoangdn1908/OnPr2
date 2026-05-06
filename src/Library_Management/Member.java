package Library_Management;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public static final int BORROW_LIMIT = 3;

    private String name;
    private String memberId;
    private List<LibraryItem<?>> borrowItems;

    public Member(String memberId, String name)
    {
        this.name = name;
        this.memberId = memberId;
        borrowItems = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<LibraryItem<?>> getBorrowItems() {
        return borrowItems;
    }

    public void borrowItem(LibraryItem<?> item)
    {
        if (borrowItems.contains(item))
        {
            throw new ItemAlreadyBorrow("Member: " + name + " already borrowed " + item.getTitle() + ".");
        }
        if (borrowItems.size() > BORROW_LIMIT)
        {
            throw new MemberBorrowLimitExceededException("Member " + name + "has reached  the limit: " + BORROW_LIMIT);
        }
        item.checkOut();
        borrowItems.add(item);
        System.out.println(name + " has borrowed " + item.getTitle());
    }

    public void returnItem(LibraryItem<?> item)
    {
        if(!borrowItems.contains(item))
        {
            System.out.println(name + " does not have " + item.getTitle());
        }
        else
        {
            borrowItems.remove(item);
            item.returnItem();
            System.out.println(name + " returned " + item.getTitle());
        }
    }

    public void printBorrowedItems() {
        System.out.println("=== " + name + "'s borrowed items ===");
        if (borrowItems.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (LibraryItem<?> item : borrowItems) {
                System.out.println("  - " + item.getInfo());
            }
        }
    }
}
