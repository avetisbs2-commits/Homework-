package inheritance_homework;

public class Car {
    int passengerCount;
    char engineType;

    Car(int passengerCount, char engineType) {
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }

    int getPassengerCount(){
        return passengerCount;
    }

    void setPassengerCount(int passengerCount){
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        }
    }

    char getEngineType(){
        return engineType;
    }

    void setEngineType(char engineType){
        if (Character.isLetter(engineType)) {
            this.engineType = engineType;
        }
    }
}
