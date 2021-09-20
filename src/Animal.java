public class Animal {
        //declaring the variables I need
    private String animal;
    private int xCoordinate;
    private int yCoordinate;

        //making a constructor
    public Animal (String animal, int xInitial, int yInitial) {
        this.animal=animal;
        this.xCoordinate=xInitial;
        this.yCoordinate=yInitial;
    }
        //making private setters for the x and y so i can only change the x and y coordinates via the move method
    private void setxCoordinate(int xCoordinate) {this.xCoordinate = xCoordinate;}
    private void setyCoordinate(int yCoordinate) {this.yCoordinate = yCoordinate;}

        //making getters for all the variables
    public int getxCoordinate() {return xCoordinate;}
    public int getyCoordinate() {return yCoordinate;}
    public String getAnimal() {return animal;}

        //making a move method for the rabbit and snake with if statement, so it can't move outside the perimeters of the board
    public void move(int xChange, int yChange) {
            //establishing the borders
        if ((xChange+this.xCoordinate)<=10 && (xChange+xCoordinate)>=1 && yChange+this.yCoordinate<=10 && (yChange+yCoordinate)>=1){
            if (xChange<=1 && xChange>=-1 && yChange<=1 && yChange>=-1) {
            setxCoordinate(this.xCoordinate + xChange);
            setyCoordinate(this.yCoordinate + yChange);
            }
            else {
                System.out.println("invalid move");
            }
        }
        else {
            System.out.println("Invalid move");
        }
    }

    public void Speak(String Keyword) {
        if(Keyword.equalsIgnoreCase("initial")) {
            System.out.println("I am the " + this.getAnimal() + " my initial position is: " + this.getxCoordinate() + "," + this.getyCoordinate());
        }
        else if(Keyword.equalsIgnoreCase("position")) {
        System.out.println("I am the " + this.getAnimal() + ", I am standing on " + this.getxCoordinate() + "," + this.getyCoordinate());
        }
        else if(Keyword.equalsIgnoreCase("please")) {
            System.out.println("Noooooo Please don't eat me!!");
        }
        else if (Keyword.equalsIgnoreCase("eat")) {
            System.out.println("Ahhhrrrr im eating you haha!");
        }

    }

}