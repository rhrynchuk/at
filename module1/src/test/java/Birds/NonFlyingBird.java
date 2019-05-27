package Birds;

public abstract class NonFlyingBird extends Bird {

    @Override
    public String toString() {
        return getClass().getName();
    }
}
