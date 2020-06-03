package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
    private static String mainContent = "";

    public static void flow() {
        catchLog("===================================================");
        catchLog("Entrou no Programa..");
        catchLog("===================================================");

        catchLog("content");

        catchLog("===================================================");
        catchLog("Saiu do Programa..");
        catchLog("===================================================");
        printLog(mainContent);

    }

    private static void catchLog(String content) {
        mainContent += content + "\n";
    }

    private static Stack generateStack(int size) throws IOException{
        Stack s = new Stack();
        for (int i = 0; i < size; i++) {
            Ticket t = new Ticket();
        }
        return s;
    }

    private static void printLog(String content) {
        FileWriter file;
        File doc = new File("log.txt");

        if (doc.exists() && !doc.isDirectory()) {
            try {
                file = new FileWriter(new File("log.txt"));
                file.append(content);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try{
                file = new FileWriter(new File("log.txt"));
                file.append(content);
                file.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}