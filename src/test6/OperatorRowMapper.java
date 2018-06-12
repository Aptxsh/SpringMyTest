package test6;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.expression.spel.support.BooleanTypedValue;
import org.springframework.jdbc.core.RowMapper;

public class OperatorRowMapper implements RowMapper<Operator> {

	@Override
	public Operator mapRow(ResultSet rs, int arg1) throws SQLException {
		Integer id = rs.getInt(1);
		String username = rs.getString(2);
		String password = rs.getString(3);
		String role = rs.getString(4);
		Boolean disabled = Boolean.parseBoolean(rs.getString(5));
		Operator operator = new Operator(id, username, password, role, disabled);
		return operator;
	}
}
