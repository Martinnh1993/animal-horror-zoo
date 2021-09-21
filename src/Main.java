public class Main {
    public static void main(String[] args) {
            //initializing the snake and rabbit with start coordinates
        Animal rabbit = new Animal(1,1);
        Animal snake = new Animal(10, 10);

            //printing the initial position
        rabbit.Speak("RabbitPosition");
        snake.Speak("SnakePosition");

            //the state of the rabbit
        boolean alive=true;
        while (alive) {
                    //if the snake and rabbit within 1 square of each other, only the snake is going to move
            if (Math.abs(snake.getXCoordinate() - rabbit.getXCoordinate())==1 && Math.abs(snake.getYCoordinate() - rabbit.getYCoordinate())==1) {
                rabbit.Speak("RabbitPlease");
                snake.move(-1, -1);
                snake.Speak("SnakePosition");
                snake.Speak("SnakeEat");
                alive=false;
            }
            else {
                    //the snake and rabbit is moving and saying their positions
                rabbit.move(1, 0);
                rabbit.Speak("RabbitPosition");
                snake.move(0, -1);
                snake.Speak("SnakePosition");
            }
        }
    }
}