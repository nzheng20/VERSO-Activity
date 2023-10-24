

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) {
        // Create new html page
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        // Write to HTML, headers
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        // For loop for if number is even it goes in first column, if not (odd) it goes in the
        // second column
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        // Close file
        file.close();
        // Create new reader
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        // Print out file
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // Close reader
        reader.close();
    }
}
