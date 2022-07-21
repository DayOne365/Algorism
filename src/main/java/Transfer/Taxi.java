package Transfer;

public class Taxi extends Transfer {

    private int nowPassenger;

    public Taxi(int number) {
        super(number);
        System.out.println("택시 생성 = " + number);
        checkStatus();
    }


    @Override
    public void takePassenger(int nowPassenger, String destiny, int instance) {
        super.takePassenger(nowPassenger, destiny, instance);
    }

    @Override
    public boolean engineStart() {
        return super.engineStart();
    }
    public void createNumber(int nowPassenger){
        this.nowPassenger = nowPassenger;
        System.out.println("-------택시 차량 번호----------");

        for (int i = 0; i < nowPassenger; i++) {
            double dValue = Math.random();   // 그냥 쓰면 0.0~ 9.9 -> 자연수 일자리 수 *10 / 십의자리 수 * 100
            int busNum = (int) (dValue * 1000) + 1000; // 랜덤 함수 (int)(랜덤함수의 변수 * 천자리 수 10000) * 시작 범위
            System.out.println("차량 번호 = " + busNum);
            System.out.println("----------------------------");
        }
    }

    @Override
    public int getUsingFuel(int index) {
        System.out.println("누적 요금 =" + plusPay(index));
        return super.getUsingFuel(index);
    }

    @Override
    public void changeStatus() {
        super.changeStatus();
    }








}
