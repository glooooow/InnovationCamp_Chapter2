package submit;

public class Taxi {

    int maxPassenger = 4; // 최대 정원
    int currentPassenger; // 현재 승객 수
    int extra; // 잔여 좌석 수
    String des;
    int basicFee = 3000; // 기본 운임
    int disFee = 100; // 거리당 추가 운임
    int pay; // 총 요금
    int totalpay; // 누적 요금

    int basicDis = 1; // 기본 거리
    int allDis; // 목적지까지의 거리
    String taxiNum; // 택시번호
    int fuel = 100; // 주유량
    int speed; // 현재 속도
    String status; // 상태


    // 택시 번호
    public Taxi(String taxiNum) { this.taxiNum = taxiNum; }

    // 택시 정보
    public void whatTaxiNum() {
        System.out.println("이 택시의 차량번호는 " + taxiNum + "입니다. ");
    }

    // 운행 노선
    public void currentTaxiNum() {
        System.out.println("차량번호 " + taxiNum + " 의 운행을 시작합니다. ");
    }

// 탑승
    public void takeIn( int passengers) {
        if (currentPassenger + passengers <= maxPassenger) {
            currentPassenger += passengers;
            extra = maxPassenger - currentPassenger;
            System.out.println("총 " + passengers + " 명 탑승하였습니다.");
            System.out.println("현재 인원은 " + currentPassenger + " 명 입니다.");
            System.out.println("잔여 좌석에 " + extra + " 명 탑승 가능합니다." );
        } else {
            currentPassenger = 0;
            System.out.println("최대 승객 수 초과입니다.");
        }
    }

    // 목적지명
    public void destination (String des) {
        System.out.println("목적지는 " + des + " 입니다.");
    }

    // 거리 및 요금 정보
    public void pays(int allDis, int basicDis, int basicFee, int disFee) {
        if (allDis <= basicDis) {
            this.pay = basicFee;
            System.out.println("요금은 " + pay + " 원 입니다.");
            System.out.println("목적지까지 거리는 " + allDis + " Km 입니다.");
        } else {
            this.pay = basicFee + ((allDis - basicDis) * disFee);
            System.out.println("목적지까지 거리는 " + allDis + " Km 입니다.");
            System.out.println("요금은 총 " + pay + " 원 입니다.");

        }
    }

    public void statusChange() {
        if (this.fuel < 10) {
            System.out.println("연료 부족으로 운행 불가합니다.");
        } else if (currentPassenger > 0){
            System.out.println("운행 중 입니다.");
        } else if (currentPassenger == 0){
            System.out.println("일반");
        }

    }

        // 주유
    public void oil(int oil) {
        this.fuel += oil;
        if (this.fuel < 10) {
            System.out.println("주유량 : " + this.fuel);
            System.out.println("주유 필요");
        } else {
            System.out.println("주유량 : " + this.fuel);
        }
    }

    // 누적 요금
    public void totalpay() {
        totalpay += this.pay;
        System.out.println("누적요금은 " + totalpay + " 원 입니다.");
    }

    // 택시 운행 종료
    public void turnOff () {
        System.out.println( taxiNum + "번 택시의 운행을 종료합니다. ");
    }


}

//
//

//
//
//    }
//
//    // 주유
//    public void oil(int oil) {
//        this.fuel += oil;
//        if (this.fuel < 10) {
//            System.out.println("주유량 : " + this.fuel);
//            System.out.println("주유 필요");
//        } else {
//            System.out.println("주유량 : " + this.fuel);
//        }
//    }
//

//    public void turnOff() {
//        System.out.println(taxiNum + "번 노선의 운행을 종료합니다. ");
//    }


//    // 탑승
//    public void takeIn (int busNum, int passengers) {
//        if (currentPassenger+passengers <= maxPassenger) {
//            currentPassenger += passengers;
//        }else {
//            currentPassenger += 0;
//            System.out.println("최대 승객 수 초과입니다.");
//        }
//        pay += passengers * 1000;
//    }
//
//    // 현재 탑승 정보
//    public void info_bus () {
//        System.out.println("1. 현재 승객 인원 : " + currentPassenger);
//        System.out.println("2. 잔여 좌석 수 : " + (maxPassenger -currentPassenger));
//        System.out.println("3. 요금 확인 : " + pay);
//
//
//    }
//
//    // 주유
//    public void oil (int oil) {
//        this.fuel += oil;
//        if(this.fuel < 10) {
//            System.out.println("주유량 : " + this.fuel);
//            System.out.println("주유 필요");
//        }
//        else {
//            System.out.println("주유량 : " + this.fuel);
//        }
//    }
//
//    public void statusChange () {
//        if (this.fuel < 60) {
//            System.out.println("차고지행");
//        }
//        else {
//            System.out.println("운행 중");
//        }
//    }
//

//    }

