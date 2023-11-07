import java.util.Scanner;

public class Student {
    private String name;
    private String phoneNumber;
    private String addressStudent;
    private int bankAcconut;
    private Apartment apartment;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public void setBankAcconut(int bankAcconut) {
        this.bankAcconut = bankAcconut;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public int getBankAcconut() {
        return bankAcconut;
    }


    public void liveln(Apartment[] arrApartment, Student[] arrStudent) {
        System.out.print("Atynyzdy jazynyz: ");
        String name = new Scanner(System.in).nextLine();

        int bankAcc = 0;
        String address = "";

        for (Student st : arrStudent) {
            if (st.getName().equals(name)) {
                System.out.println(STR. """
                        Name: \{ st.getName() }
                        Bank account: \{ st.getBankAcconut() }
                        """ );
                bankAcc = st.getBankAcconut();
                address = st.getAddressStudent();

            }
        }

        for (Apartment ap : arrApartment) {
            if (ap.getAddress().equals(address)) {
                int countStud = Math.round((ap.getPrice() / 3));
                System.out.println(STR. """
                        Aparment: \{ ap.getTitle() }
                        Aparment address: \{ ap.getAddress() }
                        Price: \{ ap.getPrice() }
                        Jashay alasyz(ai): \{ bankAcc / countStud }
                        """ );
            }
        }
    }

    public void changeInfo(Student[] arrStudent) {
        System.out.print("Atynyzdy jazynyz: ");
        String name = new Scanner(System.in).nextLine();

        String saveName = "";

        int select = 0;
        boolean truee = false;

        for (Student st : arrStudent) {
            if (st.getName().equals(name)) {
                saveName = st.getName();
                truee = true;
                break;
            }
        }
        if (!truee){
            System.out.println("ERROR");
            return;
        }


            System.out.println(STR."""
                1. Name
                2. Phone number
                3. Address
                4. Bank account
                """);

            select = new Scanner(System.in).nextInt();

        switch (select) {
            case 1:
                System.out.println("New name: ");
                String newName = new Scanner(System.in).nextLine();

                for (Student st : arrStudent) {
                    if (st.getName().equals(saveName)) {

                        st.setName(newName);

                        System.out.println(STR."""
                                1. Name: \{st.getName()}
                                2. Phone number \{st.getPhoneNumber()}
                                3. Address: \{st.getAddressStudent()}
                                4. Bank account: \{st.getBankAcconut()}
                                """);
                    }
                }
                break;
            case 2:
                System.out.println("New phone number: ");
                String newPhoneNumber = new Scanner(System.in).nextLine();

                for (Student st : arrStudent) {
                    if (st.getName().equals(saveName)) {

                        st.setPhoneNumber(newPhoneNumber);

                        System.out.println(STR."""
                                1. Name: \{st.getName()}
                                2. Phone number \{st.getPhoneNumber()}
                                3. Address: \{st.getAddressStudent()}
                                4. Bank account: \{st.getBankAcconut()}
                                """);
                    }
                }
                break;

            case 3:
                System.out.println("New address: ");
                String newAddress = new Scanner(System.in).nextLine();

                for (Student st : arrStudent) {
                    if (st.getName().equals(saveName)) {

                        st.setAddressStudent(newAddress);

                        System.out.println(STR."""
                                1. Name: \{st.getName()}
                                2. Phone number \{st.getPhoneNumber()}
                                3. Address: \{st.getAddressStudent()}
                                4. Bank account: \{st.getBankAcconut()}
                                """);
                    }
                }
                break;

            case 4:
                System.out.println("New bank account: ");
                int newAccount = new Scanner(System.in).nextInt();

                for (Student st : arrStudent) {
                    if (st.getName().equals(saveName)) {

                        st.setBankAcconut(newAccount);

                        System.out.println(STR."""
                                1. Name: \{st.getName()}
                                2. Phone number \{st.getPhoneNumber()}
                                3. Address: \{st.getAddressStudent()}
                                4. Bank account: \{st.getBankAcconut()}
                                """);
                    }
                }
                break;
            default:
                System.out.println("ERROR");
        }


    }


}
