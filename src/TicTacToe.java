import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;


public class TicTacToe {
    int boardWidth = 600;
    int boardHeight = 650; // 50px for the text panel on top

    // panels for text
    JFrame frame = new JFrame("Tic-Tac-Toe"); // add title for window
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    // tictactoe window created with exit
    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.darkGray); // background color
        textLabel.setForeground(Color.pink); // foreground color
        textLabel.setFont(new Font("Georgia", Font.BOLD, 50)); // font and font size
        textLabel.setHorizontalAlignment(JLabel.CENTER); // set to center
        textLabel.setText("Tic-Tac-Toe");
        textLabel.setOpaque(true);
        
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH); // move words up to make room for the board

        boardPanel.setLayout(new GridLayout(3, 3));
        boardPanel.setBackground(Color.darkGray);
        frame.add(boardPanel);
    }

}
