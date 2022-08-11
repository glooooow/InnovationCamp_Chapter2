package submit;


public class Bus {

    int maxPassenger = 30; // 최대 정원
    int currentPassenger; // 현재 승객 수
    int pay; // 운임
    int busNum; // 버스번호
    int fuel = 100; // 주유량
    int speed; // 현재 속도
    String status ; // 상태


    public Bus(int busNum) { this.busNum = busNum; }

    // 버스 정보
    public void whatBusNum () {
        System.out.println("이 버스는 " + busNum + "번 노선입니다. ");
    }

    // 운행 노선
    public void currentBusNum () {
        System.out.println( busNum + "번 운행을 시작합니다. ");
    }

    // 탑승
    public void takeIn (int busNum, int passengers) {
        if (currentPassenger+passengers <= maxPassenger) {
            currentPassenger += passengers;
        }else {
            currentPassenger += 0;
            System.out.println("최대 승객 수 초과입니다.");
        }
        pay += passengers * 1000;
    }

    // 현재 탑승 정보
    public void info_bus () {
        System.out.println("1. 현재 승객 인원 : " + currentPassenger);
        System.out.println("2. 잔여 좌석 수 : " + (maxPassenger -currentPassenger));
        System.out.println("3. 요금 확인 : " + pay);


    }

    // 주유
    public void oil (int oil) {
        this.fuel += oil;
        if(this.fuel < 10) {
            System.out.println("주유량 : " + this.fuel);
            System.out.println("주유 필요");
        }
        else {
            System.out.println("주유량 : " + this.fuel);
        }
    }

    public void statusChange () {
        if (this.fuel < 60) {
            System.out.println("차고지행");
        }
        else {
            System.out.println("운행 중");
        }
    }

    public void turnOff () {
        System.out.println( busNum + "번 노선의 운행을 종료합니다. ");
    }





}
