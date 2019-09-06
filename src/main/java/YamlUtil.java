import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class YamlUtil {


    public static void main(String[] args) {
        Writer writer;
        int rp, p;

        try {
            Map m1,m2,m3,m4;
            Yaml yaml = new Yaml();
            File file = new File("entity.yaml");

            //也可以将值转换为Map
            m1 = (Map) yaml.load(new FileInputStream(file));
            //通过map我们取值就可以了.
            m2 = (Map) m1.get("tunnels");
            m3 = (Map) m2.get("mc");
            m3.put("remote_port", 44444);
            m4 = (Map) m3.get("proto");
            m4.put("tcp", 33333);

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(yaml.dump(m1));
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
