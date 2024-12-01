package m.strings;

public class AfterStrings {

    public static void main(String[] args) {
        String sql = """
                select person_id, first_name, last_name \
                from person \
                where person_id = ?""";
        System.out.println(sql);
    }

}
