import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JFrame {

    private static final int ROWS = 8;
    private static final int COLS = 8;
    private static final int TILE_SIZE = 80; // size of each square

    public ChessBoard() {
        setTitle("Chess Board");
        setSize(COLS * TILE_SIZE, ROWS * TILE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(ROWS, COLS));

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                JPanel tile = new JPanel();
                if ((row + col) % 2 == 0) {
                    tile.setBackground(Color.WHITE);
                } else {
                    tile.setBackground(Color.BLACK);
                }
                boardPanel.add(tile);
            }
        }

        add(boardPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new ChessBoard());
    }
}
