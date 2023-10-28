package case_study.ultils;

import case_study.model.Booking;

import java.io.*;
import java.util.Date;
import java.util.TreeSet;

public class ReadAndWriteFileBooking {
    public static void writeBookingListToFile(TreeSet<Booking> bookings, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking b : bookings) {
                bufferedWriter.write(b.getToInCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TreeSet<Booking> readBookingListFromFile(String path) {
        TreeSet<Booking> bookingList = new TreeSet<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] bookingArr = line.split(",");
                Booking booking = new Booking(bookingArr[0], bookingArr[1], bookingArr[2], bookingArr[3], bookingArr[4],
                        bookingArr[5]);
                bookingList.add(booking);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookingList;
    }
}
