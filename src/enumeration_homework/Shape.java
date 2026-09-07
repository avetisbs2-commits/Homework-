package enumeration_homework;

public enum Shape implements Drawable {
    CIRCLE, SQUARE, TRIANGLE;

    @Override
    public void draw() {
        System.out.println("Drawing a " + name());
    }
}