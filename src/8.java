import java.util.Random;

public class MathHomework {
  private Random random = new Random();

  public int getNextHomeworkProblem() {
    int problemType = random.nextInt(4); // 0: addition, 1: subtraction, 2: multiplication, 3: division
    int operand1 = random.nextInt(10) + 1;
    int operand2 = random.nextInt(10) + 1;
    String operator = "";
    switch (problemType) {
      case 0:
        operator = "+";
        break;
      case 1:
        operator = "-";
        break;
      case 2:
        operator = "*";
        break;
      case 3:
        operator = "/";
    }
    return operand1 + " " + operator + " " + operand2;
  }
}
