package test6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class OperatorDaoImpl implements OperatorDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public OperatorDaoImpl(JdbcTemplate jdbcTemplate, BCryptPasswordEncoder passwordEncoder) {
		this.jdbcTemplate = jdbcTemplate;
		this.passwordEncoder = passwordEncoder;
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#findAll()
	 */
	@Override
	public List<Operator> findAll() {// 查找所有管理员（不需要密码）
		String sql = "select ID, USERNAME, PASSWORD, ROLE, DISABLED from OPERATORS";
		try {
			return jdbcTemplate.query(sql, new OperatorRowMapper());
		} catch (Exception e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#findOne(java.lang.Integer)
	 */
	@Override
	public Operator findOne(Integer id) { // 根据id查找某个管理员（需要密码）
		String sql = "select ID, USERNAME, PASSWORD, ROLE, DISABLED from OPERATORS where ID = ?";
		Object[] objects = { id };
		try {
			return jdbcTemplate.queryForObject(sql, objects, new OperatorRowMapper());
		} catch (Exception e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#create(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void create(String username, String password, String role) {// 添加管理员（password是明文）
		String sql = "insert into OPERATORS(ID,USERNAME,PASSWORD,ROLE) values(operator_seq.nextval,?,?,?)";
		jdbcTemplate.update(sql, username, password, role);
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#updatePassword(java.lang.Integer, java.lang.String)
	 */
	@Override
	public void updatePassword(Integer id, String newPassword) {// 修改密码（newPassword是明文）
		String sql = "update OPERATORS set PASSWORD = ? where ID = ?";
		String pwd = passwordEncoder.encode(newPassword);
		jdbcTemplate.update(sql, pwd, id);
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) {// 删除管理员
		String sql = "delete from OPERATORS where ID = ?";
		jdbcTemplate.update(sql, id);
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#disable(java.lang.Integer)
	 */
	@Override
	public void disable(Integer id) {// 禁用指定管理员账号（将DISABLED列设为true）
		String sql = "update OPERATORS set DISABLED = 'true' where ID = ?";
		jdbcTemplate.update(sql, id);
	}

	/* (non-Javadoc)
	 * @see test6.OperatorDao#enable(java.lang.Integer)
	 */
	@Override
	public void enable(Integer id) {// 启用指定管理员账号（将DISABLED列设为false）
		String sql = "update OPERATORS set DISABLED = 'false' where ID = ?";
		jdbcTemplate.update(sql, id);
	}

}
