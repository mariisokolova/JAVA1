package hw_8.tictactoe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartNewGameWindow extends JFrame {
    private static final int WIN_HEIGHT = 450;
    private static final int WIN_WIDTH  = 400;
    private static final int WIN_POS_X  = 455;
    private static final int WIN_POS_Y  = 250;
    private static final int MIN_FIELD_SIZE  = 3;
    private static final int MAX_FIELD_SIZE  = 10;
    private static final int MIN_WIN_LENGTH = 3;

    private final JRadioButton jrbHumVsAi;

    private final JSlider slFieldSize;
    private final JSlider slWinLength;

    private final GameWindow gameWindow;

    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WIN_POS_X,WIN_POS_Y,WIN_WIDTH,WIN_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);
        setLayout(new GridLayout(8,1));


        add(new JLabel("Game mode:"));
        jrbHumVsAi = new JRadioButton("Human VS AI",true);
        JRadioButton jrbHumVsHum = new JRadioButton("Human vs human (not active)");
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsHum);
        add(jrbHumVsAi);
        add(jrbHumVsHum);


        add(new JLabel("Map size:"));
        slFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        add(slFieldSize);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintLabels(true);
        slFieldSize.setPaintTicks(true);

        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int fieldSize = slFieldSize.getValue();
                slWinLength.setMaximum(fieldSize);
            }
        });

        add(new JLabel("Win length:"));
        slWinLength = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_WIN_LENGTH);
        add(slWinLength);
        slWinLength.setMajorTickSpacing(1);
        slWinLength.setPaintLabels(true);
        slWinLength.setPaintTicks(true);


        JButton btnStartGame = new JButton("Start new game");
        add(btnStartGame);
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StartNewGameWindow.this.btnStartGameClick();
            }
        });

        setVisible(false);
    }

    private void btnStartGameClick(){
        setVisible(false);
        int gameMode;
        if(jrbHumVsAi.isSelected()){
            gameMode = Map.MODE_H_V_A;
        } else {
            gameMode = Map.MODE_H_V_H;
        }
        int fieldSize = slFieldSize.getValue();
        int winLength = slWinLength.getValue();

        Logic.SIZE = fieldSize;
        Logic.DOTS_TO_WIN = winLength;
        Logic.initMap();
        Logic.gameFinished = false;

        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

    }
}