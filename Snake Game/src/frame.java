import javax.swing.*;
public class frame extends JFrame{
    frame(){
        this.add(new panel()); // adding panel to frame
        this.setTitle("SnakeGame"); // naming frame window
        this.setResizable(false);  //to make window size uniform
        this.setVisible(true);
        this.pack();  // to be accessible for any system layout irrespective of default resolution
    }
}
