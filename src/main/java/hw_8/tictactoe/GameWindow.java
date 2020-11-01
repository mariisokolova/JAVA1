package hw_8.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_WIDTH  = 507;
    private static final int WIN_POS_X  = 400;
    private static final int WIN_POS_Y  = 200;

    private final StartNewGameWindow startNewGameWindow;
    private final Map field = new Map(this);

    public GameWindow(){
        setBounds(WIN_POS_X,WIN_POS_Y,WIN_WIDTH,WIN_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);

        startNewGameWindow = new StartNewGameWindow(this);
        add(field,BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1,2));
        JButton btnNewGame = new JButton("Start game");
        bottomPanel.add(btnNewGame);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });

        JButton btnExit = new JButton("Exit");
        bottomPanel.add(btnExit);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength){
        field.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}