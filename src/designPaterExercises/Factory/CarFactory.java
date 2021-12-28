package designPaterExercises.Factory;

public class CarFactory {

    private Car car;

    public Car getCarType(CarType model){

        if(car == null) {
            synchronized (CarFactory.class) {
                if (car == null) {
                    switch (model) {
                        case SMALL:
                            car = new SmallCar();
                            break;
                        case MEDIUM:
                            car = new MediumCar();
                            break;
                        case LARGE:
                            car = new LargeCar();
                            break;
                        default:
                            throw new CarTypeNotFoundException();

                            //System.out.println("Car type is not available");

                    }
                }
            }
        }

        return car;
    }


}
