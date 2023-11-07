import java.util.Scanner;

public class Apartment {
    private String title;
    private int price;
    private String address;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }


    public void payPerMonth(Apartment[] arrApartment, Student[] arrStudent) {
        System.out.print("Kvart platany biluu uchun kvartiranyn adresin jaz: ");
        String adKv = new Scanner(System.in).nextLine();

        int counter = 0;
        double kvartplata = 0;

        for (Student st : arrStudent) {
            if (st.getAddressStudent().equals(adKv)) {
                counter++;
            }
        }

        for (Apartment ap : arrApartment) {
            if (ap.getAddress().equals(adKv)) {
                System.out.println(STR. """
                            Apartment: \{ ap.getTitle() }
                            Price aparment: \{ ap.getPrice() }
                            Aparment adderss: \{ap.getAddress()}
                            """ );
                kvartplata = Math.round(ap.getPrice() / counter);
            }
        }

        for (Student st : arrStudent) {
            if (st.getAddressStudent().equals(adKv))
                System.out.println(STR. """
                       Student: \{ st.getName() }
                       Aiyna: \{ kvartplata }
                        """ );
        }

    }
}






