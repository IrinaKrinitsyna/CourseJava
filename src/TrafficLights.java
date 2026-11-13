import java.io.*;

// Сфетофорчики https://acmp.ru/index.asp?main=task&id_task=124
public class TrafficLights {
    public static void main() throws IOException {
        try (FileInputStream fin = new FileInputStream("INPUT.TXT");
             FileOutputStream fout = new FileOutputStream("OUTPUT.TXT")) {

            //Читаем весь входной файл в буфер
            byte[] buffer = new byte[1024];
            int count;
            StringBuilder data = new StringBuilder();
            while ((count = fin.read(buffer)) != -1) {
                for (int i = 0; i < count; i++) {
                    data.append((char) buffer[i]);
                }
            }

            String[] items = data.toString().trim().split("\\s+");
            int bridges = Integer.parseInt(items[0]);
            int crossroads = Integer.parseInt(items[1]);

            int[] cnt = new int[bridges + 1];

            for (int k = 2; k + 1 < items.length; k += 2) {
                int i = Integer.parseInt(items[k]);
                int j = Integer.parseInt(items[k + 1]);
                cnt[i]++;
                cnt[j]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int k = 1; k <= bridges; k++) {
                if (k > 1) sb.append(' ');
                sb.append(cnt[k]);
            }
            sb.append('\n');

            byte[] outBytes = sb.toString().getBytes();
            fout.write(outBytes, 0, outBytes.length);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
