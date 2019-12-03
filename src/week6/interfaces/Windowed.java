package week6.interfaces;

public interface Windowed {
    void openWindow();
    void closeWindow();
    default void cleanWindow(){
        System.out.println("Window has been cleaned up");
    }
    static void printInterfaceName(){
        System.out.println("Windowed interface");
    }

    private int answerToALlQuestions(){
        return 42;
    }
}
