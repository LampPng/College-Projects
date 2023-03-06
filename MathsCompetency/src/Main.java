public class Main {
    // Application code
    public static void main(String args[]) {
        School sk1 = new School();
        School sk2 = new School();
        School sk3 = new School();

        // Direct access to attributes is not a good practices
        sk1.setName("SK Satu");
        sk2.setName("SK Dua");
        sk3.setName("SK Tiga");

        Address addr = new Address();
        Address addr2 = new Address();
        Address addr3 = new Address();

        //Info for SK Satu
        addr.setStreet("Jalan 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sk1.setAddress(addr);

        //Info for SK Dua
        addr2.setStreet("Jalan 3");
        addr2.setDistrict("Kelantan");
        addr2.setPostcode("40032");
        addr2.setState("Legoland");
        sk2.setAddress(addr2);


        //Info for SK Tiga
        addr3.setStreet("Jalan 3");
        addr3.setDistrict("Kelantan");
        addr3.setPostcode("40032");
        addr3.setState("Legoland");
        sk3.setAddress(addr3);

        //Principal List
        sk1.setPrincipal("Bob");
        sk2.setPrincipal("Julia");
        sk3.setPrincipal("Robert");

        //String output for SK Satu
        System.out.println("-----------------------------------------------------");
        System.out.println("Name of school is "+sk1.getName());
        System.out.println("Address of school is "+sk1.getAddress().getStreet()+", "+sk1.getAddress().getDistrict()+", "+sk1.getAddress().getState()+", "+sk1.getAddress().getPostcode());
        System.out.println("Principal of school is "+sk1.getPrincipal());


        Marks marks = new Marks();
        marks.createData(100);

        //Marks for students in SK Satu
        marks.setMark(50, 0);
        marks.setMark(60, 1);
        marks.setMark(93, 2);

        float mark = marks.getMark(0);

        for (int i=0; i<3; i++) {
            System.out.println("Marks for student "+ i +" is " + mark);
            mark = marks.getMark(i + 1);
        }

        //String output for SK Dua
        System.out.println("-----------------------------------------------------");
        System.out.println("Name of school is "+sk2.getName());
        System.out.println("Address of school is "+sk2.getAddress().getStreet()+", "+sk2.getAddress().getDistrict()+", "+sk2.getAddress().getState()+", "+sk2.getAddress().getPostcode());
        System.out.println("Principal of school is "+sk2.getPrincipal());

        //Marks for students in SK Dua
        marks.setMark(27, 0);
        marks.setMark(52, 1);
        marks.setMark(93, 2);

        for (int i=0; i<3; i++) {
            System.out.println("Marks for student "+ i +" is " + mark);
            mark = marks.getMark(i + 1);
        }

        //String output for SK Tiga
        System.out.println("-----------------------------------------------------");
        System.out.println("Name of school is "+sk3.getName());
        System.out.println("Address of school is "+sk3.getAddress().getStreet()+", "+sk3.getAddress().getDistrict()+", "+sk3.getAddress().getState()+", "+sk3.getAddress().getPostcode());
        System.out.println("Principal of school is "+sk3.getPrincipal());

        //Marks for students in SK Tiga
        marks.setMark(69, 0);
        marks.setMark(98, 1);
        marks.setMark(47, 2);

        for (int i=0; i<3; i++) {
            System.out.println("Marks for student "+ i +" is " + mark);
            mark = marks.getMark(i + 1);
        }

    }
}
