package ss16_io_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        final String path = "src/ss16_io_text_file/bai_tap/doc_file/country";
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvList) {
        List<String> result = new ArrayList<>();
        if (csvList != null) {
            String[] arr = csvList.split(",");
            for (int i = 0; i < arr.length; i++) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id ="
                        + country.get(0)
                        + ", code = " + country.get(1)
                        + ", name = " + country.get(2)
                        + "]");
    }
}
