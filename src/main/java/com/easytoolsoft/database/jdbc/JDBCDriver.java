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
package com.easytoolsoft.database.jdbc;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * A JDBC driver for a small in-memory database that wraps
 * the {@link com.easytoolsoft.database.Database} class. See that
 * class for a discussion of the supported SQL.
 *
 * @include /etc/license.txt
 *
 * @see com.easytoolsoft.database.Database
 */

public class JDBCDriver implements java.sql.Driver
{
	// {=JDBCDriver.staticInitializer}
	static
	{
		try
		{
			java.sql.DriverManager.registerDriver(new JDBCDriver());
		} catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException
	{
		return url.startsWith("file:/");
	}

	@Override
	public Connection connect(String uri, Properties info)
			throws SQLException
	{
		try
		{
			return new JDBCConnection(uri);
		} catch (Exception e)
		{
			throw new SQLException(e.getMessage());
		}
	}

	@Override
	public int getMajorVersion() {
		return 1;
	}

	@Override
	public int getMinorVersion() {
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		return false;
	}

	@Override
	public DriverPropertyInfo[]
			getPropertyInfo(String url, Properties info) throws SQLException
	{
		return new DriverPropertyInfo[0];
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
}
