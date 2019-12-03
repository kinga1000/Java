package week6.interfaces;

public class Door {
    private String colour;
    private String material;
    private Size size;
    private boolean opened;

    private static int numberofCreatedDoors=0;

    public Door(String colour, String material, Size size, boolean opened) {
        this.colour = colour;
        this.material = material;
        this.size = size;
        this.opened = opened;

    }




    public void open (){
        opened=true;
        System.out.println("Door has been opened");
    }
    public void close(){
        opened=false;
        System.out.println("Door has been closed");
    }

    public boolean isOpened(){
        return opened;
    }
}
