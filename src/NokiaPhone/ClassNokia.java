package NokiaPhone;

import java.util.Scanner;

public class ClassNokia {

    private int phoneBook;

    Scanner input
            = new Scanner(System.in);

    public ClassNokia(int phoneBook) {
        this.phoneBook = phoneBook;
    }

    public int phoneBook(int phoneBook) {
//        int phoneBook1 = Input.nextInt();
        System.out.println(" phonebook search ... ");
        switch (phoneBook) {
            case 1:
                System.out.println(" -> Search ");
                System.out.println(" -> Service Nos");
                System.out.println(" -> Add Name ");
                System.out.println(" -> Erase ");
                System.out.println(" -> Assign Tones ");
                System.out.println(" -> Send b' Card ");
                System.out.println(" -> Options ");
                System.out.println(" -> Speed Dials ");
                System.out.println(" -> voice Tags ");

                int search = input.nextInt();
                System.out.println("1.search");
                switch (search) {
                    case 1:
                        System.out.println(search);
                        break;
                }


                int serviceNos = input.nextInt();
                System.out.println("2.Service Nos");
                switch (serviceNos) {
                    case 2:
                        System.out.println(serviceNos);
                        break;
                }


                int addName = input.nextInt();
                System.out.println("3.Add name");
                switch (addName) {
                    case 3:
                        System.out.println(addName);
                        break;
                }


                int erase = input.nextInt();
                System.out.println("4.Erase");
                switch (erase) {
                    case 4:
                        System.out.println(erase);
                        break;
                }


                int edit = input.nextInt();
                System.out.println("5.Edit");
                switch (edit) {
                    case 5:
                        System.out.println(edit);
                        break;
                }


                int assignTone = input.nextInt();
                System.out.println("6.Assign tone");
                switch (assignTone) {
                    case 6:
                        System.out.println(assignTone);
                        break;
                }


                int sendbCard = input.nextInt();
                System.out.println("7.Send b card");
                switch (sendbCard) {
                    case 7:
                        System.out.println(sendbCard);
                        break;
                }


                int options = input.nextInt();
                System.out.println("8.Options");
                switch (options) {
                    case 8:
                        System.out.println(options);
                        if (options == 8) {
                            System.out.printf("%s%n%s%n", " 1.Type of view ", " 2.Memory ");
                        }
                        break;
                }

                int speedDials = input.nextInt();
                System.out.println("9.Speed dials");
                switch (speedDials) {
                    case 9:
                        System.out.println(speedDials);
                        break;
                }


                int voice = input.nextInt();
                System.out.println("10.Voice");
                switch (voice) {
                    case 10:
                        System.out.println(voice);
                }
                break;

        }
        return phoneBook;
    }

}