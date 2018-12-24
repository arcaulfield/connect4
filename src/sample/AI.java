package sample;
import javafx.scene.control.Label;

public class AI {
    public Label[][] grid;
    public int[] tracker;


    public AI(Label[][] grid, int[] tracker){
        this.grid = grid;
        this.tracker = tracker;
    }

    public int AICanWin(){
        //check vertcal possible win
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j].getText().charAt(0) == ' ' && grid[i][j+1].getText().charAt(0) == 'o' && grid[i][j+2].getText().charAt(0) == 'o' && grid[i][j+3].getText().charAt(0) == 'o'){

                    return i;
                }
            }
        }

        //horizontal wins
        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(grid[i+1][j].getText().charAt(0) == 'o' && grid[i+2][j].getText().charAt(0) == 'o' && grid[i+3][j].getText().charAt(0) == 'o'){

                return i;
            }
        }
        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(grid[i-1][j].getText().charAt(0) == 'o' && grid[i+1][j].getText().charAt(0) == 'o' && grid[i+2][j].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(grid[i-2][j].getText().charAt(0) == 'o' && grid[i-1][j].getText().charAt(0) == 'o' && grid[i+1][j].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(grid[i-3][j].getText().charAt(0) == 'o' && grid[i-2][j].getText().charAt(0) == 'o' && grid[i-1][j].getText().charAt(0) == 'o'){

                return i;
            }
        }

        //check for diagonal wins
        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(j<3 && grid[i+1][j+1].getText().charAt(0) == 'o' && grid[i+2][j+2].getText().charAt(0) == 'o' && grid[i+3][j+3].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(j<4 && j > 0 && grid[i-1][j-1].getText().charAt(0) == 'o' && grid[i+1][j+1].getText().charAt(0) == 'o' && grid[i+2][j+2].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(j<5  && j > 1 && grid[i-2][j-2].getText().charAt(0) == 'o' && grid[i-1][j-1].getText().charAt(0) == 'o' && grid[i+1][j+1].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(j > 2 && grid[i-1][j-1].getText().charAt(0) == 'o' && grid[i-2][j-2].getText().charAt(0) == 'o' && grid[i-3][j-3].getText().charAt(0) == 'o'){

                return i;
            }
        }


        //check for diagonal wins
        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(j<3 && grid[i-1][j+1].getText().charAt(0) == 'o' && grid[i-2][j+2].getText().charAt(0) == 'o' && grid[i-3][j+3].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(j<4 && j > 0 && grid[i+1][j-1].getText().charAt(0) == 'o' && grid[i-1][j+1].getText().charAt(0) == 'o' && grid[i-2][j+2].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(j<5  && j > 1 && grid[i+2][j-2].getText().charAt(0) == 'o' && grid[i+1][j-1].getText().charAt(0) == 'o' && grid[i-1][j+1].getText().charAt(0) == 'o'){

                return i;
            }
        }

        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(j > 2 && grid[i+1][j-1].getText().charAt(0) == 'o' && grid[i+2][j-2].getText().charAt(0) == 'o' && grid[i+3][j-3].getText().charAt(0) == 'o'){

                return i;
            }
        }


        return -1;
    }


    public int playerCanWin(){
        //check vertcal possible win
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                if(grid[i][j].getText().charAt(0) == ' ' && grid[i][j+1].getText().charAt(0) == 'x' && grid[i][j+2].getText().charAt(0) == 'x' && grid[i][j+3].getText().charAt(0) == 'x'){

                    return i;
                }
            }
        }

        //horizontal wins
        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(grid[i+1][j].getText().charAt(0) == 'x' && grid[i+2][j].getText().charAt(0) == 'x' && grid[i+3][j].getText().charAt(0) == 'x'){

                return i;
            }
        }
        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(grid[i-1][j].getText().charAt(0) == 'x' && grid[i+1][j].getText().charAt(0) == 'x' && grid[i+2][j].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(grid[i-2][j].getText().charAt(0) == 'x' && grid[i-1][j].getText().charAt(0) == 'x' && grid[i+1][j].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(grid[i-3][j].getText().charAt(0) == 'x' && grid[i-2][j].getText().charAt(0) == 'x' && grid[i-1][j].getText().charAt(0) == 'x'){

                return i;
            }
        }

        //check for diagonal wins
        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(j<3 && grid[i+1][j+1].getText().charAt(0) == 'x' && grid[i+2][j+2].getText().charAt(0) == 'x' && grid[i+3][j+3].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(j<4 && j > 0 && grid[i-1][j-1].getText().charAt(0) == 'x' && grid[i+1][j+1].getText().charAt(0) == 'x' && grid[i+2][j+2].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(j<5  && j > 1 && grid[i-2][j-2].getText().charAt(0) == 'x' && grid[i-1][j-1].getText().charAt(0) == 'x' && grid[i+1][j+1].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(j > 2 && grid[i-1][j-1].getText().charAt(0) == 'x' && grid[i-2][j-2].getText().charAt(0) == 'x' && grid[i-3][j-3].getText().charAt(0) == 'x'){

                return i;
            }
        }


        //check for diagonal wins
        for(int i = 3; i < 6; i++){
            int j = tracker[i];
            if(j<3 && grid[i-1][j+1].getText().charAt(0) == 'x' && grid[i-2][j+2].getText().charAt(0) == 'x' && grid[i-3][j+3].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 2; i < 5; i++){
            int j = tracker[i];
            if(j<4 && j > 0 && grid[i+1][j-1].getText().charAt(0) == 'x' && grid[i-1][j+1].getText().charAt(0) == 'x' && grid[i-2][j+2].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 1; i < 4; i++){
            int j = tracker[i];
            if(j<5  && j > 1 && grid[i+2][j-2].getText().charAt(0) == 'x' && grid[i+1][j-1].getText().charAt(0) == 'x' && grid[i-1][j+1].getText().charAt(0) == 'x'){

                return i;
            }
        }

        for(int i = 0; i < 3; i++){
            int j = tracker[i];
            if(j > 2 && grid[i+1][j-1].getText().charAt(0) == 'x' && grid[i+2][j-2].getText().charAt(0) == 'x' && grid[i+3][j-3].getText().charAt(0) == 'x'){

                return i;
            }
        }


        return -1;
    }


    public int determineMove(){

        int AICanWin = AICanWin();

        int playerCanWin = playerCanWin();

        if(AICanWin != -1){
            return AICanWin;
        } else if (playerCanWin != -1){
            return playerCanWin;
        } else {
            return (((int) (Math.random() * 60)) % 6);
        }


    }

}


