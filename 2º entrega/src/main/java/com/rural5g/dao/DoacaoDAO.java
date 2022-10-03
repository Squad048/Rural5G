package com.rural5g.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rural5g.factory.ConnectionFactory;
import com.rural5g.model.Doacao;

public class DoacaoDAO {

	public static void insert(Doacao doacao) {

		Connection con = null;
		PreparedStatement pstm = null;
		String insert = "INSERT INTO doacao(nome,id_escola,id_doador,entidade_doador) VALUES (?,?,?,?);";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(insert);

			pstm.setString(1, doacao.getNome());
			pstm.setInt(2, doacao.getId_escola());
			pstm.setInt(3, doacao.getId_doador());
			pstm.setString(4, doacao.getEntidade_doador());

			pstm.executeUpdate();

			ResultSet rs = pstm.getGeneratedKeys();
			if (rs.next()) {
				final int lastId = rs.getInt(1);
				doacao.setId_doador(lastId);
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

	public static void update(Doacao doacao) {
		Connection con = null;
		PreparedStatement pstm = null;
		String update = "UPDATE doacao SET nome = ?, id_escola = ?, id_doador = ?, entidade_doador = ? WHERE id_doador = ?";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(update);

			pstm.setString(1, doacao.getNome());
			pstm.setInt(2, doacao.getId_escola());
			pstm.setInt(3, doacao.getId_doador());
			pstm.setString(4, doacao.getEntidade_doador());
			pstm.setInt(5, doacao.getId_doador());

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
		String delete = "DELETE FROM doacao WHERE id_doacao = ?";

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

	public static List<Doacao> getDoacoes() {
		List<Doacao> doacoes = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstm = null;
		String select = "SELECT * FROM doacao";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(select);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				Doacao doacao = new Doacao();

				doacao.setId_doacao(rs.getInt("id_doacao"));
				doacao.setNome(rs.getString("nome"));
				doacao.setId_escola(rs.getInt("id_escola"));
				doacao.setId_doador(rs.getInt("id_doador"));
				doacao.setEntidade_doador(rs.getString("entidade_doador"));

				doacoes.add(doacao);
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

		return doacoes;
	}

}
