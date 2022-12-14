public class Main {
    public static void main(String[] args) {

        Car granta = new Car();
        granta.brand = "Lada";
        granta.model = "Granta";
        granta.productionYear = 2015;
        granta.origin = "Росиия";
        granta.color = "желтый";
        granta.engineVolume = 1.7;
        System.out.println("Марка автомобиля " + granta.brand +
                ", модель " + granta.model +
                ", год выпуска " + granta.productionYear +
                ", страна производства " + granta.origin +
                ", цвет " + granta.color +
                ", объем двигателя " + granta.engineVolume);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.origin = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println("Марка автомобиля " + audi.brand +
                ", модель " + audi.model +
                ", год выпуска " + audi.productionYear +
                ", страна производства " + audi.origin +
                ", цвет " + audi.color +
                ", объем двигателя " + audi.engineVolume);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.origin = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = 3.0;
        System.out.println("Марка автомобиля " + bmw.brand +
                ", модель " + bmw.model +
                ", год выпуска " + bmw.productionYear +
                ", страна производства " + bmw.origin +
                ", цвет " + bmw.color +
                ", объем двигателя " + bmw.engineVolume);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.productionYear = 2018;
        kia.origin = "Южная Корея";
        kia.color = "красный";
        kia.engineVolume = 2.4;
        System.out.println("Марка автомобиля " + kia.brand +
                ", модель " + kia.model +
                ", год выпуска " + kia.productionYear +
                ", страна производства " + kia.origin +
                ", цвет " + kia.color +
                ", объем двигателя " + kia.engineVolume);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.origin = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = 1.6;
        System.out.println("Марка автомобиля " + hyundai.brand +
                ", модель " + hyundai.model +
                ", год выпуска " + hyundai.productionYear +
                ", страна производства " + hyundai.origin +
                ", цвет " + hyundai.color +
                ", объем двигателя " + hyundai.engineVolume);

    }
}