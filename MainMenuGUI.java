import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuGUI extends JFrame implements ActionListener {
    private JButton game1Button, game2Button, game3Button;

    public MainMenuGUI() {
        setTitle("Main Menu");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        game1Button = new JButton("Flappy Bird");
        game2Button = new JButton("Snake Game");
        game3Button = new JButton("Tic Tac Toe");

        panel.add(game1Button);
        panel.add(game2Button);
        panel.add(game3Button);

        add(panel);

        game1Button.addActionListener(this);
        game2Button.addActionListener(this);
        game3Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == game1Button) {
            // Call the code for Flappy Bird
            FlappyBird.main(new String[0]);
            System.out.println("Starting Flappy Bird...");
        } else if (e.getSource() == game2Button) {
            // Call the code for Snake Game
            try {
				SnakeGame.main(new String[0]);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            System.out.println("Starting Snake Game...");
        } else if (e.getSource() == game3Button) {
            // Call the code for Tic Tac Toe
            Tgame.main(new String[0]);
            System.out.println("Starting Tic Tac Toe...");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenuGUI mainMenu = new MainMenuGUI();
            mainMenu.setVisible(true);
        });
    }
}
