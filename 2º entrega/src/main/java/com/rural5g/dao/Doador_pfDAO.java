package com.rural5g.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rural5g.factory.ConnectionFactory;
import com.rural5g.model.Doador_pf;

public class Doador_pfDAO {
	public static void insert(Doador_pf doador_pf) {

		Connection con = null;
		PreparedStatement pstm = null;
		String insert = "INSERT INTO doador_pf(nome,email,celular,cpf) VALUES (?,?,?,?);";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

			pstm.setString(1, doador_pf.getNome());
			pstm.setString(2, doador_pf.getEmail());
			pstm.setString(3, doador_pf.getCelular());
			pstm.setString(4, doador_pf.getCpf());

			pstm.executeUpdate();

			ResultSet rs = pstm.getGeneratedKeys();
			if (rs.next()) {
				final int lastId = rs.getInt(1);
				doador_pf.setId_doador(lastId);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					pstm.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void update(Doador_pf doador_pf) {
		Connection con = null;
		PreparedStatement pstm = null;
		String update = "UPDATE doador_pf SET nome = ?, email = ?, celular = ?, cpf = ? WHERE id_doador_pf = ?";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(update);

			pstm.setString(1, doador_pf.getNome());
			pstm.setString(2, doador_pf.getEmail());
			pstm.setString(3, doador_pf.getCelular());
			pstm.setString(4, doador_pf.getCpf());
			pstm.setInt(5, doador_pf.getId_doador());

			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					pstm.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

	public static void deleteById(int id) {
		Connection con = null;
		PreparedStatement pstm = null;
		String delete = "DELETE FROM doador_pf WHERE id_doador_pf = ?";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(delete);

			pstm.setInt(1, id);

			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					pstm.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	public static List<Doador_pf> getDoadores_pf() {
		List<Doador_pf> doadores_pf = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstm = null;
		String select = "SELECT * FROM doador_pf";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(select);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				Doador_pf doador_pf = new Doador_pf();

				doador_pf.setId_doador(rs.getInt("id_doador_pf"));
				doador_pf.setNome(rs.getString("nome"));
				doador_pf.setEmail(rs.getString("email"));
				doador_pf.setCelular(rs.getString("celular"));
				doador_pf.setCpf(rs.getString("cpf"));

				doadores_pf.add(doador_pf);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					pstm.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return doadores_pf;
	}

}
