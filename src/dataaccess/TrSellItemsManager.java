package dataaccess;

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
				//JDBCドライバを読み込み
				Class.forName("org.postgresql.Driver");

				//データベースへ接続
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp","test","test");

				//SELECT文を準備
				String sql = "SELECT * FROM tr_sell_items;";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				//SELECTを実行し、結果表ResultSetを取得
				ResultSet rs = pStmt.executeQuery();

				//レコード表示
				while (rs.next()) {

					TrSellItemsEntity en = new TrSellItemsEntity();
					en.setNum(rs.getInt("sell_items_num"));
					en.setItemName(rs.getString("sell_items_name"));
					en.setPrice(rs.getInt("sell_items_price"));
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
				//JDBCドライバを読み込み
				Class.forName("org.postgresql.Driver");

				//データベースへ接続
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp","test","test");

				//INSERT文を準備
				String sql = "INSERT INTO tr_sell_items"
				+ "(items_num,sell_items_price, sell_items_name, sell_items_description,show_flag,insert_date,update_date)"
				+"VALUES(1,?,?,?,1,?,?);";

				pStmt = conn.prepareStatement(sql);

				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				pStmt.setInt(1, item.getPrice());
				pStmt.setString(2, item.getItemName());
				pStmt.setString(3, item.getDescription());
				pStmt.setTimestamp(4, timestamp);
				pStmt.setTimestamp(5, timestamp);

				System.out.println(pStmt.toString());

				//INSERT分を実行し、結果表ResultSetを取得
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
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
