public class Door{

String color;
String state;
String position;
boolean isOpen;

public void open() {
        if (!isOpen) 
		{
            System.out.println("Door is opening");
            isOpen = true;
        } else 
		{
            System.out.println("Door is already open");
        }
    }

    public void close() 
	{
        if (isOpen) {
            System.out.println("Door is closing");
            isOpen = false;
        } else 
		{
            System.out.println("Door is already closed");
        }
    }

    public String toString() {
        return "DoorColor: " + color + "Door State: " + (isOpen ? "open" : "closed");
    }
}




