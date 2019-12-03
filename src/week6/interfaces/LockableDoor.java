package week6.interfaces;

public class LockableDoor extends Door implements Lockable {
    private boolean locked;

    public LockableDoor(String colour, String material, Size size, boolean opened) {
        super(colour, material, size, opened);
    }

    @Override
    public void lock() {
        locked=true;
        System.out.println("Door has been locked");
    }

    @Override
    public void unlock() {
        locked=false;
        System.out.println("Door has been closed");

    }
}

