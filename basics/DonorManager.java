import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

class Donor implements Serializable {
    private String name;
    private int age;
    private String address;
    private String contactNumber;
    private String bloodGroup;
    private LocalDate dateOfLastDonation;

    public Donor(String name, int age, String address, String contactNumber, String bloodGroup, LocalDate dateOfLastDonation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.dateOfLastDonation = dateOfLastDonation;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public boolean isEligibleForDonation() {
        LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);
        return bloodGroup.equalsIgnoreCase("A+ve") && dateOfLastDonation.isBefore(sixMonthsAgo);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Date of Last Donation: " + dateOfLastDonation);
        System.out.println("-----------------------------");
    }
}

public class DonorManager {
    public static void main(String[] args) {
        ArrayList<Donor> donors = new ArrayList<>();

        // Create donor objects and write to a file
        createAndWriteDonorsToFile(donors);

        // Read from the file and filter donors with blood group 'A+ve' who haven't donated in the last 6 months
        readAndDisplayEligibleDonors(donors);
    }

    public static void createAndWriteDonorsToFile(ArrayList<Donor> donors) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("donors.dat"))) {
            donors.add(new Donor("John", 30, "Address 1", "1234567890", "A+ve", LocalDate.parse("2022-04-01")));
            donors.add(new Donor("Alice", 25, "Address 2", "9876543210", "B+ve", LocalDate.parse("2022-10-15")));
            // Add more donor objects as needed

            for (Donor donor : donors) {
                outputStream.writeObject(donor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndDisplayEligibleDonors(ArrayList<Donor> donors) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("donors.dat"))) {
            System.out.println("Eligible Donors (A+ve and haven't donated in last 6 months):");
            while (true) {
                Donor donor = (Donor) inputStream.readObject();
                if (donor != null && donor.isEligibleForDonation()) {
                    donor.displayDetails();
                }
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
