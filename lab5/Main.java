public class Main {
    public static void main(String[] args) {
        District cityCenter = new District("центр міста");
        District uptown = new District("верхній район");

        Building library = new Building("центральна бібліотека");
        Building museum = new Building("музей");
        Building school = new Building("школа");

        cityCenter.add(library);
        cityCenter.add(museum);
        uptown.add(school);

        District city = new District("мегаполіс");
        city.add(cityCenter);
        city.add(uptown);

        System.out.println(city.displayDetails());
    }
}