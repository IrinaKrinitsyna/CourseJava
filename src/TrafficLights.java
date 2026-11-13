
import java.io.*;

// Сфетофорчики https://acmp.ru/index.asp?main=task&id_task=124
public class TrafficLights {
    public static void main() {
        try {
            String[] items = readFile();
            int crossroads = Integer.parseInt(items[0]); // N — перекрёстки
            int bridges    = Integer.parseInt(items[1]); // M — тоннели

            int[] cnt = new int[crossroads + 1];

            for (int k = 2; k + 1 < items.length; k += 2) {
                int i = Integer.parseInt(items[k]);
                int j = Integer.parseInt(items[k + 1]);
                cnt[i]++;
                cnt[j]++;
            }

            writeFile(cnt, crossroads);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String[] readFile() throws IOException {
        try (FileInputStream fin = new FileInputStream("INPUT.TXT")) {
            byte[] buffer = new byte[1024];
            int count;
            StringBuilder data = new StringBuilder();
            while ((count = fin.read(buffer)) != -1) {
                for (int i = 0; i < count; i++) {
                    data.append((char) buffer[i]);
                }
            }
            return data.toString().trim().split("\\s+");
        }
    }

    public static void writeFile(int[] cnt, int crossroads) throws IOException {
        try (FileOutputStream fout = new FileOutputStream("OUTPUT.TXT")) {
            StringBuilder sb = new StringBuilder();
            for (int k = 1; k <= crossroads; k++) {
                if (k > 1) sb.append(' ');
                sb.append(cnt[k]);
            }
            sb.append('\n');

            byte[] outBytes = sb.toString().getBytes();
            fout.write(outBytes, 0, outBytes.length);
        }
    }
}