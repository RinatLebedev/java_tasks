package Task6_1;

public class Main {
    public static void main(String[] args) {
        String s = "Привет";
        UndoableStringBuilder usb = new UndoableStringBuilder();
        usb.append(s);
        usb.append(", ");
        usb.append("друг");
        System.out.println(usb.toString());
        usb.undo();
        System.out.println(usb.toString());
        usb.undo();
        System.out.println(usb.toString());
    }
}
