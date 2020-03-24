package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class TrSellItemsManager {

	public ArrayList<TrSellItemsEntity> fetchAllItemData() {

		ArrayList<TrSellItemsEntity> enList = new ArrayList<TrSellItemsEntity>();

		Connection conn = null;

		try {
			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp", "test", "test");

			String sql = "SELECT * FROM tr_sell_items;";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {

				TrSellItemsEntity en = new TrSellItemsEntity();
				en.setNum(rs.getInt("sell_items_num"));
				en.setItemName(rs.getString("sell_items_name"));
				en.setPrice(String.valueOf(rs.getInt("sell_items_price")));
				en.setDescription(rs.getString("sell_items_Description"));

				enList.add(en);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		} catch (SQLException e) {
			System.out.println("SQLException");
		}

		return enList;
	}

	public Boolean InsertItemData(TrSellItemsEntity item) {

		Connection conn = null;
		PreparedStatement pStmt = null;

		try {
			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp", "test", "test");

			String sql = "INSERT INTO tr_sell_items"
					+ "(items_num,sell_items_price, sell_items_name, sell_items_description,show_flag,insert_date,update_date)"
					+ "VALUES(1,?,?,?,1,?,?);";

			pStmt = conn.prepareStatement(sql);

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			pStmt.setInt(1, Integer.parseInt(item.getPrice()));
			pStmt.setString(2, item.getItemName());
			pStmt.setString(3, item.getDescription());
			pStmt.setTimestamp(4, timestamp);
			pStmt.setTimestamp(5, timestamp);

			System.out.println(pStmt.toString());

			pStmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		} catch (SQLException e) {
			System.out.println("SQLException");
		}

		try {
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			// 例外処理せず
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
