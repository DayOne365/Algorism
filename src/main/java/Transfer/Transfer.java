package Transfer;

public class Transfer { // 꼭 파라미터로 받아야할 것만 적으면 될 거 같다....
    //
    private int nowPassenger;
    private int pay;
    private int number;
    private int nowSpeed;
    private boolean status = true;
    private int maxPassengerBus = 30;
    private int maxPassengerTaxi = 4;
    private int remain_Passenger;
    private int fuel= 100;
    private String destiny;
    private int instance;
    private int addPay;



    public Transfer(int number) {
        this.number = number;
    }

    public int getPayBus(int htn){
        pay = 1000;
        pay *= htn;
        return pay;
    }

    public int getMaxPassengerBus(int htn) {
        if(maxPassengerBus <= htn){
            System.out.println("최대 승객 수 초과");
        }else{
            maxPassengerBus -= htn;
            System.out.println("잔여 승객 수 = " + maxPassengerBus);}
        return maxPassengerBus;
    }

    public int getUsingFuel(int index) {
        fuel -= index;
        System.out.println("주유량 = " + fuel);
        if (fuel < 10){
            System.out.println("주유 필요");
        }
        if (fuel == 0){
            System.out.println("상태 = 운행불가");
        }

        return fuel;
    }
    public int getChageFuel(int index){
        fuel += index;
        System.out.println("주유량 = " + fuel);
        return fuel;
    }

    public boolean engineStart() {
        return true;
    }

    public void takePassenger(int nowPassenger){}

    public void changeStatus() {
        if (status) {
            status = false;
            System.out.println("상태 = 차고지행");
            maxPassengerBus = 30;
        } else {
            status = true;
            System.out.println("상태 = 운행중");

        }
    }
//--------------------------- 택시 ------------------------------------------
    public void checkStatus(){
         fuel = 100;
        System.out.println("주유량 = " + fuel);
        if (status) {
            status = false;
            System.out.println("상태 = 일반");
        } else {
            status = true;
            System.out.println("상태 = 운행 불가");
        }
        }
    public void takePassenger(int nowPassenger, String destiny, int instance){
        System.out.println("탑승 승객수 = " + nowPassenger);
        if(maxPassengerTaxi <= nowPassenger){
            System.out.println("최대 승객 수 초과");
        }else{
            maxPassengerTaxi -= nowPassenger;
        System.out.println("잔여 승객수 =" + maxPassengerTaxi);
        System.out.println("목적지 = " + destiny);
        System.out.println("목적지까지의 거리 = " + instance + "km");
        getPayTaxi(nowPassenger,instance);
        System.out.println("상태 = 운행중");}
    }

    public void getPayTaxi(int htn, int instance){
//        1. 탑승 승객 수 = 2
//        기본 요금 확인 = 3000
//        지불할 요금  = 4000
        pay = 3000;
        System.out.println("기본 요금 확인 = " + pay);
        pay += instance * 500;
        System.out.println("지불할 요금 =" + pay);
    }

    public int plusPay(int index){
        addPay = index * 50;
        return addPay;
    }
}



