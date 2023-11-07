import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {

    public static void main(String[] args) {
        //Objects
        Apartment apartment1 = new Apartment();
        Apartment apartment2 = new Apartment();


        Student student = new Student();
        Apartment apartment = new Apartment();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();


        //Object apartment
        apartment1.setTitle("Kut");
        apartment1.setPrice(50000);
        apartment1.setAddress("Kochkor");

        apartment2.setTitle("Ihlas");
        apartment2.setPrice(80000);
        apartment2.setAddress("Jumgal");

        //Object student
        student1.setName("Asan");
        student1.setPhoneNumber("0700998899");
        student1.setAddressStudent("Kochkor");
        student1.setBankAcconut(18000);

        student2.setName("Aliaskar");
        student2.setPhoneNumber("0700998899");
        student2.setAddressStudent("Kochkor");
        student2.setBankAcconut(16000);

        student3.setName("Aman");
        student3.setPhoneNumber("0700998899");
        student3.setAddressStudent("Kochkor");
        student3.setBankAcconut(15000);

        student4.setName("Zhigit");
        student4.setPhoneNumber("0700998899");
        student4.setAddressStudent("Jumgal");
        student4.setBankAcconut(18000);

        student5.setName("Ali");
        student5.setPhoneNumber("0700998899");
        student5.setAddressStudent("Jumgal");
        student5.setBankAcconut(16000);

        student6.setName("Esen");
        student6.setPhoneNumber("0700998899");
        student6.setAddressStudent("Jumgal");
        student6.setBankAcconut(15000);

        //Arrays
        Apartment[] arrApartment = {apartment1, apartment2};
        Student[] arrStudent = {student1, student2, student3, student4, student5, student6};


        //Methods
        getInfoAddress(arrApartment, arrStudent);

        apartment.payPerMonth(arrApartment, arrStudent);

        student.liveln(arrApartment, arrStudent);

        student.changeInfo(arrStudent);


    }


    public static void getInfoAddress(Apartment[] arrApartment, Student[] arrStudent) {
        System.out.println("Address jazynyz: ");
        String address = new Scanner(System.in).nextLine();

        for (Apartment ap : arrApartment) {
            if (ap.getAddress().equals(address)) {
                System.out.println(STR. """
                            Apartment: \{ ap.getTitle() }
                            Aparment adderss: \{ ap.getAddress() }
                            """ );
            } else {
                System.out.println("Error address");
                break;
            }
        }
        for (Student st : arrStudent) {
            if (st.getAddressStudent().equals(address)) {
                System.out.println(STR. """
                        Students: \{ st.getName() }
                        Students adderss: \{ st.getAddressStudent() }
                        """ );
            }
        }
    }
}