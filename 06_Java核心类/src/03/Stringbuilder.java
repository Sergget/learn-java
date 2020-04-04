public class Stringbuilder{
    public static void main(String[] args) {
        String[] fields={"name","position","salary"};
        String table = "employee";
        String insert = buildInsertSql(table,fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert)?"Success":"Failed");
    }

    static String buildInsertSql(String table, String[] fields){
        StringBuilder s = new StringBuilder();
        String fieldStr = String.join(", ", fields);
        s.append("INSERT INTO ").append(table).append(" (").append(fieldStr).append(") VALUES (?, ?, ?)");
        return s.toString();
    }
}