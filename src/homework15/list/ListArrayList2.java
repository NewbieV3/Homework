package homework15.list;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList2 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(45875688, 437, "iphone"));
        phones.add(new Phone(32564376, 328, "samsung"));
        phones.add(new Phone(12268721, 532, "xiaomi"));
        phones.add(new Phone(23472413, 211, "motorola"));

        System.out.println(phones);
        System.out.println("Number of phones into box: " + phones.size());

        for (Phone phone : phones)
            System.out.println(phone.getModel() + ", " + phone.getNumber());
        System.out.println("Deleting database... ");
        phones.clear();
        System.out.println("Number of phones into box: " + phones.size());
    }
}

class Phone {

    private long number;
    private int serial;
    private String model;

    public Phone(int number, int serial, String model) {
        this.number = number;
        this.serial = serial;
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "homework15.list.Phone number= " + number + ", serial=" + serial + ", model=" + model + '\n';
    }
}
