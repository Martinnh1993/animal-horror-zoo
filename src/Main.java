public class Main {
    public static void main(String[] args) {
        //initializing the snake and rabbit with start coordinates
        Animal rabbit = new Animal("Rabbit",1,1);
        Animal snake = new Animal("Snake",10, 10);

        //printing the initial position
        rabbit.Speak("initial");
        snake.Speak("initial");

        //the state of the rabbit
        boolean alive=true;
        while (alive) {
            //if the snake and rabbit within 1 square of each other, only the snake is going to move
            if (Math.abs(snake.getXCoordinate() - rabbit.getXCoordinate())==1 && Math.abs(snake.getYCoordinate() - rabbit.getYCoordinate())==1) {
                rabbit.Speak("please");
                snake.move(-1, -1);
                snake.Speak("position");
                snake.Speak("eat");
                alive=false;
            }
            else {
                //the snake and rabbit is moving and saying their positions
                rabbit.move(1, 0);
                rabbit.Speak("position");
                snake.move(0, -1);
                snake.Speak("position");
            }
        }
    }
}