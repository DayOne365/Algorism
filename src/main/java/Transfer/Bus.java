package Transfer;

public class Bus extends Transfer{

    private int nowPassenger;

    public Bus(int number) {
        super(number);
        System.out.println("버스 생성 = " + number);

    }

    @Override
    public void takePassenger(int nowPassenger) {
        super.takePassenger(nowPassenger);
        System.out.println("탑승 승객수 = " + nowPassenger);
        getMaxPassengerBus(nowPassenger);
        System.out.println("요금 확인 = " + getPayBus(nowPassenger));
    }

    @Override
    public int getUsingFuel(int index) {
        return super.getUsingFuel(index);

    }

    @Override
    public void changeStatus() {
        super.changeStatus();
    }

    @Override
    public int getChageFuel(int index) {
        return super.getChageFuel(index);
    }

    @Override
    public boolean engineStart() {
        return super.engineStart();
    }
    public void createNumber(int nowPassenger){
        this.nowPassenger = nowPassenger;
        System.out.println("-------버스 차량 번호----------");

        for (int i = 0; i < nowPassenger; i++) {
            double dValue = Math.random();   // 그냥 쓰면 0.0~ 9.9 -> 자연수 일자리 수 *10 / 십의자리 수 * 100
            int busNum = (int) (dValue * 1000) + 1000; // 랜덤 함수 (int)(랜덤함수의 변수 * 천자리 수 10000) * 시작 범위
            System.out.println("차량 번호 = " + busNum);
            System.out.println("----------------------------");
        }
    }
}
