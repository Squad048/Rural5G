package com.rural5g.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rural5g.factory.ConnectionFactory;
import com.rural5g.model.Escola;

public class EscolaDAO {
	public static void insert(Escola escola) {

		Connection con = null;
		PreparedStatement pstm = null;
		String insert = "INSERT INTO escola(nome,nome_coordenador,estado,cidade,bairro) VALUES (?,?,?,?,?);";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

			pstm.setString(1, escola.getNome());
			pstm.setString(2, escola.getNome_coordenador());
			pstm.setString(3, escola.getEstado());
			pstm.setString(4, escola.getCidade());
			pstm.setString(5, escola.getBairro());

			pstm.executeUpdate();

			ResultSet rs = pstm.getGeneratedKeys();
			if (rs.next()) {
				final int lastId = rs.getInt(1);
				escola.setId_escola(lastId);
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

	public static void update(Escola escola) {
		Connection con = null;
		PreparedStatement pstm = null;
		String update = "UPDATE escola SET nome = ?, nome_coordenador = ?, estado = ?, cidade = ?, bairro = ? WHERE id_escola = ? ";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(update);

			pstm.setString(1, escola.getNome());
			pstm.setString(2, escola.getNome_coordenador());
			pstm.setString(3, escola.getEstado());
			pstm.setString(4, escola.getCidade());
			pstm.setString(5, escola.getBairro());
			pstm.setInt(6, escola.getId_escola());

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
		String delete = "DELETE FROM escola WHERE id_escola = ?";

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

	public static List<Escola> getEscolas() {
		List<Escola> escolas = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstm = null;
		String select = "SELECT * FROM escola";

		try {
			con = ConnectionFactory.getConnection();
			pstm = con.prepareStatement(select);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				Escola escola  = new Escola();
				
				escola.setId_escola(rs.getInt("id_escola"));
				escola.setNome(rs.getString("nome"));
				escola.setNome_coordenador(rs.getString("nome_coordenador"));
				escola.setEstado(rs.getString("estado"));
				escola.setCidade(rs.getString("cidade"));
				escola.setBairro(rs.getString("bairro"));

				escolas.add(escola);
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

		return escolas;
	}
}
