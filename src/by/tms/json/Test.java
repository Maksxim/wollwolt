package by.tms.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Device cpu = new Device("y345b423", "CPU", "USA", 500, "не переферийное, 100 ватт, куллер есть", "отсутствие критично");
        Device gpu = new Device("ysad2132","GPU","USA",700,"не переферийное, 150 ватт, куллер есть","отсутствие критично");
        Device plata = new Device("g675h876","Motherboard","Japan",400,"не переферийное, 100 ватт, куллера нет","отсутствие критично");
        Device ram = new Device("y76g9898","RAM","Japan",300,"не переферийное, 10 ватт, куллера нет","отсутствие критично");
        Device winchester = new Device("y879i098","Winchester","China",300,"не переферийное, 40 ватт, куллера нет","отсутствие критично");
        Device ssd = new Device("g7876d987","SSD","China",400,"не переферийное, 20 ватт, куллера нет","отсутствие не критично");
        Device power = new Device("u324f234","Power unit","China",400,"не переферийное, 750 ватт, куллер есть","отсутствие критично");
        Device soundCard = new Device("o21442h11","Sound Card","China",100,"не переферийное, 30 ватт, куллера нет","отсутствие не критично");
        Device monitor = new Device("h1232123","Monitor","Korea",500,"переферийное, 100 ватт, куллера нет","отсутствие критично");
        Device keyboard = new Device("sd234234","Keyboard","Korea",100,"переферийное, 10 ватт, куллера нет","отсутствие критично");
        Device mouse = new Device("g235234h","Mouse","China",30,"переферийное, 10 ватт, куллера нет","отсутствие критично");
        Device printer = new Device("j986k45","Printer","China",200,"переферийное, 30 ватт, куллера нет","отсутствие не критично");
        Device scanner = new Device("a876m986","Scanner","China",200,"переферийное, 30 ватт, куллера нет","отсутствие не критично");
        Device webcam = new Device("i213j987","Webcam","china",35,"переферийное, 5 ватт, куллера нет","отсутствие не критично");
        Device drive = new Device("u2143p12","Drive","China",40,"не переферийное, 15 ватт, куллера нет","отсутствие не критично");
        Accessories accessories = new Accessories(Arrays.asList(cpu,gpu,plata,ram,winchester,ssd,power,soundCard,monitor,keyboard,mouse,printer,scanner,webcam,drive));
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(Path.of("resources", "jsonDevice","Device.json").toFile(),accessories);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Accessories accessoriesFromJson = objectMapper.readValue(Path.of("resources", "jsonDevice","Device.json").toFile(),Accessories.class);
            System.out.println(accessoriesFromJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

