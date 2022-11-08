package someClass.interfaceTraining;

public class TestWashingMachine {
    public static void main(String[] args) {
        LGWashingMachine washingMachine = new LGWashingMachine();
        washingMachine.startButtonPressed();
        washingMachine.pauseButtonPressed();
        System.out.println("세탁기의 속도는 "+washingMachine.changeSpeed(3));
        washingMachine.stopButtonPressed();
        washingMachine.dry();
    }
}
