package submit;

public class Main {
    public static void main(String[] args){

        //버스 노선
        Bus bus1 = new Bus(5712);
        Bus bus2 = new Bus(6715);

        // 버스 확인
        bus1.whatBusNum();
        bus2.whatBusNum();

        // 운행 노선
        bus1.currentBusNum();

        // 승객 2명 탑승
        bus1.takeIn(5712, 2);
        bus1.info_bus();

        // 주유량 -50
        bus1.oil(-50);

        // 상태변경 test
        bus1.statusChange();

        // 주유량 10
        bus1.oil(10);

        // 상태변경 test
        bus1.statusChange();

        // 승객 45명 탑승
        bus1.takeIn(5712, 45);

        // 승객 5명 탑승
        bus1.takeIn(5712, 5);
        bus1.info_bus();

        // 주유량 -50
        bus1.oil(-55);

        // 상태변경 test
        bus1.statusChange();

        // 운행 종료
        bus1.turnOff();




////////////// *********** 택시 *********** ///////////////

        System.out.println("-------------------------버스 종료-------------------------");
        System.out.println("-------------------------택시 시작-------------------------");


        //택시 번호
        Taxi taxi1 = new Taxi("37바3596");
        Taxi taxi2 = new Taxi("72아7456");

        // 택시 확인
        taxi1.whatTaxiNum();
        taxi2.whatTaxiNum();


        // 운행 차량
        taxi1.currentTaxiNum();

        // 승객 2명 탑승 및 운행정보, 상태
        taxi1.takeIn(2);
        System.out.println("기본 요금은 " + taxi1.basicFee + " 원 입니다.");
        taxi1.destination("서울역");
        taxi1.pays(2, 1,3000,1000);
        taxi1.statusChange();

        // 주유량 -80 , 누적요금
        taxi1.oil(-80);
        taxi1.totalpay();

        // 승객 5명 탑승
        taxi1.takeIn(5);

        // 승객 5명 탑승 및 목적지, 상태
        taxi1.takeIn(3);
        System.out.println("기본 요금은 " + taxi1.basicFee + " 원 입니다.");
        taxi1.destination("구로디지털단지역");
        taxi1.pays(12, 1,3000,1000);
        taxi1.statusChange();


        // 주유량 -80 , 누적요금
        taxi1.oil(-20);

        // 택시 상태
        taxi1.statusChange();

        // 총 누적 요금
        taxi1.totalpay();

        // 운행 종료
        taxi1.turnOff();







//
//        // 상태변경 test
//        taxi1.statusChange();
//
//        // 주유량 10
//        taxi1.oil(10);
//
//        // 상태변경 test
//        taxi1.statusChange();
//
//        // 승객 45명 탑승
//        taxi1.takeIn(5712, 45);
//
//        // 승객 5명 탑승
//        taxi1.takeIn(5712, 5);
//        taxi1.info_taxi();
//
//        // 주유량 -50
//        taxi1.oil(-55);
//
//        // 상태변경 test
//        taxi1.statusChange();
//




    }

}


