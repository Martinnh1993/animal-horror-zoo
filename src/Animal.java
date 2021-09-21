public class Animal {
    //declaring the variables I need
    private int xCoordinate;
    private int yCoordinate;

    //making a constructor
    public Animal(int xInitial, int yInitial) {
        this.xCoordinate = xInitial;
        this.yCoordinate = yInitial;
    }

    //making private setters for the x and y so i can only change the x and y coordinates via the move method
    private void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    private void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    //making getters for all the variables
    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    //making a move method for the rabbit and snake with if statement, so it can't move outside the perimeters of the board
    public void move(int xChange, int yChange) {
        //establishing the borders
        if ((xChange + this.xCoordinate) <= 10 && (xChange + xCoordinate) >= 1 && yChange + this.yCoordinate <= 10 && (yChange + yCoordinate) >= 1) {
            if (xChange <= 1 && xChange >= -1 && yChange <= 1 && yChange >= -1 && xChange != 0 || yChange != 0) {
                setXCoordinate(this.xCoordinate + xChange);
                setYCoordinate(this.yCoordinate + yChange);
            } else {
                System.out.println("invalid move");
            }
        } else {
            System.out.println("Invalid move");
        }
    }

    public void Speak(String Keyword) {

        if (Keyword.equalsIgnoreCase("RabbitPosition")) {
            System.out.println("I am the Rabbit, I am standing on " + this.getXCoordinate() + "," + this.getYCoordinate());
            }
            if (Keyword.equalsIgnoreCase("SnakePosition")) {
                System.out.println("I am the Snake, I am standing on " + this.getXCoordinate() + "," + this.getYCoordinate());
            }
            else if (Keyword.equalsIgnoreCase("RabbitPlease")) {
                System.out.println("Noooooo Please don't eat me!!");
            }
            else if (Keyword.equalsIgnoreCase("SnakeEat")) {
                System.out.println("Ahhhrrrr im eating you haha!");
            }

        }

}