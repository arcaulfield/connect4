package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button reset;
    public Label box00;
    public Label box01;
    public Label box02;
    public Label box03;
    public Label box04;
    public Label box05;
    public Label box10;
    public Label box11;
    public Label box12;
    public Label box13;
    public Label box14;
    public Label box15;
    public Label box20;
    public Label box21;
    public Label box22;
    public Label box23;
    public Label box24;
    public Label box25;
    public Label box30;
    public Label box31;
    public Label box32;
    public Label box33;
    public Label box34;
    public Label box35;
    public Label box40;
    public Label box41;
    public Label box42;
    public Label box43;
    public Label box44;
    public Label box45;
    public Label box50;
    public Label box51;
    public Label box52;
    public Label box53;
    public Label box54;
    public Label box55;
    public Label message;
    public char playerTurn = 'x';

    public Label[][] grid = null;
    public int tracker0 = 5;
    public int tracker1 = 5;
    public int tracker2 = 5;
    public int tracker3 = 5;
    public int tracker4 = 5;
    public int tracker5 = 5;

    public void initGrid() {
        grid = new Label[6][6];
        grid[0][0] = box00;
        grid[0][1] = box01;
        grid[0][2] = box02;
        grid[0][3] = box03;
        grid[0][4] = box04;
        grid[0][5] = box05;
        grid[1][0] = box10;
        grid[1][1] = box11;
        grid[1][2] = box12;
        grid[1][3] = box13;
        grid[1][4] = box14;
        grid[1][5] = box15;
        grid[2][0] = box20;
        grid[2][1] = box21;
        grid[2][2] = box22;
        grid[2][3] = box23;
        grid[2][4] = box24;
        grid[2][5] = box25;
        grid[3][0] = box30;
        grid[3][1] = box31;
        grid[3][2] = box32;
        grid[3][3] = box33;
        grid[3][4] = box34;
        grid[3][5] = box35;
        grid[4][0] = box40;
        grid[4][1] = box41;
        grid[4][2] = box42;
        grid[4][3] = box43;
        grid[4][4] = box44;
        grid[4][5] = box45;
        grid[5][0] = box50;
        grid[5][1] = box51;
        grid[5][2] = box52;
        grid[5][3] = box53;
        grid[5][4] = box54;
        grid[5][5] = box55;

        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 6; j++){
                grid[i][j].setText(" ");
            }
        }


    }

    private void togglePlayer() {
        playerTurn = (playerTurn == 'x') ? 'o' : 'x';
    }



    private char checkWinner(){

//        //check vertcal win
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j].getText().charAt(0) != ' ' && grid[i][j].getText().equals(grid[i][j+1].getText()) && grid[i][j].getText().equals(grid[i][j+2].getText()) && grid[i][j].getText().equals(grid[i][j+3].getText())){

                    return grid[i][j].getText().charAt(0);
                }
            }
        }

        for(int j = 0; j < 6; j++){
            for(int i = 0; i < 3; i++){
                if(grid[i][j].getText().charAt(0) != ' ' && grid[i][j].getText().equals(grid[i+1][j].getText()) && grid[i][j].getText().equals(grid[i+2][j].getText()) && grid[i][j].getText().equals(grid[i+3][j].getText())){

                    return grid[i][j].getText().charAt(0);
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j].getText().charAt(0) != ' ' && grid[i][j].getText().equals(grid[i+1][j+1].getText()) && grid[i][j].getText().equals(grid[i+2][j+2].getText()) && grid[i][j].getText().equals(grid[i+3][j+3].getText())){
                    return grid[i][j].getText().charAt(0);
                }
            }
        }

        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j].getText().charAt(0) != ' ' && grid[i][j].getText().equals(grid[i-1][j+1].getText()) && grid[i][j].getText().equals(grid[i-2][j+2].getText()) && grid[i][j].getText().equals(grid[i-3][j+3].getText())){

                    return grid[i][j].getText().charAt(0);
                }
            }
        }

        return ' ';

    }


    private void move(Button target) {
        if (target.equals(button0)) {
            grid[0][tracker0].setText("" + playerTurn);
            if(tracker0 == 0){
                button0.setDisable(true);
            }else{
                tracker0--;
            }


        } else if (target.equals(button1)) {
            grid[1][tracker1].setText("" + playerTurn);
            if(tracker1 == 0){
                button1.setDisable(true);
            }else{
                tracker1--;
            }

        } else if (target.equals(button2)) {
            grid[2][tracker2].setText("" + playerTurn);
            if(tracker2 == 0){
                button2.setDisable(true);
            }else{
                tracker2--;
            }

        } else if (target.equals(button3)) {
            grid[3][tracker3].setText("" + playerTurn);
            if(tracker3 == 0){
                button3.setDisable(true);
            }else{
                tracker3--;
            }

        } else if (target.equals(button4)) {
            grid[4][tracker4].setText("" + playerTurn);
            if(tracker4 == 0){
                button4.setDisable(true);
            }else{
                tracker4--;
            }

        } else if (target.equals(button5)) {
            grid[5][tracker5].setText("" + playerTurn);
            if(tracker5 == 0){
                button5.setDisable(true);
            }else{
                tracker5--;
            }

        } else if (target.equals(reset)){

        }


    }


    public void playMove(ActionEvent e) {
        if (grid == null) {
            initGrid();
        }
        Button targetButton = (Button) e.getTarget();
        move(targetButton);
        togglePlayer();
        message.setText("It is " + playerTurn +"'s turn.");

        char winner = checkWinner();
        if(winner == ' '){
            return;
        }
        else{
            message.setText("Player " + winner + " won!");
            button0.setDisable(true);
            button1.setDisable(true);
            button2.setDisable(true);
            button3.setDisable(true);
            button4.setDisable(true);
            button5.setDisable(true);
        }


    }
    public void reset(ActionEvent e){
        tracker0 = 5;
        tracker1 = 5;
        tracker2 = 5;
        tracker3 = 5;
        tracker4 = 5;
        tracker5 = 5;
        button0.setDisable(false);
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);

        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 6; j++){
                grid[i][j].setText(" ");
            }
        }



        //decide who plays first next
        int rand = (((int) (Math.random() * 10)) % 2) + 1;

        for (int i = 0; i < rand; i++) {
            togglePlayer();
        }

        message.setText("It is " + playerTurn +"'s turn.");

    }

}
