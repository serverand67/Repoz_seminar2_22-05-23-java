package homework2;

//import lombok.SneakyThrows;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public class Task1SQL_2 {

//    public static void main(String[] args)  {
//
//        String jsonString = "[{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}]";
//        parseStringJson(jsonString);
//    }
//
//    @SneakyThrows
//    private static void parseStringJson(String jsonString) {
//
//        Object object = new JSONParser().parse(jsonString);
//        JSONArray array = (JSONArray) object;
//
//        // Формируем часть WHERE запроса из данной строки
//        for (Object obj : array) {
//            JSONObject jsonObject = (JSONObject) obj;
//            StringBuilder builder = new StringBuilder();
//            // Добавляем параметр в запрос
//            builder.append(" name = ").append(jsonObject.get("name"))
//                    .append(" AND ").append(" country = ")
//                    .append(jsonObject.get("country"))
//                    .append(" AND ").append("city = ")
//                    .append(jsonObject.get("city"));
//            // Добавляем к запросу WHERE и часть запроса с параметрами
//            String sqlQuery = "SELECT * FROM students WHERE " + builder;
//            System.out.println(sqlQuery);
//        }
//    }
}
