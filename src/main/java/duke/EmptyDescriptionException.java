package duke;
public class EmptyDescriptionException extends Exception{
    public EmptyDescriptionException (String str) {
        super("☹ OOPS!!! The description cannot be empty.");
    }
}
