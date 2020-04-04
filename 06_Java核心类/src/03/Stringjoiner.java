import java.util.StringJoiner;
public class Stringjoiner {
    public static void main(String[] args) {
        String[] fields = {"name","position","salary"};
        String table = "employee";
        String select = buildSelectSql(table,fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select)?"Success":"Failed");
    }
    static String buildSelectSql(String table, String[] fields){
        StringJoiner sj = new StringJoiner(", ","SELECT "," FROM "+table);
        for (String item : fields) {
            sj.add(item);
        }
        return sj.toString();
    }
}