package Transfer;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- Start Bus ----------------------");

//     -------------- 버스 시나리오 시작 ----------------------

//        -------------- 손님 생성 -------------------
        Passenger firstBusPassenger = new Passenger(2);
//        -------------- 버스 생성 -------------------
        Bus createBus = new Bus(2);
//        -------------- 버스 번호 생성 -------------------
        createBus.createNumber(firstBusPassenger.hcn); // 손님은 탑승객으로 변신
//        -------------- 손님 차량 탑승 -------------------
        createBus.takePassenger(firstBusPassenger.hcn);
//        -------------- 주유 소모 -----------------------
        createBus.getUsingFuel(50);
//        -------------- 차고지 이동 ----------------------
        createBus.changeStatus();
//        -------------- 주유 충전 -----------------------
        createBus.getChageFuel(10);
//        -------------- 운행중  -----------------------
        createBus.changeStatus();
//        -------------- 손님 45명 생성  -------------------
        Passenger addPassenger = new Passenger(45);
//        -------------- 손님 45명 태우기 -> 최대 승객 수 초과 발생 ------------
        createBus.takePassenger(addPassenger.hcn);
//        -------------- 손님 5명 생성 ------------
        Passenger plusPassenger = new Passenger(5);
//    -------------- 손님 5명 태우기 ------------
        createBus.takePassenger(plusPassenger.hcn);
//     -------------- 주유 충전 -----------------------
        createBus.getUsingFuel(55);
//     -------------- 차고지 이동 ----------------------
        createBus.changeStatus();
////     -------------- 버스 시나리오 종료 ----------------------
        System.out.println("-------------- end Bus ----------------------");


        System.out.println("-------------- Start Taxi ----------------------");

//     -------------- 택시 시나리오 시작 ----------------------
////     -------------- 손님 생성 -------------------
        Passenger firstPassenger = new Passenger(2);
//          -------------- 택시 생성 -------------------
        Taxi createTaxi = new Taxi(2);
////        -------------- 택시 번호 생성 -------------------
        createTaxi.createNumber(firstPassenger.hcn); // 손님은 탑승객으로 변신
////        -------------- 손님 차량 탑승 -------------------
        createTaxi.takePassenger(firstPassenger.hcn,"서울역",2);
////        -------------- 주유 소모 -----------------------
        createTaxi.getUsingFuel(80);
//        -------------- 손님 생성 -----------------------
        Passenger thirdPassenger = new Passenger(5);
//        -------------- 손님 차량 탑승 -> 최대 승객 수 초과 알럿 -------------------
        createTaxi.takePassenger(thirdPassenger.hcn,"서울역",2);
//        -------------- 손님 생성 -----------------------
        Passenger endPassenger = new Passenger(3);
//          -------------- 택시 생성 -------------------
        Taxi secondTaxi = new Taxi(1);
////        -------------- 손님 차량 탑승  -------------------
        secondTaxi.takePassenger(endPassenger.hcn,"구로디지털단지역",12);
////        -------------- 주유 소모 -----------------------
        createTaxi.getUsingFuel(20);
        System.out.println("-------------- end Taxi ----------------------");








    }


}
