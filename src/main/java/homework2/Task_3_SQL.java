package homework2;

//import lombok.SneakyThrows;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

//public class Task_3_SQL {
//

//    public static void main(String[] args)  {

//        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//        parseStringJson(json);
//    }
//
//    @SneakyThrows
//    private static void parseStringJson(String json) {
//
//        Object object = new JSONParser().parse(json);
//        JSONArray array = (JSONArray) object;
//
//        for (Object o : array) {
//            JSONObject jsonObject = (JSONObject) o;
//            StringBuilder builder = new StringBuilder();
//            builder.append("Студент ").append(jsonObject.get("Фамилия"))
//                    .append(" оценка ").append(jsonObject.get("оценка"))
//                    .append("по предмету")
//                    .append(jsonObject.get("по предмету"));
//            String sqlQuery = builder.toString();
//
//            System.out.println(sqlQuery);
//        }
//    }
//}
