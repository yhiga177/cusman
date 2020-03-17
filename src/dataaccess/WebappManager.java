package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WebappManager {


	public ArrayList<WebappEntity> fetchAllItemData() {

		ArrayList<WebappEntity> enList = new ArrayList<WebappEntity>();

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

					WebappEntity en = new WebappEntity();
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

}
