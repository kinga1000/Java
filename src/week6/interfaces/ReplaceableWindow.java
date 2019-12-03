package week6.interfaces;

public interface ReplaceableWindow extends Windowed {
    void replaceWindow();

    @Override
    default void cleanWindow(){

    }
}
