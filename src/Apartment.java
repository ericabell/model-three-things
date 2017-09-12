public class Apartment {
    String address;
    String city;
    String state;
    Integer numBedrooms;
    Integer numBathrooms;

    public Apartment(String address, String city, String state, Integer numBedrooms, Integer numBathrooms) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public String printInfo() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", numBedrooms=" + numBedrooms +
                ", numBathrooms=" + numBathrooms +
                '}';
    }
}
