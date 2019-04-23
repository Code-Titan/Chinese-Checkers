import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayerClient implements Runnable {

    private static JFrame mainFrame;
    private static JPanel mainPanel;
    private static JButton joinGameButton, exitButton;

    public void run() {
        mainFrame = new JFrame();
        mainFrame.setSize(500, 300);

        mainPanel = new JPanel();
        mainPanel.setSize(500, 300);

        joinGameButton = new JButton("Join Game");
        exitButton = new JButton("Exit");

        mainPanel.add(joinGameButton);
        mainPanel.add(exitButton);

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
}
