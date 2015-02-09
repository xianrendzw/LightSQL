/*  (c) 2004 Allen I. Holub. All rights reserved.
 *
 *  This code may be used freely by yourself with the following
 *  restrictions:
 *
 *  o Your splash screen, about box, or equivalent, must include
 *    Allen Holub's name, copyright, and URL. For example:
 *
 *      This program contains Allen Holub's SQL package.<br>
 *      (c) 2005 Allen I. Holub. All Rights Reserved.<br>
 *              http://www.holub.com<br>
 *
 *    If your program does not run interactively, then the foregoing
 *    notice must appear in your documentation.
 *
 *  o You may not redistribute (or mirror) the source code.
 *
 *  o You must report any bugs that you find to me. Use the form at
 *    http://www.holub.com/company/contact.html or send email to
 *    allen@Holub.com.
 *
 *  o The software is supplied <em>as is</em>. Neither Allen Holub nor
 *    Holub Associates are responsible for any bugs (or any problems
 *    caused by bugs, including lost productivity or data)
 *    in any of this code.
 */
package com.easytoolsoft.database.jdbc.adapters;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Properties;
import java.util.concurrent.Executor;

/***
 * @include /etc/license.txt
 */

public class ConnectionAdapter implements java.sql.Connection
{
	public ConnectionAdapter() throws SQLException {
	} // Not an error if this one is called.

	public ConnectionAdapter(java.sql.Driver driver, String url, java.util.Properties info)
			throws SQLException
	{
		throw new SQLException("ConnectionAdapter constructor unsupported");
	}

	@Override
	public void setHoldability(int h)
			throws SQLException
	{
		throw new SQLException("Connection.setHoldability(int h) unsupported");
	}

	@Override
	public int getHoldability()
			throws SQLException
	{
		throw new SQLException("Connection.getHoldability() unsupported");
	}

	// ...
	// @middle
	@Override
	public Savepoint setSavepoint() throws SQLException {
		throw new SQLException("Connection.setSavepoint() unsupported");
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		throw new SQLException("Connection.setSavepoint(String name) unsupported");
	}

	@Override
	public Statement createStatement() throws SQLException {
		throw new SQLException("Connection.createStatement() unsupported");
	}

	@Override
	public Statement createStatement(int a, int b, int c) throws SQLException {
		throw new SQLException("Connection.createStatement(int a, int b, int c) unsupported");
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		throw new SQLException("Connection.createStatement(int resultSetType, int resultSetConcurrency) unsupported");
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		throw new SQLException("Connection.getMetaData() unsupported");
	}

	@Override
	public void close() throws SQLException {
		throw new SQLException("Connection.close() unsupported");
	}

	@Override
	public boolean isClosed() throws SQLException {
		throw new SQLException("Connection.isClosed() unsupported");
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		throw new SQLException("Connection.isReadOnly() unsupported");
	}

	@Override
	public void clearWarnings() throws SQLException {
		throw new SQLException("Connection.clearWarnings() unsupported");
	}

	@Override
	public void commit() throws SQLException {
		throw new SQLException("Connection.commit() unsupported");
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		throw new SQLException("Connection.getAutoCommit() unsupported");
	}

	@Override
	public String getCatalog() throws SQLException {
		throw new SQLException("Connection.getCatalog() unsupported");
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		throw new SQLException("Connection.getTransactionIsolation() unsupported");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		throw new SQLException("Connection.getWarnings() unsupported");
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		throw new SQLException("Connection.nativeSQL(String sql) unsupported");
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		throw new SQLException("Connection.prepareCall(String sql) unsupported");
	}

	@Override
	public CallableStatement prepareCall(String sql, int a, int b, int c) throws SQLException {
		throw new SQLException("Connection.prepareCall(String sql, int a, int b, int c) unsupported");
	}

	@Override
	public CallableStatement prepareCall(String sql, int x, int y) throws SQLException {
		throw new SQLException("Connection.prepareCall(String sql, int x, int y) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int x, int y) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql, int x, int y) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql,String[] columnNames) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql,int[] columnIndexes) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int a, int b, int c) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql,int a, int b, int c) unsupported");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int a) throws SQLException {
		throw new SQLException("Connection.prepareStatement(String sql,int a) unsupported");
	}

	@Override
	public void releaseSavepoint(Savepoint s) throws SQLException {
		throw new SQLException("Connection.releaseSavepoint( Savepoint s ) unsupported");
	}

	@Override
	public void rollback() throws SQLException {
		throw new SQLException("Connection.rollback() unsupported");
	}

	@Override
	public void rollback(Savepoint s) throws SQLException {
		throw new SQLException("Connection.rollback(Savepoint s) unsupported");
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		throw new SQLException("Connection.setAutoCommit(boolean autoCommit) unsupported");
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
		throw new SQLException("Connection.setCatalog(String catalog) unsupported");
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		throw new SQLException("Connection.setReadOnly(boolean readOnly) unsupported");
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		throw new SQLException("Connection.setTransactionIsolation(int level) unsupported");
	}

	@Override
	public java.util.Map getTypeMap() throws SQLException {
		throw new SQLException("unsupported");
	}

	@Override
	public void setTypeMap(java.util.Map map) throws SQLException {
		throw new SQLException("Connection.setTypeMap(java.util.Map map) unsupported");
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSchema(String schema) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort(Executor executor) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
