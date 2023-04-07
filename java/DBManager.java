import java.sql.*;

public class DBManager {

    private static DBManager ourInstance = new DBManager();
    private Connection connection;
    private static final String IP = "localhost";
    private static final String PORT = "3306";
    private static final String USER = "root";
    private static final String PASS = "Z1x2c3v4p1o2i3u4-";
    private static final String DB_NAME = "...";

    public static DBManager getInstance() {
        return ourInstance;
    }

    private DBManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"+IP+":"+PORT+"/"+DB_NAME, USER, PASS);
        }
        catch (ClassNotFoundException e){
            System.out.println("Driver failed");
        }
        catch (SQLException e){
            System.out.println("Connection failed");
        }
    }
    public void saveRegNumber(String regNum) {
        try {
            String sql = "INSERT INTO cars (licence_plate) VALUES (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, regNum);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("eror 1");
        }
    }
    public void actPhoneNumber(String phoneNumber, int id) {
        try {
            String sql = "UPDATE cars SET phone_number  = ?,WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, phoneNumber);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("eroro 2");
        }
    }

    public void saveOrder(int id,Date date) {

            String sql = "INSERT INTO order (id,date_registred) VALUES (?, NOW())";
    }

   public void updateInfo(Date date, String worker, Service.ServiceType serviceType) {

           String sql = "UPDATE orders SET diagnosed_at  = NOW(), diagnosed_by=?, WHERE id=?";
   }
    public void updateFix(Date date, String worker) {

        String sql = "UPDATE orders SET repaired_at  = NOW(), repaired_by=?,WHERE id=?";
    }


    public void stat1() {

        String sql = "SELECT COUNT(*) FROM orders WHERE registered_at >= DATEADD(day, -30, GETDATE())";
    }
    public void stat2(){

            String sql = "(SELECT COUNT(*) FROM contracts WHERE type = 'repair') AS repair_contracts,\n" +
                    "  (SELECT COUNT(*) FROM orders JOIN services ON orders.service_id = services.id WHERE " +
                    "services.type = 'MAINTENANCE') AS maintenance_orders";
    }
    public void stat3(){

        try {
            String sql = "SELECT diagnosticians.name AS name FROM orders\n" +
                    "JOIN diagnosticians ON orders.diagnosed_by = diagnosticians.id\n" +
                    "GROUP BY diagnosticians.id, diagnosticians.name\n" +
                    "ORDER BY COUNT(*) DESC LIMIT 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String name = rs.getString("name");
            System.out.println( name);
        }
        catch (SQLException e) {
            System.out.println("lele");
        }
    }
    public void stat4(){

            String sql = "SELECT cars.licence_plate FROM cars\n" +
                    "JOIN orders ON cars.id = orders.car_id\n" +
                    "GROUP BY cars.id, cars.licence_plate\n" +
                    "HAVING COUNT(*) >= 3";

    }
    public void stat5(){

            String sql = "SELECT COUNT(*) FROM orders\n" +
                    "JOIN cars ON orders.car_id = cars.id\n" +
                    "WHERE cars.warranty = true";
    }
    public void stat6(){

        String sql = "SELECT SUM(CASE WHEN c.warranty = 1 THEN 0 ELSE s.price END) as total_amount\n" +
                "FROM orders o\n" +
                "JOIN cars c ON o.car_id = c.id\n" +
                "JOIN services s ON o.service_id = s.id";
    }

}
